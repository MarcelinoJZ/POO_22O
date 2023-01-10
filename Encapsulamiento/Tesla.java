import Auto.Tesla.*;
class Tesla{ //inicio de la clase 
	//Sbasico bas=new Sbasico();
	//Slujo lujo = new Slujo();
	//Slujo bas=new Slujo();
	SPreminum prem=new SPreminum();

	public static void main(String[] args){
		
		System.out.println("\nSerbicio basico ");
		//Sbasico bas=new Sbasico();
		Tesla tes=new Tesla();

		Sensores sen = new Sensores();
		sen.Verifica();
	
		/*tes.bas.tempmotor();
		tes.bas.nivelaceite();
		tes.bas.nivelgasolina();
		//bas.apagarmotor();
		//bas.
		
		tes.lujo.estereo();
		tes.prem.serviciox();
		*/
		tes.prem.cajanegra();
		//tes.prem.frenos();
		//tes.prem.ventanas();
		
	
	}




} //fin de la classe tesla 
