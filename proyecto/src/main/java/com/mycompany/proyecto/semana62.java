package com.mycompany.proyecto;

//Escribir un programa que use el bucle while para realizar algún procesamiento o cálculo.//
import java.util.Scanner;
import java.util.regex.Pattern;


public class semana62 {
    public static void main(String[] args) {
        Scanner lector=new Scanner(System.in);
       Pattern siPattern=Pattern.compile("(?i)no");
       
       int a,b;
       String suma,resta,operacion,respuesta,cadena;
       double areaTotal;

        
        
       while(true){//inicio ciclo//
                System.out.println("Que operacion matematica desea realizar: ");
        System.out.println("""
                           suma/sum
                           resta/res
                           multiplicacion/mul
                           divicion/div
                           """);   
        operacion=lector.nextLine();
           System.out.println("Ingrese un numero: ");
           a=lector.nextInt();
           System.out.println("Ingrese otro numero: ");
           b=lector.nextInt();
           
       areaTotal=switch(operacion){
           case "suma","sum"->{
           yield a+b;
       }
           case "resta","res"->{
           yield a-b;
           }
           case "multiplicacion","mul"->{
           yield a*b;
           }
           case "divicion","div"->{
               if(a==0||b==0){
                   
                 System.out.println("Ingrese una variable correcta: ");  
                 continue;
               }
               yield a/b;
              }
           default->{
               System.out.println("Ingrese un valor correcto");
          
               
           }
       
       };
           System.out.println(areaTotal);
               
       System.out.println("Desea realizar otra operacion: ");
       lector.nextLine();
       respuesta=lector.nextLine();
       if(respuesta.equals("no")){
           break;
       }
       }
    } 
}
