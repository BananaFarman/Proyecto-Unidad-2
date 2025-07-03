package com.mycompany.negociolabcomputo.negociosfacades.centrocomputo;

import dtos.centrocomputo.CentroComputoAgregarDTO;
import dtos.centrocomputo.CentroComputoTablaDTO;
import entidades.CentroComputoDominio;
import entidades.UnidadDominio;

import java.util.List;

public interface ICentroComputoNeogcio {
    List<CentroComputoTablaDTO> consultarCentros();

    List<CentroComputoTablaDTO> consultarCentrosUnidad(UnidadDominio unidad);

    void guardarCentro(CentroComputoAgregarDTO centroComputoAgregarDTO);

    void validarHorarios(CentroComputoAgregarDTO centroComputoAgregarDTO);

}
