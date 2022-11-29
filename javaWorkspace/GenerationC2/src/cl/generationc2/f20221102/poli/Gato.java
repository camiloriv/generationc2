package cl.generationc2.f20221102.poli;

public class Gato extends Mascota{

	private String sonido;
	
	public Gato() {
		super();
		
	}

	public Gato(String nombre, String raza, String color, String sexo) {
		super(nombre, raza, color, sexo);
		
	}
	
	public Gato(String nombre, String raza, String color, String sexo, String sonido) {
		super(nombre, raza, color, sexo);
		this.sonido = sonido;
	}	
	
	public Gato(String sonido) {
		super();
		this.sonido = sonido;
	}
	
	public String getSonido() {
		return sonido;
	}

	public void setSonido(String sonido) {
		this.sonido = sonido;
	}

	@Override
	public void emitirSonido() {
		System.out.println("el sonido (maullido) es: MIAUU MIAUU");
	}
}
