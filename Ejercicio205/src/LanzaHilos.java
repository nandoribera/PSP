import java.util.Random;
import java.util.Scanner;

public class LanzaHilos extends Thread {
	public static void main(String args[]) {
		
		Scanner tcl = new Scanner(System.in);
		System.out.println("Introduce número de hilos: ");
		int n = tcl.nextInt();
		
		if (n > 10) {
			System.out.println("No se pueden crear mas de 10 hilos");
		} else {
			Hilo205[] arraydeHilos;
			arrayDeHilos = new Hilo205[n];
			
			for (int i = 0; i < n; i++) {
				Thread hilo = new Thread(rc);
				hilo.setName("hilo"+(i+1));
				hilo.start();
				
			}
		}
	}
}
