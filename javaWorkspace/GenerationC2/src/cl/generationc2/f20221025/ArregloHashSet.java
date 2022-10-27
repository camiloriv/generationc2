package cl.generationc2.f20221025;

import java.util.HashSet;

public class ArregloHashSet {

	public static void main(String[] args) {
		// set o Hashset
		//HashSet<TIPODATO> nombre_array = new HashSet<TIPODATO>;
		
		HashSet<String> grupo7 = new HashSet<String>();
		
		//no duplica
		//ingresa datos aleatorios
		grupo7.add("Luisa");
		grupo7.add("Atenas");
		grupo7.add("Jona");
		grupo7.add("Luisa");
		
		System.out.println(grupo7);
		
		
		//verificar el contenido del arreglo
		boolean verificacionNombre = grupo7.contains("Luisa");
		System.out.println("existe el integrante 'luisa' : " + verificacionNombre);;
		
		//eliminar un elemento - se elimina por contenido
		grupo7.remove("Jona");
		System.out.println(grupo7);
		
		//tamaño del arreglo
		System.out.println("tamaño del HashSet es: " + grupo7.size());
		
	}

}
