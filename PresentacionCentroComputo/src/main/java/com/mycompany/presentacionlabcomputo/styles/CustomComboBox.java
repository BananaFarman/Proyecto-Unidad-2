package com.mycompany.presentacionlabcomputo.styles;

import com.mycompany.negociolabcomputo.negociosfacades.ISistemaFacade;
import com.mycompany.negociolabcomputo.negociosfacades.SistemaFacade;
import entidades.UnidadDominio;
import enums.FuncionEquipo;

import javax.swing.*;
import javax.swing.plaf.basic.BasicComboBoxUI;
import java.awt.*;
import java.util.List;

public class CustomComboBox<T> extends JComboBox<T> {

    public CustomComboBox(String tipo, ISistemaFacade sistemaFacade) {
        super();
        iniciarComponentes();
        cargarOpciones(tipo, sistemaFacade);
    }

    private void iniciarComponentes() {
        setUI(new BasicComboBoxUI() {
            @Override
            protected JButton createArrowButton() {
                JButton button = new JButton("▼");
                button.setBorder(BorderFactory.createEmptyBorder());
                button.setContentAreaFilled(false);
                button.setForeground(Color.DARK_GRAY);
                button.setFocusPainted(false);
                return button;
            }
        });

        setBackground(Color.WHITE);
        setForeground(Color.BLACK);
        setFont(FuenteUtil.cargarFuenteInter(16, "Inter_Light"));
        setFocusable(false);
        setOpaque(false);
        setBorder(BorderFactory.createEmptyBorder(5, 10, 5, 10));
        setBorder(BorderFactory.createEmptyBorder(8, 12, 8, 12));

        this.setRenderer(new DefaultListCellRenderer() {
            @Override
            public Component getListCellRendererComponent(
                    JList<?> list, Object value, int index, boolean isSelected, boolean cellHasFocus
            ) {
                super.getListCellRendererComponent(list, value, index, isSelected, cellHasFocus);

                if (value instanceof UnidadDominio) {
                    UnidadDominio unidad = (UnidadDominio) value;
                    setText(unidad.getNombre());
                } else if (value != null) {
                    setText(value.toString());
                }

                return this;
            }
        });
    }

    public void cargarOpciones(String tipo, ISistemaFacade sistemaFacade) {
        this.removeAllItems();

        switch (tipo){
            case "unidades":
                List<UnidadDominio> unidades = sistemaFacade.getUnidadAcademicaFacade().obtenerTodos();
                for (UnidadDominio unidad : unidades) {
                    this.addItem((T)unidad);
                }
                break;
            case "funcionalidades":
                this.addItem((T)FuncionEquipo.De_Reserva);
                this.addItem((T)FuncionEquipo.Para_Reservas);
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + tipo);
        }
    }

    public T getSeleccionado() {
        return (T) this.getSelectedItem();
    }

    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2d = (Graphics2D) g.create();
        g2d.setColor(Color.white);
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2d.fillRoundRect(0, 0, getWidth(), getHeight(), Style.CORNER_RADIUS_TXT, Style.CORNER_RADIUS_TXT);
        super.paintComponent(g);

    }
}
