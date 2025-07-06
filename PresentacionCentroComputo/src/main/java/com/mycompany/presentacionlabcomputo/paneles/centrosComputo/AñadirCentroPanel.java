package com.mycompany.presentacionlabcomputo.paneles.centrosComputo;

import com.mycompany.negociolabcomputo.negociosfacades.ISistemaFacade;
import com.mycompany.presentacionlabcomputo.frames.MainFrameBase;
import com.mycompany.presentacionlabcomputo.styles.*;
import com.mycompany.presentacionlabcomputo.styles.Button;
import dtos.centrocomputo.CentroComputoAgregarDTO;
import entidades.UnidadDominio;
import org.eclipse.sisu.launch.Main;

import javax.swing.*;
import java.awt.*;
import java.time.LocalTime;
import java.time.ZoneId;
import java.util.Date;

public class AñadirCentroPanel extends JPanel {
    private CustomComboBox<UnidadDominio> comboUnidades;
    private TxtFieldPh txtNombreCentro;
    SpinnerDateModel modeloHoraInicio;
    SpinnerDateModel modeloHoraFin;
    private JPanel panelCentro;
    private JPanel panelSur;
    private Button btnAgregar;

    public AñadirCentroPanel(CentrosComputoPanel panelOwner, ISistemaFacade sistemaFacade) {
        setLayout(new BorderLayout());
        setOpaque(false);

        panelCentro = new JPanel();
        panelCentro.setOpaque(false);
        panelSur = new JPanel();
        panelSur.setPreferredSize(new Dimension(400, 100));
        panelSur.setOpaque(false);
        btnAgregar = new Button("Agregar", 205, 50, 20, 50);
        comboUnidades = new CustomComboBox<>("unidades", sistemaFacade);
        comboUnidades.setPreferredSize(new Dimension(200, 35));
        txtNombreCentro = new TxtFieldPh("Nombre del centro", false, 200, 50, 15);
        txtNombreCentro.setForeground(Color.white);
        txtNombreCentro.setBackground(Style.COLOR);
        modeloHoraInicio = new SpinnerDateModel();
        modeloHoraFin = new SpinnerDateModel();

        //Spiner de hora inicial
        JSpinner spinnerHoraInicio = new JSpinner(modeloHoraInicio);
        JSpinner.DateEditor editorDeHoraInicio = new JSpinner.DateEditor(spinnerHoraInicio, "HH:mm");
        spinnerHoraInicio.setEditor(editorDeHoraInicio);

        //Spiner hora de cierre
        JSpinner spinnerHoraCierre = new JSpinner(modeloHoraFin);
        JSpinner.DateEditor editorDeHoraFin = new JSpinner.DateEditor(spinnerHoraCierre, "HH:mm");
        spinnerHoraCierre.setEditor(editorDeHoraFin);

        //Formato para el texto en el spinner de hora
        JFormattedTextField txtEditor = ((JSpinner.DefaultEditor) spinnerHoraInicio.getEditor()).getTextField();
        JFormattedTextField txtEditor2 = ((JSpinner.DefaultEditor) spinnerHoraCierre.getEditor()).getTextField();
        txtEditor.setColumns(5);
        txtEditor.setFont(FuenteUtil.cargarFuenteInter(20, "Inter_Light"));
        txtEditor2.setColumns(5);
        txtEditor2.setFont(FuenteUtil.cargarFuenteInter(20, "Inter_Light"));

        //Boton de agregar
        btnAgregar.addActionListener(e -> {
            String nombre = txtNombreCentro.getText();
            UnidadDominio unidadSeleccionada = comboUnidades.getSeleccionado();

            Date dateInicio = (Date) spinnerHoraInicio.getValue();
            LocalTime horaApertura = dateInicio.toInstant()
                    .atZone(ZoneId.systemDefault())
                    .toLocalTime();

            Date dateFin = (Date) spinnerHoraCierre.getValue();
            LocalTime horaCierre = dateFin.toInstant()
                    .atZone(ZoneId.systemDefault())
                    .toLocalTime();

            CentroComputoAgregarDTO nuevoCentro = new CentroComputoAgregarDTO(
                    nombre,
                    horaApertura,
                    horaCierre,
                    "admin",
                    "admin1234",
                    unidadSeleccionada);

            sistemaFacade.getCentroComputoFacade().guardarCentro(nuevoCentro);
            JOptionPane.showMessageDialog(null, "Centro de cómputo agregado correctamente.", "Centro Agregado", JOptionPane.INFORMATION_MESSAGE);
            if (unidadSeleccionada != null && unidadSeleccionada.getId() == 0L) {
                panelOwner.crearTablaCentros();
            } else if (unidadSeleccionada != null) {
                panelOwner.crearTablaPorUnidad(unidadSeleccionada);
            }

        });

        panelCentro.add(Box.createRigidArea(new Dimension(400, 100)));
        panelCentro.add(comboUnidades);
        panelCentro.add(Box.createRigidArea(new Dimension(400, 35)));
        panelCentro.add(txtNombreCentro);
        panelCentro.add(Box.createRigidArea(new Dimension(400, 40)));
        panelCentro.add(spinnerHoraInicio);
        panelCentro.add(spinnerHoraCierre);
        panelSur.add(btnAgregar);
        add(panelCentro, BorderLayout.CENTER);
        add(panelSur, BorderLayout.SOUTH);

    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g.create();
        g2d.setColor(Color.white);
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2d.setStroke(new BasicStroke(.2f));
        g2d.setFont(FuenteUtil.cargarFuenteInter(26, "Inter_SemiBold"));
        g2d.drawString("Nuevo Centro", 140, 45);
        g2d.setFont(FuenteUtil.cargarFuenteInter(15, "Inter_Light"));
        g2d.drawString("Horario de funcionamiento", 150, 275);
        g2d.drawRoundRect((getWidth() / 2) - 155, 70, 310, 290, 25, 25);
        g2d.dispose();

    }
}
