import java.util.Scanner;

public class Calculadora {
    
    public static void main(String []args){

        int opc = 0;
        double a = 0 ;
        double b = 0 ;
        double resultado = 0;

        do{
            System.out.println("Bienvenido a la Calculadora");

            System.out.println("1.-Suma");
            System.out.println("2.Resta");
            System.out.println("3. Multiplicacion");
            System.out.println("4. Division");
            System.out.println("5. Salir");

            System.out.println("Selecciona una opcion: ");
            Scanner sc = new Scanner(System.in);
            opc = sc.nextInt();

            if (opc == 1){
                System.out.println("Entraste a suma");
            }
            if (opc == 2){
                System.out.println("Entraste a resta");
            }
            if (opc == 3){
                System.out.println("Entraste a multiplicacion");
            }
            if (opc == 4){
                System.out.println("Entraste a divicion");
            }

        }
        while (opc < 5 );{

            System.out.println("Saliendo del Programa");
        }
    }

}
