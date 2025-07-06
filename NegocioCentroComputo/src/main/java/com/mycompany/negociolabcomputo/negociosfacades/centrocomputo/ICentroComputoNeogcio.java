package com.mycompany.negociolabcomputo.negociosfacades.centrocomputo;

import dtos.centrocomputo.CentroComputoAgregarDTO;
import dtos.centrocomputo.CentroComputoTablaDTO;
import dtos.computadora.ComputadoraTablaDTO;
import entidades.CentroComputoDominio;
import entidades.ComputadoraDominio;
import entidades.UnidadDominio;

import java.util.List;

public interface ICentroComputoNeogcio {
    List<CentroComputoTablaDTO> consultarCentros();

    List<CentroComputoTablaDTO> consultarCentrosUnidad(UnidadDominio unidad);

    void guardarCentro(CentroComputoAgregarDTO centroComputoAgregarDTO);

    List<ComputadoraTablaDTO> consultarComputadorasCentro(CentroComputoDominio centro);

    void validarHorarios(CentroComputoAgregarDTO centroComputoAgregarDTO);

    CentroComputoDominio buscarPorId(Long id);



}
