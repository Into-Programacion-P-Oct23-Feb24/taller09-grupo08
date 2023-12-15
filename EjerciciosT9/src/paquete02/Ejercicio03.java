/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete02;

/**
 *
 * @author reroes
 */
public class Ejercicio03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] arreglo = {1, 10, 11, 12, 12, 13, 16, 2, 3, 4, 9, 10, 21};
        int suma = 0;
        int resultado;
        double media;

        // Contar elementos por encima y por debajo de la media
        int porEncimaMedia = 0;
        int porDebajoMedia = 0;

        for (int i = 0; i < arreglo.length; i++) {
            suma = suma + arreglo[i];
        }

        resultado = suma / arreglo.length;
        // Calcular la media aritmética
        media = resultado;
        
        //calculo para definir los numero + y - a la media.
        for (int i =0;i<arreglo.length;i++) {
            if (arreglo[i]>media) {
                porEncimaMedia++;
            } else {
                if (arreglo[i]<media) {
                    porDebajoMedia++;
                }
            }
        }

        // Mostrar resultados
        System.out.println("Media aritmética: " + media);
        System.out.println("Elementos por encima de la media: " 
                + porEncimaMedia);
        System.out.println("Elementos por debajo de la media: " 
                + porDebajoMedia);
    }

}
