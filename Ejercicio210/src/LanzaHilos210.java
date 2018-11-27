
public class LanzaHilos210 {
	public static void main(String args[]) {
		Hilo210 esperaHilo1 = new Hilo210();
		Hilo210 esperaHilo2 = new Hilo210();
		
		//añadir el nombre de la clase thread
		esperaHilo1.setName("hilo 1");
		esperaHilo2.setName("hilo 2");
		
		//iniciar hilos con metodo start
		esperaHilo1.start();
		esperaHilo2.start();
		
		
		try {
			//El hilo principal espera 5 seg
			//Al no exteder la clase thread definimos el hilo principal con: Thread.currentThread() 
			Thread.currentThread().sleep(1000);
		} catch (InterruptedException e) {
			System.out.println(Thread.currentThread().getName() + " Lanzahilos210 interrumpido. ");
			return;
		}
		
		//se interrumpe el hilo1
		esperaHilo1.interrupt();
		Thread.currentThread().interrupt();
		
		System.out.println("Fin de LanzaHilos210\n");
	}
}
