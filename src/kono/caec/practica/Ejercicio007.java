package kono.caec.practica;

import javax.swing.*;

public class Ejercicio007 {
    public static void main(String[] args) {
        double base = Double.parseDouble(JOptionPane.showInputDialog("Ingresa la base de la potencia"));
        double exponente = Double.parseDouble(JOptionPane.showInputDialog("Ingresa el exponente de la potencia"));
        double potencia = Math.pow(base, exponente);

        System.out.println(base + " a la " + exponente + " es " + potencia);
    }
}
