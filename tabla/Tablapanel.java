package tabla;

import javax.swing.*;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Tablapanel extends JScrollPane {

public JScrollPane getTable() {


    String[] columnas = { "ID", "Nombre", "Edad" };

// Datos de la tabla
    Object[][] datos = {
    { 1, "Ana", 20 },
    { 2, "Luis", 22 },
    { 3, "María", 19 }
    };

    DefaultTableModel base = new DefaultTableModel(datos, columnas);

    JTable tabla = new JTable(base);

    JScrollPane scrollPane = new JScrollPane(tabla);

    return scrollPane;
    
    }

    public static void main(String[] args) {
    SwingUtilities.invokeLater(() -> {
    new Tablapanel().setVisible(true);
    });
    }
}