package com.mycompany.presentacionlabcomputo;

import com.mycompany.presentacionlabcomputo.paneles.MenuLateralPanel;
import com.mycompany.presentacionlabcomputo.paneles.centrosComputo.CentrosComputoPanel;
import com.mycompany.presentacionlabcomputo.styles.Button;
import com.mycompany.presentacionlabcomputo.styles.Style;

import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {
    private JPanel panelContenedor;
    private MenuLateralPanel panelMenu;
    private JPanel panelContenido;
    private CentrosComputoPanel centrosComputoPanel;
    private Button btnCentrosDeComputo;
    private Button btnCursos;
    private Button btnEstudiantes;
    private Button btnReportes;

    public MainFrame() {
        setSize(1440, 800);
        getContentPane().setBackground(Style.COLOR);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().setBackground(Style.COLOR);
        setLocationRelativeTo(null);
        //centrosComputoPanel  = new CentrosComputoPanel(this);

        panelContenedor = new JPanel(new BorderLayout());
        panelContenedor.setOpaque(false);
        panelMenu = new MenuLateralPanel();
        panelContenido = new JPanel();
        panelContenido.add(new JLabel("Centro de Computos:"));
        panelContenido.setOpaque(false);

        btnCentrosDeComputo = new Button("Centros de computo", 255, 45, 16, 50);
        btnCursos = new Button("Cursos", 255, 45, 16, 50);
        btnEstudiantes = new Button("Gestionar Estudiantantes", 255, 45, 16, 50);
        btnReportes = new Button("Generar reporte", 255, 45, 16, 50);

//        btnCentrosDeComputo.addActionListener(e -> {
//            showPanelContenedorNuevo(centrosComputoPanel, centrosComputoPanel.getMenuLateralPanel());
//
//        });


        panelMenu.add(Box.createRigidArea(new Dimension(350, 150)));
        panelMenu.add(btnCentrosDeComputo);
        panelMenu.add(Box.createRigidArea(new Dimension(350, 30)));
        panelMenu.add(btnCursos);
        panelMenu.add(Box.createRigidArea(new Dimension(350, 30)));
        panelMenu.add(btnEstudiantes);
        panelMenu.add(Box.createRigidArea(new Dimension(350, 30)));
        panelMenu.add(btnReportes);

        panelContenedor.add(panelMenu, BorderLayout.WEST);
        panelContenedor.add(panelContenido, BorderLayout.CENTER);
        add(panelContenedor);
        setVisible(true);

    }

    public void showPanelContenedorNuevo(JPanel nuevoPanel, JPanel nuevoMenu) {
        panelContenedor.remove(panelMenu);
        panelContenedor.remove(panelContenido);
        panelContenedor.add(nuevoPanel, BorderLayout.CENTER);
        panelContenedor.add(nuevoMenu, BorderLayout.WEST);
        panelContenedor.revalidate();
        panelContenedor.repaint();
    }

    public void volverInicio() {
        panelContenedor.removeAll();
        showPanelContenedorNuevo(panelContenido, panelMenu);
    }


}
