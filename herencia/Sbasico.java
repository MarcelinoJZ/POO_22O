public class Sbasico{  //este es el "codigo padre, las demas clases beben de tener estos caracteres basicos 
	
	/*Sbasico(){ //Constructor del servicio vasico
	System.out.println("verificando censores");
	tempmotor();
	nivelaceite();
	nivelgasolina();
	cinturonseguridad();
	apagarmotor();
	
	
	
	} 
	*/

	public void tempmotor(){ //metodo temperatura del motor
		char a='m';
		System.out.println("Entrando a verificar temperatura del motor");
		switch (a) {
			case 'l': System.out.println("Temperatura del motor baja");
				break;
			case 'm': System.out.println("Temeperatura del motor media");
				break;
			case 'h': System.out.println("Tempereatura del motor alta procediendo a apagar motor");
				break;
		} //fin del case
	
	
	} //fin del metodo tempmotor



	public void nivelaceite(){ //metodo nivel de acceite 
		char a='m';
		System.out.println("Enrando a verificar nivel de aceite");
		switch (a) {
			case 'l': System.out.println("nivel del aceite bajo procediendo a apagar motor");
				break;
			case 'm': System.out.println("Nivel del aceite media, se recomienda rellenar el faltante");
				break;
			case 'h': System.out.println("Nivel de acite normal ");
				break;
	
		}
	} //fin del metodo nivelaceite
	
	
	
	public void nivelgasolina(){  //metodo nivel de gasolina
		char a='m';
		System.out.println("Entrando a verificar nivel de gasolina");
		
		switch (a) {
			case 'l': System.out.println("Nivel de gasolina bajo; rellene el teanque urgentemente");
				break;
			case 'm': System.out.println("nivel de gasolina media; se recominda rellenar ");
				break;
			case 'h': System.out.println("Nivel de gasolina alto ");
				break;
		}
	
	
	} //fin metodo nivelgasolina
	
	
	public void cinturonseguridad(){ //metodo del cinturon de seguridad 
		System.out.println("verificando si se tiene el cinturon de seguridad");
	
	
	} //fin metodo cinturonseguridad
	
	
	
	public void apagarmotor(){//metodo de apagado del motor
		System.out.println("Apagando el motor ");
	
	
	} //fin metodo apagarmotor
	
	
	
}
