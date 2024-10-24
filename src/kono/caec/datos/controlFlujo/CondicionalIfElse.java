package kono.caec.datos.controlFlujo;

import javax.swing.*;

public class CondicionalIfElse {
    public static void main(String[] args) {
        // Primer ejemplo
        int nota = Integer.parseInt(JOptionPane.showInputDialog("Introduce tu nota"));

        if (nota >= 18) {
            System.out.println("Aprobaste con un examen perfecto");
        } else if (nota >= 12) {
            System.out.println("Aprobaste el examen");
        } else {
            System.out.println("Reprobaste el examen");
        }

        // Segundo Ejemplo
        final double costoCuota = 500;
        final double presupuesto = 10000;

        double cuotas = Double.parseDouble(JOptionPane.showInputDialog("Introduce el número de cuotas"));
        double inicial = Double.parseDouble(JOptionPane.showInputDialog("Introduce el pago inicial"));

        if ((cuotas * costoCuota) + inicial < presupuesto){
            System.out.println("Si puedes pagar esta universidad");
        } else {
            System.out.println("No puedes pagar esta universidad");
        }
    }
}
