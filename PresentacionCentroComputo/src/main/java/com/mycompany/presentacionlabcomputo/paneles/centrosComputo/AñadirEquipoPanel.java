package com.mycompany.presentacionlabcomputo.paneles.centrosComputo;

import com.mycompany.negociolabcomputo.negociosfacades.ISistemaFacade;
import com.mycompany.presentacionlabcomputo.styles.*;
import com.mycompany.presentacionlabcomputo.styles.Button;
import dtos.computadora.ComputadoraAgregarDTO;
import entidades.CentroComputoDominio;
import enums.FuncionEquipo;

import javax.swing.*;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class AñadirEquipoPanel extends JPanel {
    private JPanel panelCentro;
    private JPanel panelSur;
    private TxtFieldPh txtSistemaOperativo;
    private TxtFieldPh txtNumeroEquipo;
    private CustomComboBox<String> comboFucionalidad;
    private Button btnAgregarSoftware;
    private Button btnAsignarIp;
    private Button btnAgregar;
    private List<String> softwareInstalado;
    private String ip;

    public AñadirEquipoPanel(CentroPanel panelOwner, CentroComputoDominio centro, ISistemaFacade sistemaFacade) {
        setLayout(new BorderLayout());
        setOpaque(false);

        // Componentes
        panelCentro = new JPanel();
        panelCentro.setOpaque(false);
        panelSur = new JPanel();
        panelSur.setOpaque(false);
        btnAgregarSoftware = new Button("Agregar Software de trabajo", 340, 30, 20, 30);
        btnAsignarIp = new Button("Asignar ip", 170, 40, 20, 30);
        btnAgregar = new Button("Agregar", 150, 40, 20, 35);
        txtSistemaOperativo = new TxtFieldPh("Sistema operativo", false, 275, 50, 15);
        txtSistemaOperativo.setForeground(Color.white);
        txtSistemaOperativo.setBackground(Style.COLOR);
        txtNumeroEquipo = new TxtFieldPh("", false, 100, 50, 15);
        txtNumeroEquipo.setForeground(Color.white);
        txtNumeroEquipo.setBackground(Style.COLOR);

        // Boton de agregar software
        btnAgregarSoftware.addActionListener(e -> {
            softwareInstalado = new ArrayList<>();
            String input = JOptionPane.showInputDialog(
                    null,
                    "Nombre del programa",
                    "Agregar software",
                    JOptionPane.QUESTION_MESSAGE
            );
            if (input != null && !input.trim().isEmpty()) {
                softwareInstalado.add(input.trim());
                JOptionPane.showMessageDialog(
                        null,
                        "Programa añadido",
                        "Guardado Exitoso",
                        JOptionPane.INFORMATION_MESSAGE
                );
            } else if (input != null) {
                JOptionPane.showMessageDialog(
                        null,
                        "No se ingresó prgrograma",
                        "Advertencia",
                        JOptionPane.WARNING_MESSAGE
                );
            }
        });

        // Boton de asignar IP
        btnAsignarIp.addActionListener(e -> {
            String ipInput = JOptionPane.showInputDialog(
                    null,
                    "Ip del equipo de computo",
                    "Agsignar Ip",
                    JOptionPane.QUESTION_MESSAGE
            );

            //verificar que la ip no sea nula o vacia o que se repita
            if (ipInput != null && !ipInput.trim().isEmpty()) {
                this.ip = ipInput;
                JOptionPane.showMessageDialog(
                        null,
                        "ip añadida",
                        "Guardado Exitoso",
                        JOptionPane.INFORMATION_MESSAGE
                );
            }else if (ipInput != null) {
                JOptionPane.showMessageDialog(
                        null,
                        "No se ingreso ip",
                        "Advertencia",
                        JOptionPane.WARNING_MESSAGE
                );
            }
        });

        // Boton de agregar
        btnAgregar.addActionListener(e -> {
            if (txtSistemaOperativo.getText().isEmpty()){
                JOptionPane.showMessageDialog(
                        null,
                        "Necestia registrar un sistema operativo",
                        "Campo obligatorio",
                        JOptionPane.WARNING_MESSAGE
                );
                return;
            }
            // Verificar que el numero no se repido, que no sea de otro tipo y no sea mayor a 2 digitos
            if (txtNumeroEquipo.getText().isEmpty()){
                JOptionPane.showMessageDialog(
                        null,
                        "Numero del equipo no puede quedar vacio",
                        "Campo obligatorio",
                        JOptionPane.WARNING_MESSAGE
                );
                return;
            }else if (txtNumeroEquipo.getText().trim().length() > 2){
                JOptionPane.showMessageDialog(
                        null,
                        "Numero de equipo invalido, debe ser de 2 digitos o menos",
                        "Campo obligatorio",
                        JOptionPane.WARNING_MESSAGE
                );
                return;

            }
            if (Integer.parseInt(txtNumeroEquipo.getText()) < 0){
                JOptionPane.showMessageDialog(
                        null,
                        "Numero de equipo invalido, no puede ingresar un numero negativo o cero",
                        "Campo obligatorio",
                        JOptionPane.WARNING_MESSAGE
                );
                return;
            }
            try {
                Integer.parseInt(txtNumeroEquipo.getText().trim());
            }catch (NumberFormatException ex){
                JOptionPane.showMessageDialog(
                        null,
                        "Digito invalido",
                        "Campo obligatorio",
                        JOptionPane.WARNING_MESSAGE
                );
                return;
            }
            String sistemaOperativo = txtSistemaOperativo.getText();
            FuncionEquipo funcion = (FuncionEquipo) comboFucionalidad.getSelectedItem();
            int numeroEquipo = Integer.parseInt(txtNumeroEquipo.getText());
            List<String> listaSoftware = softwareInstalado;
            String ipDelEquipo = this.ip;
            CentroComputoDominio centroComputoDominio = centro;

            ComputadoraAgregarDTO nuevaComputadora = new ComputadoraAgregarDTO(
                    sistemaOperativo,
                    funcion,
                    numeroEquipo,
                    ipDelEquipo,
                    listaSoftware,
                    centroComputoDominio
            );
            sistemaFacade.getComputadoraFacade().registrarComputadora(nuevaComputadora);
            JOptionPane.showMessageDialog(
                    null,
                    "Equipo agregado correctamente.",
                    "Éxito",
                    JOptionPane.INFORMATION_MESSAGE
            );
            panelOwner.crearTablaComputadoras(centro);

        });




        // ComboBox de funcionalidad
        comboFucionalidad = new CustomComboBox<>("funcionalidades", sistemaFacade);
        comboFucionalidad.setBounds(20, 70, 200, 35);

        panelCentro.add(Box.createRigidArea(new Dimension(400, 80)));
        panelCentro.add(txtSistemaOperativo);
        panelCentro.add(Box.createRigidArea(new Dimension(400, 50)));
        panelCentro.add(comboFucionalidad);
        panelCentro.add(Box.createRigidArea(new Dimension(400, 35)));
        panelCentro.add(txtNumeroEquipo);
        panelCentro.add(Box.createRigidArea(new Dimension(400, 15)));
        panelCentro.add(btnAgregarSoftware);
        panelCentro.add(Box.createRigidArea(new Dimension(400, 10)));
        panelCentro.add(btnAsignarIp);
        panelCentro.add(Box.createRigidArea(new Dimension(400, 55)));
        panelCentro.add(btnAgregar);

        add(panelCentro);
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
        g2d.drawString("Nuevo Equipo", (getWidth() / 2) - 85, 45);
        g2d.setFont(FuenteUtil.cargarFuenteInter(15, "Inter_Light"));
        g2d.drawString("Tipo de equipo", (getWidth() / 2) - 50, 185);
        g2d.drawString("Número de equipo", (getWidth() / 2) - 65, 270);
        g2d.drawRoundRect((getWidth() - 370) / 2, 70, 370, 400, 25, 25);
        g2d.dispose();

    }

}
