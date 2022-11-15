public class Pantalla{
    int resoluionX;
    int resolucionY;
    int res;
    String tipo;

    Pantalla(){
        resolucion();
    }

    public void resolucion(){
    
        resolucionY = 1920;
        resoluionX = 1080;
        res = resolucionY * resoluionX;
        tipo = " Dell S2721HGF ";
        System.out.println("\n\nResolucion de la pantalla es de 1.920 x 1.080 pixeles y" + res +" pixeles por pulgada");
                
    } // Fin de la class resolucion
    
} // Fin de la clase Pnatalla