package kono.caec.practica;

import javax.swing.*;

public class Ejercicio009 {
    public static void main(String[] args) {
        double altura = Double.parseDouble(JOptionPane.showInputDialog("Ingresa tu altura"));
        String genero = JOptionPane.showInputDialog("Ingresa tu genero");
        double pesoIdeal = 0;

        if (genero.equalsIgnoreCase("Femenino")) {
            pesoIdeal = altura - 120;
        }

        if (genero.equalsIgnoreCase("Masculino")) {
            pesoIdeal = altura - 110;
        }

        if (pesoIdeal != 0) {
            JOptionPane.showMessageDialog(null,
                    "El peso ideal según tu genero y altura es de " + pesoIdeal + " kg");
        }
    }
}
