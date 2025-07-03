package com.mycompany.persistencialabcomputo.conexion;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EntityManagerProvider {
    private static final String persistenceUnitEnUso = "conexionPrueba";
    private static EntityManagerFactory emf;

    static {
        try {
            emf = Persistence.createEntityManagerFactory(persistenceUnitEnUso);
        } catch (Exception e) {
            System.err.println("Error al crear EntityManagerFactory: " + e.getMessage());
            throw new RuntimeException(e);
        }
    }

    public static EntityManager getEntityManager() {
        return emf.createEntityManager();
    }
}
