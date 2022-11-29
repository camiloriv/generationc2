package cl.generationc2.f20221102.tarea_herencia;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		ArrayList<Alumnos> alumnos = new ArrayList<Alumnos>();
		
		//instanciamos y asignamos datos a un alumno a traves de un constructor con "super".
		Alumnos alumno1 = new Alumnos("Juanito","Bandolero",15,"Media","1°B",15);
		
		//instanciamos y asignamos datos a un alumno a traves de un constructor con "super" y sus parametros.
		Alumnos alumno2 = new Alumnos("Turio","Triviño",16,"Media","2°C",17);
		
		//instanciamos otro alumno
		Alumnos alumno3 = new Alumnos();
		//asignamos datos al alumno
		alumno3.setNombre("chipote");
		alumno3.setApellido("chillon");
		alumno3.setEdad(10);
		alumno3.setCurso("2°C");
		alumno3.setNivel("Basica");
		alumno3.setcantidadAsignaturas(10);
		
		alumnos.add(alumno1);
		alumnos.add(alumno2);
		alumnos.add(alumno3);
		
		for(Alumnos niños: alumnos) {
			
			System.out.println(niños.toString());
			
		}
		
		Apoderado apoderado = new Apoderado();
		apoderado.metodoImprimir();
		alumno1.metodoImprimir();
	}
	

}
