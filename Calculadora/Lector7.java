import java.util.Scanner;


public class Lector7 {

    public static void main(String[] args){

        char caracter;
        char caracter1 = 'Z';

        System.out.println("El caracter asignado es: "+caracter1);
        
        Scanner sc = new Scanner(System.in);
                
        System.out.println("Dame un caracter: ");
        caracter = sc.next().charAt(0);

        System.out.println("Tu caracter ingresado es: " +caracter);

    }
    
}
