package cl.generationc2.f20221027;

public class UsoObjeto {

	public static void main(String[] args) {
		// instancia de clase - refencia a un objeto
		Auto auto1 = new Auto(); // inicializando.
		//asignar valores a los atributos privados
		auto1.setColor("Beige");
		auto1.setMarca("Chevrolet");
		
		//Consultar el contenido de los atributos
		System.out.println("el color del auto es: " + auto1.getColor());
		System.out.println("la marca del auto es: " + auto1.getMarca());
		
		Auto car = new Auto("Chevrolet", "rojo", "Corsa",1.6f,8.5f,240f);
		System.out.println(car.getModelo());
	
	
	}

}
