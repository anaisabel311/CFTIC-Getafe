package es.curso.java.hibernate.usuario;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

//import java.util.Date; // almacenar el valor de la fecha
//import java.util.GregorianCalendar;
//import java.util.Calendar; // hacer cálculos con la fecha
//import java.text.DateFormat; // dar formato a la fecha
//import java.text.SimpleDateFormat;

import es.curso.java.hibernate.basics.entities.Usuario;
import es.curso.java.hibernate.util.JpaUtil;
import jakarta.persistence.EntityManager;

public class HibernateListarUsuario {
	
	private static final Logger logger = LogManager.getLogger(HibernateListarUsuario.class);
    public static void main(String[] args) {
    	logger.debug("Empezando");
        EntityManager em = JpaUtil.getEntityManager();
              
        Usuario usuario1 = new Usuario ("Nombre1","Apellido","DNI1","24/11/23");
        Usuario usuario2 = new Usuario ("Nombre2","Apellido2","DNI2","23/11/23");
        Usuario usuario3 = new Usuario ("Nombre3","Apellido2","DNI3","22/11/23");
        
        em.getTransaction().begin();
        em.persist(usuario1);
        em.persist(usuario2);
        em.persist(usuario3);
        em.getTransaction().commit();
        
        List<Usuario> usuarios = em.createQuery("from Usuario", Usuario.class).getResultList();
        usuarios.forEach(System.out::println);  //Método Referencia
        em.close();
        logger.debug("Final");
    }
}
