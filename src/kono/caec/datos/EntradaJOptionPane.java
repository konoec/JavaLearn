package kono.caec.datos;

import javax.swing.JOptionPane;

public class EntradaJOptionPane {
    public static void main(String[] args) {
        String frase = JOptionPane.showInputDialog("Introduzca una frase");
        String autor = JOptionPane.showInputDialog("Introduzca su Autor");
        int anio = Integer.parseInt(JOptionPane.showInputDialog("Introduzca el año de creación"));

        System.out.println(frase + "-" + autor + "-" + anio);
    }
}
