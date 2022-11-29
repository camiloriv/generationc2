package cl.generationc2.f20221102;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// Herencia
		
		//intenciando objeto
		ArrayList <Basquetbolista> listaBasquetbolistas = new ArrayList<Basquetbolista>();
		
		Basquetbolista basquetbolista = new Basquetbolista();
		basquetbolista.setNombre("juan");
		basquetbolista.setApellido("ito");
		basquetbolista.setEdad(28);
		basquetbolista.setAltura(2.5f);
		basquetbolista.setPeso(60.3f);
		
		listaBasquetbolistas.add(basquetbolista);
		
		Basquetbolista basquetbolista2 = new Basquetbolista();
		basquetbolista2.setNombre("maikel");
		basquetbolista2.setApellido("perez");
		basquetbolista2.setEdad(35);
		basquetbolista2.setAltura(2.2f);
		basquetbolista2.setPeso(59.3f);
				
		listaBasquetbolistas.add(basquetbolista2);
		
		for (Basquetbolista jugador: listaBasquetbolistas) {
		 System.out.println(jugador.toString());
		}
	
			Kinesiologo kine = new Kinesiologo();
		kine.setNombre("Esteban");
		kine.setApellido("dido");
		kine.setEdad(35);
		kine.setTitulo("kinesiologia");
		kine.setEspecialidad("rodilla");
		
		
		
	}

}
