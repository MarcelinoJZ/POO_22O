package Auto.Tesla;

public class Slujo extends Sbasico{  //codigo hijo, recibe todos los metodos de la clase padre en este caso Sbasico 

	public Slujo(){ //Constructor del servicio basico y agrega una clase 
	System.out.println("verificando censores");
	tempmotor();
	nivelaceite();
	nivelgasolina();
	cinturonseguridad();
	apagarmotor();
	System.out.println("\n Servicio de lujo \n ");
	estereo();
	
	}  

	public void estereo(){ //inicio de una clase x
		int a=1;
		System.out.println("Verificando Estereo");
		switch(a)  {
			case 1: System.out.println("Estereo basico de botones radio y auxiliar");
				break;
			case 2: System.out.println("Estereo basico de botones, radio, auxiliar, bluetooth");
		
		}
	
	}
	




}
