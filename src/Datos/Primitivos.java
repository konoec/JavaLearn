package Datos;

public class Primitivos {
    public static void main(String[] args) {
        // Inicializar la variable
        char letra = 'K';
        byte edad = 27;
        short puntaje = 1000;
        int productosVendidos = 100000;
        long numeroEstrellas = 1000000L;
        float peso = 0F;
        double precio = 0;
        boolean esReal = false;

        System.out.println(letra);
        System.out.println(edad);
        System.out.println(puntaje);
        System.out.println(productosVendidos);
        System.out.println(numeroEstrellas);
        System.out.println(peso);
        System.out.println(precio);
        System.out.println(esReal);

        // Su valor puede cambiar
        letra = 'L';
        edad = 17;
        puntaje = 1001;
        productosVendidos = 100001;
        numeroEstrellas = 1000001L;
        peso = 20.0F;
        precio = 3.5;
        esReal = true;

        System.out.println(letra);
        System.out.println(edad);
        System.out.println(puntaje);
        System.out.println(productosVendidos);
        System.out.println(numeroEstrellas);
        System.out.println(peso);
        System.out.println(precio);
        System.out.println(esReal);
    }
}
