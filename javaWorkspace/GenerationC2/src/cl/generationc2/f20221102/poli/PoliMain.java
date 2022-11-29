package cl.generationc2.f20221102.poli;

public class PoliMain {

	public static void main(String[] args) {
		// Polimorfismo
		Mascota mascota = new Mascota();
		mascota.emitirSonido();
		
		Gato manjar = new Gato();
		manjar.emitirSonido();
		
		Perro quewe = new Perro();
		quewe.emitirSonido();
		
		/********************/
		 
		//Polimorfismo
		//debe existir herencia, jerarquia de clases
		//clase que se comporta como otra, pero no es esa"
		//"regalon se comporta como perro, pero no es un perro"
		Mascota regalon = new Perro();
		regalon.emitirSonido();
		regalon.setNombre("quewe");
		System.out.println(regalon.toString());
		
		Mascota michi = new Gato();
		michi.emitirSonido();
		michi.horaSiesta(3);
		
		
	}

}
