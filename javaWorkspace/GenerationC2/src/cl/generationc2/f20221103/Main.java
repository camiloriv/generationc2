package cl.generationc2.f20221103;

public class Main {

	public static void main(String[] args) {
		
		Usuario usuario = new Usuario();
		Direccion direccion = new Direccion();
		direccion.setCalle("juanitas");
		direccion.setNumero("1231");
		direccion.setSector("juan ramon");
		direccion.setCiudad("santiago");
		direccion.setRegion("RM");
		System.out.println(direccion.toString());
	}

}
