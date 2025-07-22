package ventana;

import java.awt.*;
import javax.swing.*;
import paneles.MenuLateralPanel;
import paneles.Tablamedicamentos;

public class Ventanamedicamentos extends JFrame {
    public Ventanamedicamentos() {
        // Configuración básica
        setTitle("Medicamentos");
        setSize(1000, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Añade el Header (desde el paquete header)


        // Resto de componentes
        add(new MenuLateralPanel().getJPanel(), BorderLayout.WEST);
        add(new Tablamedicamentos(), BorderLayout.CENTER);

        setVisible(true);
    }
}
