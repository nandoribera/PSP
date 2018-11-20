
public class LanzaHilos {
	public static void main(String args[]) {
		RunnableClass rc = new RunnableClass();	// Crea objeto RunnableClass
		
		//Creación de hilos
		Thread hilo1 = new Thread(rc);
		Thread hilo2 = new Thread(rc);
		Thread hilo3 = new Thread(rc);
		
		//Asignar nombres a hilos
		hilo1.setName("Hilo1");
		hilo2.setName("Hilo2");
		hilo3.setName("Hilo3");
		
		// No hay control de hilos
		System.out.println("Hilo principal");
		//Iniciar hilos<
		hilo1.start();
		hilo2.start();
		hilo3.start();
		System.out.println("He terminado...");
	}
}
