package com.mycompany.negociolabcomputo.ip;

import com.mycompany.persistencialabcomputo.daos.computadora.IComputadoraDAO;
import util.RedUtils;


public class AccesoSistemaService {
    private final IComputadoraDAO computadoraDAO;

    public AccesoSistemaService(IComputadoraDAO computadoraDAO) {
        this.computadoraDAO = computadoraDAO;
    }

    public boolean ipEsValida() {
        String ipLocal = RedUtils.obtenerIpLocal();
        return computadoraDAO.existeIpRegistrada(ipLocal);
    }
}
