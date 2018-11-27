
public class Hilo210 extends Thread {
	@Override
	//metodo run de la clase thread
	public void run() {
		//se obtiene el nombre del hilo actual
		System.out.println("Soy el " + getName() + " empezando.");
		
		//cuando el hilo duerme puede ser interrumpido, necesita una excepcion de interrupcion
		try {
			//el hilo espera 10seg
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			//Excepción si el hilo se interrumpe
			System.out.println(getName() + " interrumpido.");
			return;
		}
		System.out.println(getName() + " acabado.");
	}
}
