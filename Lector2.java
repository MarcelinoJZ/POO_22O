import java.util.Scanner;

public class Lector2 {
    int num;
    public static void main (String [] args){
        
        int num;

        /*Si no se inicializan las varaible no funciona */

       // System.out.println("Tu edad es: " +num );
        
        Scanner sc = new Scanner(System.in);
                
        System.out.println("Dame tu edad: ");
        num = sc.nextInt();

        System.out.println("Tu edad es: " +num );
        
    }
}
