class Transporte{

	public static void main (String[] args){
	
		Vehiculo v1=new Auto();
		System.out.println("\n\n Auto");
		System.out.println("tipo de combustible: "+v1.combustible(1));
		System.out.println("Desplzamiento: "+v1.desplazamiento(1));
		System.out.println("los pasajeros son: "+v1.pasajeros(1));
	
	
		Vehiculo v2=new Avion();
		System.out.println("\n\nAvion");
		System.out.println("tipo de combustible: "+v2.combustible(1));
		System.out.println("Desplzamiento: "+v2.desplazamiento(1));
		System.out.println("los pasajeros son: "+v2.pasajeros(2));
		
		
		
		Vehiculo v3=new Barco();
		System.out.println("\n\nBarco");
		System.out.println("tipo de combustible: "+v3.combustible(1));
		System.out.println("Desplzamiento: "+v3.desplazamiento(1));
		System.out.println("los pasajeros son: "+v3.pasajeros(3));
		
		
		Vehiculo v4=new Moto();
		System.out.println("\n\nMoto");
		System.out.println("tipo de combustible: "+v4.combustible(1));
		System.out.println("Desplzamiento: "+v4.desplazamiento(1));
		System.out.println("los pasajeros son: "+v4.pasajeros(4));
	
	
	
	}

}
