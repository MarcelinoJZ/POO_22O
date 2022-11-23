
public class TCompetencia extends TeslaModel {

    int velocidad;

    @Override // Sobreescritura o remplaso de un metodo de la clase madre o superclase
    public void Velocidad(){
        System.out.println("Velocidad maxima para tesla competition 250 km/h");
    }

    public String Potencia(){

        String octanaje = "98 octanos";
        return octanaje;
    }
    
}
