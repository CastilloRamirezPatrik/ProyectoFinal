/**Implementar 4 programas en Java para:
Resolver un problema matemático que utilice una condicional simple anidada en una condición simple.
Resolver un problema matemático que utilice una condicional simple anidada en una condición doble.
Resolver un problema matemático que utilice una condicional doble anidada en una condición simple.
Resolver un problema matemático que utilice una condicional doble anidada en una condición doble.
*/

package com.mycompany.ejercicios;

import java.util.Scanner;

public class NewClass1 {
    public static void main(String[] args) {
        Scanner lector=new Scanner(System.in);
        
         int num3,num4,num5,num7,num8;
         int num1,num2,num6,resultado1,resultado2,resultado3;
         double bono,sueldoT;
      String operacion1,operacion2;
     //1//
        System.out.println("Escriba la operacion que quiera realizar(suma/resta):");
      operacion1=lector.nextLine();
        System.out.println("Ingrese 2 numeros: ");
        num1=lector.nextInt();
        num2=lector.nextInt();
       
      if(operacion1.equals("suma")){
      resultado1=num1+num2;
          System.out.println("El resultado de tu suma es: "+resultado1);
      }if(operacion1.equals("resta")){
      resultado1=num1-num2;
          System.out.println("El resultado de tu resta es: "+resultado1);
         
      }else{
           System.out.println("Ingresa un valor correcto");
       
      }
      //2//
       lector.nextLine(); 
       System.out.println("Escriba otra operacion que quiera realizar(suma/resta/multipllicacion ):");
      operacion2=lector.nextLine();
      
        System.out.println("Ingrese 2 numeros: ");
        
          num7=lector.nextInt();
          num8=lector.nextInt();
        
      
      if(operacion2.equals("suma")){
      resultado2=num7+num8;
      System.out.println("El resultado es: "+resultado2);
      }else if(operacion2.equals("resta")){
      resultado2=num7-num8;
      System.out.println("El resultado es: "+resultado2);
    }else if(operacion2.equals("multiplicacion")){
      resultado2=(num7*num8);
      System.out.println("El resultado es: "+resultado2);
       }else{
          System.out.println("Se equivoco al ingresar una variable");
      }
          
      
      //3//
        System.out.println(" ingrese tres numeros para hayar cual es el mayor: ");
        num3=lector.nextInt();
        num4=lector.nextInt();
        num5=lector.nextInt();
      
        
        if(num3>num4&&num3>num5){
            System.out.println("El numero mayor es el numero "+num3);
           }if(num4>num3&&num4>num5){
            System.out.println("El numero mayor es el numero "+num4);  
              }if(num5>num3&&num5>num4){
                System.out.println("El numero mayor es el numero "+num5);
                 }
    
       //4//
          System.out.println("Ingrese cuantos años esta trabajando: ");
          resultado3=lector.nextInt();
          System.out.println("Ingrese salario: ");
          num6=lector.nextInt();
          bono=0;
          if (resultado3<=2){
          bono=(num6*0.05);
                  
          }if (resultado3>2&&resultado3<=5){
              bono=(num6*0.10);
          }if(resultado3>5&&resultado3<=10){
              bono=(num6*0.20);
          }if(resultado3>10){
              bono=(num6*0.30);
          }
          sueldoT=(num6+bono);
          
          System.out.println("Su bono es de: "+bono);
          System.out.println("Su sueldo total es de: " +sueldoT);
         
          }
          
          }
              
 

