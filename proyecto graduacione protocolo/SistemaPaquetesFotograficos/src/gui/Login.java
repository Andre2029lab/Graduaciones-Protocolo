package gui;
import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Clases.Usuario;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.SystemColor;
import java.awt.Color;
import javax.swing.UIManager;
import java.awt.Font;
import javax.swing.ImageIcon;
import java.awt.Image;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


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
		
		
		
		JButton btnSalir = new JButton("Salir");
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			System.exit(0);

			}
		});
		ImageIcon icon1 =new ImageIcon (getClass().getResource("/Imagenes/times-square.png"));
		int ancho1 = 85-70;
		int alto1=21-13;
		Image img1= icon1.getImage();
		Image imgEscalada1 = img1.getScaledInstance(ancho1, alto1, Image.SCALE_SMOOTH);
		btnSalir.setIcon(new ImageIcon(imgEscalada1));		
		btnSalir.setBounds(356, 167, 109, 21);
		contentPane.add(btnSalir);
		
		JButton btnIngresar = new JButton("Ingresar");
		btnIngresar.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        try {
		            String correo = textField.getText().trim();
		            String contr = new String(passwordField.getPassword()).trim();

		            if(correo.isEmpty() || contr.isEmpty()) {
		                throw new IllegalArgumentException("Correo y contraseña no pueden estar vacíos");
		            }

		            if(!correo.matches("[a-zA-Z0-9@.]+")) {
		                throw new IllegalArgumentException("Correo solo puede contener letras, números, @ y .");
		            }

		            if(!contr.matches("[a-zA-Z0-9]+")) {
		                throw new IllegalArgumentException("Contraseña solo puede contener letras y números");
		            }

		            Usuario usuario = new Usuario(correo, contr);
		            usuario.registrarUsuario(correo, contr);

		            JOptionPane.showMessageDialog(null,
		                "Usuario creado correctamente:\nCorreo: " + usuario.getCorreo());

		            Menu form = new Menu();
		            form.setVisible(true);
		            Login.this.setVisible(false);

		        } catch (Exception ex) {
		            JOptionPane.showMessageDialog(null,
		                "Error al crear usuario: " + ex.getMessage());
		        }
		    }
		});


			
		ImageIcon icon =new ImageIcon(getClass().getResource("/Imagenes/door-open.png"));
		int ancho =85 -75;
		int alto = 21 -14;	
		Image img= icon.getImage();
		Image imgEscalada = img.getScaledInstance(ancho, alto,Image.SCALE_SMOOTH);
		btnIngresar.setIcon(new ImageIcon(imgEscalada));
		btnIngresar.setBounds(248, 167, 98, 21);
		contentPane.add(btnIngresar);
	}
			
		private void setImageToLabel(JLabel label , String imagePath) {
			ImageIcon icon = new ImageIcon(getClass().getResource(imagePath));
	        Image img = icon.getImage();
	        Image imgEscalada = img.getScaledInstance(label.getWidth(), label.getHeight(), Image.SCALE_SMOOTH);
	        label.setIcon(new ImageIcon(imgEscalada));
		
		}
	
}
