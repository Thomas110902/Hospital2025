package ventana;

import java.awt.*;
import javax.swing.*;


import paneles.MenuLateralPanel;
import paneles.Tablapanel;

public class DashBoard extends JFrame {
    public DashBoard() {
        // Configuración básica
        setTitle("Dashboard");
        setSize(1000, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Añade el Header (desde el paquete header)


        // Resto de componentes
        add(new MenuLateralPanel().getJPanel(), BorderLayout.WEST);
        add(new Tablapanel(), BorderLayout.CENTER);

        setVisible(true);
    }
}