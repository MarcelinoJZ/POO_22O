
public class Laptop {

    Memoria memoria = new Memoria();
    Pantalla pantalla = new Pantalla();
    Disco disco = new Disco(120);
    Procesador procesador = new  Procesador("Core i7", 12);
    TarjetaG tarjetag = new TarjetaG(); 
    TouchPad touchpad = new TouchPad();
    /*Teclado teclado = new Teclado();
    TarjetaV tarjetav = new TarjetaV();
    WebCam webcam = new WebCam();
    Microfono microfono = new Microfono();
    Ventilador ventilador = new Ventilador();*/


    

    
    public static void main(String []args){

        System.out.println("Monitpor de componentes de la Laptop");

        Laptop laptop = new Laptop();

        laptop.pantalla.resolucion();
        laptop.tarjetag.tarjetaGrafica();
        laptop.touchpad.touch(1);

    } // Fin del main

}// Fin de la clase Laptop
