
public class Hilo209 extends Thread {
	// Creamos una clase que hereda de Thread y cremos una variable de la clase
	public String parametro;
	public int repeticion;
	public int espera;

	// Constructor con parametros donde recoge el nombre y las iteraciones
	public Hilo209(String parametro, int repeticion, int espera) {
			super(parametro);
			this.repeticion = repeticion;
			this.espera = espera * 1000; 
    }

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
