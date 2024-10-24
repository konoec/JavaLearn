package kono.caec.datos;

import java.util.Scanner;

public class EntradaScanner {
    public static void main(String[] args) {
        // Utilizamos el Scanner para recibir datos del sistema [System][in]
        Scanner entrada = new Scanner(System.in);

        System.out.print("Introduce tu edad: ");
        int edad = entrada.nextInt(); entrada.nextLine();

        System.out.print("Introduce tu nombre: ");
        String nombre = entrada.nextLine();

        System.out.println("Bienvenido " + nombre);
        System.out.println("Tienes " + edad + " años");

        entrada.close();
    }
}
