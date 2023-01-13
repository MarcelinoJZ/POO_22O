class Avion extends Vehiculo{
String combus;
	public String combustible(int tipo){
		if (tipo==1){
			combus="Turbocina";
		
		}	
		return combus;
	}
	public int desplazamiento(int num){
		int km=0;
		if (num==1){
			km=100540;
		}
		return km;
	}


}
