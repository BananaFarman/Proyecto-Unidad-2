package com.mycompany.presentacionlabcomputo.styles;

import com.mycompany.presentacionlabcomputo.frames.MainFrameBase;
import com.mycompany.presentacionlabcomputo.paneles.centrosComputo.CentrosComputoPanel;

import javax.swing.*;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableModel;
import java.awt.*;

public class CustomTable extends JTable {

    public CustomTable(TableModel modelo) {
        super(modelo);
        configurarEstilo();
    }

    private void configurarEstilo() {
        // Fondo y texto
        this.setBackground(Style.COLOR);
        this.setForeground(Color.WHITE);
        this.setFont(FuenteUtil.cargarFuenteInter(16, "Inter_Light"));
        this.setRowHeight(60);

        // Líneas invisibles
        this.setShowHorizontalLines(false);
        this.setShowVerticalLines(false);
        this.setGridColor(new Color(20, 23, 31));
        setIntercellSpacing(new Dimension(10, 10));

        //Filas y columnas
        this.getColumnModel().getColumn(0).setPreferredWidth(50);
        this.getColumnModel().getColumn(1).setPreferredWidth(100);
        this.getColumnModel().getColumn(2).setPreferredWidth(100);
        this.getColumnModel().getColumn(3).setPreferredWidth(120);
        this.getColumnModel().getColumn(4).setPreferredWidth(120);

        // Selección
        this.setSelectionBackground(new Color(30, 41, 67));
        this.setSelectionForeground(Color.WHITE);

        // Encabezado
        JTableHeader header = this.getTableHeader();
        alinearColumna();

        header.setDefaultRenderer(new DefaultTableCellRenderer() {
            @Override
            public Component getTableCellRendererComponent(JTable table, Object value,
                                                           boolean isSelected, boolean hasFocus, int row, int column) {
                JLabel label = new JLabel(value.toString());
                label.setOpaque(true);
                label.setBackground(Style.COLOR);
                label.setForeground(Color.WHITE);
                label.setFont(FuenteUtil.cargarFuenteInter(18, "Inter_Regular"));
                label.setHorizontalAlignment(SwingConstants.CENTER);
                label.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
                return label;

            }
        });
        header.setReorderingAllowed(false);
    }

    public void alinearColumna() {
        DefaultTableCellRenderer renderer = new DefaultTableCellRenderer();
        renderer.setHorizontalAlignment(SwingConstants.CENTER);
        for (int i = 0; i < this.getColumnCount(); i++) {
            this.getColumnModel().getColumn(i).setCellRenderer(renderer);
        }
    }

    public void agregarColumnaBotonAccion(MainFrameBase owner, CentrosComputoPanel centrosComputoPanel) {
        this.getColumnModel().getColumn(5).setCellRenderer(new BotonRenderer());
        this.getColumnModel().getColumn(5).setCellEditor(new BotonEditor(new JCheckBox(), owner, centrosComputoPanel));
    }

}
