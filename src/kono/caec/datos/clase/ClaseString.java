package kono.caec.datos.clase;

public class ClaseString {
    public static void main(String[] args) {
        // Inicializar la variable
        String cadena = "Cadena";
        System.out.println(cadena);

        int longitud = cadena.length();
        System.out.println("La palabra " + cadena + " tiene " + longitud + " caracteres.");

        char caracter = cadena.charAt(0);
        char caracterFinal = cadena.charAt(longitud - 1);
        System.out.println("La primera letra de " + cadena + " es " + caracter);
        System.out.println("La última letra de " + cadena + " es " + caracterFinal);

        String subCadena = cadena.substring(2,4);
        String subCadena2 = cadena.substring(2);
        System.out.println(subCadena);
        System.out.println(subCadena2);

        boolean valor = cadena.equals(subCadena);
        boolean valor2 = cadena.equalsIgnoreCase(cadena.toLowerCase());
        System.out.println(valor);
        System.out.println(valor2);
    }
}
