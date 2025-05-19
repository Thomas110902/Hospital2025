import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.*;

import vistas.Loginpanel;

public class Main {
    public static void main(String[] args){

        //Crear una ventana con JFrame
        JFrame miventana = new JFrame();
        miventana.setTitle("Hospital SCL");
        miventana.setSize(1000,800);
        miventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        miventana.setLayout(new BorderLayout());
    
        // Panel Banner
        JPanel paneldelBanner = new JPanel();
        paneldelBanner.setPreferredSize(new Dimension(500,800));;
        paneldelBanner.setOpaque(true);
        paneldelBanner.setBackground(Color.GRAY);
        miventana.add(paneldelBanner,BorderLayout.WEST);

        Loginpanel panellogin = new Loginpanel();
        miventana.add(panellogin.getJPanel(), BorderLayout.CENTER); 
        
        miventana.setVisible(true);


}

    
}