import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Ejemplo_GridLayout extends JFrame{

    private JTextField txtNombre = new JTextField();
    private JTextField txtCodigo = new JTextField();
    private JTextField txtPrecio = new JTextField();
    private JTextField txtStock = new JTextField();

    public Ejemplo_GridLayout(){ // Siempre en el contructor
        setTitle("Grid Layout - Formulario");
        setSize(420, 260);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        // Nombre: _____________
        // Codigo: _____________
        //GridLayout 4 filas,  2 columnas, spacio horizontal y vertical de 8 px
        JPanel formulario = new JPanel(new GridLayout(4, 2, 2, 4));
        formulario.setBorder(BorderFactory.createEmptyBorder(12, 12, 12, 12));
        // Agregar los jtextfield al panel
        formulario.add(new JLabel("Nombre: "));
        formulario.add(txtNombre);
        formulario.add(new JLabel("Codigo: "));
        formulario.add(txtCodigo);
        formulario.add(new JLabel("Precio S/: "));
        formulario.add(txtPrecio);
        formulario.add(new JLabel("Stock: "));
        formulario.add(txtStock);
        // Agregar el formulario al JFrame
        add(formulario); // el Jframe tiene por defecto BorderLayout en CENTRO
        // Sur
        JPanel panelBotones = new JPanel(new FlowLayout(FlowLayout.RIGHT, 8, 8));
        panelBotones.add(new JButton("Cancelar"));
        panelBotones.add(new JButton("Guardar"));
        add(panelBotones, BorderLayout.SOUTH);
        
        setVisible(true);
    }
}
