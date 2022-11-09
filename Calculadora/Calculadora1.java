import java.util.Scanner;

class Calculadora1 {

    // atributos de la clase (Globales)

    static double n1 = 0;
    static double n2 = 0;
    static double resultado1 = 0;

    static Scanner sc2 = new Scanner(System.in); //para escanear ls numero 

    static void Suma(){

        System.out.print("Ingresa el primer numero: ");
        n1 = sc2.nextDouble();
        System.out.print("Ingresa el segundo numero: ");
        n2 = sc2.nextDouble();
        
        resultado1 = n1 + n2;

        System.out.println("El resultado de la suma es: " +resultado1);

    }

    static void Resta(double x){
        System.out.print("Dame el segundo numero: ");
        n2 = sc2.nextDouble();
        resultado1 = x - n2;

    }

    static double Multiplicar(double x, double y){
        double m1 = 0;
        double m2 = 0;
        double resmultiplicacion;

        m1 = x;
        m2 = y;
        resmultiplicacion = m1 * m2;
        resultado1 = resmultiplicacion;
        return  resultado1;

    }

    static double Dividir(double x, double y){

        resultado1 = x / y;
        return resultado1;
    }

    public static void main(String []args){

        int opc = 0;
        double a = 0 ;
        double b = 0 ;
        double valor = 0;

        
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
                Suma();
            }
            if (opc == 2){
                System.out.println("Entraste a resta");
                        
                System.out.print("Ingresa el primer numero: ");
                a = sc2.nextDouble();

                Resta(a);
                System.out.print("El resultado de la resta es: "+ resultado1);

            }
            if (opc == 3){
                System.out.println("Entraste a multiplicacion");

                System.out.print("Ingresa el primer numero: ");
                a = sc2.nextDouble();
                System.out.print("Ingresa el segundo  numero: ");
                b = sc2.nextDouble();

                valor  = Multiplicar(a,b);

                System.out.println("El resualtado de la multiplicaion es: " + valor);
            }
            if (opc == 4){
                System.out.println("Entraste a divicion");

                System.out.print("Ingresa el primer numero: ");
                a = sc2.nextDouble();
                System.out.print("Ingresa el segundo  numero: ");
                b = sc2.nextDouble();

                System.out.print("El resultado de la divicion es: " +Dividir(a,b));

            }

        }
        while (opc < 5 );{

            System.out.println("Saliendo del Programa");
        }
    }

}
