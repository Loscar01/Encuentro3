
package deteccionerroresencuentro3;

import java.util.Scanner;

public class DETECCIONERRORES3 {

    public static void main(String[] args) throws InterruptedException {
       //Define variables donde puedas alojar los resultados y prueba usar dos operadores de cada tipo.
       int num1,num2;

        Scanner leer= new Scanner(System.in);
        System.out.println("Ingrese un numero");
        //le oedimos que ingrese un numero y con el leer.nextInt lo guardamos en esa variable
        num1=leer.nextInt();
        // para cada tipo de dato hay un next especifico
        System.out.println("Ingrese el otro numero");
        num2=leer.nextInt();
        int suma = num1 + num2;
        System.out.println("La suma de los numeros es " + suma) ;
          Thread.sleep(1000);
        System.out.println("Ahora vamos a hacer lo mismo pero restando");
        int resta = num1 - num2;
        System.out.println("La resta de los numeros es " + resta) ;
          Thread.sleep(1000);
        System.out.println("Ahora, multiplicando");
        int multiplicacion = num1 * num2;
        System.out.println("La multiplicacion de los numeros es " + multiplicacion) ;
        
        Thread.sleep(1000);
        
        System.out.println("Ahora, dividiendo");
        //double para numeros reales
        //Convirtiendo numeros int a double
        double division = (double) num1 / (double) num2;
        // Otra forma de convertir 
        //double numeroDouble1 = (double) num1;
        //double numeroDouble2 = (double) num2;
        //double division = numeroDouble1 / numeroDouble2;
        System.out.println("La division de los numeros es " + division) ;
          Thread.sleep(1000);
        System.out.println("Ahora, el modulo de esto es: ");
        int mod = num1 % num2;
        System.out.println("el modulo de " + num1 + "," + num2 +  "=" + mod) ;
     
            Thread.sleep(2000);
            
         System.out.println("Ahora vamos a usar operadores unarios ");
          System.out.println("Vamos a multiplicar un numero positivo con uno negativo");
        int operadormas = num1 * (- num2);
        System.out.println("el resultado queda: " + operadormas) ;
        
    }
    
}
