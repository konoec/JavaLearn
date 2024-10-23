package Datos.Clase;

public class ClaseString {
    public static void main(String[] args) {
        // Inicializar la variable
        String cadena = "Cadena";
        System.out.println(cadena);

        int longitud = cadena.length();
        System.out.println(longitud);

        char caracter = cadena.charAt(0);
        System.out.println(caracter);

        String subCadena = cadena.substring(2,4);
        System.out.println(subCadena);

        boolean valor = cadena.equals(subCadena);
        System.out.println(valor);
    }
}
