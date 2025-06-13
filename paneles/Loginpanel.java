package paneles;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.event.ActionEvent; 
import java.awt.event.ActionListener;

import javax.swing.*;

import ventana.DashBoard;
import control.LoginControler;



public class Loginpanel{

     private JPanel panelLogin;

    public Loginpanel(){
        panelLogin = new JPanel();
        panelLogin.setOpaque(true);
        panelLogin.setSize(10, 10);
        panelLogin.setBackground(Color.WHITE);
        panelLogin.setBorder(BorderFactory.createEmptyBorder(200, 200, 200, 200));

        panelLogin.setLayout(new BoxLayout(panelLogin, BoxLayout.Y_AXIS));


        JLabel titulo = new JLabel("Login");
        panelLogin.add(titulo);
        titulo.setAlignmentX(Component.CENTER_ALIGNMENT);
        panelLogin.add(Box.createRigidArea(new Dimension(0, 20)));

        JTextField titulo2 = new JTextField("");
        titulo2.setPreferredSize(new Dimension(5,5));
        titulo2.setAlignmentX(Component.CENTER_ALIGNMENT);
        titulo2.setMaximumSize(new Dimension(800,30));
        panelLogin.add(titulo2);
        panelLogin.add(Box.createRigidArea(new Dimension(0, 10)));

        JTextField titulo3 = new JTextField("");
        titulo3.setPreferredSize(new Dimension(250,50));
        titulo3.setMaximumSize(new Dimension(800,30));
        titulo3.setAlignmentX(Component.CENTER_ALIGNMENT);
        panelLogin.add(titulo3);
        panelLogin.add(Box.createRigidArea(new Dimension(0, 10)));

        JButton titulo4 = new JButton("Iniciar");
        titulo4.setPreferredSize(new Dimension(250, 50));
        titulo4.setMaximumSize(new Dimension(250, 50));


        

        titulo4.addActionListener(new ActionListener() {
            @Override //Reiniciar y establecer mi propia configuracion 
            public void actionPerformed(ActionEvent e){

                //Recuperar Datos
                String entradausuario = titulo2.getText();
                String entradaContra = titulo3.getText();

                if(new LoginControler().validacionDatos(entradausuario , entradaContra)){ 

                    JFrame framePadre = (JFrame) SwingUtilities.getWindowAncestor(panelLogin);
                    framePadre.dispose();
                    
                    new DashBoard();
                }
            }
        });


        JPanel botonPanel = new JPanel(new java.awt.FlowLayout(java.awt.FlowLayout.RIGHT));
        botonPanel.setOpaque(false); 
        botonPanel.setMaximumSize(new Dimension(800, 60)); 
        botonPanel.add(titulo4);
        panelLogin.add(botonPanel);

        
    
    }

    public JPanel getJPanel(){
        return panelLogin;
    }

    
}
