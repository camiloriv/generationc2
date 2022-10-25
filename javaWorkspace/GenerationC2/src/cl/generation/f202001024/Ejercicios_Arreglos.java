package cl.generation.f202001024;

import java.util.Arrays;

public class Ejercicios_Arreglos {

	public static void main(String[] args) {


		/*Escribir un arreglo de tamaño de 10 ,con números 
		 * positivos y negativos , capturar en máximo y mínimo
		 */
		
		int arr[] = {5,8,1,6,9,-6,3,-10,6,3};
		int max = 0;// 5 / 8
		int min = 0;
		
		for (int i = 0 ; i < arr.length ; i++) {
			if( arr[i] < min ) { // arr[0] = 5 < 0   /  arr[1] = 8 < 0
				min = arr[i];
			} else if (arr[i] > max) { //arr[0] = 5 > 0   /arr[1] = 8 > 5
				max = (arr[i]); // max = 5 / 8
			} 
			
		}
		System.out.println("el maximo es: " + max);
		System.out.println("el minimo es: " + min);
		
		
		/*
		 * 2. El mismo arreglo crear otros 2 arreglos, uno con 
		 * solo los pares y otro arreglo solo con los impares
		 */
		
		int arrPar[] = new int[arr.length]; // arreglo de pares
		int arrImpar[] = new int[arr.length]; // arreglo de impares
		
		for (int i = 0 ; i < arr.length ; i++) {
			if(arr[i] % 2 == 0) {
				arrPar[i] = arr[i];
			} else if (arr[i] % 2 != 0) {
				arrImpar[i] = arr[i];
			}
		}
		System.out.println("arreglo con pares: " + Arrays.toString( arrPar));
		System.out.println(arrPar.length);
		System.out.println("arreglo con impares: " + Arrays.toString(arrImpar));
		
		
		/*
		 * 3. Para el mismo arreglo, sacar el promedio de los números.
		 */
		
	}

}
