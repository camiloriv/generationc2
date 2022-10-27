package cl.generationc2.f20221027;

import java.util.Scanner;

public class Ejercicio_geometria {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int opciones = 0;
		// rectangulo area = largo * ancho
		// rectangulo perimetro = sumas de todos los lados = num1*2 + num2*2
		// circulo area = PI * (radio*radio)
		// circulo perimetro = PI*diametro
		// triangulo area = (base * altura)/2 ---> num1 - num2
		// triangulo perimetro = suma de sus lados = num1 + num2 + num3

		System.out.println("<                           >");
		System.out.println("<           MENU            >");
		System.out.println("<                           >");
		System.out.println("<   1. Rectangulo_Area      >");
		System.out.println("<   2. Rectangulo_Perimetro >");
		System.out.println("<   3. Circulo_Area         >");
		System.out.println("<   4. Circulo_Perimetro    >");
		System.out.println("<   5. Triangulo_Area       >");
		System.out.println("<   6. Triangulo_Perimetro  >");
		System.out.println("                           ");
		System.out.println("<Selecciona una opcion>");
		opciones = scanner.nextInt();
		float lado1 = 0;
		float lado2 = 0;

		switch (opciones) {
		case 1:
			calculo_rectangulo_Area();
			break;

		case 2:
			calculo_rectangulo_Perimetro();
			break;
			
		case 3:
			calculo_circulo_Area();
			break;
			
		case 4:
			calculo_circulo_Perimetro();
			break;
		
		case 5:
			calculo_triangulo_Area();
			break;
			
		case 6:
			calculo_triangulo_Perimetro();
			break;

		default:
			System.out.println("ninguna opcion valida");
			;
		}
	}

	public static void calculo_rectangulo_Area() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("ingresa un lado del rectangulo");
		float lado1 = scanner.nextInt();
		System.out.println("ingresa el otro lado");
		float lado2 = scanner.nextInt();
		if (lado1 == lado2) {
			System.out.println("segun los datos es un cuadrado, no un rectangulo");
		} else {
			System.out.println("el Area del rectangulo es: " + lado1 * lado2);
		}
	}
	public static void calculo_rectangulo_Perimetro() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("ingresa un lado del rectangulo");
		float lado1 = scanner.nextInt();
		System.out.println("ingresa el otro lado");
		float lado2 = scanner.nextInt();
		if (lado1 == lado2) {
			System.out.println("segun los datos es un cuadrado, no un rectangulo");
		} else {
			System.out.println("el Area del rectangulo es: " + ((lado1*2) + (lado2*2)));
		}
		scanner.close();
	}
	public static void calculo_circulo_Area() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("ingresa el radio");
		float radio = scanner.nextInt();
		if (radio < 0) {
			System.out.println("el circulo no existe");
		} else {
			System.out.println("el Area del circulo es: " + (Math.PI * (radio * radio))); 
		}
		scanner.close();
	}
	public static void calculo_circulo_Perimetro() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("ingresa el radio");
		float radio = scanner.nextInt();
		if (radio < 0) {
			System.out.println("el circulo no existe");
		} else {
			System.out.println("el perimetro del circulo es: " + (Math.PI * (radio*2))); 
		}
		scanner.close();
	}
	public static void calculo_triangulo_Area() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("ingresa la base");
		float base = scanner.nextInt();
		System.out.println("ingresa la altura");
		float altura = scanner.nextInt();
		if (base < 0 || altura < 0) {
			System.out.println("el triangulo no existe");
		} else {
			System.out.println("el Area del triangulo es: " + ((base * altura)/2)); 
		}
		scanner.close();
	}
	public static void calculo_triangulo_Perimetro() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("ingresa primer lado");
		float lado1 = scanner.nextInt();
		System.out.println("ingresa segundo lado");
		float lado2 = scanner.nextInt();
		System.out.println("ingresa tercer lado");
		float lado3 = scanner.nextInt();
		if (lado1 < 0 || lado2 < 0 || lado3 < 0) {
			System.out.println("el triangulo no existe");
		} else {
			System.out.println("el Area del triangulo es: " + ((lado1 + lado2 + lado3))); 
		}
		scanner.close();
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
