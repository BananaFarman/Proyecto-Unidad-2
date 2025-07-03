package com.mycompany.presentacionlabcomputo.frames;

import com.mycompany.presentacionlabcomputo.styles.Button;
import com.mycompany.presentacionlabcomputo.styles.Style;
import com.mycompany.presentacionlabcomputo.styles.TxtFieldPh;

import javax.swing.*;

public class DesbloquearComputadoraFrame extends JFrame {
    private TxtFieldPh txtContraseña = new TxtFieldPh("Usuario", true, 200, 50, 15);
    private Button btnDesbloquear;

    public DesbloquearComputadoraFrame() {
    }
}
