package com.mycompany.persistencialabcomputo.daos.unidadacademica;

import entidades.UnidadDominio;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import java.util.List;

public class UnidadAcademicaDAO implements IUnidadAcademicaDAO {
    private final EntityManager em;

    public UnidadAcademicaDAO(EntityManager em) {
        this.em = em;
    }

    public void guardarUnidades(List<UnidadDominio> unidadesAcademicas) {
        EntityTransaction tx = em.getTransaction();
        try {
            tx.begin();
            for (UnidadDominio region : unidadesAcademicas) {
                em.persist(region);
            }
            tx.commit();
        } catch (Exception e) {
            tx.rollback();
            throw new RuntimeException("Error al registrar las unidades", e);
        }

    }

    @Override
    public List<UnidadDominio> obtenerTodos() {
        String jpql = "SELECT u FROM UnidadDominio u";
        return em.createQuery(jpql, UnidadDominio.class).getResultList();
    }

    @Override
    public void vaciar() {
        em.getTransaction().begin();
        em.createQuery("DELETE FROM UnidadDominio").executeUpdate();
        em.createNativeQuery("ALTER TABLE UnidadDominio AUTO_INCREMENT = 1").executeUpdate();
        em.getTransaction().commit();
    }
}
