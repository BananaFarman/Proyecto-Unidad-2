package com.mycompany.negociolabcomputo.negociosfacades.centrocomputo;

import com.mycompany.persistencialabcomputo.daos.centrocomputo.ICentroComputoDAO;
import dtos.centrocomputo.CentroComputoAgregarDTO;
import dtos.centrocomputo.CentroComputoTablaDTO;
import dtos.computadora.ComputadoraTablaDTO;
import entidades.CentroComputoDominio;
import entidades.UnidadDominio;

import java.util.List;

public class CentroComputoFacade implements ICentroComputoFacade {
    private ICentroComputoNeogcio ICentroComputoNegocio;
    private ICentroComputoDAO centroComputoDAO;

    public CentroComputoFacade(ICentroComputoDAO dao) {
        centroComputoDAO = dao;
        this.ICentroComputoNegocio = new CentroComputoNegocio(centroComputoDAO);
    }

    @Override
    public List<CentroComputoTablaDTO> consultarCentros() {
        return ICentroComputoNegocio.consultarCentros();
    }

    @Override
    public List<CentroComputoTablaDTO> consultarCentrosUnidad(UnidadDominio unidad) {
        return ICentroComputoNegocio.consultarCentrosUnidad(unidad);
    }

    @Override
    public List<ComputadoraTablaDTO> consultarComputadorasCentro(CentroComputoDominio centro) {
        return ICentroComputoNegocio.consultarComputadorasCentro(centro);
    }

    @Override
    public void guardarCentro(CentroComputoAgregarDTO centroComputoAgregarDTO) {
        ICentroComputoNegocio.guardarCentro(centroComputoAgregarDTO);
    }

    @Override
    public CentroComputoDominio obtenerCentroPorId(Long id) {
        return ICentroComputoNegocio.buscarPorId(id);
    }

}
