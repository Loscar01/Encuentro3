
package funcionmatchsqrt;

import java.util.Scanner;

public class FuncionMatchsqrt {

    public static void main(String[] args) throws InterruptedException {
        // Escribir un programa que lea un número entero por teclado y muestre
        //por pantalla el doble, el triple y la raíz cuadrada de ese número. 
        //Nota: investigar la función Math.sqrt().

        int num1;
        Scanner leer= new Scanner(System.in);
        System.out.println("Ingrese un numero (ENTERO)");
         Thread.sleep(1000);
         num1=leer.nextInt();
        int doble = num1 * 2;
         System.out.println("El doble seria: " + doble);
         System.out.println("El triple es: " + num1 * 3);
         System.out.println("La raiz cuadrada es: " + Math.sqrt(num1));
    }
    
}
