abstract class Vehiculo{

public abstract String combustible (int tipo);
public abstract int desplazamiento(int num);

	public int pasajeros(int pas){
	
		int pasajeros=0;
		if (pas==1){
			pasajeros =5;

		}
		if (pas==2){
			pasajeros=150;
		}
		if (pas==3){
			pasajeros=1632;
		
		}
		if (pas==4){
			pasajeros=2;
		}
		return pasajeros;
	}//fin del metodo


}//fin de la clase 
