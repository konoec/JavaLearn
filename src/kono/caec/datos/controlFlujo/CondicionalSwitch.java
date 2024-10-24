package kono.caec.datos.controlFlujo;

import javax.swing.*;

public class CondicionalSwitch {
    public static void main(String[] args) {
        int hijos = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el número de hijos"));

        // En caso se cumpla uno, luego se ejecutan todos los que están debajo. Usando break deja de hacer eso.
        switch (hijos){
            case 0: JOptionPane.showMessageDialog(null,"Deberías empezar.");
            case 1: JOptionPane.showMessageDialog(null,"Por algo se empieza.");
            case 2: JOptionPane.showMessageDialog(null,"Buen duo.");
            case 3: JOptionPane.showMessageDialog(null,"Te animaste.");
            case 4: JOptionPane.showMessageDialog(null,"Tu familia es numerosa.");
            default: JOptionPane.showMessageDialog(null,"Wow...!");
        }
    }
}
