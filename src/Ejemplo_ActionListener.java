import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ejemplo_ActionListener extends JFrame {
    private JButton btnAccion = new JButton("Incrementar");
    private JLabel lblSalida = new JLabel("Clicks: 0");
    private int contador = 0;

    public Ejemplo_ActionListener(){
        // Configurar la ventana principal
        setTitle("Ejemplo Action Listener");
        setSize(320, 180);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new FlowLayout());

        // Metodo clase anonima (Compative con todas las versiones de Java)
        // btnAccion.addActionListener(new ActionListener() {
        //     @Override
        //     public void actionPerformed(ActionEvent e){
        //         contador++;
        //         lblSalida.setText("Clicks: " + contador);
        //     }
        // });
        // Metodo Lambda en una sola linea (compatible con Java 8+)
        btnAccion.addActionListener(e -> {
            contador++;
            lblSalida.setText("Clicks: " + contador);
        });

        add(lblSalida);
        add(btnAccion);

        setVisible(true);   
    }    
}
