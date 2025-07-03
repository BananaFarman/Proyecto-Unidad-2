package com.mycompany.persistencialabcomputo.daos.estudiante;

import javax.persistence.EntityManager;

public class EstudianteDAO implements  IEstudianteDAO{
    private EntityManager entityManager;

    public EstudianteDAO(EntityManager entityManager) {
        this.entityManager = entityManager;
    }
}
