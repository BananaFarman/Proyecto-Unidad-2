package com.mycompany.presentacionlabcomputo.paneles.reportes;

import com.mycompany.negociolabcomputo.negociosfacades.ISistemaFacade;
import com.mycompany.presentacionlabcomputo.frames.MainFrameBase;
import com.mycompany.presentacionlabcomputo.paneles.MenuLateralPanel;
import com.mycompany.presentacionlabcomputo.styles.*;
import com.mycompany.presentacionlabcomputo.styles.Button;

import javax.swing.*;
import java.awt.*;

public class GenerarReportePanel extends JPanel {
    private MenuLateralPanel menuLateralPanel;
    private JPanel panelContenido;
    private JLabel lblTitulo;
    private JLabel lblTipoReporte;
    private CustomComboBox comboTipoReporte;
    private JLabel lblPeriodo;
    private JLabel lblDe;
    private TxtFieldPh txtFechaDeInicio;
    private JLabel lblHasta;
    private TxtFieldPh txtFechaHasta;
    private Button btnGenerarReporte;
    private Button btnVolver;

    public GenerarReportePanel(MainFrameBase owner, ISistemaFacade sistemaFacade){
        setOpaque(false);
        setLayout(new BorderLayout());
        panelContenido = new JPanel();
        panelContenido.setOpaque(false);
        menuLateralPanel =  new MenuLateralPanel();

        //Componentes
        lblTitulo = new JLabel("Generar Reporte");
        lblTitulo.setFont(FuenteUtil.cargarFuenteInter(26, "Inter_Bold"));
        lblTitulo.setForeground(Color.white);
        lblTipoReporte = new JLabel("Tipo de Reporte");
        lblTipoReporte.setFont(FuenteUtil.cargarFuenteInter(20, "Inter_Light"));
        lblTipoReporte.setForeground(Color.white);
//        comboTipoReporte = new CustomComboBox<>(new String[]{"Centros de computo", "Carreras", "Bloqueos"});
//        comboTipoReporte.setPreferredSize(new Dimension(200, 35));
        lblPeriodo = new JLabel("Periodo");
        lblPeriodo.setFont(FuenteUtil.cargarFuenteInter(15, "Inter_Light"));
        lblPeriodo.setForeground(Color.white);
        lblDe = new JLabel("De");
        lblDe.setFont(FuenteUtil.cargarFuenteInter(15, "Inter_Light"));
        lblDe.setForeground(Color.white);
        txtFechaDeInicio = new TxtFieldPh("dd / mm / aaaa", true, 180, 35, 16);
        lblHasta = new JLabel("Hasta");
        lblHasta.setFont(FuenteUtil.cargarFuenteInter(15, "Inter_Light"));
        lblHasta.setForeground(Color.white);
        txtFechaHasta = new TxtFieldPh("dd / mm / aaaa", true, 180, 35, 16);
        btnGenerarReporte = new Button("Generar", 160, 40, 16, 20);
        btnGenerarReporte.setNewColor(new Color(0x161F33), new Color(0x1B253E), Color.white);
        btnGenerarReporte.crearBorder();
        btnVolver = new Button("Volver", 160, 40, 16, 20);

        btnVolver.addActionListener(e -> {
            owner.volverInicio();
        });

        menuLateralPanel.add(Box.createRigidArea(new Dimension(350, 20)));
        menuLateralPanel.add(lblTitulo);
        menuLateralPanel.add(Box.createRigidArea(new Dimension(350, 40)));
        menuLateralPanel.add(lblTipoReporte);
        menuLateralPanel.add(Box.createRigidArea(new Dimension(350, 25)));
//        menuLateralPanel.add(comboTipoReporte);
        menuLateralPanel.add(Box.createRigidArea(new Dimension(350, 150)));
        menuLateralPanel.add(lblPeriodo);
        menuLateralPanel.add(Box.createRigidArea(new Dimension(350, 15)));
        menuLateralPanel.add(lblDe);
        menuLateralPanel.add(Box.createRigidArea(new Dimension(350, 0)));
        menuLateralPanel.add(txtFechaDeInicio);
        menuLateralPanel.add(Box.createRigidArea(new Dimension(350, 10)));
        menuLateralPanel.add(lblHasta);
        menuLateralPanel.add(Box.createRigidArea(new Dimension(350, 0)));
        menuLateralPanel.add(txtFechaHasta);
        menuLateralPanel.add(Box.createRigidArea(new Dimension(350, 40)));
        menuLateralPanel.add(btnGenerarReporte);
        menuLateralPanel.add(Box.createRigidArea(new Dimension(350, 20)));
        menuLateralPanel.add(btnVolver);

        add(menuLateralPanel, BorderLayout.WEST);
        add(panelContenido, BorderLayout.CENTER);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g.create();
        g2d.setColor(Color.white);
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2d.fillRoundRect(txtFechaDeInicio.getX(), txtFechaDeInicio.getY(), txtFechaDeInicio.getWidth(), txtFechaDeInicio.getHeight(), Style.CORNER_RADIUS_TXT, Style.CORNER_RADIUS_TXT);
        g2d.fillRoundRect(txtFechaHasta.getX(), txtFechaHasta.getY(), txtFechaHasta.getWidth(), txtFechaHasta.getHeight(), Style.CORNER_RADIUS_TXT, Style.CORNER_RADIUS_TXT);
        g2d.setStroke(new BasicStroke(.5f));
        g2d.drawLine(45, 400, 320, 400);
        g2d.drawLine(45, 585, 320, 585);
        g2d.drawLine(368, 40, 368, 720);
        g2d.drawRoundRect(12, 100, 340, 130, 25, 25);
        g2d.dispose();

    }
}
