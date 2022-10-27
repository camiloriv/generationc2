package cl.generationc2.f20221026;

import java.util.Arrays;

public class Funciones1 {

	public static void main(String[] args) {
		//Funciones
		metodo1();
		metodo2("Rodrigo");
		metodo2(3);
		metodo3(4,4.5f);
		String[] vocales = {"a","e","i","o","u"};
		metodo4(vocales);
		cantidad();
		}
		//void <-> funcion no retorna ningun valor
	public static void metodo1(){
			System.out.println("hola world");
	}
	public static void metodo2(String nombre){
		System.out.println("mi nombre es: " + nombre);
	}
	public static void metodo2(Integer numero){
		System.out.println("el numero es: " + numero);
	}
	public static void metodo3(Integer numero1, Float numero2){
		System.out.println("el numero 1 es: " + numero1);
		System.out.println("el numero 2 es: " + numero2);
	}
	public static void metodo4(String[] arreglito){
		System.out.println("el arreglito es: " + Arrays.toString(arreglito));
	}
	public static Integer cantidad() {
		Integer alumnos = 35;
		return alumnos;
	}
	
	

}
