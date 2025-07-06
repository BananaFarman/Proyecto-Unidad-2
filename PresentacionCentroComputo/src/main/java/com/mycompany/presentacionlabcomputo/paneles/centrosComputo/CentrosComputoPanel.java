package com.mycompany.presentacionlabcomputo.paneles.centrosComputo;

import com.mycompany.negociolabcomputo.negociosfacades.ISistemaFacade;
import com.mycompany.presentacionlabcomputo.dialogs.AñadirCentroDialog;
import com.mycompany.presentacionlabcomputo.frames.MainFrameBase;
import com.mycompany.presentacionlabcomputo.paneles.MenuLateralPanel;
import com.mycompany.presentacionlabcomputo.styles.*;
import com.mycompany.presentacionlabcomputo.styles.Button;
import dtos.centrocomputo.CentroComputoTablaDTO;
import entidades.CentroComputoDominio;
import entidades.UnidadDominio;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.util.List;

public class CentrosComputoPanel extends JPanel {
    private ISistemaFacade sistemaFacade;
    private AñadirCentroDialog añadirCentroDialog;
    private MenuLateralPanel menuLateralPanel;
    private JPanel panelContenido;
    private JLabel lblTitulo;
    private JLabel lblUnidad;
    private JLabel lblUnidadSeleccionada;
    private CustomComboBox comboUnidades;
    private Button btnAñadirCentro;
    private Button btnVolver;
    private CustomTable tablaCentros;
    private DefaultTableModel modelo;

    public CentrosComputoPanel(MainFrameBase owner, ISistemaFacade sistemaFacade) {
        setOpaque(false);
        setLayout(new BorderLayout());
        this.sistemaFacade = sistemaFacade;
        panelContenido = new JPanel();
        panelContenido.setOpaque(false);
        menuLateralPanel = new MenuLateralPanel();

        //Componentes
        modelo = new DefaultTableModel(new Object[]{"ID", "Hora Apertura", "Hora Cierre", "Unidad Academica", "Computadoras", " "}, 0);
        this.tablaCentros = new CustomTable(modelo);
        tablaCentros.agregarColumnaBotonAccion(owner, this);
        lblTitulo = new JLabel("Centro de Computos");
        lblTitulo.setFont(FuenteUtil.cargarFuenteInter(26, "Inter_Bold"));
        lblTitulo.setForeground(Color.white);
        lblUnidad = new JLabel("Unidad");
        lblUnidad.setFont(FuenteUtil.cargarFuenteInter(20, "Inter_Light"));
        lblUnidad.setForeground(Color.white);
        lblUnidadSeleccionada = new JLabel("Mostrando: ");
        lblUnidadSeleccionada.setFont(FuenteUtil.cargarFuenteInter(26, "Inter_SemiBold"));
        lblUnidadSeleccionada.setForeground(Color.white);
         //Combobox
        UnidadDominio opcionTodas = new UnidadDominio();
        opcionTodas.setId(0L);
        opcionTodas.setNombre("Todas");

        comboUnidades = new CustomComboBox<>("unidades", sistemaFacade);
        comboUnidades.insertItemAt(opcionTodas, 0);
        comboUnidades.setPreferredSize(new Dimension(200, 35));
        btnAñadirCentro = new Button("Añadir centro de computo", 310, 45, 20, 50);
        btnVolver = new Button("Volver", 162, 45, 20, 50);

        btnAñadirCentro.addActionListener(e -> {
            añadirCentroDialog = new AñadirCentroDialog(owner, this, sistemaFacade);

        });
        btnVolver.addActionListener(e -> {
            owner.volverInicio();
        });
        comboUnidades.addActionListener(e -> {
            UnidadDominio unidadSeleccionada = (UnidadDominio) comboUnidades.getSelectedItem();
            if (unidadSeleccionada != null && unidadSeleccionada.getId() == 0L) {
                crearTablaCentros();
            }else if(unidadSeleccionada != null){
                crearTablaPorUnidad(unidadSeleccionada);
            }
        });

        panelContenido.add(Box.createRigidArea(new Dimension(1800, 70)));
        panelContenido.add(lblUnidadSeleccionada);
        // TABLA CON LOS CENTOS DE COMPUTO
        crearTablaCentros();
        panelContenido.add(Box.createRigidArea(new Dimension(1800, 100)));
        JScrollPane scrollPane = new JScrollPane(tablaCentros);
        scrollPane.setBorder(BorderFactory.createEmptyBorder());
        scrollPane.setPreferredSize(new Dimension(920, 400));
        scrollPane.getViewport().setBackground(tablaCentros.getBackground());
        panelContenido.add(scrollPane);

        menuLateralPanel.add(Box.createRigidArea(new Dimension(350, 20)));
        menuLateralPanel.add(lblTitulo);
        menuLateralPanel.add(Box.createRigidArea(new Dimension(350, 40)));
        menuLateralPanel.add(lblUnidad);
        menuLateralPanel.add(Box.createRigidArea(new Dimension(350, 25)));
        menuLateralPanel.add(comboUnidades);
        menuLateralPanel.add(Box.createRigidArea(new Dimension(350, 65)));
        menuLateralPanel.add(btnAñadirCentro);
        menuLateralPanel.add(Box.createRigidArea(new Dimension(350, 330)));
        menuLateralPanel.add(btnVolver);

        add(menuLateralPanel, BorderLayout.WEST);
        add(panelContenido, BorderLayout.CENTER);

    }

    public void crearTablaCentros() {
        modelo.setRowCount(0);
        List<CentroComputoTablaDTO> centros = sistemaFacade.getCentroComputoFacade().consultarCentros();
        for (CentroComputoTablaDTO centro : centros) {
            modelo.addRow(new Object[]{
                    centro.getId(),
                    centro.getHoraApertura(),
                    centro.getHoraCierre(),
                    centro.getNombreUnidad(),
                    centro.getNumComputadoras()
            });
        }
    }

    public void crearTablaPorUnidad(UnidadDominio unidad) {
        modelo.setRowCount(0);
        List<CentroComputoTablaDTO> centros = sistemaFacade.getCentroComputoFacade().consultarCentrosUnidad(unidad);

        for (CentroComputoTablaDTO centro : centros) {
            modelo.addRow(new Object[]{
                    centro.getId(),
                    centro.getHoraApertura(),
                    centro.getHoraCierre(),
                    centro.getNombreUnidad(),
                    centro.getNumComputadoras()
            });
        }
    }

    public ISistemaFacade getSistemaFacade() {
        return sistemaFacade;
    }

    public CustomTable getTablaCentros() {
        return tablaCentros;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g.create();
        g2d.setColor(Color.white);
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2d.setStroke(new BasicStroke(.2f));
        g2d.drawLine(368, 40, 368, 720);
        g2d.drawRoundRect(52, 100, 260, 130, 25, 25);
        g2d.dispose();

    }
}
