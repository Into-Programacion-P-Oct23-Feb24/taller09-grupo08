package paquete01;

import java.util.*;

public class Ejercicio {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        int numeroElementos;
        int contador1 = 0;
        int i=0;
        String al="Las marcas ingresadas son:\n";

        String a;
        System.out.println("Ingrese el número de marcas");
        numeroElementos = entrada.nextInt();
        entrada.nextLine();
        String[] marcas = new String[numeroElementos];

        for (int contador = 0; contador < numeroElementos; contador++) {
            System.out.print("Ingrese la marca del Automovil: ");
            a = entrada.nextLine();
            String inicial = a.substring(0, 1).toUpperCase();

            if (inicial.equals("A") || inicial.equals("C") || inicial.equals("T")) {
                System.out.println("Marca no permitida");
                System.out.println("Ingrese una nueva marca");
                --contador;
            } else {
                i++;
                marcas[contador] = a;
                al = String.format("%sMarca #%d: %s\n", al,i,marcas[contador]);
            }

        }
        System.out.print(al); 

    }

}
