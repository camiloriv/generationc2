package cl.generationc2.f20221102.tarea_herencia;

public class Profesores extends Colegio {

	private String asignatura;
	private String titulo;

	public Profesores() {
		super();
	}

	public Profesores(String materia, String titulo) {
		super();
		this.asignatura = materia;
		this.titulo = titulo;
	}

	public String getMateria() {
		return asignatura;
	}

	public void setMateria(String materia) {
		this.asignatura = materia;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	@Override
	public String toString() {
		return "Profesores [asignatura=" + asignatura + ", titulo=" + titulo + ", getNombre()=" + getNombre()
				+ ", getApellido()=" + getApellido() + ", getEdad()=" + getEdad() + "]";
	}
	
	@Override
	public void metodoImprimir() {
		System.out.println("estoy en el metodo de la clase profesores");

	}
}