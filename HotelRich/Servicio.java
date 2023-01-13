// Contrsuctor para inicializarlos atributos 
public class Servicio {
    String tipo;
    String habitacion;
    String comedor;
    String albercas;
    String bar;
    String transporte;
    String parques;

    Servicio(){ // contrsuctor para tipo Sencillo
        tipo = "Sencilla";
        servicioHabitacion(1);
        servicioComedor(1);
        servicioAlbercas(1);
        bar = "Sin servicio de bar";
        transporte = "Sin servicio de transporte";
        parques = "Sin acceso a parques y atracciones";
        
    }//fin contrsuctor para tipo sencillo

    Servicio(int a){ // contrsuctor para tipo doble
        tipo = "Doble";
        servicioHabitacion(a);
        servicioComedor(a);
        servicioAlbercas(2);
        bar = "Sin servicio de bar";
        transporte = "Sin servicio de transporte";
        parques = "Sin acceso a parques y atracciones";
        
    }//fin contrsuctor para tipo doble

    Servicio(String trato, int a, int b){ // contrsuctor para tipo triple
        tipo = trato;
        servicioHabitacion(3);
        servicioComedor(a);
        servicioAlbercas(b);
        servicioBar(3);
        transporte = "Sin servicio de transporte";
        parques = "Sin acceso a parques y atracciones";
        
    }//fin contrsuctor para tipo triple

    Servicio(String trato, int a, int b, int c, int d, int e){ // contrsuctor para tipo lujo
        tipo = trato;
        servicioHabitacion(a);
        servicioComedor(b);
        servicioAlbercas(c);
        servicioBar(d);
        servicioTransporte(e);
        parques = "Sin acceso a parques y atracciones";
        
    }//fin contrsuctor para tipo lujo

    Servicio( int a, int b, int c, int d, int e){ // contrsuctor para tipo presidencial
        tipo = "Presidencial";
        servicioHabitacion(a);
        servicioComedor(b);
        servicioAlbercas(c);
        servicioBar(d);
        servicioTransporte(e);
        servicioParques(1);
        
    }//fin contrsuctor para tipo presidencial

    public void servicioHabitacion(int opc){
        switch(opc){
            case 1:
                habitacion = "Habitacion Sencilla - Cama individual";
                break;
            case 2:
                habitacion = "Habitacion Doble - Cama matrimonial";
                break;
            case 3:
                habitacion = "Habitacion Triple - Cama matrimonial, individual";
                break;
            case 4:
                habitacion = "Habitacion Lujo - Cama King Size";
                break;
            case 5:
                habitacion = "Habitacion Presidencial - Recamaras separadas";
                break;

        } //fin del switch

    }// Fin del metodo servicioHabitacion

    public void servicioComedor( int opc){

        switch(opc){
            case 1:
                comedor = "Solo desayuno";
                break;
            case 2:
                comedor = "Desayuno Cena";
                break;
            case 3:
                comedor = "Desayuno, Comida, Cena";
                break;
            case 4:
                comedor = "Todo excepto mariscos";
                break;
            case 5:
                comedor = "Todo Incliudo sin limite";
                break;
        } // Fin del switch

    }//Fin de metodo servicioComedor

    public void servicioAlbercas(int opc){

        switch(opc){
            case 1:
                albercas = "Acceso General";
                break;
            case 2:
                albercas = "Alberca General con entrada preferencial";
                break;
            case 3:
                albercas = "Alberca con juegos";
                break;
            case 4:
                albercas = "Alberca propia";
                break;
            case 5:
                albercas = "Alberca Propia y masajes";
                break;
        }// Fin del switch servicioAlbercas

    }// Fin del metodo servicioAlbercas 

    public void servicioBar(int opc){

        switch(opc){
            case 1:
                bar = "Solo Sodas";
                break;
            case 2:
                bar = "Sodas y Cervezas";
                break;
            case 3:
                bar = "Todo ilimitado";
                break;
        }// Fin del swicht sericioBar

    } // Fin del metodo servicioBar

    public void servicioTransporte(int opc){
        switch(opc){
            case 1:
                transporte = "Transporte ejecutivo";
                break;
            case 2:
                transporte = "Helicoptero / Deportivo";
                break;

        } // Fin del switch servicioTransporte

    } // Fin de metodo servicioTransporte




    public void servicioParques(int opc){
        switch(opc){
            case 1:
                parques = "Todos los parques y entradas ilimitadas";
                break;
        }// Fin del switch servicioParques

    }//Fin del metodo servicioParques

}// Fin de la tipo Servicio
    

