package com.mycompany.presentacionlabcomputo.paneles.reservarEquipo;

import com.mycompany.presentacionlabcomputo.styles.FuenteUtil;
import com.mycompany.presentacionlabcomputo.styles.LineaAngular;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Line2D;
import java.util.List;

public class ReservarEquipoPanel extends JPanel {

    public ReservarEquipoPanel() {
        setOpaque(false);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g.create();
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2d.setColor(Color.white);
        g2d.setFont(FuenteUtil.cargarFuenteInter(20, "Inter_Light"));
        g2d.drawString("Seleccione una computadora", 30, 70);
        g2d.setStroke(new BasicStroke(0.2f));
        g2d.drawRoundRect(15, 40, 300, 50, 25, 25);

        //Todas las lineas del panel para los "escritorios"
        List<LineaAngular> lineas = List.of(
                // Primer Escritorio

                );

        for (LineaAngular linea : lineas) {
            g2d.draw(linea.obtenerLinea());
        }
    }
}
