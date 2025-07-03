package com.mycompany.negociolabcomputo.negociosfacades.computadora;

import com.mycompany.negociolabcomputo.negociosfacades.carrera.CarreraNegocio;
import com.mycompany.persistencialabcomputo.daos.computadora.IComputadoraDAO;

public class ComputadoraFacade implements  IComputadoraFacade {
    public IComputadoraNegocio IComputadoraNegocio;
    public IComputadoraDAO computadoraDAO;

    public ComputadoraFacade(IComputadoraDAO computadoraDAO) {
        this.computadoraDAO = computadoraDAO;
        this.IComputadoraNegocio = new ComputadoraNegocio(computadoraDAO);
    }
}
