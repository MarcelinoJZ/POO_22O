import java.util.Scanner;

public class Lector6 {

        public static void main (String [] args){
            
            float num;
            float num2;
            double num3;
            double num4;
            /*********************************************FLOAT************** */
            Scanner sc = new Scanner(System.in);
                    
            System.out.println("Dame un numero con decimales: ");
            num = sc.nextFloat();
            
            num2 = num +30;
            System.out.println("Tu numero es Float es: " +num2 );


            /***************************************DOUBLE******************** */
            Scanner sc1 = new Scanner(System.in);
                    
            System.out.println("Dame un numero : ");
            num3 = sc1.nextDouble();
            
            num4 = num3 + 30;
            System.out.println("Tu numero Double es: " +num4 );


            
        }
    
}
