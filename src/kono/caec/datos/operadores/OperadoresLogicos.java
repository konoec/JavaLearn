package kono.caec.datos.operadores;

import javax.swing.*;

public class OperadoresLogicos {
    public static void main(String[] args) {
        int distancia = Integer.parseInt(JOptionPane.showInputDialog("Ingresa la distancia a tu colégio"));
        double renta = Double.parseDouble(JOptionPane.showInputDialog("Ingresa la renta familiar"));
        int nroHermanos = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el número de hermanos"));

        if (!(distancia > 1)){
            System.out.println("No puedes pedir la beca");
        }

        if (distancia > 10 && renta < 20000){
            System.out.println("El alumno tiene beca");
        } else if (distancia > 5 || renta < 10000 || nroHermanos > 5) {
            System.out.println("El alumno tiene media beca");
        } else {
            System.out.println("El alumno no tiene beca");
        }
    }
}
