package com.mycompany.persistencialabcomputo.daos.apartado;

import javax.persistence.EntityManager;

public class ApartadoDAO implements IApartadoDAO{
    private EntityManager entityManager;

    public ApartadoDAO(EntityManager entityManager) {
        this.entityManager = entityManager;
    }
}
