package ventana;
import javax.swing.JFrame;
import java.awt.BorderLayout;

public class Dashboard extends JFrame {
    

        public Dashboard(){
            
            JFrame nuevaventana = new JFrame();
            nuevaventana.setTitle("Dashboard");
            nuevaventana.setSize(1000,800);
            nuevaventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            nuevaventana.setLayout(new BorderLayout());

            
            
            nuevaventana.setVisible(true);
            
        }
    

    public JFrame getDashFrame(){
        return this;
    }
}
