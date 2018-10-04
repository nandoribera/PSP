import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class runTime2 {
	public static void main(String[] args) throws IOException {

		if (args.length <= 0) {
			System.err.println("Se necesita un programa a ejecutar");
			System.exit(-1);
		}
		
		Runtime runtime = Runtime.getRuntime();
		Scanner s = new Scanner(System.in);

		ProcessBuilder pb = new ProcessBuilder(args);

		try {
			Process process = runtime.exec(args, null, new File("/home/ferviu/PSP/EjemploRuntime2"));
			
			System.out.print("Soy ejemplo runtime2...");	
			String nombre;
			nombre = s.nextLine();
			s.close();
			
			process.destroy();
			
//			int retorno = process.waitFor();
//			System.out.println("La ejecución de " + Arrays.toString(args) + " devuelve " + retorno);
//			
		} catch (IOException ex) {
			System.err.println("Excepción de E/S");
			System.exit(-1);
			
		} 
//		catch (InterruptedException ex) {
//			System.err.println("El proceso hijo finalizó de forma incorrecta");
//		}
//	}
	}
}
