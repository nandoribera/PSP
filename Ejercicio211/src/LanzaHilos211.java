
public class LanzaHilos211 {
	public static void main(String[] args) {
		// Lanzamos dos hilos de forma concurrente que duren un tiempo determinado:
		Hilo211 hilo1 = new Hilo211(3);
		Hilo211 hilo2 = new Hilo211(5);
		Hilo211 hilo3 = new Hilo211(20);
		hilo1.setName("hilo1");
		hilo1.start();
		
		hilo2.setName("Hilo2");
		hilo2.start();
		
		
		hilo3.setName("Hilo3Daemon");
		
		//Convertir hilo3 en daemon
		hilo3.setDaemon(true);
		hilo3.start();
		
		//Comprobar si hilo3 es daemon
		System.out.println("Hilo3 es Daemon? " + hilo3.isDaemon());
		
		try {
			Thread.currentThread().sleep(4000);
			System.out.println("Soy el hilo principal y acabaré en 4 segundos");
		} catch (InterruptedException e) {
			System.err.println("Soy el hilo principal y me han interrumpido.");
		}
		
		System.out.println("Soy el hilo principal y he acabado");
	}

}
