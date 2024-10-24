package kono.caec.practica;

import java.util.Scanner;

public class Ejercicio010 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Bienvenido a la calculadora de area en figuras planas");
        System.out.println("Ingresa el número de la figura que deseas calcular");
        System.out.println("1.Cuadrado");
        System.out.println("2.Rectángulo");
        System.out.println("3.Triángulo");
        System.out.println("4.Círculo");

        double area;
        int nroFigura = entrada.nextInt();

        switch (nroFigura){
            case 1:
                System.out.println("Ingresa el valor numérico del lado del cuadrado");
                double lado = entrada.nextDouble();

                area = lado*lado;
                System.out.println("El área del cuadrado es " + area + " unidades cuadradas");
                break;

            case 2:
                System.out.println("Ingresa el valor numérico del ancho del rectángulo");
                double ancho = entrada.nextDouble();

                System.out.println("Ingresa el valor numérico del largo del rectángulo");
                double largo = entrada.nextDouble();

                area = ancho * largo;
                System.out.println("El área del rectángulo es de " + area + " unidades cuadradas");
                break;

            case 3:
                System.out.println("Ingresa el valor numérico de la base del triangulo");
                double base = entrada.nextDouble();

                System.out.println("Ingresa el valor numérico de la altura del triangulo");
                double altura = entrada.nextDouble();

                area = (base * altura) / 2;
                System.out.println("El área del triangulo es de " + area + " unidades cuadradas");
                break;

            case 4:
                System.out.println("Ingresa el valor numérico del radio del círculo");
                double radio = entrada.nextDouble();

                area = Math.PI * radio * radio;
                System.out.println("El área del triangulo es de " + area + " unidades cuadradas");
                break;
            default:
        }
    }
}
