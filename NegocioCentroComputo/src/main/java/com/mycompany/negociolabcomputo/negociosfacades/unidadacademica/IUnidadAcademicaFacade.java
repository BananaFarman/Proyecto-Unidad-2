package com.mycompany.negociolabcomputo.negociosfacades.unidadacademica;

import dtos.unidadacademica.InsertarUnidadesDTO;
import entidades.UnidadDominio;

import java.util.List;

public interface IUnidadAcademicaFacade {

    void insertarUnidadesAcademias(InsertarUnidadesDTO insertarUnidadesDTO);

    List<UnidadDominio> obtenerTodos();

    void vaciar();

}
