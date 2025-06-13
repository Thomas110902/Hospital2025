package paneles;

import javax.swing.*;
import java.awt.*;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MenuLateralPanel {
    private JPanel panelMenu;

    public MenuLateralPanel() {
        // Panel principal con BorderLayout
        panelMenu = new JPanel(new BorderLayout());
        panelMenu.setBackground(Color.RED);
        panelMenu.setPreferredSize(new Dimension(400, 600));

        // Panel para los elementos superiores (centro)
        JPanel topPanel = new JPanel();
        topPanel.setLayout(new BoxLayout(topPanel, BoxLayout.Y_AXIS));
        topPanel.setBackground(Color.RED);
        topPanel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        // Información del doctor
        JLabel nombreDoctor = new JLabel("Dr. Juan Carlos");
        nombreDoctor.setFont(new Font("Arial", Font.BOLD, 24));
        nombreDoctor.setForeground(Color.WHITE);
        nombreDoctor.setAlignmentX(Component.CENTER_ALIGNMENT);
       
        JLabel especialidad = new JLabel("Cirujano");
        especialidad.setFont(new Font("Arial", Font.ITALIC, 18));
        especialidad.setForeground(Color.WHITE);
        especialidad.setAlignmentX(Component.CENTER_ALIGNMENT);

        // Fecha y temperatura
        String fecha = new SimpleDateFormat("dd/MM/yyyy").format(new Date());
        JLabel fechaLabel = new JLabel("Fecha: " + fecha);
        fechaLabel.setFont(new Font("Arial", Font.PLAIN, 14));
        fechaLabel.setForeground(Color.WHITE);
        fechaLabel.setAlignmentX(Component.CENTER_ALIGNMENT);

        JLabel temperaturaLabel = new JLabel("Temperatura: 22°C");
        temperaturaLabel.setFont(new Font("Arial", Font.PLAIN, 14));
        temperaturaLabel.setForeground(Color.WHITE);
        temperaturaLabel.setAlignmentX(Component.CENTER_ALIGNMENT);

        // Añadir elementos al topPanel
        topPanel.add(nombreDoctor);
        topPanel.add(Box.createRigidArea(new Dimension(0, 10)));
        topPanel.add(especialidad);
        topPanel.add(Box.createRigidArea(new Dimension(0, 30)));
        topPanel.add(fechaLabel);
        topPanel.add(Box.createRigidArea(new Dimension(0, 5)));
        topPanel.add(temperaturaLabel);
        topPanel.add(Box.createRigidArea(new Dimension(0, 30)));

        // Botones del menú (excepto Salir)
        String[] textosBotones = {
            "Pacientes",
            "Citas",
            "Historiales",
            "Configuración",
            "Camilla",
            "Tipo de Consulta"
        };

        for (String texto : textosBotones) {
            JButton boton = new JButton(texto);
            boton.setAlignmentX(Component.CENTER_ALIGNMENT);
            boton.setMaximumSize(new Dimension(Integer.MAX_VALUE, boton.getPreferredSize().height));
            boton.setBackground(Color.WHITE);
            boton.setForeground(Color.RED);
            boton.setFocusPainted(false);
            topPanel.add(Box.createRigidArea(new Dimension(0, 10)));
            topPanel.add(boton);
        }

        // Panel para el botón Salir (sur/abajo)
        JPanel bottomPanel = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        bottomPanel.setBackground(Color.RED);
        bottomPanel.setBorder(BorderFactory.createEmptyBorder(0, 20, 20, 20));

        // Botón Salir
        JButton salirButton = new JButton("Salir");
        salirButton.setBackground(new Color(255, 80, 80));
        salirButton.setForeground(Color.WHITE);
        salirButton.setFont(new Font("Arial", Font.BOLD, 14));
        salirButton.addActionListener(e -> System.exit(0));
        bottomPanel.add(salirButton);

        // Añadir los paneles al principal
        panelMenu.add(topPanel, BorderLayout.CENTER);
        panelMenu.add(bottomPanel, BorderLayout.SOUTH);
    }

    public JPanel getJPanel() {
        return panelMenu;
    }
}