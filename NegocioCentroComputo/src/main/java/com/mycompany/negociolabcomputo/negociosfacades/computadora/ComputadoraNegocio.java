package com.mycompany.negociolabcomputo.negociosfacades.computadora;

import com.mycompany.persistencialabcomputo.daos.computadora.IComputadoraDAO;

public class ComputadoraNegocio implements IComputadoraNegocio {
    public IComputadoraDAO computadoraDAO;

    public ComputadoraNegocio(IComputadoraDAO computadoraDAO) {
        this.computadoraDAO = computadoraDAO;
    }

}
