
public class LanzaHilos203 {
	public static void main(String [] args) {
		//Se crean los hilos HiloConParametros
		Hilo203 hilo1 = new Hilo203("1", 7 );
		Hilo203 hilo2 = new Hilo203("2",  5 );
		Hilo203 hilo3 = new Hilo203("3", 3 );
		
		System.out.println("Lanzando los hilos...");
		//Lanzamos los hilos
		hilo1.start();
		hilo2.start();
		hilo3.start();
		
		System.out.println("Hilos finalizados");
	}

}
