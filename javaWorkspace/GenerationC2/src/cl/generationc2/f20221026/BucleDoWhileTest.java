package cl.generationc2.f20221026;

import java.util.Scanner;

public class BucleDoWhileTest {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String nombre;
		String apellido; 
		int edad = 0;
		Float kilos = 0F;
		Float estatura = 0f;
		Float IMC = 0f;
		String definicion_IMC = null;
		
		
		System.out.println("Ingresa tu nombre");
		nombre = scanner.next();
		System.out.println("Ingresa tu apellido");
		apellido = scanner.next();
		
		do {
			System.out.println("Debes ser mayor de edad, ingresa tu edad");
			edad = scanner.nextInt();
		} while (edad < 18);
		System.out.println("");
		
		do {
			System.out.println("Ingresa tu peso en Kilogramos");
			kilos = scanner.nextFloat();
		} while (kilos < 40 || kilos > 150);
		System.out.println("Tu peso es: " + kilos + "Kgrs");
		System.out.println("");
		
		do {
			System.out.println("Ingresa tu estatura en metros");
			estatura = scanner.nextFloat();
		} while (estatura < 1.5 || estatura > 2.67);
				
		
		//scanner.nextFloat();
				
		//Se realiza cálculo del IMC
		IMC = kilos / (estatura * estatura);
		if (IMC < 18.5F) {
			definicion_IMC = "bajo de peso";
		} else if (IMC >= 18.5 && IMC < 25) {
			definicion_IMC = "normal";
		} else if (IMC >= 25 && IMC < 30) {
			definicion_IMC = "sobrepeso";
		} else if (IMC >= 30) {
			definicion_IMC = "obesidad";
		}
		System.out.println("-----RESULTADO DE LA CONSULTA-----");
		System.out.println("El paciente: " + nombre + " " + apellido);
		System.out.println("edad: " + edad + " años");
		System.out.println("peso: " + kilos + " kls");
		System.out.println("estatura: " + estatura + " mts");
		System.out.println("DIAGNOSTICO: " + definicion_IMC + ", debido a que su IMC es: " + IMC);
		
		scanner.close();

	}
}
