import java.util.Scanner;

public class RunThread {
	public static void main(String[]args) {
		
	Scanner tcl = new Scanner(System.in);
	System.out.println("Introduce números de la secuencia");
	int N = tcl.nextInt();
	
	HiloFibonacci hilo = new HiloFibonacci();
	
	hilo.HiloFibonacciN(N);
	hilo.start();
	
	}
}
