package kono.caec.practica;

import javax.swing.*;

public class Ejercicio013 {
    public static void main(String[] args) {
        int factorial = 1;
        int numero = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingresa el número a calcular su calcular"));

        for (int i = 1; i <= numero; i++) {
            factorial = factorial * i;
        }

        JOptionPane.showMessageDialog(null,"El factorial de " + numero + " es " + factorial);
    }
}
