package com.mycompany.presentacionlabcomputo.frames;

import com.mycompany.negociolabcomputo.negociosfacades.ISistemaFacade;
import com.mycompany.presentacionlabcomputo.paneles.MainFramePanel;
import com.mycompany.presentacionlabcomputo.styles.Button;
import com.mycompany.presentacionlabcomputo.styles.Style;

import javax.swing.*;
import java.awt.*;

public class MainFrameBase extends JFrame {
    private JPanel panelNorte;
    private JPanel panelSur;
    private JPanel panelContenedor;
    private MainFramePanel  mainFramePanel;
    private Button btnCentrosDeComputo;
    private Button btnCursos;
    private Button btnEstudiantes;
    private Button btnReportes;

    public MainFrameBase(ISistemaFacade sistemaFacade) {
        setSize(1470, 800);
        getContentPane().setBackground(Style.COLOR);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        panelContenedor = new JPanel(new BorderLayout());
        panelContenedor.setOpaque(false);
        mainFramePanel = new MainFramePanel(this, sistemaFacade);

        panelContenedor.add(mainFramePanel);
        add(panelContenedor, BorderLayout.CENTER);

        setVisible(true);
    }

    public void showPanelContenedorNuevo(JPanel nuevoPanel) {
        panelContenedor.removeAll();
        panelContenedor.add(nuevoPanel);
        panelContenedor.revalidate();
        panelContenedor.repaint();
    }

    public void volverInicio() {
        showPanelContenedorNuevo(mainFramePanel);
    }

    public void volerAtras(JPanel nuevoPanel){
        showPanelContenedorNuevo(nuevoPanel);
    }
}
