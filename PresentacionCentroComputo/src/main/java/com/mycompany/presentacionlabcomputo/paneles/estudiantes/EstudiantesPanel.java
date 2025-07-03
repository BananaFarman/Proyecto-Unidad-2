package com.mycompany.presentacionlabcomputo.paneles.estudiantes;

import com.mycompany.negociolabcomputo.negociosfacades.ISistemaFacade;
import com.mycompany.presentacionlabcomputo.frames.MainFrameBase;
import com.mycompany.presentacionlabcomputo.paneles.MenuLateralPanel;
import com.mycompany.presentacionlabcomputo.styles.Button;
import com.mycompany.presentacionlabcomputo.styles.CustomComboBox;
import com.mycompany.presentacionlabcomputo.styles.FuenteUtil;

import javax.swing.*;
import java.awt.*;

public class EstudiantesPanel extends JPanel {
    private MenuLateralPanel menuLateralPanel;
    private JPanel panelContenido;
    private CustomComboBox comboUnidad;
    private CustomComboBox comboCarrera;
    private JLabel lblTitulo;
    private JLabel lblUnidad;
    private JLabel lblCarrera;
    private Button btnVolver;

    public EstudiantesPanel(MainFrameBase owner, ISistemaFacade sistemaFacade){
        setOpaque(false);
        setLayout(new BorderLayout());
        panelContenido = new JPanel();
        panelContenido.setOpaque(false);
        menuLateralPanel =  new MenuLateralPanel();

        //Componentes
        lblTitulo = new JLabel("Estudiantes");
        lblTitulo.setFont(FuenteUtil.cargarFuenteInter(26, "Inter_Bold"));
        lblTitulo.setForeground(Color.white);
        lblUnidad = new JLabel("Unidad");
        lblUnidad.setFont(FuenteUtil.cargarFuenteInter(20, "Inter_Light"));
        lblUnidad.setForeground(Color.white);
        lblCarrera = new JLabel("Carrera");
        lblCarrera.setFont(FuenteUtil.cargarFuenteInter(20, "Inter_Light"));
        lblCarrera.setForeground(Color.white);
        comboUnidad = new CustomComboBox<>("unidades", sistemaFacade);
        comboUnidad.setPreferredSize(new Dimension(200, 35));

//        comboCarrera.setPreferredSize(new Dimension(200, 35));
        btnVolver = new Button("Volver", 162, 45, 20, 50);

        btnVolver.addActionListener(e -> {
            owner.volverInicio();
        });

        menuLateralPanel.add(Box.createRigidArea(new Dimension(350, 20)));
        menuLateralPanel.add(lblTitulo);
        menuLateralPanel.add(Box.createRigidArea(new Dimension(350, 40)));
        menuLateralPanel.add(lblUnidad);
        menuLateralPanel.add(Box.createRigidArea(new Dimension(350, 5)));
        menuLateralPanel.add(comboUnidad);
        menuLateralPanel.add(Box.createRigidArea(new Dimension(350, 10)));
        menuLateralPanel.add(lblCarrera);
        menuLateralPanel.add(Box.createRigidArea(new Dimension(350, 5)));
//        menuLateralPanel.add(comboCarrera);
        menuLateralPanel.add(Box.createRigidArea(new Dimension(350, 380)));
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
        g2d.drawRoundRect(12, 100, 340, 205, 25, 25);
        g2d.dispose();

    }

}
