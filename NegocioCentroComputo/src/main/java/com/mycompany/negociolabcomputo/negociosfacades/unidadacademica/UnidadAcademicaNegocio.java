package com.mycompany.negociolabcomputo.negociosfacades.unidadacademica;

import com.mycompany.persistencialabcomputo.daos.unidadacademica.IUnidadAcademicaDAO;
import entidades.UnidadDominio;

import java.util.List;

public class UnidadAcademicaNegocio implements IUnidadAcademicaNegocio {
    private IUnidadAcademicaDAO unidadDAO;

    public UnidadAcademicaNegocio(IUnidadAcademicaDAO unidadDAO) {
        this.unidadDAO = unidadDAO;
    }

    public void insertarUnidadesAcademicas(List<UnidadDominio> listUnidadDominio) {
        unidadDAO.guardarUnidades(listUnidadDominio);
    }

    @Override
    public List<UnidadDominio> obtenerTodos() {
        return unidadDAO.obtenerTodos();
    }

    @Override
    public void vaciar() {
        unidadDAO.vaciar();
    }


}
