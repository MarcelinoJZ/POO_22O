
public class MainTesla {

    

    public static void main(String [] args){

        System.out.println("\nDetectando tipo de tesla: \n");

        //TeslaModel tesla = new TeslaModel();
        //TFamiliar tesla = new TFamiliar();
        //TDeportivo tesla = new TDeportivo();
        TCompetencia tesla = new TCompetencia();

        tesla.Velocidad();

        System.out.println("La potencia de combustion es de : "+ tesla.Potencia()+"\n");

        TeslaModel tes = new TFamiliar();
        tes.Velocidad();

        
        TeslaModel entrada = new TeslaModel();
        TFamiliar familiar = new TFamiliar();
/******************************************************************* */
        entrada.Velocidad();
        familiar.Velocidad();
/****************************************************************** */
        entrada =familiar;
        entrada.Velocidad();

/*************************************************** */

    }// Fin del programa princiapl
    
}//Fin de la clase MainTesla
