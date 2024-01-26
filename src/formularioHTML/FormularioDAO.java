package formularioHTML;

import jakarta.persistence.EntityManager;

public class FormularioDAO {

	private EntityManager em;
	
	public FormularioDAO (EntityManager em) {
		this.em = em;
	}
	
	
	public List<DatosUsuarios> getDatosUsuarios(){
		return em.createQuery("", ).getDatosUsuarios();
		
	}
	
	
	
}

