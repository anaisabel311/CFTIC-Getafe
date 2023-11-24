package es.curso.java.hibernate.usuario;

import java.util.List;
import java.util.Scanner;

import es.curso.java.hibernate.basics.entities.Cliente;
import es.curso.java.hibernate.basics.entities.Usuario;
import es.curso.java.hibernate.util.JpaUtil;
import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;

public class HibernateResultListWhereUsuario {
	
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        EntityManager em = JpaUtil.getEntityManager();
        Query query = em.createQuery("from Usuario u where u.nombre=?1", Usuario.class);
        System.out.println("Ingrese el nombre a buscar: ");
        String nom = scanner.next();
        query.setParameter(1, nom);
        List<Usuario> usuarios = query.getResultList();
        usuarios.forEach(cliente->System.out.println(usuarios));
        em.close();
    }
    
    
    
    
    
}
