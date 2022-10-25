import java.util.Scanner;
public class Lector3 {
    public static void main(String [] args){
        System.out.println("Systema de registro de Datos \n");
        Scanner leer = new Scanner(System.in);
        
        System.out.print("Ingrese tu nombre: ");
        String nombre = leer.nextLine();
        
        System.out.print("Ingresa tu edad: ");
        int edad = leer.nextInt();
        
        
        int mat = edad + 10;
        
        System.out.println("\n\n\nTu nombre es: \n "+nombre);
        System.out.println("Tu Edad: \n"+edad);
        System.out.println("Tu edad en 10 años es: \n"+mat);
        System.out.println("Tu nombre es: "+nombre+"ahora tienes" +edad +"en 10 anios tendras" +mat);
    }
 }

