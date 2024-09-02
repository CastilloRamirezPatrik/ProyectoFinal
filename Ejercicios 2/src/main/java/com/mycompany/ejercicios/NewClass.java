//Escribir un programa en Java que haga uso de estructuras condicionales dobles para realizar ciertas operaciones/procesos con datos, en cada caso.//
package com.mycompany.ejercicios;



import java.util.Scanner;


public class NewClass {
    
    public static void main(String[] args) {
        Scanner lector=new Scanner(System.in);
        int num1,num2,resultado;
        String operacion;
        
        System.out.println("Que operacion quiere realizar: ");
        operacion=lector.nextLine();
        System.out.println("Ingrtese un numero: ");
        num1=lector.nextInt();
        System.out.println("Ingrese otro numero: ");
        num2=lector.nextInt();
        
        if (operacion.equals("suma")){
        resultado=num1+num2;
            System.out.println("El resultado de tu suma es: "+resultado);
          
        }else{
        resultado=num1-num2;
            System.out.println("El resultado se tu resta es: "+resultado); 
        }
        
    }
     
}
 