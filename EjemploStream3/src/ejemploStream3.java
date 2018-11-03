import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.io.*;
import org.omg.CORBA.portable.OutputStream;

public class ejemploStream3 {
	public static void main(String[] args) throws IOException {
		
		//Argumento al processBuilder
		ProcessBuilder pb = new ProcessBuilder("passwd");
		
		//Proceso
		Process process = pb.start();
		
		//OutputStream a entrada estandar del hijo
		java.io.OutputStream os = process.getOutputStream();
		
		//introducir argumentos en el OutputStream
		//con argumento "\n" para intro
		//vaciar OutputStream con flush
		//Metodo .getBytes para "os.write" le pasa bytes no string como argumento
		//getbytes transforma una cadena de caracteres en bytes
		os.write("hola\n".getBytes());
		os.flush();
		os.write("hola\n".getBytes());
		os.flush();
		os.write("hola\n".getBytes());
		os.flush();

		//InputStream salida del proceso
		//asignar a InputStream para leer la salida del proceso
		InputStream is = process.getInputStream();
		InputStreamReader isr1 = new InputStreamReader(is);
		BufferedReader br1 = new BufferedReader(isr1);
		
		//getErrorStream para obtener la salida de error del proceso
		//Asignar a objeto InputStream para leer el valor del resultado de error
		InputStream err = process.getErrorStream();
		InputStreamReader isr2 = new InputStreamReader(err);
		BufferedReader br2 = new BufferedReader(isr2);
		
		//variable string para leer los resultados
		String line;

		System.out.println("Salida estandar del proceso " + Arrays.toString(args) + " :");
		while ((line = br1.readLine()) != null) {
			System.out.println("Salida estandar ->" + line);
		}

		//Escribir salida estandar del proceso principal
		System.out.println("Salida de error " + Arrays.toString(args) + " :");
		//Leer lineas del proceso en salida estandar de error del buffered reader conectado con el error
		while ((line = br2.readLine()) != null) {
			System.out.println("Error -> " +  line);
		}
	}
}
