package cl.generationc2.f20221102;

public class Kinesiologo extends EquipoBasquetbol{
	
	private String titulo;
	private String especialidad;
	
	
	
	public Kinesiologo() {
		super();
	}
	
	
	public Kinesiologo(String titulo, String especialidad) {
		super();
		this.titulo = titulo;
		this.especialidad = especialidad;
	}
	
	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getEspecialidad() {
		return especialidad;
	}
	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}
	
	
	
}
