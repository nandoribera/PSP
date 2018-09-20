package holaMundo4;
	import java.util.*;
	import java.io.*;
	
public class holaMundo4{

	public static void main (String[]args){
	Scanner s = new Scanner(System.in);
	String fichero = "HolaMundo3.txt";
	String nombre;
	System.out.println("Escribe tu nombre");
	nombre = s.next();
	int a = 0;



	try{
	BufferedWriter ficheroSalida = new BufferedWriter(
	new FileWriter(new File("HolaMundo3.txt")));
	while(a<20){
	ficheroSalida.write("hola "+nombre);
	ficheroSalida.newLine();
	a++;}
	ficheroSalida.close();

	}
	catch (IOException errorDeFichero){
	System.out.println("Ha habido problemas: " +
	errorDeFichero.getMessage() );
	}


	}
}
