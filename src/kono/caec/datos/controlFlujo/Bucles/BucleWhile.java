package kono.caec.datos.controlFlujo.Bucles;

import javax.swing.*;

public class BucleWhile {
    public static void main(String[] args) {
        String clave = "Juan";
        String acceso = "";

        while (!clave.equals(acceso)) {
            acceso = JOptionPane.showInputDialog("Ingrese su acceso: ");

            if (!clave.equals(acceso)) {
                JOptionPane.showMessageDialog(null, "La acceso es incorrecto");
            }
        }

        JOptionPane.showMessageDialog(null, "Bienvenido al Sistema!!");
    }
}
