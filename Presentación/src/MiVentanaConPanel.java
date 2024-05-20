import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;

public class MiVentanaConPanel {
    public static void main(String[] args) {
        // Crear el marco
        JFrame frame = new JFrame("Ventana con Panel");
        frame.setSize(400, 300); // Establece el tamaño de la ventana (ancho x alto)
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Acción al cerrar

        // Crear un panel y establecer el color de fondo
        JPanel panel = new JPanel();
        panel.setBackground(Color.CYAN); // Cambiar el color de fondo del panel a cian

        frame.add(panel); // Añadir el panel al marco

        // Hacer visible el marco
        frame.setVisible(true);
    }
}
