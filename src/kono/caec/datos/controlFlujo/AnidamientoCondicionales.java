package kono.caec.datos.controlFlujo;

import javax.swing.*;

public class AnidamientoCondicionales {
    public static void main(String[] args) {
        int edad = Integer.parseInt(JOptionPane.showInputDialog("Ingresa tu edad"));
        String tieneCarnet;

        if (edad >= 18) {
            tieneCarnet = JOptionPane.showInputDialog("¿Tienes carnet de conducir?");

            if (tieneCarnet.equals("Si")) {
                JOptionPane.showMessageDialog(null,"Puedes comprar el coche");
            } else {
                JOptionPane.showMessageDialog(null,"No puedes comprar el coche");
            }
        } else {
            JOptionPane.showMessageDialog(null,"No puedes comprar el coche");
        }
    }
}
