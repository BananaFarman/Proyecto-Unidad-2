package com.mycompany.persistencialabcomputo.daos.unidadacademica;

import entidades.UnidadDominio;

import java.util.List;

public interface IUnidadAcademicaDAO {
    void guardarUnidades(List<UnidadDominio> unidades);

    List<UnidadDominio> obtenerTodos();

    void vaciar();
}
