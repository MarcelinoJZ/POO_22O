import java.util.Scanner;

public class Calcu3 {
    public static void main(String []args){

        int opc = 0;
        double a = 0 ;
        double b = 0 ;
        double valor = 0;

        Calculos obj1 = new Calculos();  //Creando instancia de la clase Operaciones 

        Scanner sc2 = new Scanner(System.in);
        
        do{
            System.out.println("\n\n Bienvenido a la Calculadora \n\n");

            System.out.println("1. Suma");
            System.out.println("2. Resta");
            System.out.println("3. Multiplicacion");
            System.out.println("4. Division");
            System.out.println("5. Salir");

            System.out.print("\n Selecciona una opcion: ");
            Scanner sc = new Scanner(System.in);
            opc = sc.nextInt();

            if (opc == 1){
                System.out.println("Entraste a suma");
                obj1.suma();
            }
            if (opc == 2){
                System.out.println("Entraste a resta");
                        
                System.out.print("Ingresa el primer numero: ");
                a = sc2.nextDouble();

                obj1.resta(a);
                System.out.print("El resultado de la resta es: "+ obj1.resultado1);

            }// fin del metodo resta 


            if (opc == 3){
                System.out.println("Entraste a multiplicacion");

                System.out.print("Ingresa el primer numero: ");
                a = sc2.nextDouble();
                System.out.print("Ingresa el segundo  numero: ");
                b = sc2.nextDouble();

                valor  = obj1.multiplicar(a,b);

                System.out.println("El resualtado de la multiplicaion es: " + valor);

            } // Fin del metodo Multiplicacion


            if (opc == 4){
                System.out.println("Entraste a divicion");

                System.out.print("Ingresa el primer numero: ");
                a = sc2.nextDouble();
                System.out.print("Ingresa el segundo  numero: ");
                b = sc2.nextDouble();

                System.out.print("El resultado de la divicion es: " +obj1.dividir(a,b));

            } // fin del metedodo division 

        } // Fin del DO 

        while (opc < 5 );{

            System.out.println("Saliendo del Programa");
        }
    }

} // fin de calcu3
    

