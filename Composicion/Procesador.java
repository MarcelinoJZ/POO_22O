public class Procesador {


    Procesador(String t, int h){

        tipoProcesador(t, h);

    }//Fin del constructor

    public void tipoProcesador(String t, int h){

        System.out.println("Tipo " +t+" con "+h+" hilos");

    }// Fin del metodo tipoProcesador
    
}// Fin de la clase Procesador
