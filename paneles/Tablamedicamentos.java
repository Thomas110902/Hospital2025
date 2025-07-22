package paneles;
import data.Medicina;
import java.awt.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class Tablamedicamentos extends JPanel {
    
    public Tablamedicamentos() {

        setLayout(new BorderLayout());

        String[] columnas = { "Codigo", "Nombre del medicamento", "Categoria","Presentacion","Cantidad","Fecha de Ven." };
        
      Object[][] datos = new Medicina().getMedicina();
        
      DefaultTableModel modelo = new DefaultTableModel(datos, columnas);
        JTable tabla = new JTable(modelo);
        
        JScrollPane scrollPane = new JScrollPane(tabla);
        
        add(scrollPane, BorderLayout.CENTER);
        
    }
}