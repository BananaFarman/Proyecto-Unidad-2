package com.mycompany.presentacionlabcomputo.paneles.centrosComputo;

import com.mycompany.negociolabcomputo.negociosfacades.ISistemaFacade;
import com.mycompany.presentacionlabcomputo.styles.*;
import com.mycompany.presentacionlabcomputo.styles.Button;

import javax.swing.*;
import java.awt.*;

public class AñadirEquipoPanel extends JPanel {
    private JPanel panelCentro;
    private JPanel panelSur;
    private TxtFieldPh txtSistemaOperativo;
    private TxtFieldPh txtNumeroEquipo;
    private CustomComboBox<String> comboFucionalidad;
    private Button btnAgregarSoftware;
    private Button btnAgregar;

    public AñadirEquipoPanel(CentroPanel panelOwner, ISistemaFacade sistemaFacade) {
        setLayout(new BorderLayout());
        setOpaque(false);

        // Componentes
        panelCentro = new JPanel();
        panelCentro.setOpaque(false);
        panelSur = new JPanel();
        panelSur.setOpaque(false);
        btnAgregarSoftware = new Button("Agregar Software de trabajo", 360, 30, 20, 30);
        btnAgregar = new Button("Agregar", 150, 40, 20, 35);
        txtSistemaOperativo = new TxtFieldPh("Sistema operativo", false, 275, 50, 15);
        txtSistemaOperativo.setForeground(Color.white);
        txtSistemaOperativo.setBackground(Style.COLOR);
        txtNumeroEquipo = new TxtFieldPh("", false, 100, 50, 15);
        txtNumeroEquipo.setForeground(Color.white);
        txtNumeroEquipo.setBackground(Style.COLOR);

        // Boton de agregar
        btnAgregar.addActionListener(e -> {
            // Crear equipo DTO


        });

        // ComboBox de funcionalidad
        comboFucionalidad = new CustomComboBox<>("funcionalidades", sistemaFacade);
        comboFucionalidad.setBounds(20, 70, 200, 35);

        panelCentro.add(Box.createRigidArea(new Dimension(400, 80)));
        panelCentro.add(txtSistemaOperativo);
        panelCentro.add(Box.createRigidArea(new Dimension(400, 50)));
        panelCentro.add(comboFucionalidad);
        panelCentro.add(Box.createRigidArea(new Dimension(400, 35)));
        panelCentro.add(txtNumeroEquipo);
        panelCentro.add(Box.createRigidArea(new Dimension(400, 50)));
        panelCentro.add(btnAgregarSoftware);
        panelCentro.add(Box.createRigidArea(new Dimension(400, 10)));
        panelCentro.add(btnAgregar);

        add(panelCentro);
        add(panelSur, BorderLayout.SOUTH);

    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g.create();
        g2d.setColor(Color.white);
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2d.setStroke(new BasicStroke(.2f));
        g2d.setFont(FuenteUtil.cargarFuenteInter(26, "Inter_SemiBold"));
        g2d.drawString("Nuevo Equipo", (getWidth()/2)-85, 45);
        g2d.setFont(FuenteUtil.cargarFuenteInter(15, "Inter_Light"));
        g2d.drawString("Tipo de equipo", (getWidth()/2)-50, 185);
        g2d.drawString("Número de equipo", (getWidth()/2)-65, 270);
        g2d.drawRoundRect((getWidth()/2)-165, 70, 340, 285, 25, 25);
        g2d.dispose();

    }

}
