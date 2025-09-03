package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.SystemColor;
import java.awt.Color;
import javax.swing.UIManager;
import java.awt.Font;
import javax.swing.ImageIcon;
import java.awt.Image;
import javax.swing.JTextField;
import javax.swing.JPasswordField;


public class Login extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Login() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 506, 248);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("GRADUACIONES\n PROTOCOLO");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Arial Black", Font.PLAIN, 13));
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setBounds(0, 117, 217, 84);
		contentPane.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(248, 53, 217, 28);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Nro Documento");
		lblNewLabel_3.setBounds(248, 28, 98, 13);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_3_1 = new JLabel("Contraseña");
		lblNewLabel_3_1.setBounds(248, 94, 98, 13);
		contentPane.add(lblNewLabel_3_1);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(248, 118, 217, 28);
		contentPane.add(passwordField);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setBounds(28, 10, 163, 116);
		contentPane.add(lblNewLabel_2);
		setImageToLabel (lblNewLabel_2,"/Imagenes/video-camera.png");
		
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setBackground(new Color(102, 153, 204));
		lblNewLabel.setBounds(0, 0, 217, 223);
		contentPane.add(lblNewLabel);
		lblNewLabel.setOpaque(true);
	}
			
//se creo un metodo para ajustar la imagen al label 
		private void setImageToLabel(JLabel label , String imagePath) {
			// Crea un objeto ImageIcon cargando la imagen desde los recursos del proyecto.
			ImageIcon icon = new ImageIcon(getClass().getResource(imagePath));
			// Obtiene el objeto Image del ImageIcon.
			// Esto es necesario porque para escalar la imagen se trabaja con Image, no directamente con ImageIcon.
	        Image img = icon.getImage();
	     // Escala la imagen al tamaño actual del JLabel (ancho y alto).
	        Image imgEscalada = img.getScaledInstance(label.getWidth(), label.getHeight(), Image.SCALE_SMOOTH);
	     // Crea un nuevo ImageIcon a partir de la imagen escalada y lo asigna al JLabel.
	        label.setIcon(new ImageIcon(imgEscalada));
		
		}
	
}
