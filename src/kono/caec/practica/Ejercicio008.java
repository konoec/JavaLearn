package kono.caec.practica;

import javax.swing.*;

public class Ejercicio008 {
    public static void main(String[] args) {
        double base = Double.parseDouble(JOptionPane.showInputDialog("Ingresa la base de la potencia"));
        double exponente = Double.parseDouble(JOptionPane.showInputDialog("Ingresa el exponente de la potencia"));

        System.out.println(base + " a la " + exponente + " es " + Math.pow(base, exponente));
    }
}
