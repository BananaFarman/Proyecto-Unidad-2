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
                new LineaAngular(24, 396, 30, 640),
                new LineaAngular(103, 441, 30, 640),
                new LineaAngular(103, 447, 30, 640),
                new LineaAngular(103, 441, 150, 90),
                new LineaAngular(103, 447, 150, 90),
                new LineaAngular(655, 121, 150, 90),
                new LineaAngular(657, 202, 90, 80),
                new LineaAngular(103, 521, 90, 80),
                new LineaAngular(24, 476, 90, 80),
                // Segundo Escritorio
                new LineaAngular(214, 506, 30, 640),
                new LineaAngular(292, 551, 30, 640),
                // Tercer Escritorio
                new LineaAngular(417, 622, 30, 640),
                new LineaAngular(495, 667, 30, 640)

                );

        for (LineaAngular linea : lineas) {
            g2d.draw(linea.obtenerLinea());
        }
    }
}
