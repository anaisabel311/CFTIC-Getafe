package es.curso.java.hibernate.basics.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;

@Entity
@Table(name = "TB_ALUMNO")
public class Alumno {
	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)// lo comento porque con ORACLE version XE, me da error el auto-incremental a la hora de crear las tablas.Utiliza Secuencias
	@GeneratedValue(strategy = GenerationType.SEQUENCE) // EN ORACLE UTILIZA SECUENCIAS
	private long id;
	
	private String nombre;
	private String apellidos;
	
	@Column(length = 9, name = "DNI_ALUMNO", unique = true)
	private String dni;
	
	private String usuario;
	
	@Transient
	private int edad;

	public Alumno() {
		super();
	}

	public Alumno(long id, String nombre, String apellidos, String dni, String user, int edad) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.dni = dni;
		this.usuario = user;
		this.edad = edad;
	}


	public Alumno(String nombre, String apellidos, String dni, String user) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.dni = dni;
		this.usuario = user;
	}

	public Alumno(long id, String nombre, String apellidos, String dni, String user) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.dni = dni;
		this.usuario = user;
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

	public String getUser() {
		return usuario;
	}
	public void setUser(String user) {
		this.usuario = user;
	}

	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}


	@Override
	public String toString() {
		return "Alumno [id=" + id + ", nombre=" + nombre + ", apellidos=" + apellidos + ", dni=" + dni + ", user="
				+ usuario + "]";
	}
	
}
