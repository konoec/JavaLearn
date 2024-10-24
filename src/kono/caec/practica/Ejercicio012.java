package kono.caec.practica;

import javax.swing.*;

public class Ejercicio012 {
    public static void main(String[] args) {
        String email;
        int contador;
        boolean repetir = false;

        do {
            contador = 0;
            email = JOptionPane.showInputDialog("Ingresa tu dirección de email");

            if (email.contains("@") && email.contains(".") && email.length() >= 4) {
                for (int i = 0; i < email.length(); i++) {
                    if (email.charAt(i) == '@') {
                        contador++;
                    }
                }

                if (contador > 1) {
                    JOptionPane.showMessageDialog(null, "El email tiene más de un @");
                    repetir = true;
                }
            } else {
                JOptionPane.showMessageDialog(null, "El email no es correcto");
                repetir = true;
            }
        } while (repetir);

        JOptionPane.showMessageDialog(null, "El email es correcto");
    }
}
