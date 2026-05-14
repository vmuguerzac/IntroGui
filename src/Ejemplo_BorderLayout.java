import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;

public class Ejemplo_BorderLayout extends JFrame{
    public Ejemplo_BorderLayout(){
        setTitle("Border Layout - Zonas");
        setSize(500, 380);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        // Definir el layout
        setLayout(new BorderLayout(5, 5));
        // Definir Controles
        //Norte
        JLabel lblTitulo = new JLabel("Sistema de Gestion", SwingConstants.CENTER);
        lblTitulo.setFont(new Font("Calibri", Font.BOLD, 16));
        lblTitulo.setOpaque(true);
        lblTitulo.setBackground(new Color(6, 90, 130));
        lblTitulo.setForeground(Color.WHITE);
        lblTitulo.setPreferredSize(new Dimension(0,45));
        add(lblTitulo, BorderLayout.NORTH);
        //Centro
        JTextArea txtContenido = new JTextArea("Aquí irá el formulario...");
        txtContenido.setEditable(false);
        txtContenido.setFont(new Font("Courier New", Font.PLAIN, 13));
        add(txtContenido, BorderLayout.CENTER);
        // Sur
        JPanel panelBotones = new JPanel(new FlowLayout(FlowLayout.RIGHT, 8, 8));
        panelBotones.add(new JButton("Cancelar"));
        panelBotones.add(new JButton("Guardar"));
        add(panelBotones, BorderLayout.SOUTH);

        setVisible(true);
    }

}
