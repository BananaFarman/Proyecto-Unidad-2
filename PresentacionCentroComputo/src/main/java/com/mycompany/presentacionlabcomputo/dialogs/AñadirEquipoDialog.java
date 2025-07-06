package com.mycompany.presentacionlabcomputo.dialogs;

import com.mycompany.negociolabcomputo.negociosfacades.ISistemaFacade;
import com.mycompany.presentacionlabcomputo.frames.MainFrameBase;
import com.mycompany.presentacionlabcomputo.paneles.centrosComputo.AñadirEquipoPanel;
import com.mycompany.presentacionlabcomputo.paneles.centrosComputo.CentroPanel;
import com.mycompany.presentacionlabcomputo.styles.Style;

import javax.swing.*;

public class AñadirEquipoDialog extends JDialog {
    private AñadirEquipoPanel añadirEquipoPanel;

    public AñadirEquipoDialog(MainFrameBase owner, CentroPanel panelOwner, ISistemaFacade sistemaFacade) {
        super(owner, "Añadir equipo", true);
        setSize(510, 540);
        getContentPane().setBackground(Style.COLOR);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
        añadirEquipoPanel = new AñadirEquipoPanel(panelOwner, sistemaFacade);
        add(añadirEquipoPanel);
        setVisible(true);
    }

}
