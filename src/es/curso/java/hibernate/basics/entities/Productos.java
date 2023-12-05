package es.curso.java.hibernate.basics.entities;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;


@Entity
@Table (name= "TB_PRODUCTOS")
public class Productos {
	
	@Id
	@SequenceGenerator(name="PRODUCTOGEN", sequenceName="PRODUCTO_GEN", initialValue=1, allocationSize=1) // para que las secuencias no se compartan en todas las tablas del persistence unit.
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="PRODUCTOGEN") // el name del sequenceGenerator debe ser igual al generator del GeneratedValue. los id borrados se pierden.
	private long id;
	
	@Column (length = 20, name = "NOMBRE")
	private String nombre;
	
	@Column (length = 20, name = "TIPO")
	private String tipo;
	
	@Column (length = 10, name = "FECHA_ALTA")
	private String fecha;
	
	@Column (length = 10, name = "PRECIO")
	private long precio;
	
	@Column (length = 10, name = "UNIDADES")
	private int unidades;

	
	
// CONSTRUCTOR
	
	public Productos(long id, String nombre, String tipo, String fecha, long precio, int unidades) {
	super();
	this.id = id;
	this.nombre = nombre;
	this.tipo = tipo;
	this.fecha = fecha;
	this.precio = precio;
	this.unidades = unidades;
}
	
	
	


	public Productos(String nombre, String tipo, String fecha, long precio, int unidades) {
	super();
	this.nombre = nombre;
	this.tipo = tipo;
	this.fecha = fecha;
	this.precio = precio;
	this.unidades = unidades;
}





	public Productos() {
		super();
	}


// GETTERS AND SETTERS	
	
	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public String getTipo() {
		return tipo;
	}


	public void setTipo(String tipo) {
		this.tipo = tipo;
	}


	public String getFecha() {
		return fecha;
	}


	public void setFecha(String fecha) {
		this.fecha = fecha;
	}


	public long getPrecio() {
		return precio;
	}


	public void setPrecio(long precio) {
		this.precio = precio;
	}


	public int getUnidades() {
		return unidades;
	}


	public void setUnidades(int unidades) {
		this.unidades = unidades;
	}


	@Override
	public String toString() {
		return "Productos [id=" + id + ", nombre=" + nombre + ", tipo=" + tipo + ", fecha=" + fecha + ", precio="
				+ precio + ", unidades=" + unidades + "]";
	}
	

	
}
