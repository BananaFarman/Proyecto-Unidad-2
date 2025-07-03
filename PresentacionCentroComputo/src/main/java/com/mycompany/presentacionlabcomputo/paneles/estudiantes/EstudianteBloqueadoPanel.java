package com.mycompany.presentacionlabcomputo.paneles.estudiantes;

import com.mycompany.presentacionlabcomputo.styles.Button;
import com.mycompany.presentacionlabcomputo.styles.FuenteUtil;
import com.mycompany.presentacionlabcomputo.styles.Style;

import javax.swing.*;
import java.awt.*;

public class EstudianteBloqueadoPanel extends JPanel {
    private JPanel panelCentro;
    private JPanel panelSur;
    private Button btnEntendido;
    private Label lblMotivoBloqueo;

    public EstudianteBloqueadoPanel() {
        setLayout(new BorderLayout());
        setOpaque(false);
        panelCentro = new JPanel();
        panelSur = new JPanel();
        lblMotivoBloqueo = new Label();
        panelCentro.setLayout(new BoxLayout(panelCentro, BoxLayout.Y_AXIS));
        btnEntendido = new Button("Entendido", 134, 45, 15, 50);

        panelSur.add(btnEntendido);
        panelSur.setOpaque(false);
        add(panelSur,  BorderLayout.SOUTH);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g.create();
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2d.setColor(Color.white);

        g2d.setFont(FuenteUtil.cargarFuenteInter(15, "Inter_Bold"));
        g2d.drawString("Su usario ha sido bloqueado debido  a  ", 140, 35);
        g2d.setFont(FuenteUtil.cargarFuenteInter(13, "Inter_Light_Italic"));
        g2d.drawString("Comuniquese con Control estudiantil para resolver la situacion.", 85, 190);
        g2d.setStroke(new BasicStroke(0.2f));
        g2d.drawRoundRect(105, 56, 335, 103, 25, 25);

    }

    public void setMotivoBloqueo(String motivoBloqueo) {}
}
