
package ejercicio3;

import java.util.Scanner;


public class EJERCICIO3 {

   
    public static void main(String[] args) {
        // Escribir un programa que pida una frase y la muestre toda en mayúsculas y después toda en minúsculas. 
        //Nota: investigar la función toUpperCase() y toLowerCase() en Java.
        //es asi, no hace falta inicializar
        String frase;
        Scanner leer= new Scanner(System.in);
        System.out.println("Ingrese la frase para ser convertida a minusculas y mayusculas");
        //Next solo es hasta el espacio, y next line lee toda la cadena de texto
        // Esta es una forma de convertir
        frase=leer.nextLine().toUpperCase();
        System.out.println("Su frase quedaria asi:" + frase);
        // esta es otra forma de convertir 
        System.out.println("Ahora en minusculas: " + frase.toLowerCase());
    }
    
}
