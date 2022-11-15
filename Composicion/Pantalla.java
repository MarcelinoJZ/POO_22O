public class Pantalla{
    int resoluionX;
    int resolucionY;
    int res;
    String tipo;

    public void resolucion(){
    
        resolucionY = 1920;
        resoluionX = 1080;
        res = resolucionY * resoluionX;
        tipo = "Super Alta resolucion";
        System.out.println("Resolucion de la pantalla es de " + res +" pixeles por pulgada");
                
    } // Fin de la class resolucion
    
} // Fin de la clase Pnatalla