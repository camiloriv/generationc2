package cl.generationc2.f20221102;

public class Entrenador extends EquipoBasquetbol{
	
	private int años_experiencia;
	private String equipo;
	
	
	public Entrenador() {
		super();
	}
	
	public Entrenador(int años_experiencia, String equipo) {
		super();
		this.años_experiencia = años_experiencia;
		this.equipo = equipo;
	}
	public int getAños_experiencia() {
		return años_experiencia;
	}
	public void setAños_experiencia(int años_experiencia) {
		this.años_experiencia = años_experiencia;
	}
	public String getEquipo() {
		return equipo;
	}
	public void setEquipo(String equipo) {
		this.equipo = equipo;
	}
	
	
	
}
