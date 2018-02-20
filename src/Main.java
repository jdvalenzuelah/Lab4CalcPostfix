/**
 * 
 */

/**
 * Driver del programa
 * @author David Valenzuela 171001
 * @author Fernando Hengstenberg 17699
 */

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		CalculadoraPostFix calc = CalculadoraPostFix.getInstance();
		
		System.out.println("Calculadora Post fix\n Por favor seleccione una opcion para continuar:");
		System.out.println("1. Implementacion Stack con ArrayList");
		System.out.println("2. Implementacion Stack con Vector");
		System.out.println("3. Implementacion Stack con lista simplemente encadenada");
		System.out.println("4. Implementacion Stack con lista doblemente encadenada");
		System.out.println("5. Implementacion Stack con lista circular");
		String choice = sc.nextLine();
		
		switch(choice) {
		case "1":
			calc.setStack("arraylist");
			break;
		case "2":
			calc.setStack("vector");
			break;
		case "3":
			calc.setStack("simple");
			break;
		case "4":
			calc.setStack("doble");
			break;
		case "5":
			calc.setStack("circular");
			break;
		default:
			System.out.println("Opcion no valida, stack creado con arrayList");
			calc.setStack("");
			break;
		}
		
		System.out.println("ingrese ruta o el nombre del archivo");// le pedimos que ingrese el nombre del archivo
		String nombre = sc.nextLine(); // guardamos el nombre del archivo en la variable nombre
		File datos = new File(nombre);  
		try {
			String line;
			BufferedReader  reader = new BufferedReader(new FileReader(datos));
			 while((line = reader.readLine()) != null) {
			System.out.println(line + " =" + calc.calcular(line));
			 }
			 reader.close();
		}catch(IOException e) {
			System.out.println("Error: " + e.getMessage()); // en caso de algun error 
}
		
		
	}

}
