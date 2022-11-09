import java.util.Scanner;


public class Calculos {

    // atributos de la clase (Globales)

    double n1 = 0;
    double n2 = 0;
    double resultado1 = 0;

    Scanner sc2 = new Scanner(System.in); //para escanear ls numero 

    public void suma(){  

        System.out.print("Ingresa el primer numero: ");
        n1 = sc2.nextDouble();
        System.out.print("Ingresa el segundo numero: ");
        n2 = sc2.nextDouble();
        
        resultado1 = n1 + n2;

        System.out.println("El resultado de la suma es: " +resultado1);

    }

    public void resta(double x){
        System.out.print("Dame el segundo numero: ");
        n2 = sc2.nextDouble();
        resultado1 = x - n2;

    }

    public double multiplicar(double x, double y){
        double m1 = 0;
        double m2 = 0;
        double resmultiplicacion;

        m1 = x;
        m2 = y;
        resmultiplicacion = m1 * m2;
        resultado1 = resmultiplicacion;
        return  resultado1;

    }

    public double dividir(double x, double y){

        resultado1 = x / y;
        return resultado1;
    }
} // fin de la clase operaciones

