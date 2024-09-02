
package com.mycompany.ejercicios;

import java.util.Scanner;


public class SumaTresDigitos {
    
    public static void main(String[] args){
    
    double num1,num2,num3;    
        
   Scanner lector=new Scanner(System.in);
        System.out.println("Ingrese tres numeros: ");
      num1=lector.nextDouble();
      num2=lector.nextDouble();
      num3=lector.nextDouble();
      
      
      boolean igual=num1==num2&&num2==num3;
      boolean mun1M=num1>=num2&&num1>=num3;
      boolean num2M=num2>=num1&&num2>=num3;
      boolean num3M=num3>=num2&&num3>=num1;
      
     
     
     
      if(igual){
          System.out.println("Los numeros son iguales");
      
      }else if(mun1M){
          System.out.println("El primer numero es mayor");
          
      
      }else if(num2M){
          System.out.println("El segundo numero es mayor");
        
    }else if  (num3M){
          System.out.println("El tercer numero es mayor");  
    }
    }
    }