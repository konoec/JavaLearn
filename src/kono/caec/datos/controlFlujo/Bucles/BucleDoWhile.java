package kono.caec.datos.controlFlujo.Bucles;

import javax.swing.*;

public class BucleDoWhile {
    public static void main(String[] args) {
        String texto;
        int numeroCaracteres;

        JOptionPane.showMessageDialog(null,
                "Este programa cuenta los caracteres de la palabra que ingreses.\n" +
                        "Para salir escribe Salir.");

        do {
            texto = JOptionPane.showInputDialog("El texto es...");

            if (!texto.equalsIgnoreCase("Salir")) {
                numeroCaracteres = texto.length();
                JOptionPane.showMessageDialog(null, "El número de caracteres es: " + numeroCaracteres);
            }
        } while (!texto.equalsIgnoreCase("Salir"));
    }
}
