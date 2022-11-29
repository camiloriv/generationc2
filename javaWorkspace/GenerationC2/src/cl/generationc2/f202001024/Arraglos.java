package cl.generationc2.f202001024;

import java.util.Arrays;

public class Arraglos {

	public static void main(String[] args) {
		//arreglos en java
		
		int[] arreglo = new int[3];
		
		//agregar datos
		arreglo[0] = 4;
		arreglo[1] = 2;
		arreglo[2] = 6;
		
		System.out.println(arreglo.toString());
		System.out.println(Arrays.toString(arreglo));
		System.out.println(arreglo[0]);
		
		//{}
		int arrSinNumeros[] = {};// NO hay elementos, por lo que NO se puede sobreeescribir y/o agregar
		System.out.println(arrSinNumeros.length);
		
		String vocales[] = {"a","e","i","o","u"}; // hay elementos que pueden ser sobreescribidos
		System.out.println("La cantidad vocales es: " + vocales.length);
		vocales[0] = "k"; 
		System.out.println(Arrays.toString(vocales));
		
		
		
		//crear un array de numeros flotantes de tamaño 6.
		float[] arrfloat = new float[6]; 
		//agregar 6 elementos al arreglo
		arrfloat[0] = 5.2f;
		arrfloat[0] = 58.6f;
		arrfloat[0] = 12.5f;
		arrfloat[0] = 12.6f;
		arrfloat[0] = 12.3f;
		
		/*crear un arreglo de enteros tamaño 100
		 * y agregar valores dinamicamente,
		 * desde el 1 al 100
		 */
		
		int[] arr1al100 = new int[100];
		for(int i = 1 ; i <= 100 ; i++) {
			arr1al100[i-1]=i;
		}
		System.out.println(Arrays.toString(arr1al100));
		
		
		/*crear un arreglo de enteros tamaño 100
		 * y agregar valores dinamicamente,
		 * desde el 100 al 1
		 */
		System.out.println("");
		System.out.println("array creado dinamicamente del 100 al 1");
		int[] arr100al1 = new int[100];
		for(int i = arr100al1.length ; i >= 1 ; i--) {
			arr100al1[arr100al1.length - i]=i;
		}
		System.out.println(Arrays.toString(arr100al1));
		
		
		//otra manera
		int [] ejercicio3 = new int [100];
		for (int i= 0; i<ejercicio3.length; i++) {
			ejercicio3[i]= ejercicio3.length-i;
		}
		
		System.out.println("otra manera");
		System.out.println(Arrays.toString(ejercicio3));
		
		
		
	}

}
