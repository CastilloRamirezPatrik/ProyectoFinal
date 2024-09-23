package javaapplication3;
import java.util.Scanner;
public class semana63 {
    public static void main(String[] args) {
        String respuesta,producto1;
        double precio=0;
        Scanner lector=new Scanner(System.in);
        while(true){
            System.out.println("Desea comprar algo: ");
            respuesta=lector.nextLine();
 
            if(respuesta.equals("si")){
                        System.out.println("""
                           .-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.
                           Jugueria 
                           -.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-
                           Jugos            |   Sandwichs
                           -----------------|-------------------------
                           surtido (1)      |pollo deshilachado (7)             
                           fresa (2)        |hamburguesa de pollo (8)           
                           papaya (3)       |
                           platano (4)      |
                           mango (5)        |
                           especial (6)     |
                           .-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.
                           """);
                        
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
                    System.out.println("el producto cuesta 2.0 ");
                    precio=precio+2;
                    break;
                case "8" :
                    System.out.println("el producto cuesta 3.0 ");
                    precio=precio+3;
                    break;
            } 

        }else if(respuesta.equals("no")){
           System.out.println("El presio total es de: "+precio);      
           break;
        } 
        }
    } 
}
