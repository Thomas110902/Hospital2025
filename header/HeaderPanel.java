package header;  // Debe coincidir con la carpeta

import javax.swing.*;
import java.awt.*;
import javax.swing.ImageIcon;

public class HeaderPanel extends JPanel {
    public HeaderPanel() {
        setBackground(new Color(50, 120, 200));
        setPreferredSize(new Dimension(1000, 60));
        setLayout(new BorderLayout());

        // Título (izquierda)
        JLabel titulo = new JLabel("Hospital 2025");
        titulo.setFont(new Font("Arial", Font.BOLD, 20));
        titulo.setForeground(Color.WHITE);
        add(titulo, BorderLayout.WEST);

        // Botón de usuario (derecha)
        JPanel panelUsuario = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        panelUsuario.setOpaque(false);

        JButton btnUsuario = new JButton("Dataguite");
        btnUsuario.setFont(new Font("Arial", Font.PLAIN, 14));
       
        // Carga el icono desde recursos (opcional)
        try {
            ImageIcon icono = new ImageIcon(getClass().getResource("/user_icon.png"));
            btnUsuario.setIcon(icono);
        } catch (Exception e) {
            System.out.println("Icono no encontrado. Se mostrará solo texto.");
        }

        btnUsuario.addActionListener(e -> {
            JOptionPane.showMessageDialog(this, "Menú de usuario");
        });

        panelUsuario.add(btnUsuario);
        add(panelUsuario, BorderLayout.EAST);
    }
}