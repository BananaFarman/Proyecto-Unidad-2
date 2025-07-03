package com.mycompany.presentacionlabcomputo.frames;

import com.mycompany.presentacionlabcomputo.paneles.LogInPanel;
import com.mycompany.presentacionlabcomputo.styles.Style;

import javax.swing.*;

public class LogInFrame extends JFrame {
    private JPanel panelCentral;
    private LogInPanel logInPanel;

    public LogInFrame() {
        setTitle("Control de computadoras");
        setSize(450, 500);
        getContentPane().setBackground(Style.COLOR);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        panelCentral = new JPanel();
        logInPanel = new LogInPanel(this);
        panelCentral.add(logInPanel);
        panelCentral.setOpaque(false);

        add(panelCentral);
        setVisible(true);
    }
}
