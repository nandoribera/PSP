import java.util.Random;
import java.util.Scanner;

public class LanzaHilos205 extends Thread {
	public static void main(String [] args) throws Exception {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Cuantos hilos deseas crear? ");
		int respuesta = teclado.nextInt();
		Hilo205 [] lista = new Hilo205 [respuesta];
		
		for(int indice = 0; indice <respuesta; indice++) {
			lista[indice] = (new Hilo205(indice));
			lista[indice].start();
		}
	}
}
