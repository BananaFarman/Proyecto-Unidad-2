package com.mycompany.presentacionlabcomputo.styles;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.util.List;
import java.util.function.Function;

public class TablaPaginada<T> {
    private final CustomTable tabla;
    private final DefaultTableModel modelo;
    private final List<T> datos;
    private final Function<T, Object[]> transformador;
    private final int tamanioPagina;
    private int paginaActual = 0;
    private final JLabel lblPagina;

    public TablaPaginada(CustomTable tabla, List<T> datos, Function<T, Object[]> transformador, int tamanioPagina, JLabel lblPagina) {
        this.tabla = tabla;
        this.modelo = (DefaultTableModel) tabla.getModel();
        this.datos = datos;
        this.transformador = transformador;
        this.tamanioPagina = tamanioPagina;
        this.lblPagina = lblPagina;
        actualizar();
    }

    public void siguiente() {
        if ((paginaActual + 1) * tamanioPagina < datos.size()) {
            paginaActual++;
            actualizar();
        }
    }

    public void anterior() {
        if (paginaActual > 0) {
            paginaActual--;
            actualizar();
        }
    }

    public void actualizar() {
        modelo.setRowCount(0);
        int inicio = paginaActual * tamanioPagina;
        int fin = Math.min(inicio + tamanioPagina, datos.size());

        for (int i = inicio; i < fin; i++) {
            modelo.addRow(transformador.apply(datos.get(i)));
        }

        int totalPaginas = (datos.size() + tamanioPagina - 1) / tamanioPagina;
        lblPagina.setText("Página " + (paginaActual + 1) + " de " + totalPaginas);
    }
}
