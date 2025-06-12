package ventana;

import java.awt.*;
import javax.swing.*;
import tabla.Tablapanel;
import header.HeaderPanel;  // Importa desde el paquete header

public class DashBoard extends JFrame {
    public DashBoard() {
        // Configuración básica
        setTitle("Dashboard");
        setSize(1000, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Añade el Header (desde el paquete header)
        add(new HeaderPanel(), BorderLayout.NORTH);  // ✅ Correcto

        // Resto de componentes
        add(new MenuLateralPanel().getJPanel(), BorderLayout.WEST);
        add(new Tablapanel(), BorderLayout.CENTER);

        setVisible(true);
    }
}