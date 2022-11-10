import java.util.Scanner;

public class Huesped {
    public static void main (String [] args){

        System.out.println("--Bienvenido al hotel Rich---");

        Scanner sn = new Scanner(System.in);
        boolean salir = false;
        int opcion; //Guardaremos la opcion del usuario
         
        do{
             
            System.out.println("1. Baja");
            System.out.println("2. Media");
            System.out.println("3. Alta");
            System.out.println("4. Oro");
            System.out.println("5. Platino");
            System.out.println("5. Salir");
             
            System.out.println("Escribe una de las opciones");
            opcion = sn.nextInt();
             
                if (opcion==1){
                    System.out.println("Clase baja");

                    Servicios cl = new Servicios();

                    System.out.println("El servicio es:"+ cl.clase);
                    System.out.println("El servicio es:"+ cl.habitacion);
                    System.out.println("El servicio es:"+ cl.ducha);
                }   

                if (opcion==2){
                    Servicios cl = new Servicios("Media");
                }

                if (opcion==3){
                    Servicios cl = new Servicios("Alta");
                }

                if (opcion == 4){
                    Servicios cl = new Servicios("Oro");
                }

               if (opcion == 5){
                    Servicios cl = new Servicios("Platino");
                }
            }        

        while (opcion < 5 );{

            System.out.println("Saliendo del Programa");
        }

    }

    
}
