package com.mycompany.presentacionlabcomputo.paneles;

import com.mycompany.negociolabcomputo.negociosfacades.ISistemaFacade;
import com.mycompany.negociolabcomputo.negociosfacades.centrocomputo.CentroComputoFacade;
import com.mycompany.negociolabcomputo.negociosfacades.centrocomputo.ICentroComputoFacade;
import com.mycompany.presentacionlabcomputo.frames.MainFrameBase;
import com.mycompany.presentacionlabcomputo.paneles.carreras.CarrerasPanel;
import com.mycompany.presentacionlabcomputo.paneles.centrosComputo.CentrosComputoPanel;
import com.mycompany.presentacionlabcomputo.paneles.estudiantes.EstudiantesPanel;
import com.mycompany.presentacionlabcomputo.paneles.reportes.GenerarReportePanel;
import com.mycompany.presentacionlabcomputo.styles.Button;

import javax.swing.*;
import java.awt.*;

public class MainFramePanel extends JPanel {
    //fachadas
    CentroComputoFacade centroComputoFacade;

    private MenuLateralPanel menuLateralPanel;
    private JPanel panelContenido;
    private CentrosComputoPanel centrosComputoPanel;
    private CarrerasPanel carrerasPanel;
    private EstudiantesPanel estudiantesPanel;
    private GenerarReportePanel  generarReportePanel;
    private Button btnCentrosDeComputo;
    private Button btnCursos;
    private Button btnEstudiantes;
    private Button btnReportes;

    public MainFramePanel(MainFrameBase owner, ISistemaFacade sistemaFacade) {
        setOpaque(false);
        setLayout(new BorderLayout());
        panelContenido = new JPanel();
        panelContenido.setOpaque(false);
        menuLateralPanel = new MenuLateralPanel();
        centrosComputoPanel  = new CentrosComputoPanel(owner, sistemaFacade);
        carrerasPanel = new CarrerasPanel(owner, sistemaFacade);
        estudiantesPanel = new EstudiantesPanel(owner, sistemaFacade);
        generarReportePanel = new GenerarReportePanel(owner, sistemaFacade);
        //panelMenuLateral.setBorder(BorderFactory.createEmptyBorder(200, 0, 0, 0));

        btnCentrosDeComputo = new Button("Centros de computo", 255, 60, 16, 50);
        btnCursos = new Button("Carreras", 255, 60, 16, 50);
        btnEstudiantes = new Button("Gestionar Estudiantantes", 255, 60, 16, 50);
        btnReportes = new Button("Generar reporte", 255, 60, 16, 50);

        btnCentrosDeComputo.addActionListener(e -> {
            owner.showPanelContenedorNuevo(centrosComputoPanel);
        });
        btnCursos.addActionListener(e -> {
            owner.showPanelContenedorNuevo(carrerasPanel);
        });
        btnEstudiantes.addActionListener(e -> {
            owner.showPanelContenedorNuevo(estudiantesPanel);
        });
        btnReportes.addActionListener(e -> {
            owner.showPanelContenedorNuevo(generarReportePanel);
        });

        menuLateralPanel.add(Box.createRigidArea(new Dimension(350, 30)));
        menuLateralPanel.add(btnCentrosDeComputo);
        menuLateralPanel.add(Box.createRigidArea(new Dimension(350, 30)));
        menuLateralPanel.add(btnCursos);
        menuLateralPanel.add(Box.createRigidArea(new Dimension(350, 30)));
        menuLateralPanel.add(btnEstudiantes);
        menuLateralPanel.add(Box.createRigidArea(new Dimension(350, 30)));
        menuLateralPanel.add(btnReportes);

        add(menuLateralPanel, BorderLayout.WEST);
        add(panelContenido, BorderLayout.CENTER);

    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g.create();
        g2d.setColor(Color.white);
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2d.setStroke(new BasicStroke(.5f));
        g2d.drawLine(368, 40, 368, 720);
        g2d.dispose();

    }
}
