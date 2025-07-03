package com.mycompany.persistencialabcomputo.daos.bloqueo;

import javax.persistence.EntityManager;

public class BloqueoDAO implements  IBloqueoDAO{
    private EntityManager entityManager;

    public BloqueoDAO(EntityManager entityManager) {
        this.entityManager = entityManager;
    }
}
