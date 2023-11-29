package es.curso.java.hibernate.util;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class JpaUtil { 
    private static final EntityManagerFactory entityManagerFactory = buildEntityManagerFactory();
    
    // EntityManagerFactory = le decimos con qué conexión hay que trabajar.

    private static EntityManagerFactory buildEntityManagerFactory(){
        return Persistence.createEntityManagerFactory("hibernateOracle");
        // CreateEntityManagerFactory = crea un entity con el nombre que le pasamos de la conexión de la base de datos.
        
    }

    public static EntityManager getEntityManager() { 
        return entityManagerFactory.createEntityManager();
    }
}
