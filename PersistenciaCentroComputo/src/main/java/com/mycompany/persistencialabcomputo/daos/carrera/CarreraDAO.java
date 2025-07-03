package com.mycompany.persistencialabcomputo.daos.carrera;

import javax.persistence.EntityManager;

public class CarreraDAO implements ICarreraDAO{
    private EntityManager entityManager;

    public CarreraDAO(EntityManager entityManager) {
        this.entityManager = entityManager;
    }
}
