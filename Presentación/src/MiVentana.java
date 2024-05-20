import javax.swing.JFrame;

public class MiVentana {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Mi Primera Ventana");
        frame.setSize(400, 300); // Establece el tamaño de la ventana (ancho x alto)
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Acción al cerrar
        frame.setVisible(true); // Hace visible la ventana
    }
}
