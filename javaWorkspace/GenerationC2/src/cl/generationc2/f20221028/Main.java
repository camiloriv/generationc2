package cl.generationc2.f20221028;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// instanciar estudiante

		pedir_datos();

	}

	public static void pedir_datos() {
		Scanner scanner = new Scanner(System.in);
		ArrayList<Estudiante> estudiantes = new ArrayList<Estudiante>();
		Integer continuar = 0;
		do {
		
		System.out.println("introduce el nombre");
		String nombre = scanner.next();
		System.out.println("introduce el apellido");
		String apellido = scanner.next();
		System.out.println("introduce la edad");
		Integer edad = scanner.nextInt();
		
		Estudiante estudiante = new Estudiante(nombre, apellido, edad);
		estudiantes.add(estudiante);
		System.out.println("¿DESEA CONTINUAR? (1)SI (0)NO");
		continuar = scanner.nextInt();
		scanner.nextLine();
		
		}while(continuar == 1);
		
		for(Estudiante estudiante : estudiantes) {
			System.out.println("Nombre: " + estudiante.getNombre());
			System.out.println("Apellido: " + estudiante.getApellido());
			System.out.println("Edad: " + estudiante.getEdad());
		}
		
		scanner.close();
	}

}
