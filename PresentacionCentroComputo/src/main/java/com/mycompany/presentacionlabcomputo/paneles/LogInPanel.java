package com.mycompany.presentacionlabcomputo.paneles;

import com.mycompany.presentacionlabcomputo.dialogs.EstudianteBloqueadoDialog;
import com.mycompany.presentacionlabcomputo.styles.*;
import com.mycompany.presentacionlabcomputo.styles.Button;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LogInPanel extends JPanel {
    private JPanel panelPrincipal;
    private JPanel panelSur;
    private TxtFieldPh txtUsuario;
    private PsswrdFieldPh txtPsswrd;
    private Button btnIngresar;
    private JFrame owner;


    public LogInPanel(JFrame owner) {
        setPreferredSize(new Dimension(400, 450));
        setOpaque(false);
        inicializarComponentes();
        this.owner = owner;

    }

    private void inicializarComponentes(){
        // Paneles
        panelPrincipal = new JPanel();
        panelPrincipal.setOpaque(false);
        panelPrincipal.setLayout(new BoxLayout(panelPrincipal, BoxLayout.Y_AXIS));

        panelSur = new JPanel();
        panelSur.setOpaque(false);

        // Componentes
        txtUsuario = new TxtFieldPh("Usuario", true, 200, 50, 15);
        txtPsswrd = new PsswrdFieldPh("Contraseña");
        btnIngresar = new Button("Ingresar", 200, 60, 16, 50);

        btnIngresar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Crear y mostrar el diálogo
                EstudianteBloqueadoDialog dialog = new EstudianteBloqueadoDialog(owner);
            }
        });


        // Añadir componentes
        panelPrincipal.add(Box.createVerticalStrut(80));
        panelPrincipal.add(txtUsuario);
        panelPrincipal.add(Box.createVerticalStrut(20));
        panelPrincipal.add(txtPsswrd);
        panelPrincipal.add(Box.createVerticalStrut(60));
        panelSur.add(btnIngresar);

        // Añadir Subpaneles
        add(panelPrincipal);
        add(panelSur);

    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g.create();
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2d.setColor(Color.white);
        g2d.setStroke(new BasicStroke(0.5f));
        g2d.fillRoundRect(txtUsuario.getX()+60, txtUsuario.getY()+5, txtUsuario.getWidth(), txtUsuario.getHeight(), Style.CORNER_RADIUS_TXT, Style.CORNER_RADIUS_TXT);
        g2d.fillRoundRect(txtPsswrd.getX()+60, txtPsswrd.getY()+5, txtPsswrd.getWidth(), txtPsswrd.getHeight(), Style.CORNER_RADIUS_TXT, Style.CORNER_RADIUS_TXT);
        g2d.setFont(FuenteUtil.cargarFuenteInter(14, "Inter_Light"));
        g2d.drawString("LogIn", 60, 55);
        g2d.drawRoundRect(35, 65, 330, 160, 25, 25);
    }


}
