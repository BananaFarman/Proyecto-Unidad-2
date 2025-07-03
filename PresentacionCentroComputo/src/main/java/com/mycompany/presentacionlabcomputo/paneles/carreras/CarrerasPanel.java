package com.mycompany.presentacionlabcomputo.paneles.carreras;

import com.mycompany.negociolabcomputo.negociosfacades.ISistemaFacade;
import com.mycompany.presentacionlabcomputo.frames.MainFrameBase;
import com.mycompany.presentacionlabcomputo.paneles.MenuLateralPanel;
import com.mycompany.presentacionlabcomputo.styles.Button;
import com.mycompany.presentacionlabcomputo.styles.CustomComboBox;
import com.mycompany.presentacionlabcomputo.styles.FuenteUtil;

import javax.swing.*;
import java.awt.*;

public class CarrerasPanel extends JPanel {
    private MenuLateralPanel menuLateralPanel;
    private JPanel panelContenido;
    private JLabel lblTitulo;
    private JLabel lblUnidad;
    private CustomComboBox combo;
    private Button btnVolver;

    public CarrerasPanel(MainFrameBase owner, ISistemaFacade sistemaFacade) {
        setOpaque(false);
        setLayout(new BorderLayout());
        panelContenido = new JPanel();
        panelContenido.setOpaque(false);
        menuLateralPanel =  new MenuLateralPanel();

        //Componentes
        lblTitulo = new JLabel("Centro de Computos");
        lblTitulo.setFont(FuenteUtil.cargarFuenteInter(26, "Inter_Bold"));
        lblTitulo.setForeground(Color.white);
        lblUnidad = new JLabel("Unidad");
        lblUnidad.setFont(FuenteUtil.cargarFuenteInter(20, "Inter_Light"));
        lblUnidad.setForeground(Color.white);
        combo = new CustomComboBox<>("unidades", sistemaFacade);
        combo.setPreferredSize(new Dimension(200, 35));
        btnVolver = new Button("Volver", 162, 45, 20, 50);

        btnVolver.addActionListener(e -> {
            owner.volverInicio();
        });

        menuLateralPanel.add(Box.createRigidArea(new Dimension(350, 20)));
        menuLateralPanel.add(lblTitulo);
        menuLateralPanel.add(Box.createRigidArea(new Dimension(350, 40)));
        menuLateralPanel.add(lblUnidad);
        menuLateralPanel.add(Box.createRigidArea(new Dimension(350, 25)));
        menuLateralPanel.add(combo);
        menuLateralPanel.add(Box.createRigidArea(new Dimension(350, 470)));
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
        g2d.setStroke(new BasicStroke(.5f));
        g2d.drawLine(368, 40, 368, 720);
        g2d.drawRoundRect(12, 100, 340, 130, 25, 25);
        g2d.dispose();

    }

}
