package es.curso.java.hibernate.basics.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;



@Entity
@Table (name= "TB_USUARIO")
public class Usuario {

	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY) // AUTO INCREMENTAL PK //lo comento porque con ORACLE version XE, me da error el auto-incremental a la hora de crear las tablas. Utiliza secuencias.
	@GeneratedValue(strategy = GenerationType.SEQUENCE) // EN ORACLE SON SECUENCIAS.
	private long id;
	
	@Column (length = 20, name = "NOMBRE_USUARIO")
	private String nombre;
	
	@Column (length = 40, name = "NOMBRE_APELLIDOS")
	private String apellidos;
	
	@Column (length = 10, name = "DNI_USUARIO", unique = true)
	private String dni;
	
	private String fechaAlta;

	
// CONSTRUCTOR	
	

	public Usuario() {
		super();
	}
	
	
	
	public Usuario(String nombre, String apellidos, String dni, String fechaAlta) {
		super();

		this.nombre = nombre;
		this.apellidos = apellidos;
		this.dni = dni;
		this.fechaAlta = fechaAlta;
	}

	
	







// GETTERS AND SETTERS	
	
	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getApellidos() {
		return apellidos;
	}


	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}


	public String getDni() {
		return dni;
	}


	public void setDni(String dni) {
		this.dni = dni;
	}


	public String getFechaAlta() {
		return fechaAlta;
	}


	public void setFechaAlta(String fechaAlta) {
		this.fechaAlta = fechaAlta;
	}




	@Override
	public String toString() {
		return "Usuario [id=" + id + ", nombre=" + nombre + ", apellidos=" + apellidos + ", dni=" + dni + ", fechaAlta="
				+ fechaAlta + "]";
	}
	
	
	
	
	
	
}
