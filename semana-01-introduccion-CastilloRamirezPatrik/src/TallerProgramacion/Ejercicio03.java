//Escribir un programa que, dado un monto total, lo descomponga en monto a pagar e IGV (18%).//
package TallerProgramacion;

import java.util.Scanner;


public class Ejercicio03 {
    public static void main(String[] args) {
      double montoTotal,montoFinal;
      
        Scanner lector=new Scanner(System.in);
        
        System.out.println("Inserte el monto total: ");
        montoTotal=lector.nextInt();
        
        montoFinal= (montoTotal *0.18);
        
        System.out.println("La cantidad total a pagar es de: "+montoFinal);
        
        
        
    }
}
