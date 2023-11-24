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
	@GeneratedValue(strategy = GenerationType.IDENTITY) // AUTO INCREMENTAL PK
	private Long id;
	
	@Column (length = 20, name = "NOMBRE_USUARIO")
	private String nombre;
	
	@Column (length = 40, name = "NOMBRE_APELLIDOS")
	private String apellidos;
	
	@Column (length = 10, name = "DNI_USUARIO", unique = true)
	private String dni;
	
	private String fechaAlta;

	
// CONSTRUCTOR	
	public Usuario(String nombre, String apellidos, String dni, String fechaAlta) {
		super();

		this.nombre = nombre;
		this.apellidos = apellidos;
		this.dni = dni;
		this.fechaAlta = fechaAlta;
	}

	
	


	public Usuario() {
		super();
	}





// GETTERS AND SETTERS	
	
	public Long getId() {
		return id;
	}


	public void setId(Long id) {
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
