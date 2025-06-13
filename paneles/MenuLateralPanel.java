package paneles;

import javax.swing.*;
import java.awt.*;

public class MenuLateralPanel {
    private JPanel panelMenu;

    public MenuLateralPanel() {
        panelMenu = new JPanel();
        panelMenu.setBackground(Color.RED);
        panelMenu.setPreferredSize(new Dimension(400, 600)); 

        JButton boton = new JButton("Menú");
        panelMenu.add(boton);
    }

    public JPanel getJPanel() {
        return panelMenu;
    }
}