package com.mycompany.presentacionlabcomputo.frames;

import com.mycompany.presentacionlabcomputo.paneles.reservarEquipo.ReservarEquipoPanel;
import com.mycompany.presentacionlabcomputo.paneles.MenuLateralPanel;
import com.mycompany.presentacionlabcomputo.styles.FuenteUtil;
import com.mycompany.presentacionlabcomputo.styles.Style;

import javax.swing.*;
import java.awt.*;

public class ReservarEquipoFrame extends JFrame{
    private MenuLateralPanel panelMenu;
    private ReservarEquipoPanel panelElegir;
    private String nombreLaboratorio;
    private JLabel lblTitulo;


    public ReservarEquipoFrame() {
        setSize(1440, 800);
        getContentPane().setBackground(Style.COLOR);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().setBackground(Style.COLOR);
        setLocationRelativeTo(null);

        panelMenu = new MenuLateralPanel();
        panelElegir = new ReservarEquipoPanel();
        lblTitulo = new  JLabel(nombreLaboratorio);
        lblTitulo.setForeground(Color.WHITE);
        lblTitulo.setFont(FuenteUtil.cargarFuenteInter(24, "Inter_SemiBold"));

        panelMenu.add(lblTitulo);
        panelMenu.add(Box.createVerticalStrut(120));

        add(panelMenu, BorderLayout.WEST);
        add(panelElegir, BorderLayout.CENTER);
        setVisible(true);

    }


}
