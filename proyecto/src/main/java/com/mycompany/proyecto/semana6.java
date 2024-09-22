package com.mycompany.proyecto;

//Escribir un programa que solicite n datos al usuario utilizando el bucle while.//
import java.util.Scanner;


public class semana6 {
    public static void main(String[] args) {
        Scanner lector=new Scanner(System.in);
        int n=0,dato,variables;
        
        System.out.println("cuantas variables desea ingresar?: ");
        variables=lector.nextInt();
        
        
        while(n<=variables){
            n++;
            System.out.println("Ingrese un dato: ");
            dato=lector.nextInt();
        if(n>=variables){
        System.out.println("Usted a ingresado "+n+" datos");
        break;
         }
        }
        
     } 
    }

