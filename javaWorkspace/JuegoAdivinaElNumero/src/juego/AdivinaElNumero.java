package juego;
import java.util.Scanner;

public class AdivinaElNumero {
	private Scanner entrada = new Scanner(System.in);
	private boolean juegoActivo = true;

	public void jugar() {
		System.out.println("Hola, Cual es tu nombre?");
		String nombreJugador = entrada.nextLine();
		System.out.printf("BIENVENIDO %s, vamos a comenzar\n" , nombreJugador);
		
		while(juegoActivo) {
			int intentos = 0;
			int min = 0;
			int max = 100;
			int numeroJuego = (int) (Math.random() * ((max - min) + 1));
			System.out.printf("%s, he escongido un numero entre %d y %d, Adivinalo!" , nombreJugador, min, max);
			System.out.println("Escoge un numero");
			int numeroJugador;
			
			
			do {
				
				numeroJugador = entrada.nextInt();
				if(numeroJugador > numeroJuego) {
					System.out.println("Muy ALTO, intenta otra vez");
				} else if (numeroJugador < numeroJuego) {
					System.out.println("Muy BAJO, intenta otra vez");
				}
				intentos++;
				
			} while(numeroJuego != numeroJugador);
			
			System.out.printf("ganaste! y con solo %d intentos", intentos);
			juegoActivo = false;
		
		}
		
	}
}
