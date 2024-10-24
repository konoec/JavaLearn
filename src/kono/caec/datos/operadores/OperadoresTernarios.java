package kono.caec.datos.operadores;

import javax.swing.*;

public class OperadoresTernarios {
    public static void main(String[] args) {
        double salario = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor del salario del primer programador"));
        double salario2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor del salario del segundo programador"));

        double salarioMayor = Math.max(salario, salario2);
        String mensaje = (salario > salario2) ? "El primer programador tiene el salario mayor" : "El segundo programador tiene el salario mayor";

        JOptionPane.showMessageDialog(null, mensaje);
        JOptionPane.showMessageDialog(null, "El salario mayor es " + salarioMayor);
    }
}
