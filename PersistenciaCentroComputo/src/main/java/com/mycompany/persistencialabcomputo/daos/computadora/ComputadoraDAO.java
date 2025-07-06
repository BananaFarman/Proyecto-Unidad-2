package com.mycompany.persistencialabcomputo.daos.computadora;

import entidades.ComputadoraDominio;

import javax.persistence.EntityManager;

public class ComputadoraDAO implements IComputadoraDAO {
    private final EntityManager entityManager;

    public ComputadoraDAO(EntityManager em) {
        this.entityManager = em;
    }

    @Override
    public void agregarComputadora(ComputadoraDominio computadora) {
        entityManager.getTransaction().begin();
        entityManager.persist(computadora);
        entityManager.getTransaction().commit();
    }

    @Override
    public boolean existeIpRegistrada(String ip) {
        String jpql = "SELECT COUNT(c) FROM ComputadoraDominio c WHERE c.direccionIp = :ip";
        Long count = entityManager.createQuery(jpql, Long.class)
                .setParameter("ip", ip)
                .getSingleResult();
        return count > 0;
    }

}
