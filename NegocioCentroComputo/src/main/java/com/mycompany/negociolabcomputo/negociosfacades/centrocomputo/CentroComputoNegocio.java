package com.mycompany.negociolabcomputo.negociosfacades.centrocomputo;

import com.mycompany.persistencialabcomputo.daos.centrocomputo.ICentroComputoDAO;
import dtos.centrocomputo.CentroComputoAgregarDTO;
import dtos.centrocomputo.CentroComputoTablaDTO;
import entidades.CentroComputoDominio;
import entidades.UnidadDominio;

import java.sql.Time;
import java.util.List;
import java.util.stream.Collectors;

public class CentroComputoNegocio implements ICentroComputoNeogcio {
    private ICentroComputoDAO centroComputoDAO;

    public CentroComputoNegocio(ICentroComputoDAO dao) {
        centroComputoDAO = dao;
    }

    public List<CentroComputoTablaDTO> consultarCentros() {
        List<CentroComputoDominio> centros = centroComputoDAO.obtenerTodos();

        return centros.stream()
                .map(centro -> new CentroComputoTablaDTO(
                        centro.getId(),
                        centro.getHoraInicio(),
                        centro.getHoraFin(),
                        centro.getUnidad().getNombre(),
                        centro.getNumeroComputadoras()
                )).collect(Collectors.toList());
    }

    public List<CentroComputoTablaDTO> consultarCentrosUnidad(UnidadDominio unidad) {
        List<CentroComputoDominio> lista = centroComputoDAO.obtenerPorUnidad(unidad);
        return lista.stream()
                .map(centro -> new CentroComputoTablaDTO(
                        centro.getId(),
                        centro.getHoraInicio(),
                        centro.getHoraFin(),
                        centro.getUnidad().getNombre(),
                        centro.getNumeroComputadoras()
                ))
                .collect(Collectors.toList());
    }

    @Override
    public void guardarCentro(CentroComputoAgregarDTO centroComputoAgregarDTO) {

        //
        //Validaciones del negocio
        //

        Time horaInicio = Time.valueOf(centroComputoAgregarDTO.getHoraInicio());
        Time horaFIn =  Time.valueOf(centroComputoAgregarDTO.getHoraFin());
        CentroComputoDominio centroComputoDominio = new  CentroComputoDominio();
        centroComputoDominio.setHoraInicio(horaInicio);
        centroComputoDominio.setHoraFin(horaFIn);
        centroComputoDominio.setUsuarioAdmin(centroComputoAgregarDTO.getUsuarioAdmin());
        centroComputoDominio.setContrasenaAdmin(centroComputoAgregarDTO.getContrasenaAdmin());
        centroComputoDominio.setUnidad(centroComputoAgregarDTO.getIdUnidad());

        centroComputoDAO.agregarCentro(centroComputoDominio);

    }

    @Override
    public void validarHorarios(CentroComputoAgregarDTO centroComputoAgregarDTO) {
        //validar los horarios que no sean incongruentes
    }
}
