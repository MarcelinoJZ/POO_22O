
public class Memoria{

    
    String modelo;
    String lecesc;
    String controlador;
    String memory;
    int total;
    
    



    Memoria(){
        System.out.println("\nTipo de Almacenamiento");

        modelo = "Samsung 870 EVO";
        lecesc ="560 MB/s y 530 MB/s";
        controlador = "Samsung MKX Controller";
        memory = "MLC TLC 128 capas";
        total = 12;
        totalMemoria(total);
    }


    public void totalMemoria(int m){
        System.out.print("Modelo " +modelo+"\nVelocidad: "+lecesc+ "\nControlador: " +controlador+ "\nTipo de Memoria: "+memory+ "\nEspacio total: "+m+" TB");

    }

} // Fin de la clase Memoria