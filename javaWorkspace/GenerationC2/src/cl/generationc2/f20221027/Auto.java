package cl.generationc2.f20221027;

public class Auto {
//atributos - tipo acceso
	private	String marca;//"Chevrolet"
	private String color;//"Beige"
	private String modelo;//"Corsa"
	private Float cilindrada;//1,6
	private Float rendimiento; //"8.5 km/l"
	private Float velocidad; //km/h
	
	
	//Constructor
	//permite instanciar al objeto
	//permite inicializar los atributos
	
	public Auto() {
		super();
	}

	public Auto(String marca, String color, String modelo, Float cilindrada, Float rendimiento, Float velocidad) {
		super();
		this.marca = marca;
		this.color = color;
		this.modelo = modelo;
		this.cilindrada = cilindrada;
		this.rendimiento = rendimiento;
		this.velocidad = velocidad;
	}

	
	
	
	//getter y setter (accesador y mutador)
	
	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public Float getCilindrada() {
		return cilindrada;
	}

	public void setCilindrada(Float cilindrada) {
		this.cilindrada = cilindrada;
	}

	public Float getRendimiento() {
		return rendimiento;
	}

	public void setRendimiento(Float rendimiento) {
		this.rendimiento = rendimiento;
	}

	public Float getVelocidad() {
		return velocidad;
	}

	public void setVelocidad(Float velocidad) {
		this.velocidad = velocidad;
	}
	
	
	//metodos del objeto (acciones)
	
	public void avanzar() {
		System.out.println("Esto en el metodo avanzar en el objeto");
	}

	@Override
	public String toString() {
		return "Auto [marca=" + marca + ", color=" + color + ", modelo=" + modelo + ", cilindrada=" + cilindrada
				+ ", rendimiento=" + rendimiento + ", velocidad=" + velocidad + "]";
	}
	
	
	
	
}
