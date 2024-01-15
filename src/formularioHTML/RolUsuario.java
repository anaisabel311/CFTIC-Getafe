package formularioHTML;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table (name = "TB_ROLUSUARIO")

public class RolUsuario {
	
	@Id
	@SequenceGenerator(name = "ROLGEN", sequenceName = "ROL_GEN", initialValue = 1, allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ROLGEN")
	@Column(name = "ID", nullable = false, updatable = false)
	private long id;
	
	@Column (length= 25, name = "ROL")
	private String rolnombre;

	
// CONSTRUCTOR
	
	public RolUsuario(long id, String rolnombre) {
		super();
		this.id = id;
		this.rolnombre = rolnombre;
	}


public RolUsuario() {
	super();
}


public long getId() {
	return id;
}


public void setId(long id) {
	this.id = id;
}


public String getRolnombre() {
	return rolnombre;
}


public void setRolnombre(String rolnombre) {
	this.rolnombre = rolnombre;
}
	
	
	
	

}
