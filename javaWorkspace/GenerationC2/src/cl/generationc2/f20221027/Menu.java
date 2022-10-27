package cl.generationc2.f20221027;

import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {

		// Menu - para que el usuario sea capaz saber que hacer
		menu();
		// Calculadora con 4 operaciones basicas
		// Solicitar 2 y capturar numeros float
		// Imprimir resultados y guardar variable
		// Ofrecer opciones de repeticion (bucles)
		// definir los metodos
		// validaciones
		// terminar la ejecucion
		// limpiar variables
	}

	public static void menu() {
		System.out.println("<-------------------->");
		System.out.println("<-------MENU--------->");
		System.out.println("<                    >");
		System.out.println("<   1. SUMAR         >");
		System.out.println("<   2. RESTAR        >");
		System.out.println("<   3. MULTIPLICAR   >");
		System.out.println("<   4. DIVIDIR       >");
		System.out.println("<   0. SALIR         >");
		System.out.println("<-------------------->");

		Scanner scanner = new Scanner(System.in);
		int opciones = 0;
		int contadorErrores = 4;

		do {
			System.out.println("<Selecciona una opcion>");
			opciones = scanner.nextInt();

			// si la opcion es cero, sale forzado del do-while con break.
			if (opciones == 0) {
				System.out.println("<Programa finalizado>");
				break;
			}

			if (contadorErrores == 0) {
				System.out.println("**Número de intentos agotados**");

				break;
			} else if (opciones < 0 || opciones > 4) {
				contadorErrores--;
				System.out.println("**Te quedan " + contadorErrores + " **");

			}
		} while (opciones < 0 || opciones > 4);

		if (opciones == 0 || contadorErrores == 0) {
			System.out.println("Adios!");
		} else {
			
			System.out.println("Ingresa el primer número");
			float num1 = scanner.nextFloat();
			System.out.println("Ingresa el segundo número");
			float num2 = scanner.nextFloat();
			
			float resultado = 0f;
			switch (opciones) {
			case 1: 
				resultado = num1 + num2;
				System.out.println("El resultado es: "+resultado);
				break;
			
			case 2: 
				resultado = num1 - num2;
				System.out.println("El resultado es: "+resultado);
				break;
			
			case 3: 
				resultado = num1 * num2;
				System.out.println("El resultado es: "+resultado);
				break;
			
			case 4: 
				if(num2 ==0) {
					System.out.println("NO SE PUEDE DIVIDIR POR CERO");
				}else {
					resultado = num1 / num2;
					System.out.println("El resultado es: "+resultado);
				}

				break;
			
			default:
				System.out.println("Opción no valida");
				break;
			}
		}
	}
}
