import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaPro {
    public static void main(String[] args) {
        // Crear el marco
        JFrame frame = new JFrame("Ventana Pro");
        frame.setSize(600, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Crear un panel con un color de fondo
        JPanel panel = new JPanel(new GridBagLayout());
        panel.setBackground(Color.LIGHT_GRAY);
        frame.add(panel);

        // Usar GridBagConstraints para la disposición de componentes
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10);
        gbc.fill = GridBagConstraints.HORIZONTAL;

        // Crear y añadir JLabel para el usuario
        JLabel userLabel = new JLabel("Usuario:");
        gbc.gridx = 0;
        gbc.gridy = 0;
        panel.add(userLabel, gbc);

        // Crear y añadir JTextField para el usuario
        JTextField userText = new JTextField(20);
        gbc.gridx = 1;
        gbc.gridy = 0;
        gbc.gridwidth = 2;
        panel.add(userText, gbc);

        // Crear y añadir JLabel para la contraseña
        JLabel passwordLabel = new JLabel("Contraseña:");
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.gridwidth = 1;
        panel.add(passwordLabel, gbc);

        // Crear y añadir JTextField para la contraseña
        JPasswordField passwordText = new JPasswordField(20);
        gbc.gridx = 1;
        gbc.gridy = 1;
        gbc.gridwidth = 2;
        panel.add(passwordText, gbc);

        // Crear y añadir JComboBox para el rol
        JLabel roleLabel = new JLabel("Rol:");
        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.gridwidth = 1;
        panel.add(roleLabel, gbc);

        String[] roles = { "Administrador", "Usuario", "Invitado" };
        JComboBox<String> roleComboBox = new JComboBox<>(roles);
        gbc.gridx = 1;
        gbc.gridy = 2;
        gbc.gridwidth = 2;
        panel.add(roleComboBox, gbc);

        // Crear y añadir JButton para login
        JButton loginButton = new JButton("Login");
        gbc.gridx = 0;
        gbc.gridy = 3;
        gbc.gridwidth = 1;
        loginButton.setBackground(Color.BLUE);
        loginButton.setForeground(Color.WHITE);
        panel.add(loginButton, gbc);

        // Crear y añadir JButton para reset
        JButton resetButton = new JButton("Reset");
        gbc.gridx = 1;
        gbc.gridy = 3;
        gbc.gridwidth = 1;
        resetButton.setBackground(Color.RED);
        resetButton.setForeground(Color.WHITE);
        panel.add(resetButton, gbc);

        // Añadir ActionListener al botón de login
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String usuario = userText.getText();
                String contraseña = new String(passwordText.getPassword());
                String rol = (String) roleComboBox.getSelectedItem();

                if (!usuario.isEmpty() && !contraseña.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Login con éxito\nUsuario: " + usuario + "\nRol: " + rol);
                } else {
                    JOptionPane.showMessageDialog(null, "Por favor, ingrese todos los datos", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        // Añadir ActionListener al botón de reset
        resetButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                userText.setText("");
                passwordText.setText("");
                roleComboBox.setSelectedIndex(0);
            }
        });

        // Hacer visible el marco
        frame.setVisible(true);
    }
}
