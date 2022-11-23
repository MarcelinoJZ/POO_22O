
public class TFamiliar extends TeslaModel {

    int velocidad;

    @Override // Sobreescritura o remplaso de un metodo de la clase madre o superclase
    public void Velocidad(){
        System.out.println("Velocidad maxima para tesla familiar 90 km/h");
    }

    public String Potencia(){

        String octanaje = "85 octanos";
        return octanaje;
    }
    
}
