package cl.generationc2.f20221025;

import java.util.ArrayList;

public class ArregloDinamico {

	public static void main(String[] args) {
		// ArrayList
		
		//1.-Definicion
		//ArrayList<TIPODATO> nombre_arreglo = new ArrayList<TIPODATO>();
		
		ArrayList<String> grupo7 = new ArrayList<String>();
		//2.-Agregar valores al arreglo
		grupo7.add("Atenas");
		grupo7.add("Luisa");
		grupo7.add("Luis");
		grupo7.add("Jonathan");
		grupo7.add("Camilo");
		
		//mostrar array
		System.out.println(grupo7);
		//mostrar tamaño del array
		System.out.println(grupo7.size());
		//mostrar 1 elemento por su posicion
		System.out.println(grupo7.get(grupo7.size()-1));
		//eliminar un elemento por su posicion
		grupo7.remove(2);
		System.out.println(grupo7);
		//6.- recorrer el ArrayList
		for(int i = 0; i < grupo7.size() ; i++){
			System.out.println("integrante: "+grupo7.get(i));
		}
		grupo7.add("Luis");
		System.out.println("*******");
		
		//for de objeto o iterador
		for( String integrante: grupo7){
			System.out.println("integrante: " + integrante);
			System.out.println(integrante);
		}
		
	}

}
