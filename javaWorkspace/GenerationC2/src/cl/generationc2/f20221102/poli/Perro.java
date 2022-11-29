package cl.generationc2.f20221102.poli;

public class Perro extends Mascota{
	
	private String sonido;
	
	public Perro() {
		super();
	}
	
	public Perro(String sonido) {
		super();
		this.sonido = sonido;
	}
	
	public Perro(String nombre, String raza, String color, String sexo, String sonido) {
		super(nombre, raza, color, sexo);
		this.sonido = sonido;
	}

	public String getSonido() {
		return sonido;
	}

	public void setSonido(String sonido) {
		this.sonido = sonido;
	}

	@Override
	public String toString() {
		return "Perro [sonido=" + sonido + "]";
	}
	
	@Override
	public void emitirSonido() {
		System.out.println("el sonido (ladrido) es: GUAU GUAU");
	}
	
}
