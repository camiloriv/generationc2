package cl.generationc2.f20221102;

public class Entrenador extends EquipoBasquetbol{
	
	private int a�os_experiencia;
	private String equipo;
	
	
	public Entrenador() {
		super();
	}
	
	public Entrenador(int a�os_experiencia, String equipo) {
		super();
		this.a�os_experiencia = a�os_experiencia;
		this.equipo = equipo;
	}
	public int getA�os_experiencia() {
		return a�os_experiencia;
	}
	public void setA�os_experiencia(int a�os_experiencia) {
		this.a�os_experiencia = a�os_experiencia;
	}
	public String getEquipo() {
		return equipo;
	}
	public void setEquipo(String equipo) {
		this.equipo = equipo;
	}
	
	
	
}
