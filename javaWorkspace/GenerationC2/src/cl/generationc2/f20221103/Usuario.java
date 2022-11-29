package cl.generationc2.f20221103;

import java.util.ArrayList;

public class Usuario {

	private String nombre;
	private String apellido;
	private String correo;
	private String password;
	private String nickname;
	private ArrayList<String> telefonos;
	private Direccion direccion;
	
	//se inicializa el constructor vacio, entra a este metodo
	// e inicializa el ArrayList de telefonos.
	public Usuario() {
		super();
		this.telefonos = new ArrayList<String>();
		
	}

	public Usuario(String nombre, String apellido, String correo, String password, String nickname, ArrayList<String> telefonos, Direccion direccion) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.correo = correo;
		this.password = password;
		this.nickname = nickname;
		this.telefonos = telefonos;
		this.direccion = direccion;
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

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
		
	public ArrayList<String> getTelefonos() {
		return telefonos;
	}

	public void setTelefonos(ArrayList<String> telefonos) {
		this.telefonos = telefonos;
	}

	public Direccion getDireccion() {
		return direccion;
	}

	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}

	@Override
	public String toString() {
		return "Usuario [nombre=" + nombre + ", apellido=" + apellido + ", correo=" + correo + ", password=" + password
				+ ", nickname=" + nickname + ", telefonos=" + telefonos + ", direccion=" + direccion + "]";
	}

	
	
	
}
