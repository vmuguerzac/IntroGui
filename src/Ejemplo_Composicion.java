import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class Ejemplo_Composicion extends JFrame{
    private JTextField txtNombre = new JTextField();
    private JTextField txtCodigo = new JTextField();
    private JComboBox<String> cbCategoria = new JComboBox<>(
        new String[]{"Electronica", "Computacion", "Accesorios"});
    private JLabel lblEstado = new JLabel("Listo");

    public Ejemplo_Composicion(){
        // Configurar la ventana principal
        setTitle("Gestion de Productos");
        setSize(480, 310);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout(0, 0));
        // Norte - Titulo
        JLabel lblTitulo = new JLabel("   Nuevo Producto",  SwingConstants.LEFT);
        lblTitulo.setFont(new Font("Calibri", Font.BOLD, 15));
        lblTitulo.setOpaque(true);
        lblTitulo.setBackground(new Color(6, 90, 130));
        lblTitulo.setForeground(Color.WHITE);
        lblTitulo.setPreferredSize(new Dimension(0, 42));
        add(lblTitulo, BorderLayout.NORTH);
        // Centro
        // Formulario con Grid
        // 3 filas x 2 columnas x 4 separacion
        JPanel formulario = new JPanel(new GridLayout(3,2, 4, 4));
        formulario.setBorder(BorderFactory.createEmptyBorder(16, 18, 16, 18));
        formulario.add(new JLabel("Nombre"));
        formulario.add(txtNombre);
        formulario.add(new JLabel("Codigo"));
        formulario.add(txtCodigo);
        formulario.add(new JLabel("Categoria"));
        formulario.add(cbCategoria);
        add(formulario, BorderLayout.CENTER);
        // Sur
        JButton btnLimpiar = new JButton("Limpiar ");
        JButton btnGuardar = new JButton("Guardar");
        btnGuardar.setBackground(new Color(6, 90, 150));
        btnGuardar.setForeground(Color.BLACK);
        btnGuardar.setFocusPainted(false);
        // JPanel
        JPanel panelIzq = new JPanel(new FlowLayout(FlowLayout.LEFT, 14, 8));
        panelIzq.add(lblEstado);
        JPanel panelDer = new JPanel(new FlowLayout(FlowLayout.RIGHT, 10, 8));
        panelDer.add(btnLimpiar);
        panelDer.add(btnGuardar);
        // Combinar para agregar a la barra sur
        JPanel panelSur = new JPanel(new BorderLayout());
        panelSur.setBorder(BorderFactory.createMatteBorder(1, 0, 0, 0, Color.LIGHT_GRAY));
        panelSur.add(panelIzq, BorderLayout.WEST);
        panelSur.add(panelDer, BorderLayout.EAST);
        add(panelSur, BorderLayout.SOUTH);

        setVisible(true);
    }


}
