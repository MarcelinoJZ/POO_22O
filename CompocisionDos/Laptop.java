public class Laptop {
    TarjetaMadre tarjetam = new TarjetaMadre();
    Procesador procesador = new  Procesador("Ryzen 9 7950X", 32, 16);
    Memoria memoria = new Memoria();
    Disco disco = new Disco(10.54848);
    Ram ram = new Ram();
    Pantalla pantalla = new Pantalla();
    TarjetaG tarjetag = new TarjetaG();
    Teclado teclado = new Teclado("Asus ROG Strix Scope RX TKL Wireless Deluxe");
    WebCam cam = new WebCam();
    TouchPad touch = new TouchPad(2);  
    Microfono microfono = new Microfono();
    Ventilador ventilador = new Ventilador();
}// Fin de la clse laptop