public class Procesador {


    Procesador(String t, int h, int n){

        tipoProcesador(t, h, n);

    }//Fin del constructor

    public void tipoProcesador(String t, int h, int n){

        System.out.println("Procesador");

        System.out.println(t+" con "+h+" hilos y "  +n+" nucleos");

    }// Fin del metodo tipoProcesador
    
}// Fin de la clase Procesador
