package cl.generationc2.f20221102.tarea_herencia;

public class Administrativos extends Colegio{
	
	private String cargo;
	private int antiguedad;
	private String area;
	
	
	public Administrativos() {
		super();
	}


	public Administrativos(String cargo, int antiguedad, String area) {
		super();
		this.cargo = cargo;
		this.antiguedad = antiguedad;
		this.area = area;
	}
	
	public Administrativos(String nombre, String apellido, int edad, String cargo, int antiguedad, String area) {
		super(nombre, apellido, edad);
		this.cargo = cargo;
		this.antiguedad = antiguedad;
		this.area = area;
	}


	public String getCargo() {
		return cargo;
	}


	public void setCargo(String cargo) {
		this.cargo = cargo;
	}


	public int getantiguedad() {
		return antiguedad;
	}


	public void setantiguedad(int antiguedad) {
		this.antiguedad = antiguedad;
	}


	public String getArea() {
		return area;
	}


	public void setArea(String area) {
		this.area = area;
	}


	@Override
	public String toString() {
		return "Administrativos [cargo=" + cargo + ", antiguedad=" + antiguedad + ", area=" + area + ", getCargo()="
				+ getCargo() + ", getantiguedad()=" + getantiguedad() + ", getArea()=" + getArea() + "]";
	}
	
	@Override
	public void metodoImprimir() {
	System.out.println("estoy en el metodo de la clase admnistrativos");
}
}