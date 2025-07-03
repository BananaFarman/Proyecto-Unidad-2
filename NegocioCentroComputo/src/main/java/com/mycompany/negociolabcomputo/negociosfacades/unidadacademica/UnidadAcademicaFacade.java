package com.mycompany.negociolabcomputo.negociosfacades.unidadacademica;

import com.mycompany.persistencialabcomputo.daos.unidadacademica.IUnidadAcademicaDAO;
import dtos.unidadacademica.InsertarUnidadesDTO;
import entidades.UnidadDominio;

import java.util.List;

public class UnidadAcademicaFacade implements IUnidadAcademicaFacade {

    private IUnidadAcademicaNegocio IUnidadAcademicaNegocio;

    public UnidadAcademicaFacade(IUnidadAcademicaDAO unidadDAO){
        this.IUnidadAcademicaNegocio = new UnidadAcademicaNegocio(unidadDAO);
    }

    @Override
    public void insertarUnidadesAcademias(InsertarUnidadesDTO insertarUnidadesDTO) {
        IUnidadAcademicaNegocio.insertarUnidadesAcademicas(insertarUnidadesDTO.getUnidadesAcademicas());
    }

    @Override
    public List<UnidadDominio> obtenerTodos() {
        return IUnidadAcademicaNegocio.obtenerTodos();
    }

    @Override
    public void vaciar() {
        IUnidadAcademicaNegocio.vaciar();
    }
}
