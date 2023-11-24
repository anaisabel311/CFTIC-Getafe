package es.curso.java.hibernate.usuario;

import java.util.List;
import java.util.Scanner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;



import es.curso.java.hibernate.basics.entities.Usuario;
import es.curso.java.hibernate.util.JpaUtil;
import jakarta.persistence.EntityManager;


public class HibernateListadoUsuarios {
	
	private static final Logger logger = LogManager.getLogger(HibernateListadoUsuarios.class);

    public static void main(String[] args) {

        
        EntityManager em = JpaUtil.getEntityManager();
     
        List<Usuario> usuarios = em.createQuery("from Usuario", Usuario.class).getResultList();
        usuarios.forEach(System.out::println);//Método Referencia
        em.close();
        logger.debug("Final");
        
        em.close();
    }
}
