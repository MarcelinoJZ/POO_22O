package Auto.Tesla;

public class Sensores {


    Sbasico tbas = new Sbasico();
    Slujo tlujo = new Slujo();
    //SPreminum tprem = SPreminum();

    public void Verifica(){
        System.out.println("Verificando");

        tbas.frenos();
        System.out.println("Basico frenos F"+tbas.f);

        tbas.ventanas();
        //System.out.println("Basico Ventanas F"+tbas.v);


        //tlujo.frenos();
        System.out.println("Basico frenos F"+tbas.f);

        //tlujo.ventanas();
        //System.out.println("Basico Ventanas F"+tbas.v);

        //tprem.frenos();
        //System.out.println("Basico frenos F"+tbas.f);

        //tprem.ventanas();
        // System.out.println("Basico Ventanas F"+tbas.v);
    }
}

    
   