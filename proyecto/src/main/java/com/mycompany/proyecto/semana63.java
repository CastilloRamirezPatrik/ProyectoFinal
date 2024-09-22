package com.mycompany.proyecto;

//Escribir un programa que utilice el bucle while para imprimir información en pantalla.//
import java.util.Scanner;


public class semana63 {
    public static void main(String[] args) {
        String respuesta,producto1;
        double precio=0;
        Scanner lector=new Scanner(System.in);
        System.out.println("""
                           .-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.
                           Jugueria 
                           -.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-
                           Jugos            |   Sandwichs
                           -----------------|-------------------------
                           surtido (1)      |pollo deshilachado (9)             
                           fresa (2)        |hamburguesa de pollo (10)           
                           papaya (3)       |
                           platano (4)      |
                           mango (5)        |
                           especial (6)     |
                           -------------------------------------------
                           Postres
                           -------------------------------------------
                           porcion de pastel(7)
                           pastel de choclo(8)
                           .-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.
                           
                           """);
        while(true){
            System.out.println("Desea comprar algo: ");
            respuesta=lector.nextLine();
           
            precio=0+precio;
            if(respuesta.equals("si")){
                System.out.println("Que desea comprar: ");
                producto1=lector.nextLine();
               
        switch(producto1){
                case "1" :
                    System.out.println("el producto cuesta 2.0 ");
                    precio=precio+2;
                    break;
                case "2" :
                    System.out.println("el producto cuesta 1.5 ");
                    precio=precio+1.5;
                    break;
                case "3" :
                    System.out.println("el producto cuesta 2.0 ");
                    precio=precio+2;
                    break;
                case "4" :
                    System.out.println("el producto cuesta 1.5 ");
                    precio=precio+1.5;
                    break;
                case "5" :
                    System.out.println("el producto cuesta 2.0 ");
                    precio=precio+2;
                    break;
                case "6" :
                    System.out.println("el producto cuesta 3.0 ");
                    precio=precio+3;
                    break;
                case "7" :
                    System.out.println("el producto cuesta 4.0 ");
                    precio=precio+4;
                    break;
                case "8" :
                    System.out.println("el producto cuesta 3.5 ");
                    precio=precio+3.5;
                    break;
                case "9" :
                    System.out.println("el producto cuesta 1.5 ");
                    precio=precio+1.5;
                    break;
                case "10" :
                    System.out.println("el producto cuesta 2.5 ");
                    precio=precio+2.5;
                    break;
                    
            } 
        }else if(respuesta.equals("no")){
           System.out.println("El presio total es de: "+precio);
           break;
        } 
        }
    } 
}
