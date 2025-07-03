package com.mycompany.negociolabcomputo.negociosfacades.unidadacademica;

import entidades.UnidadDominio;

import java.util.List;

public interface IUnidadAcademicaNegocio {
    void insertarUnidadesAcademicas(List<UnidadDominio> listUnidadDominio);

    List<UnidadDominio> obtenerTodos();

    void vaciar();
}
