package ventana;

import javax.swing.*;
import java.awt.*;

public class MenuLateralPanel {
    private JPanel panelMenu;

    public MenuLateralPanel() {
        panelMenu = new JPanel();
        panelMenu.setBackground(Color.LIGHT_GRAY);
        panelMenu.setPreferredSize(new Dimension(250, 600)); // Ancho fijo

        // Ejemplo: Añade un botón
        JButton boton = new JButton("Menú");
        panelMenu.add(boton);
    }

    public JPanel getJPanel() {
        return panelMenu;
    }
}