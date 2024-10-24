package kono.caec.datos.controlFlujo.Bucles;

public class BucleFor {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println("Hola Alumno " + (i + 1));
            if (i == 5) break;
        }
    }
}
