//Escribir un programa que calcule el área de una figura geométrica cualquiera.//
package TallerProgramacion;

import java.util.Scanner;

public class Ejercicio01 {
    public  static  void    main(String[] args){
        float altura,base,areaTotal;
        
        Scanner lector=new Scanner(System.in);
        System.out.println("Ingrese la altura de un rectangulo: ");
        altura =lector.nextInt();
        
         System.out.println("Ingrese la base de un rectangulo: ");
        base =lector.nextInt();
        
        areaTotal=altura*base;
        
         System.out.println("El area del rectangulo es de: ");
         System.out.println(areaTotal+" cm al cuadrado");
        
    }}