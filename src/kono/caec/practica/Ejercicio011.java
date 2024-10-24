package kono.caec.practica;

import javax.swing.*;

public class Ejercicio011 {
    public static void main(String[] args) {
        int numeroAleatorio = (int) (Math.random() * 100);
        int numeroAdivinado;
        int numeroIntentos = 1;
        boolean isCorrecto = false;

        JOptionPane.showMessageDialog(null, "Bienvenido al random adivinate!!!");
        JOptionPane.showMessageDialog(null, "Se generó un número al azar, adivinalo!!");

        while (!isCorrecto) {
            numeroAdivinado = Integer.parseInt(JOptionPane.showInputDialog("El número es..."));

            if (numeroAdivinado == numeroAleatorio) {
                isCorrecto = true;
            } else {
                JOptionPane.showMessageDialog(null,"Casi...");

                if (numeroAdivinado > numeroAleatorio) {
                    JOptionPane.showMessageDialog(null,"Es un número menor");
                }

                if (numeroAdivinado < numeroAleatorio) {
                    JOptionPane.showMessageDialog(null,"Es un número mayor");
                }

                numeroIntentos++;
            }
        }
        JOptionPane.showMessageDialog(null,"Felicitaciones, lo lograste en " + numeroIntentos + " intentos.");
    }
}
