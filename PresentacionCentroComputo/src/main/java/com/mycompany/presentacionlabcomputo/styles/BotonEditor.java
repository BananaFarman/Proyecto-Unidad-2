package com.mycompany.presentacionlabcomputo.styles;

import com.mycompany.presentacionlabcomputo.frames.MainFrameBase;
import com.mycompany.presentacionlabcomputo.paneles.centrosComputo.CentroPanel;
import com.mycompany.presentacionlabcomputo.paneles.centrosComputo.CentrosComputoPanel;
import entidades.CentroComputoDominio;

import javax.swing.*;

import java.awt.*;
import java.util.List;

public class BotonEditor extends DefaultCellEditor {
    private JButton button;
    private boolean isPushed;
    private MainFrameBase owner;
    private CentrosComputoPanel centrosComputoPanel;
    private CustomTable table;
    private int filaActual;
    private List<CentroComputoDominio> centros;

    public BotonEditor(JCheckBox checkBox, MainFrameBase owner, CentrosComputoPanel centrosComputoPanel) {
        super(checkBox);
        this.owner = owner;
        this.centrosComputoPanel = centrosComputoPanel;
        this.table = centrosComputoPanel.getTablaCentros();


        button = new JButton("≡");
        button.setFont(new Font("SansSerif", Font.PLAIN, 24));
        button.setBackground(new Color(60, 63, 83));
        button.setForeground(Color.WHITE);
        button.setFocusPainted(false);
        button.setBorderPainted(false);
        button.setBorder(BorderFactory.createEmptyBorder());

        button.addActionListener(e -> {
            if (isPushed) {
                Long idCentro = (Long) table.getModel().getValueAt(filaActual, 0);
                CentroComputoDominio centroComputo = centrosComputoPanel.getSistemaFacade().getCentroComputoFacade().obtenerCentroPorId(idCentro);

                owner.showPanelContenedorNuevo(new CentroPanel(owner, centroComputo, centrosComputoPanel, centrosComputoPanel.getSistemaFacade()));
            }
        });
    }

    @Override
    public Component getTableCellEditorComponent(JTable table, Object value,
                                                 boolean isSelected, int row, int column) {
        isPushed = true;
        this.filaActual = row;
        return button;
    }

    @Override
    public Object getCellEditorValue() {
        isPushed = false;
        return null;
    }
}
