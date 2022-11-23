public class CBasico {

    String nivelA;


    public void tempMotoR(int opc){

        if(opc < 20){

            System.out.println("El motor tiene una temperatura: fria");

        }

        if(opc >20 && opc <80){

            System.out.println("El motor tiene una temperatura: Regular");
        }

        if(opc >80 ){

            System.out.println("El motor tiene una temperatura: Muy caliente");

        }

    }//Fin del metodo tempMotor

    public void nivelAceite(int a){

        switch(a){
            case 1: 
                System.out.println("Nivel de Aceie: Bajo");
            break;
            case 2:
                System.out.println("Nivel de Aceite:  Regular");
            break;
            case 3: 
                System.out.println("Nivel de Aciete:  Alto");
            break;
        }

    }//Fin del metodo nivelAceite

    public void nivelGasolina(){

        System.out.println("El nivel de la gasolina es del 80 %");




    }//Fin del metodo nivelGasolina

    public void cinturonSeg(){

        System.out.println("Cuenta con cinturon de seguridad");

    }//Fin del metodo cinturonSeg

    public void apagarCarro(){


    }//Fin de metodo apagarCarro


    
}// fin de la clase CBasico
