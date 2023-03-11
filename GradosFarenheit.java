
package gradosfarenheit;

import java.util.Scanner;




public class GradosFarenheit {

   
    public static void main(String[] args) {
        // Dada una cantidad de grados centígrados se debe mostrar su equivalente 
        //en grados Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5).
        
        double C;
        double F;
       Scanner leer= new Scanner(System.in);
        System.out.println("Ingrese la temperatura en grados Celcius");
        C=leer.nextDouble();
        F = 32 + (9 * C / 5);
        System.out.println("La temperatura de" + C + "a grados Farenheit es:" + F);
        
    }
    
}
