package cl.generationc2.f20221026;

import java.util.Scanner;

public class CapturarDatos {

	public static void main(String[] args) {
		System.out.println(calculoIMC());
		
	}
	
	public static Float calculoIMC() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ingrese su peso en kilogramos");
		Float peso = scanner.nextFloat();
		System.out.println("Ingrese su estatura en metros");
		Float estatura = scanner.nextFloat();
		Float result = peso / (estatura * estatura);
		
		scanner.close();
		return result;
	}
}
