import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Main {
    public static void main(String[] args){

        //Crear una ventana con JFrame
        JFrame miventana = new JFrame();
        miventana.setTitle("Hospital SCL");
        miventana.setSize(1000,800);
        miventana.setBackground(Color.BLUE);
        
        //Crear un texto JLabel
        JLabel texto = new JLabel();
        texto.setText("Hola mundo");
        miventana.add(texto);
        
        
        
        
        miventana.setVisible(true);


}

    
}