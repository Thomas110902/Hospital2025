package paneles;

import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JPanel;

public class Bannerpanel {
    
    private JPanel paneldelBanner;

    public Bannerpanel() {
        paneldelBanner = new JPanel();
        paneldelBanner.setPreferredSize(new Dimension(500, 800));
        paneldelBanner.setOpaque(true);
        paneldelBanner.setBackground(Color.GRAY); // o Color.WHITE si prefieres
    }

    public JPanel getJPanel() {
        return paneldelBanner;
    }
}
