package formularioHTML;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;


import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "TB_DATOSUSUARIO")
public class DatosUsuarios {

	@Id
	@SequenceGenerator(name = "USUARIOGEN", sequenceName = "USUARIO_GEN", initialValue = 1, allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "USUARIOGEN")
	@Column(name = "ID", nullable = false, updatable = false)
	private long id;
	
	@ManyToMany(cascade=CascadeType.ALL, fetch=FetchType.EAGER)
    @JoinTable(name="TB_ROLUSUARIO")
    private List<RolUsuario> roles = new ArrayList<RolUsuario>();
	
	
	
	@Column (length = 20, name = "NOMBRE_USUARIO")
	private String nombre;
	@Column (length = 20, name = "APELLIDOS_USUARIO")
	private String apellidos;
	@Column (length = 8, name = "PASSWORD")
	private String password;
	@Column (length = 20, name = "EMAIL_USUARIO")
	private String email;
	@Column (length = 9, name = "TELF_USUARIO")
	private int telefono;
	@Column (length = 10, name = "FECHA")
	private Date fecha;
	@Column (length = 1, name = "SEXO_USUARIO")
	private String sexo;
	@Column (length = 9, name = "DNI_USUARIO")
	private String dni;
	
// CONSTRUCTORES
	
	public DatosUsuarios() {
		super();
	}
	
	
	public DatosUsuarios(long id, String nombre, String apellidos, String password, String email, int telefono,
			Date fecha, String sexo, String dni) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.password = password;
		this.email = email;
		this.telefono = telefono;
		this.fecha = fecha;
		this.sexo = sexo;
		this.dni = dni;
	}

	
	
// GETTER AND SETTER	

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


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public int getTelefono() {
		return telefono;
	}


	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}


	public Date getFecha() {
		return fecha;
	}


	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}


	public String getSexo() {
		return sexo;
	}


	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public String getDni() {
		return dni;
	}


	public void setDni(String dni) {
		this.dni = dni;
	}


	@Override
	public String toString() {
		return "DatosUsuarios [id=" + id + ", nombre=" + nombre + ", apellidos=" + apellidos + ", password=" + password
				+ ", email=" + email + ", telefono=" + telefono + ", fecha=" + fecha + ", sexo=" + sexo + ", dni=" + dni +"]";
	}
	
	
	
	
}

