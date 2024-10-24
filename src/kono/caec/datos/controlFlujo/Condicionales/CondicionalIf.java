package kono.caec.datos.controlFlujo.Condicionales;

import javax.swing.*;

public class CondicionalIf {
    public static void main(String[] args) {
        int edad = Integer.parseInt(JOptionPane.showInputDialog("Introduce tu edad"));

        if (edad >= 18) {
            System.out.println("Tu edad es mayor de 18");
        }
    }
}
