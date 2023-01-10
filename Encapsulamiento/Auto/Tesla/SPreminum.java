package Auto.Tesla;

public class SPreminum {

/*
    public void SeguroAauto(){
        System.out.print("Seguros automaticos");
    }
    

    public void AirBag(){
        System.out.println("Cuenta con 6 bolsas de aire");
    }

    public void AireLlanta(){
        System.out.println("Cuneta socn sensor de presion de llantas");
    }

    public void Clima(){
        System.out.println("Cuenta con clima en los acientos");
    }*/


    public void cajanegra(){

        System.out.println("Caja negra");

        Sbasico tb = new Sbasico();

        tb.ventanas();
        tb.frenos();

        System.out.println("Y es privada:"+ tb.f);
        //System.out.println("Y es privada:"+ tb.v); No se puede acceder porque es privada
    }
}
