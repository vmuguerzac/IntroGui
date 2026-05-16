import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;

public class Ejemplo_JTable extends JFrame {
    public Ejemplo_JTable(){
        try {
            // Sets the Look and Feel to the native style of the current OS
            UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
        } catch (Exception e) {
            e.printStackTrace();
        }
        setTitle("Lista de Estudiantes");
        setSize(550, 350);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // 1. Definir columnas
        String[] cols = {"Codigo", "Nombre", "Ciclo", "Nota"};
        //2. Datos de ejemplo
        Object[][] datos = {
            {"2024001", "Ana García", "5to", 16.5},
            {"2024002", "Carlos Lopez", "5to", 14.0},
            {"2024003", "maria Torres", "5to", 18.0},
            {"2024004", "Luis Mendoza", "5to", 12.5},
        };
        //3. Modelo no editable
        DefaultTableModel modelo = new DefaultTableModel(datos, cols){
            @Override
            public boolean isCellEditable(int row, int col){
                return false; // Solo de lectura
            }
        };
        // 4. Jtable con el modelo
        JTable tabla = new JTable(modelo);
        tabla.setFont(new Font("Arial", Font.PLAIN, 14));
        tabla.setRowHeight(28);
        //Estilo del encabezado
        tabla.getTableHeader().setFont(new Font("Arial", Font.BOLD, 14));
        tabla.getTableHeader().setBackground(new Color(6, 90, 130));
        tabla.getTableHeader().setForeground(Color.WHITE);
        // 5. JScrollPane -> Obligatorio
        add(new JScrollPane(tabla), BorderLayout.CENTER);
        setVisible(true);

    }
    
}
