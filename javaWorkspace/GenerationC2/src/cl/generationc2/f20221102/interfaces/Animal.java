package cl.generationc2.f20221102.interfaces;

public abstract class Animal {
	
	private Float altura;
	private Float Peso;
		
	public Animal() {
		super();
	}

	public Animal(Float altura, Float peso) {
		super();
		this.altura = altura;
		Peso = peso;
	}

	public Float getAltura() {
		return altura;
	}

	public void setAltura(Float altura) {
		this.altura = altura;
	}

	public Float getPeso() {
		return Peso;
	}

	public void setPeso(Float peso) {
		Peso = peso;
	}

	public void metodoEnAnimal() {
		System.out.println("El animal come");
	}
}
