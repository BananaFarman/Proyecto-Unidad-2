package com.mycompany.negociolabcomputo.negociosfacades.apartado;

import com.mycompany.persistencialabcomputo.daos.apartado.IApartadoDAO;

import javax.swing.plaf.PanelUI;

public class ApartadoNegocio implements IApartadoNegocio {
    private IApartadoDAO apartadoDAO;

    public ApartadoNegocio(IApartadoDAO apartadoDAO) {
        this.apartadoDAO = apartadoDAO;
    }

    //Acciones de apartado


}
