
public class Hilo212 extends Thread {
	int espera;
	
	public Hilo212(int espera) { 
        this.espera = espera * 1000; 
    }

	// Método que contiene las acciones que hará el hilo cuando se ejecute.
	
	public void run() {
		String nombre = Thread.currentThread().getName();
		System.out.println("Soy el hilo " + nombre + " y he iniciado mi ejecución.");
		System.out.println("Soy el hilo " + nombre + " y voy a parar mi ejecución " + espera + " ms.");
		
		try {
			sleep(espera);
		} catch (InterruptedException e) {
			System.err.println("Soy el hilo " + nombre + " y me han interrumpido.");
		}
		System.out.println("Soy el hilo " + nombre + " y continúo mi ejecución.");
		System.out.println("Soy el hilo " + nombre + " y he finalizado mi ejecución.");
	}
	
}
