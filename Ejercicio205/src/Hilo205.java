import java.io.Serializable;

public class Hilo205 extends Thread{
	
	public int numero;
	
	public Hilo205(int numero) throws Exception {
		this.numero = numero;
	}
	public void run() {
		System.out.println("Hilo lanzado " + (numero + 1));
		System.out.println("Hilo finalizado " + (numero + 1));
		
}
}

