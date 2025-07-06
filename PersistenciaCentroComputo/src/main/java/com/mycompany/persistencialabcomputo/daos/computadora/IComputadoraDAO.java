package com.mycompany.persistencialabcomputo.daos.computadora;

import entidades.ComputadoraDominio;

public interface IComputadoraDAO {
    void agregarComputadora(ComputadoraDominio computadora);

    boolean existeIpRegistrada(String ip);

}
