import javax.swing.JFrame;

public class EjemploLayout  extends JFrame {

    public EjemploLayout(){
        setTitle("Mi Ventana");
        setSize(500, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        // Agregar los componentes y defini el layout
        setVisible(true); // Siempre colocar al final
    }

}
