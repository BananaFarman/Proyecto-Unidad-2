package com.mycompany.presentacionlabcomputo.dialogs;

import com.mycompany.negociolabcomputo.negociosfacades.ISistemaFacade;
import com.mycompany.presentacionlabcomputo.frames.MainFrameBase;
import com.mycompany.presentacionlabcomputo.paneles.centrosComputo.AñadirCentroPanel;
import com.mycompany.presentacionlabcomputo.paneles.centrosComputo.CentrosComputoPanel;
import com.mycompany.presentacionlabcomputo.styles.Style;

import javax.swing.*;
import java.awt.*;

public class AñadirCentroDialog extends JDialog {
    private AñadirCentroPanel añadirCentroPanel;

    public AñadirCentroDialog(MainFrameBase owner, CentrosComputoPanel panelOwner, ISistemaFacade sistemaFacade) {
        super(owner, "Nuevo centro de computo", true);
        setSize(450, 580);
        getContentPane().setBackground(Style.COLOR);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
        añadirCentroPanel = new AñadirCentroPanel(panelOwner, sistemaFacade);
        add(añadirCentroPanel);
        setVisible(true);

    }
}
