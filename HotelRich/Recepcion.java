import java.util.Scanner;

public class Recepcion{

    public static void main(String[]args){

        int opcion;

        System.out.println("Bienvenido al Hotel Xcaret \n\n");
        
        do { 
            System.out.println("selecciona el tipo de habitacion que deseas: \n");

            System.out.println("1. Sencillo");
            System.out.println("2. Doble");
            System.out.println("3. Triple");
            System.out.println("4. Lujo");
            System.out.println("5. Presidencial");
            System.out.println("5. Salir");
            
            

            Scanner sn = new Scanner(System.in);
            opcion = sn.nextInt();
            System.out.println("\n");

            if(opcion == 1){

                Servicio srv = new Servicio();

                System.out.println("Tipo: " + srv.tipo);
                System.out.println("Habitacion: " + srv.habitacion);
                System.out.println("Comedor: " + srv.comedor);
                System.out.println("Albercas: " + srv.albercas);
                System.out.println("Bar: " + srv.bar);
                System.out.println("Transporte: " + srv.transporte);
                System.out.println("Parques y Atracciones: " + srv.parques +"\n");

            } // Fin del If opcion 1

            if(opcion == 2){

                Servicio srv = new Servicio(2);

                System.out.println("Tipo: " + srv.tipo);
                System.out.println("Habitacion: " + srv.habitacion);
                System.out.println("Comedor: " + srv.comedor);
                System.out.println("Albercas: " + srv.albercas);
                System.out.println("Bar: " + srv.bar);
                System.out.println("Transporte: " + srv.transporte);
                System.out.println("Parques y Atracciones: " + srv.parques+"\n");
            } // Fin del If opcion 2

            if(opcion == 3){

                Servicio srv = new Servicio("Triple", 3, 3);

                System.out.println("Tipo: " + srv.tipo);
                System.out.println("Habitacion: " + srv.habitacion);
                System.out.println("Comedor: " + srv.comedor);
                System.out.println("Albercas: " + srv.albercas);
                System.out.println("Bar: " + srv.bar);
                System.out.println("Transporte: " + srv.transporte);
                System.out.println("Parques y Atracciones: " + srv.parques+"\n");
            } // Fin del If opcion 3

            if(opcion == 4){

                Servicio srv = new Servicio("Lujo",4, 4, 4, 2, 1);

                System.out.println("Tipo: " + srv.tipo);
                System.out.println("Habitacion: " + srv.habitacion);
                System.out.println("Comedor: " + srv.comedor);
                System.out.println("Albercas: " + srv.albercas);
                System.out.println("Bar: " + srv.bar);
                System.out.println("Transporte: " + srv.transporte);
                System.out.println("Parques y Atracciones: " + srv.parques+"\n");
            } // Fin del If opcion 4

            if(opcion == 5){

                Servicio srv = new Servicio(5, 5, 5, 3, 2);

                System.out.println("Tipo: " + srv.tipo);
                System.out.println("Habitacion: " + srv.habitacion);
                System.out.println("Comedor: " + srv.comedor);
                System.out.println("Albercas: " + srv.albercas);
                System.out.println("Bar: " + srv.bar);
                System.out.println("Transporte: " + srv.transporte);
                System.out.println("Parques y Atracciones: " + srv.parques+"\n");
            } // Fin del If opcion 5
            
        }// Fin del Do (Menu)

        while (opcion < 5 );{

            System.out.println("Saliendo del Programa");

        }// Fin del while (Menu)

    }//Fin del Main

} // Fin de la clase 