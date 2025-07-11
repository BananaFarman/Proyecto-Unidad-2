package com.mycompany.persistencialabcomputo.daos.centrocomputo;

import entidades.CentroComputoDominio;
import entidades.ComputadoraDominio;
import entidades.UnidadDominio;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import java.util.List;

public class CentroComputoDAO implements ICentroComputoDAO {
    private EntityManager entityManager;

    public CentroComputoDAO(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    public List<CentroComputoDominio> obtenerTodos() {
        String jpql = "SELECT c FROM CentroComputoDominio c";
        return entityManager.createQuery(jpql, CentroComputoDominio.class).getResultList();
    }

    @Override
    public List<ComputadoraDominio> obtenerComputadoras(CentroComputoDominio centro) {
        TypedQuery<ComputadoraDominio> query = entityManager.createQuery(
                "SELECT c FROM ComputadoraDominio c WHERE c.centroComputo = :centro", ComputadoraDominio.class
        );
        query.setParameter("centro", centro);
        return query.getResultList();
    }

    public List<CentroComputoDominio> obtenerPorUnidad(UnidadDominio unidad){
        return entityManager.createQuery(
                        "SELECT c FROM CentroComputoDominio c WHERE c.unidad = :unidad", CentroComputoDominio.class)
                .setParameter("unidad", unidad)
                .getResultList();
    }

    @Override
    public CentroComputoDominio buscarPorId(Long id) {
        // Crear try catch para manejar excepciones
        return entityManager.find(CentroComputoDominio.class, id);
    }

    @Override
    public void agregarCentro(CentroComputoDominio centroComputo) {
        entityManager.getTransaction().begin();
        entityManager.persist(centroComputo);
        entityManager.getTransaction().commit();
    }

}
