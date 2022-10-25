import java.util.Scanner;

public class Lector5 {

    public static void main(String [] args){

        boolean bandera1;
        boolean bandera2;
        boolean bandera3;

        bandera3 = true;
        bandera2 = false;


        /*SI NO SE INICIALIZAN LAS VARIABLES BOOLEANAS NO SE PUEDE COMPILAR */

        //System.out.println("Es valor de la variable boolean es: " +bandera1);


        Scanner sc = new Scanner(System.in);
        System.out.println("Dame true o false para la variable: ");
        bandera1 = sc.nextBoolean();

        System.out.println("Es valor de la variable boolean es: " +bandera1);

        System.out.println("Es valor de la variable boolean es: " +bandera2);

        System.out.println("Es valor de la variable boolean es: " +bandera3);
       


    }
    
}