package cl.generationc2.f20221102.tarea_herencia;

public class Alumnos extends Colegio{
	// crear un curso o app de colegio
	// profesor, alumnos y directivos (administrativos)
	// generar la herencia, arrayList e imprimir los profesores, alumnos y
	// directivos (min 3)
	
	private String nivel;
	private String curso;
	private int cantidadAsignaturas;
	
	public Alumnos() {
		super();
	}

	public Alumnos(String nivel, String curso, int cantidadAsignaturas) {
		super();
		this.nivel = nivel;
		this.curso = curso;
		this.cantidadAsignaturas = cantidadAsignaturas;
	}
	
	public Alumnos(String nombre, String apellido, int edad, String nivel, String curso, int cantidadAsignaturas) {
		super(nombre, apellido, edad);
		this.nivel = nivel;
		this.curso = curso;
		this.cantidadAsignaturas = cantidadAsignaturas;
	}

	public String getNivel() {
		return nivel;
	}

	public void setNivel(String nivel) {
		this.nivel = nivel;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	public int getcantidadAsignaturas() {
		return cantidadAsignaturas;
	}

	public void setcantidadAsignaturas(int cantidadAsignaturas) {
		this.cantidadAsignaturas = cantidadAsignaturas;
	}

	@Override
	public String toString() {
		return "Alumnos - Nivel= " + nivel + ", Curso= " + curso + ", CantidadAsignaturas= " + cantidadAsignaturas
				+ ", Nombre= " + getNombre() + ", Apellido= " + getApellido() + ", Edad= " + getEdad();
	}

	@Override
	public void metodoImprimir() {
	System.out.println("estoy en el metodo de la clase Alumnos");
	}
	
	

	

}
