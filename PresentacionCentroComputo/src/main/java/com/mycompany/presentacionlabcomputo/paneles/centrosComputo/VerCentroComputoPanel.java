package com.mycompany.presentacionlabcomputo.paneles.centrosComputo;

import com.mycompany.negociolabcomputo.negociosfacades.centrocomputo.ICentroComputoFacade;
import com.mycompany.presentacionlabcomputo.frames.MainFrameBase;
import com.mycompany.presentacionlabcomputo.paneles.MenuLateralPanel;
import com.mycompany.presentacionlabcomputo.styles.Button;

import javax.swing.*;
import java.awt.*;

public class VerCentroComputoPanel extends JPanel {
    private ICentroComputoFacade ICentroComputoFacade;

    private JPanel panelContenido;
    private CentrosComputoPanel panelAnterior;
    private MenuLateralPanel menuLateralPanel;
    private JLabel lblNombreCentroComputo;
    private Button btnAgregarComputadora;
    private Button btnModificarCentro;
    private Button btnVolver;

    public VerCentroComputoPanel(MainFrameBase owner, CentrosComputoPanel panelAnterior, ICentroComputoFacade ICentroComputoFacade) {
        setOpaque(false);
        setLayout(new BorderLayout());
        panelContenido = new JPanel();
        panelContenido.setOpaque(false);
        menuLateralPanel =  new MenuLateralPanel();
        this.ICentroComputoFacade = ICentroComputoFacade;

        //Componentes
        //lblNombreCentroComputo
        btnModificarCentro = new Button("Modificar este centro de computo", 310, 45, 20, 50);
        btnAgregarComputadora = new Button("Agregar equipo nuevo", 310, 45, 20, 50);
        btnVolver = new Button("Volver", 162, 45, 20, 50);

        btnVolver.addActionListener(e -> {
            owner.showPanelContenedorNuevo(panelAnterior);
        });

        //MenuLateral del panel
        menuLateralPanel.add(Box.createRigidArea(new Dimension(350, 20)));
        menuLateralPanel.add(lblNombreCentroComputo);
        menuLateralPanel.add(Box.createRigidArea(new Dimension(350, 40)));
        menuLateralPanel.add(btnModificarCentro);
        menuLateralPanel.add(Box.createRigidArea(new Dimension(350, 25)));
        menuLateralPanel.add(btnAgregarComputadora);
        menuLateralPanel.add(Box.createRigidArea(new Dimension(350, 350)));
        menuLateralPanel.add(btnVolver);

        add(menuLateralPanel, BorderLayout.WEST);
        add(panelContenido, BorderLayout.CENTER);

    }

    public void mostrarTodosLosCentros(){

    }


}
