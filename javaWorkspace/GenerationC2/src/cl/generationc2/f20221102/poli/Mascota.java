package cl.generationc2.f20221102.poli;

public class Mascota {
	// ATRIBUTOS
	private String nombre;
	private String raza;
	private String color;
	private String sexo;

	
	//CONSTRUCTORES
	public Mascota() {
		super();
	}

	public Mascota(String nombre, String raza, String color, String sexo) {
		super();
		this.nombre = nombre;
		this.raza = raza;
		this.color = color;
		this.sexo = sexo;
	}
	
	
	//GETTER Y SETTER
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getRaza() {
		return raza;
	}

	public void setRaza(String raza) {
		this.raza = raza;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	@Override
	public String toString() {
		return "Mascota [nombre=" + nombre + ", raza=" + raza + ", color=" + color + ", sexo=" + sexo + "]";
	}
	
	public void emitirSonido() {
		System.out.println("el sonido es: ");
	}
	
	//polimorfismo parametrico
	//SOBRECARGA DEL METODO
	public void horasSiesta() {
		System.out.println("la mascota no duerme");
	}
	public void horaSiesta(int horas) {
		System.out.println("la mascota duerme " + horas + " horas");
	}
	public void horaSiestas(Float horas) {
		System.out.println("la mascota duerme " + horas + " horas");
	}
	
	
	
	
}
