
public class Memoria{

    int total;

    Memoria(){
        System.out.println("Leyendo total de mmoria en el dispositivo");
        total = 1200;
        totalMemoria(total);
    }


    public void totalMemoria(int m){
        System.out.print("Memoria disponible: " + m );

    }

} // Fin de la clase Memoria