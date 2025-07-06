package com.mycompany.persistencialabcomputo.daos.centrocomputo;

import dtos.computadora.ComputadoraTablaDTO;
import entidades.CentroComputoDominio;
import entidades.ComputadoraDominio;
import entidades.UnidadDominio;

import java.util.List;

public interface ICentroComputoDAO {
    List<CentroComputoDominio> obtenerTodos();

    List<ComputadoraDominio> obtenerComputadoras(CentroComputoDominio centro);

    void agregarCentro(CentroComputoDominio centroComputo);

    List<CentroComputoDominio> obtenerPorUnidad(UnidadDominio unidad);

    CentroComputoDominio buscarPorId(Long id);



}
