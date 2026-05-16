import javax.swing.BorderFactory;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;

public class Ejemplo_JTable extends JFrame {
    public Ejemplo_JTable(){
        setTitle("Lista de Estudiantes");
        setSize(550, 350);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Norte - Titulo
        JLabel titulo = new JLabel("Registro de Estudiantes",
            SwingConstants.CENTER);
        titulo.setFont(new Font("Arial", Font.BOLD, 20));
        titulo.setForeground(new Color(6, 90, 130));
        titulo.setBorder(BorderFactory.createEmptyBorder(15, 0, 15, 0));
        add(titulo, BorderLayout.NORTH);
        // Center 4 x 2 
        JPanel campos = new JPanel(new GridLayout(4, 2, 5, 6));
        campos.setBorder(BorderFactory.createEmptyBorder(10, 30, 10, 30));
        campos.add(new JLabel("Nombres: "));
        campos.add(new JTextField());
        campos.add(new JLabel("Codigo: "));
        campos.add(new JTextField());
        String[] ciclos = {"1ro", "2do", "3ro", "4to", "5to", "6to"};
        campos.add(new JLabel("Ciclo: "));
        campos.add(new JComboBox<>(ciclos));
        campos.add(new JLabel("Activo: "));
        campos.add(new JCheckBox("Estudiante Activo"));
        add(campos, BorderLayout.CENTER);

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
        add(tabla, BorderLayout.SOUTH);

        
        setVisible(true);

    }
    
}
