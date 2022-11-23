
public class TDeportivo extends TeslaModel {

    int velocidad;

    @Override // Sobreescritura o remplaso de un metodo de la clase madre o superclase
    public void Velocidad(){
        System.out.println("Velocidad maxima para tesla deportivo200 km/h");
    }

    public String Potencia(){

        String octanaje = "92 octanos";
        return octanaje;
    }
    
}
