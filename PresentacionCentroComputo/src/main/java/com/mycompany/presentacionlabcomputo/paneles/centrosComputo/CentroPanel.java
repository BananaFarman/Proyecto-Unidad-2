package com.mycompany.presentacionlabcomputo.paneles.centrosComputo;

import com.mycompany.negociolabcomputo.negociosfacades.ISistemaFacade;
import com.mycompany.presentacionlabcomputo.dialogs.AñadirCentroDialog;
import com.mycompany.presentacionlabcomputo.frames.MainFrameBase;
import com.mycompany.presentacionlabcomputo.paneles.MenuLateralPanel;
import com.mycompany.presentacionlabcomputo.styles.Button;
import com.mycompany.presentacionlabcomputo.styles.CustomTable;
import entidades.CentroComputoDominio;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class CentroPanel extends JPanel {
    private ISistemaFacade sistemaFacade;
    private AñadirCentroDialog añadirCentroDialog;
    private MenuLateralPanel menuLateralPanel;
    private JPanel panelContenido;
    private Button btnAñadirComputadora;
    private Button btnVolver;
    private CustomTable tablaComputadoras;
    private DefaultTableModel modelo;

    public CentroPanel(MainFrameBase owner, CentroComputoDominio centroComputoDominio, ISistemaFacade sistemaFacade) {
        setOpaque(false);
        setLayout(new BorderLayout());
        this.sistemaFacade = sistemaFacade;
        panelContenido = new JPanel();
        panelContenido.setOpaque(false);
        menuLateralPanel = new MenuLateralPanel();
        //Componentes
        modelo = new DefaultTableModel(new Object[]{"ID", "Numero", "Direccion IP",  " "}, 0);
        this.tablaComputadoras = new CustomTable(modelo);
        btnAñadirComputadora = new Button("Añadir nueva computadora", 310, 45, 20, 50);
        btnVolver = new Button("Volver", 162, 45, 20, 50);

        btnAñadirComputadora.addActionListener(e -> {


        });

    }
}
