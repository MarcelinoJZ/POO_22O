class Fijo{

    static int x = 8; //Cuado uso static se modifica el valor desde la ubicacion de memoria
    int y = 10;

}
public class PruebaStatic{

    public static void main(String [] args){

        Fijo fobj1 = new Fijo();
        Fijo fobj2 = new Fijo();

        System.out.println("Comprobante atributo static: ");
        System.out.println("El valor de X1 es: " +fobj1.x);
        System.out.println("El valor de X2 es: " +fobj2.x);

        System.out.println("El valor de Y1 es: " +fobj1.y);
        System.out.println("El valor de Y2 es: " +fobj1.y);



       // Fijo.x = Fijo.x + 50; // Modificacion a la memoria

        //Fijo.y = Fijo.y + 80;                   //Y no es una variable static

        System.out.println("\n");
        System.out.println("El valor de X1 es: " +fobj1.x);
        System.out.println("El valor de X2 es: " +fobj2.x);

        System.out.println("El valor de Y1 es: " +fobj1.y);
        System.out.println("El valor de Y2 es: " +fobj2.y);


        //fobj1.x = fobj1.x + 80;
        fobj2.x = fobj2.x + 125;

        fobj1.y = fobj1.y + 30; //Modificacion solo en el objeto
        fobj2.y = fobj2.y + 123;
        
        System.out.println("\n");
        System.out.println("El valor de X1 es: " +fobj1.x);
        System.out.println("El valor de X2 es: " +fobj2.x);

        System.out.println("El valor de Y1 es: " +fobj1.y);
        System.out.println("El valor de Y2 es: " +fobj2.y);

    }//Fin del Main
    
}//cFin de la clase PruebaStatuc