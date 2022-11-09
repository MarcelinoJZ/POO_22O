import java.util.Scanner;

public class Cuenta {
    String cliente;
    int cuenta;
    double efectivo;
    String operacion;
    double saldo =100000;



    Scanner sc = new Scanner (System.in);

    //Pedimos todos los datos 
    public void datos_cliente(){

        System.out.println("Dame el nombre del cliente: ");
        cliente =sc.nextLine();

        System.out.println("Dame el numero de cuenta: ");
        cuenta =sc.nextInt();

        System.out.println("Dame el efectivo del cliente: ");
        efectivo =sc.nextDouble();

    } 
    //Pedimos cuenta y efectivo. Nombre ya esta definido
    public void datos_cliente(String name){

        cliente =name;
        System.out.println("Cliente: "+name);

        System.out.println("Dame el numero de cuenta: ");
        cuenta =sc.nextInt();

        System.out.println("Dame el efectivo del cliente: ");
        efectivo =sc.nextDouble();

    }
    //Solo pedimos efectivo. Nombre y cuenta ya estan definidos
    public void datos_cliente(String name, int c){

        cliente =name;
        System.out.println("Cliente: "+name);

        cuenta =c;
        System.out.println("No. Cuenta: "+c);

        System.out.println("Dame el efectivo del cliente");
        efectivo =sc.nextDouble();
    }
    // Ya esta definido el nombre, cuenta y efectivo
    public void datos_cliente(String name, int c, double e){
        cliente =name;
        System.out.println("Cliente: "+name);

        cuenta =c;
        System.out.println("No. Cuenta: "+c);

        efectivo =e;
        System.out.println("Efectivo: "+e);
    }



    public double deposito(){

        saldo = 100000;
        System.out.println("Depositando en cuenta" +cuenta);
        saldo = saldo + efectivo;
        System.out.println("Saldo"+saldo+" con deposito \n"+ efectivo);
        operacion= "Deposito";
        return saldo;

    }

    public double retiro(){

        saldo = 100000;
        if (saldo >= efectivo){
            System.out.println("Retiro cuenta: " + efectivo);
            saldo = saldo - efectivo;
            operacion = "Retiro";
        }
        else 

        System.out.println("null");

        operacion = "Intento rechazado";

        System.out.println("Saldo actual: " + saldo);
        return saldo;

    }
}
