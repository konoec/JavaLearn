package kono.caec.practica;

import java.util.Scanner;

public class Ejercicio005 {
    public static void main(String[] args) {
        Scanner entrada =  new Scanner(System.in);

        System.out.println("Bienvenido a la calculadora de Raíces Cuadradas");
        System.out.print("Ingrese el numero a sacar la raíz: ");

        int numero = entrada.nextInt();
        double raiz = Math.sqrt(numero);

        System.out.println("La raíz de " + numero + " es " + raiz);
    }
}
