
public class LanzaHilos {
	public static void main(String[] args) {
		// Lanzamos dos hilos de forma concurrente que duren un tiempo determinado:
		Hilo207 hilo1 = new Hilo207(3);
		Hilo207 hilo2 = new Hilo207(5);
		hilo1.setName("hilo1");
		hilo1.start();
		
		hilo2.setName("Hilo2");
		hilo2.start();
		
		try {
			Thread.currentThread().sleep(4000);
			System.out.println("Soy el hilo princcipal y acabaré en 4 segundos");
		} catch (InterruptedException e) {
			System.err.println("Soy el hilo principal y me han interrumpido.");
		}
		
		System.out.println("Soy el hilo principal y he acabado");
	}

}
