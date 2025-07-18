package com.mycompany.presentacionlabcomputo.styles;

import javax.swing.*;
import java.awt.*;

public class PsswrdFieldPh extends JPasswordField {
    private String txtPlaceholder;

    public PsswrdFieldPh(String txtPlaceholder) {
        this.txtPlaceholder = txtPlaceholder;
        setFont(FuenteUtil.cargarFuenteInter(12, "Inter_Regular"));
        setPreferredSize(new Dimension(280, 50));
        setBorder(new RoundBorder(Style.CORNER_RADIUS_TXT));
        setOpaque(false);

    }

    @Override
    protected void paintComponent(Graphics g) {
        if (getPassword().length == 0) {
            Graphics2D g2d = (Graphics2D) g.create();
            g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
            g2d.setColor(Color.white);
            g2d.fillRoundRect(0, 0, getWidth(), getHeight(), Style.CORNER_RADIUS_TXT, Style.CORNER_RADIUS_TXT);
            g2d.setColor(Style.COLOR_TXT_PH);
            g2d.setFont(FuenteUtil.cargarFuenteInter(16, "Inter_Regular"));
            g2d.drawString(txtPlaceholder, 15, getHeight() / 2 + 6);
            g2d.dispose();
        }
        super.paintComponent(g);

    }
}
