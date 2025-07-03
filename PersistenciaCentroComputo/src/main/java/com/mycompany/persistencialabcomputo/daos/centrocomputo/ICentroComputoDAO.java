package com.mycompany.persistencialabcomputo.daos.centrocomputo;

import entidades.CentroComputoDominio;
import entidades.UnidadDominio;

import java.util.List;

public interface ICentroComputoDAO {
    List<CentroComputoDominio> obtenerTodos();

    void agregarCentro(CentroComputoDominio centroComputo);

    List<CentroComputoDominio> obtenerPorUnidad(UnidadDominio unidad);

}
