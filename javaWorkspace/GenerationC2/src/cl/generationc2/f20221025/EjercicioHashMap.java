package cl.generationc2.f20221025;

import java.util.HashMap;
import java.util.Iterator;

public class EjercicioHashMap {

	public static void main(String[] args) {
		/*HashMap<String, Integer> mapa = new HashMap<>();
        
        mapa.put("producto1", 5);
        mapa.put("producto2", 7);
        mapa.put("producto3", 9);
        mapa.put("producto4", 8);
        mapa.put("producto5", 4);
        
        System.out.println(mapa.keySet()); // muestra array la clave
        System.out.println(mapa.values()); // muestra array el valor
        System.out.println(mapa.get("producto1")); // ingresa clave, retorna valor
                
        Iterator<String> it = mapa.keySet().iterator(); 
        
        // mapa.keySet().iterator() = [producto4, producto5, producto2, producto3, producto1]
        // it = [producto4, producto5, producto2, producto3, producto1]
        
        while(it.hasNext()){ //si tiene algo siguiente - entra
            String clave = it.next(); // 
            //it.next(); = 'producto4'
            //clave = 'producto4'
            int valor = mapa.get(clave);
            //mapa.get(clave); = mapa.get("producto4");
            //valor = 8
            
            System.out.println("Clave: " + clave + ", valor: " + valor);
            */
		
		//Crear Hashmap
		HashMap<Integer,String> equipo7 = new HashMap<Integer,String>();
		
		//Agregar valores al map
		equipo7.put(1,"camilo");
		equipo7.put(13,"luisa");
		equipo7.put(31,"juan");
		equipo7.put(12,"atenas");
		equipo7.put(13,"juana"); // como se repite la llave, se sobreescribe el valor
		System.out.println("integrantes: " + equipo7);
		
		//TAMAÑO
		System.out.println("el tamaño es : " + equipo7.size());
		
		//OBTENER UN VALOR INGRESANDO LA LLAVE
		 System.out.println("la llave 13 equivale a: " + equipo7.get(13));
		 
		 //REMOVER EL PAR DE DATOS
		 equipo7.remove(31);
		 System.out.println("integrantes: " + equipo7);
		 
		 //Itirar el HashMap
		 for(Integer clave: equipo7.keySet()) {
			 System.out.println("la clave es: "+ clave + " el valor es: " + equipo7.get(clave));
			
		 }
			
			 
			 
			 
			 
			 
		
		
	}

}
