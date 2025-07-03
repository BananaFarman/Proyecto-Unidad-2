package com.mycompany.presentacionlabcomputo.paneles;

import com.mycompany.presentacionlabcomputo.styles.FuenteUtil;
import com.mycompany.presentacionlabcomputo.styles.Style;

import javax.swing.*;
import java.awt.*;

public class MenuLateralPanel extends JPanel {
    private JPanel panelPrincipal;

    public MenuLateralPanel() {
        setPreferredSize(new Dimension(366, 800));
        setOpaque(false);
        setLayout(new FlowLayout());
        // Paneles
        panelPrincipal = new JPanel();
        panelPrincipal.setOpaque(false);
        panelPrincipal.setLayout(new BoxLayout(panelPrincipal, BoxLayout.Y_AXIS));


    }

    public JPanel getPanelPrincipal() {
        return panelPrincipal;
    }

    @Override
    protected void paintComponent(Graphics g) {

    }

}
