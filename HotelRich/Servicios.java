import java.util.Scanner;

public class Servicios {


    String clase;
    String habitacion;
    String bebidas;
    String ducha;
    String transporte;
    String golf;
    String alberca;
    String parque;

    boolean salir = false;
    int opc; //Guardaremos la opcion del usuario

    
///#########################################  Seccion de metodos o servicios###########################//#endregion


    Servicios(){ // contrsuctor para clase baja
        clase = "Baja";
        servicioHab(1);
        bebidas = "Sin servico";
        servicioDucha(1);
        transporte = "Sin servicio";
        golf = "Sin servicio";
        alberca = "Sin servicio";
        parque = "Sin servicio";
        
    }//fin contrsuctor para clase baja
    Servicios(){
        clase = "Media";
        servicioHab(2);
        servicioAlb(2);
        servicioBebida(1);
        golf = "Sin servicio";
    }



    Servicios(String trato){ // se envianlos datos desde el Huesped.java
        clase = trato;

        servicioHab(1);
        
    }



    public void servicioHab(int opc){   
        switch(opc){
            case 1:
                habitacion = "Cama individual";
                break;
            case 2:
                habitacion = "Cama 2 individuales";
                break;
            case 3:
                habitacion = "Cama matrimonila";
                break;
            case 4:
                habitacion = "Cama king size";
                break;
            case 5:
                habitacion = "Cama Queen siza ultra suave";
                break;
        } //fin del switch
    }// fon de clase servicioHab

    public void servicioDucha(int opc){   
        switch(opc){
            case 1:
                ducha = "Basico";
                break;
            case 2:
                ducha = "Mediano";
                break;
            case 3:
                ducha = "Grnade";
                break;
            case 4:
                ducha = "jacusi";
                break;
            case 5:
                ducha = "Con hidormasaje";
                break;
        }
    }// fon de clase de serviico ducha

    public void servicioBebida(int opc){   
        switch(opc){
            case 1:
                bebidas = "Agua";
                break;
            case 2:
                bebidas = "Cerveza";
                break;
            case 3:
                bebidas = "Cocteleria basica";
                break;
            case 4:
                bebidas = "Vino Ilimitado";
                break;
            case 5:
                bebidas = "Champagne Ilimitada";
                break;
        }
    }// fin de clase servicio bebidas

    public void servicioTransporte(int opc){   
        switch(opc){
            case 1:
                transporte = "Taxi";
                break;
            case 2:
            transporte = "Auto del lujo";
                break;
            case 3:
            transporte = "Helicoptero";
            case 4:
        }
    }//fin de clase servicio transporte 

    public void servicioGolf(int opc){   
        switch(opc){
            case 1:
                golf = "Mini Golf";
                break;
            case 2:
                golf = "Carrito y ytiempo ilimitado";
                break;
                /*/ case 3:
                System.out.println("Has seleccionado la opcion 3");
                break;
             case 4:
                System.out.println("Has seleccionado la opcion 3");
                break;*/
        }
    }// flin de clase servico golf

    public void servicioAlb(int opc){   
        switch(opc){
            case 1:
                alberca = "Grande compartida";
                break;
            case 2:
                alberca = "Grnade uso personla";
                break;
             /*/ case 3:
                System.out.println("Has seleccionado la opcion 3");
                break;
             case 4:
                System.out.println("Has seleccionado la opcion 3");
                break;*/
        }//Fin de swicht
    }// fin de clase servicio alberca

    public void servicioParques(int opc){   
        switch(opc){
            case 1:
                parque = "Todos los paruqes incluidos";
                break;
            /*case 2:
                System.out.println("Has seleccionado la opcion 2");
                break;
             case 3:
                System.out.println("Has seleccionado la opcion 3");
                break;
             case 4:
                System.out.println("Has seleccionado la opcion 3");
                break;
            */
        }// Fin de switch
    }// fin de clase servico parques

}
