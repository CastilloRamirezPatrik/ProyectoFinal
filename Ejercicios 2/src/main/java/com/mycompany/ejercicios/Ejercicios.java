

package com.mycompany.ejercicios;


import java.util.Scanner;


public class Ejercicios {

public static void main(String[] args){
        
    Scanner lector=new Scanner(System.in);
    
    Double precio, precioF,descuento;
    
    System.out.println("Ingrese precio del producto: ");
    precio=lector.nextDouble();
    
    
    
    if (precio>=1000){
    descuento= (precio*0.10);   
    precioF=precio-descuento;

        System.out.println("Su descuento es de "+descuento);
        System.out.println("El precio final es de "+precioF);
    }else {
        System.out.println("No tiene descuento");

     }
        
   
        
    }
}
