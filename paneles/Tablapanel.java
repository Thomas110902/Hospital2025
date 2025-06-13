package paneles;
import data.Pacientes;
import java.awt.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class Tablapanel extends JPanel {
    
    public Tablapanel() {

        setLayout(new BorderLayout());

        String[] columnas = { "ID", "Nombre", "Edad","Tipo de Consulta","Paciente","Hora" };
        
      Object[][] datos = new Pacientes().getDatos();
        
      DefaultTableModel modelo = new DefaultTableModel(datos, columnas);
        JTable tabla = new JTable(modelo);
        
        JScrollPane scrollPane = new JScrollPane(tabla);
        
        add(scrollPane, BorderLayout.CENTER);
        
    }
}