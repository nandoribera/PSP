
public class LanzaHilos {
	public static void main(String[] args) {
		// Lanzamos dos hilos de forma concurrente que duren un tiempo determinado:
		Hilo208 hilo1 = new Hilo208(3);
		Hilo208 hilo2 = new Hilo208(5);
		hilo1.setName("hilo1");
		hilo1.start();

		hilo2.setName("Hilo2");
		hilo2.start();

		try {
			System.out.println("Soy el hilo princcipal y acabaré en lo que tarden ls hijxs");
			hilo1.join();
			hilo2.join();
			
		} catch (InterruptedException e) {
			System.err.println("Soy el hilo principal y me han interrumpido.");
		}
		
		

		System.out.println("Soy el hilo principal y he acabado");
	}
}
