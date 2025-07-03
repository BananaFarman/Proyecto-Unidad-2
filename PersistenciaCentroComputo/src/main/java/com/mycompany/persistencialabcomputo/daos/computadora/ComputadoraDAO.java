package com.mycompany.persistencialabcomputo.daos.computadora;

import javax.persistence.EntityManager;

public class ComputadoraDAO implements IComputadoraDAO {
    private final EntityManager em;

    public ComputadoraDAO(EntityManager em) {
        this.em = em;
    }

    @Override
    public boolean existeIpRegistrada(String ip) {
        String jpql = "SELECT COUNT(c) FROM ComputadoraDominio c WHERE c.direccionIp = :ip";
        Long count = em.createQuery(jpql, Long.class)
                .setParameter("ip", ip)
                .getSingleResult();
        return count > 0;
    }

}
