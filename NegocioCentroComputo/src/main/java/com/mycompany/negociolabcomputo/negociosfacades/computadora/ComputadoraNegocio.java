package com.mycompany.negociolabcomputo.negociosfacades.computadora;

import com.mycompany.persistencialabcomputo.daos.computadora.IComputadoraDAO;
import dtos.computadora.ComputadoraAgregarDTO;
import entidades.ComputadoraDominio;
import enums.EstatusApartado;

public class ComputadoraNegocio implements IComputadoraNegocio {
    public IComputadoraDAO computadoraDAO;

    public ComputadoraNegocio(IComputadoraDAO computadoraDAO) {
        this.computadoraDAO = computadoraDAO;
    }

    @Override
    public void registrarComputadora(ComputadoraAgregarDTO dto) {
        //Verificar si la IP ya está registrada
        //verificar numero de equipo valido (No ocupado)

        ComputadoraDominio computadora = new ComputadoraDominio(dto.getNumeroMaquina(),
                dto.getDireccionIp(),
                dto.getSoftwareInstalado(),
                EstatusApartado.DISPONIBLE,
                dto.getFuncion(),
                dto.getCentroComputo());

        computadoraDAO.agregarComputadora(computadora);

    }
}
