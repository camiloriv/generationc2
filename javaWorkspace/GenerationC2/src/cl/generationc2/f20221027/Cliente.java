package cl.generationc2.f20221027;

public class Cliente {

	private	String nombre;
	private	String apellido;
	private Integer edad;
	private	Integer numTelefono;
	private	String direccion;
	
	public Cliente() {
		super();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public Integer getEdad() {
		return edad;
	}

	public void setEdad(Integer edad) {
		this.edad = edad;
	}

	public Integer getNumTelefono() {
		return numTelefono;
	}

	public void setNumTelefono(Integer numTelefono) {
		this.numTelefono = numTelefono;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	@Override
	public String toString() {
		return "Cliente [nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + ", numTelefono="
				+ numTelefono + ", direccion=" + direccion + "]";
	}
	
	
	
	
	
}
