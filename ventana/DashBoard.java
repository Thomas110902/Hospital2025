package ventana;

import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import ventana.MenuLateralPanel;
import tabla.Tablapanel;

public class DashBoard extends JFrame {
    
    public DashBoard() {
        setTitle("Dashboard");
        setSize(1000, 700); 
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        
        MenuLateralPanel menuPanel = new MenuLateralPanel();
        Tablapanel tablaPanel = new Tablapanel();

        
        add(tablaPanel, BorderLayout.CENTER);   
        add(menuPanel.getJPanel(), BorderLayout.WEST); 

        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new DashBoard();
        });
    }
}