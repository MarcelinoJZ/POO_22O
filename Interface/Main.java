public class Main
{
 public static void main(String[] args) {
     
     Instrumento ints = new Cuerdas();
     ints.tipoInstrumento();
     ints.afinacion();
     
     Instrumento ints1 = new Viento();
     Genero ints2 = new Viento();
     
  
     ints1.tipoInstrumento();
     ints1.afinacion();
     ints2.tradicional();
     
     
 }
}