import java.util.Scanner;

public class Calcu2 {
    public static void main(String []args){

        int opc = 0;
        double a = 0 ;
        double b = 0 ;
        double valor = 0;

        Operaciones obj1 = new Operaciones();

        Scanner sc2 = new Scanner(System.in);
        
        do{
            System.out.println("\n\n Bienvenido a la Calculadora \n\n");

            System.out.println("1.-Suma");
            System.out.println("2.Resta");
            System.out.println("3. Multiplicacion");
            System.out.println("4. Division");
            System.out.println("5. Salir");

            System.out.print("\n Selecciona una opcion: ");
            Scanner sc = new Scanner(System.in);
            opc = sc.nextInt();

            if (opc == 1){
                System.out.println("Entraste a suma");
                obj1.Suma();
            }
            if (opc == 2){
                System.out.println("Entraste a resta");
                        
                System.out.print("Ingresa el primer numero: ");
                a = sc2.nextDouble();

                obj1.Resta(a);
                System.out.print("El resultado de la resta es: "+ obj1.resultado1);

            }
            if (opc == 3){
                System.out.println("Entraste a multiplicacion");

                System.out.print("Ingresa el primer numero: ");
                a = sc2.nextDouble();
                System.out.print("Ingresa el segundo  numero: ");
                b = sc2.nextDouble();

                valor  = obj1.Multiplicar(a,b);

                System.out.println("El resualtado de la multiplicaion es: " + valor);
            }
            if (opc == 4){
                System.out.println("Entraste a divicion");

                System.out.print("Ingresa el primer numero: ");
                a = sc2.nextDouble();
                System.out.print("Ingresa el segundo  numero: ");
                b = sc2.nextDouble();

                System.out.print("El resultado de la divicion es: " +obj1.Dividir(a,b));

            }

        }
        while (opc < 5 );{

            System.out.println("Saliendo del Programa");
        }
    }

}

    
