package kono.caec.datos;

public class Operadores {
    public static void main(String[] args) {
        int edadJuan = 15;
        int edadVictor = 16;

        // Suma
        int sumar = edadJuan + edadVictor;
        // Resta
        int restar = edadJuan - edadVictor;
        //Multiplicación
        double multiplicar = edadJuan * edadVictor;
        // División
        double dividir = (double) edadJuan / edadVictor;

        System.out.println(sumar);
        System.out.println(restar);
        System.out.println(multiplicar);
        System.out.println(dividir);

        // Incrementales y decrementales
        restar++;
        sumar--;
        multiplicar-=10;
        dividir+=10;

        System.out.println(sumar);
        System.out.println(restar);
        System.out.println(multiplicar);
        System.out.println(dividir);

        // Concatenación de String
        System.out.println("Aquí concatenamos un valor " + sumar);
        System.out.println("Aquí concatenamos dos valores " + sumar + restar);
        System.out.println("Aquí concatenamos un valor en dos " + (sumar+restar));
    }
}
