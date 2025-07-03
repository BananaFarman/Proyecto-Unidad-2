package com.mycompany.presentacionlabcomputo.dialogs;

import com.mycompany.presentacionlabcomputo.paneles.estudiantes.EstudianteBloqueadoPanel;
import com.mycompany.presentacionlabcomputo.styles.Style;
import com.mycompany.presentacionlabcomputo.styles.Button;

import javax.swing.*;
import java.awt.*;

public class EstudianteBloqueadoDialog extends JDialog {
    private EstudianteBloqueadoPanel estuadianteBloqueadoPanel;
    private Button btnEntendido;
    private Label lblTituloBloqueado;

    public EstudianteBloqueadoDialog(Frame owner) {
        super(owner, "Error de ingreso", true);
        setSize(560, 310);
        getContentPane().setBackground(Style.COLOR);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
        estuadianteBloqueadoPanel  = new EstudianteBloqueadoPanel();

        add(estuadianteBloqueadoPanel);

        setVisible(true);
    }

}
