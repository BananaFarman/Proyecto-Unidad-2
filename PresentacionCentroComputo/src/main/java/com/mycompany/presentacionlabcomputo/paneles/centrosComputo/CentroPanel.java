package com.mycompany.presentacionlabcomputo.paneles.centrosComputo;

import com.mycompany.negociolabcomputo.negociosfacades.ISistemaFacade;
import com.mycompany.presentacionlabcomputo.dialogs.AñadirEquipoDialog;
import com.mycompany.presentacionlabcomputo.frames.MainFrameBase;
import com.mycompany.presentacionlabcomputo.paneles.MenuLateralPanel;
import com.mycompany.presentacionlabcomputo.styles.Button;
import com.mycompany.presentacionlabcomputo.styles.CustomTable;
import com.mycompany.presentacionlabcomputo.styles.FuenteUtil;
import com.mycompany.presentacionlabcomputo.styles.TablaPaginada;
import dtos.centrocomputo.CentroComputoTablaDTO;
import dtos.computadora.ComputadoraTablaDTO;
import entidades.CentroComputoDominio;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.util.List;

public class CentroPanel extends JPanel {
    private ISistemaFacade sistemaFacade;
    private CentroComputoDominio centroComputo;
    private AñadirEquipoDialog añadirEquipoDialog;
    private MenuLateralPanel menuLateralPanel;
    private JPanel panelContenido;
    private JLabel lblNombreCentro;
    private Button btnAñadirComputadora;
    private Button btnVolver;
    private CustomTable tablaComputadoras;
    private DefaultTableModel modelo;
    private TablaPaginada<ComputadoraTablaDTO> paginador;
    private final JLabel lblPagina;
    private final Button btnAnterior;
    private final Button btnSiguiente;

    public CentroPanel(MainFrameBase owner, CentroComputoDominio centroComputo, CentrosComputoPanel centrosComputoPanel, ISistemaFacade sistemaFacade) {
        setOpaque(false);
        setLayout(new BorderLayout());
        this.sistemaFacade = sistemaFacade;
        this.centroComputo = centroComputo;

        panelContenido = new JPanel();
        panelContenido.setOpaque(false);
        menuLateralPanel = new MenuLateralPanel();
        // Componentes
         // Modelo de la tabla
        modelo = new DefaultTableModel(new Object[]{"ID", "Direccion IP", "Numero",  "Estado", "Funcion", "Detalles"}, 0);
        this.tablaComputadoras = new CustomTable(modelo);
        tablaComputadoras.agregarColumnaBotonAccion(owner, centrosComputoPanel);
         // Labels
        lblNombreCentro = new JLabel("Centro de Computo: " + centroComputo.getId());
        lblNombreCentro.setFont(FuenteUtil.cargarFuenteInter(26, "Inter_Bold"));
        lblNombreCentro.setForeground(Color.white);
        lblPagina = new JLabel("Página 1 de 1");
        lblPagina.setFont(FuenteUtil.cargarFuenteInter(16, "Inter_Light"));
        lblPagina.setForeground(Color.white);
         // Botones
        btnAnterior = new Button("Anterior", 120, 40, 16, 35);
        btnSiguiente = new Button("Siguiente", 120, 40, 16, 35);

        btnAñadirComputadora = new Button("Añadir nueva computadora", 310, 45, 20, 50);
        btnVolver = new Button("Volver", 162, 45, 20, 50);

        btnAñadirComputadora.addActionListener(e -> {
            añadirEquipoDialog = new AñadirEquipoDialog(owner, this, centroComputo, sistemaFacade);
        });

        btnVolver.addActionListener(e -> {
            owner.volerAtras(centrosComputoPanel);
        });

        // TABLA CON LOS EQUIPOS DE COMPUTO DEL CENTRO
        crearTablaComputadoras(centroComputo);
        panelContenido.add(Box.createRigidArea(new Dimension(1800, 200)));
        JScrollPane scrollPane = new JScrollPane(tablaComputadoras);
        scrollPane.setBorder(BorderFactory.createEmptyBorder());
        scrollPane.setPreferredSize(new Dimension(920, 400));
        scrollPane.getViewport().setBackground(tablaComputadoras.getBackground());

        // Añadir componentes al panel
        panelContenido.add(scrollPane);
        panelContenido.add(Box.createRigidArea(new Dimension(1800, 20)));
        panelContenido.add(btnAnterior);
        panelContenido.add(lblPagina);
        panelContenido.add(btnSiguiente);

        menuLateralPanel.add(Box.createRigidArea(new Dimension(350, 20)));
        menuLateralPanel.add(lblNombreCentro);
        menuLateralPanel.add(Box.createRigidArea(new Dimension(350, 50)));
        menuLateralPanel.add(btnAñadirComputadora);
        menuLateralPanel.add(Box.createRigidArea(new Dimension(350, 20)));
        menuLateralPanel.add(btnVolver);

        add(panelContenido, BorderLayout.CENTER);
        add(menuLateralPanel, BorderLayout.WEST);

    }

    public void crearTablaComputadoras(CentroComputoDominio centro){

        List<ComputadoraTablaDTO> computadoras = sistemaFacade.getCentroComputoFacade().consultarComputadorasCentro(centro);
        paginador = new TablaPaginada<>(
                tablaComputadoras,
                computadoras,
                computadora -> new Object[]{
                        computadora.getId(),
                        computadora.getDireccionIP(),
                        computadora.getNumeroEquipo(),
                        computadora.getEstado(),
                        computadora.getFuncion(),
                        "≡"
                },
                5,
                lblPagina
        );
        btnAnterior.addActionListener(e -> paginador.anterior());
        btnSiguiente.addActionListener(e -> paginador.siguiente());

    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g.create();
        g2d.setColor(Color.white);
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2d.setStroke(new BasicStroke(.2f));
        g2d.drawLine(368, 40, 368, 720);
        g2d.drawRoundRect(15, 100, 335, 165, 25, 25);
        g2d.dispose();

    }
}
