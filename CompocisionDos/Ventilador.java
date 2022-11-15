public class Ventilador {

    String tipo;
    int disipador;

    Ventilador(){
        tipo = "Freezer 7 X de Arctic Cooling";
        disipador = 4;

        Refrigeracion();
    }

    public void Refrigeracion(){
        System.out.println("\nTipo de Refrigeracion");
        System.out.println(tipo+" con "+ disipador+ " disipadores.");


    }//Fin del metodo Refrigeracion
    
}//Fin de la clase Ventilador
