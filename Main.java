import java.awt.BorderLayout;

import javax.swing.*;

import vistas.Bannerpanel;
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
        Bannerpanel banner = new Bannerpanel();
        miventana.add(banner.getJPanel(), BorderLayout.WEST);

        Loginpanel panellogin = new Loginpanel();
        miventana.add(panellogin.getJPanel(), BorderLayout.CENTER); 

        
        
        miventana.setVisible(true);


}

    
}