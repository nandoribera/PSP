
public class LanzaHilos209 {
	public static void main(String [] args) {
		//Se crean los hilos HiloConParametros
		Hilo209 hilo1 = new Hilo209("1", 7, 3);
		Hilo209 hilo2 = new Hilo209("2",  5, 5);
		Hilo209 hilo3 = new Hilo209("3", 3, 2);
		
		System.out.println("Lanzando los hilos...");
		//Lanzamos los hilos
		hilo1.start();
		hilo2.start();
		hilo3.start();
		
		
		try {
			System.out.println("Soy el hilo princcipal y acabaré en lo que tarden ls hijxs");
			hilo1.join();
			hilo2.join();
			hilo3.join();
			
		} catch (InterruptedException e) {
			System.err.println("Soy el hilo principal y me han interrumpido.");
		}
		
		

		System.out.println("Soy el hilo principal y he finalizado mi ejecución.");
		Thread.currentThread().stop();
	
		System.out.println("Hilos finalizados");
	}

}
