import java.util.Scanner;


class Operaciones {

    // atributos de la clase (Globales)

    double n1 = 0;
    double n2 = 0;
    double resultado1 = 0;

    Scanner sc2 = new Scanner(System.in); //para escanear ls numero 

    public void Suma(){  

        System.out.print("Ingresa el primer numero: ");
        n1 = sc2.nextDouble();
        System.out.print("Ingresa el segundo numero: ");
        n2 = sc2.nextDouble();
        
        resultado1 = n1 + n2;

        System.out.println("El resultado de la suma es: " +resultado1);

    }

    public void Resta(double x){
        System.out.print("Dame el segundo numero: ");
        n2 = sc2.nextDouble();
        resultado1 = x - n2;

    }

    public double Multiplicar(double x, double y){
        double m1 = 0;
        double m2 = 0;
        double resmultiplicacion;

        m1 = x;
        m2 = y;
        resmultiplicacion = m1 * m2;
        resultado1 = resmultiplicacion;
        return  resultado1;

    }

    public double Dividir(double x, double y){

        resultado1 = x / y;
        return resultado1;
    }
} // fin de la clase operaciones

public class Prueba {
    public static void main(String []args){

        int opc = 0;
        double a = 0 ;
        double b = 0 ;
        double valor = 0;

        Operaciones obj1 = new Operaciones();  //Creando instancia de la clase Operaciones 

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

            }// fin del metodo resta 


            if (opc == 3){
                System.out.println("Entraste a multiplicacion");

                System.out.print("Ingresa el primer numero: ");
                a = sc2.nextDouble();
                System.out.print("Ingresa el segundo  numero: ");
                b = sc2.nextDouble();

                valor  = obj1.Multiplicar(a,b);

                System.out.println("El resualtado de la multiplicaion es: " + valor);

            } // Fin del metodo Multiplicacion


            if (opc == 4){
                System.out.println("Entraste a divicion");

                System.out.print("Ingresa el primer numero: ");
                a = sc2.nextDouble();
                System.out.print("Ingresa el segundo  numero: ");
                b = sc2.nextDouble();

                System.out.print("El resultado de la divicion es: " +obj1.Dividir(a,b));

            } // fin del metedodo division 

        } // Fin del DO 

        while (opc < 5 );{

            System.out.println("Saliendo del Programa");
        }
    }

} // fin de calcu2

    
