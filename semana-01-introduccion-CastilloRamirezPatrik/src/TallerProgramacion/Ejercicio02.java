//Escribir un programa que resuelva una fórmula matemática que utilice al menos 3 variables.//
package TallerProgramacion;

import java.util.Scanner;

public class Ejercicio02 {
    public  static  void    main(String[] args){
    
     float numero1,numero2;
     float suma,resta,multiplicacion;
  
    
    
        Scanner lector=new Scanner(System.in);
        
        System.out.println("Ingrese el primer numero: ");
        numero1=lector.nextInt ();
        
       
        System.out.println("Ingrese el segundo numero: ");
        numero2=lector.nextInt ();
        
        suma=numero1+numero2;
        resta=numero1-numero2;
        multiplicacion=numero1*numero2;
       
        
        System.out.println("La suma es: "+suma);
        System.out.println("La resta es: "+resta);
        System.out.println("La multiplicacion es: "+multiplicacion);
    }
    
    
    
    }
