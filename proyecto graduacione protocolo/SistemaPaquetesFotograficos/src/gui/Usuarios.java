package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.SystemColor;
import javax.swing.JTextField;
import javax.swing.JList;
import java.awt.Checkbox;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.HeadlessException;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;

public class Usuarios extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private Menu menu;
	private final JScrollPane scrollPane = new JScrollPane();
	
	public Usuarios(Menu menu) throws HeadlessException {
		
		this.menu = menu;
	
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 896, 516);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.desktop);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Nro Documento:");
		lblNewLabel_1.setBounds(25, 39, 123, 13);
		contentPane.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(35, 62, 146, 19);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Nombre Completo:");
		lblNewLabel_2.setBounds(25, 91, 123, 13);
		contentPane.add(lblNewLabel_2);
		
		textField_1 = new JTextField();
		textField_1.setBounds(35, 114, 146, 19);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Correo:");
		lblNewLabel_3.setBounds(25, 143, 45, 13);
		contentPane.add(lblNewLabel_3);
		
		textField_2 = new JTextField();
		textField_2.setBounds(35, 166, 146, 19);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("Contraseña:");
		lblNewLabel_4.setBounds(25, 195, 91, 13);
		contentPane.add(lblNewLabel_4);
		
		textField_3 = new JTextField();
		textField_3.setBounds(35, 218, 146, 19);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("Confirmar Contraseña:");
		lblNewLabel_5.setBounds(25, 247, 141, 13);
		contentPane.add(lblNewLabel_5);
		
		textField_4 = new JTextField();
		textField_4.setBounds(35, 270, 146, 19);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
		
		JLabel lblNewLabel_6 = new JLabel("Rol:");
		lblNewLabel_6.setBounds(25, 299, 45, 13);
		contentPane.add(lblNewLabel_6);
		
		JComboBox comboBox = new JComboBox();
		JComboBox<String> comboRol = new JComboBox<>(new String[] {"Administrador", "Empleado"});
		comboRol.setBounds(35, 313, 146, 21);
		contentPane.add(comboRol);
		contentPane.add(comboBox);
		
		JLabel lblNewLabel_7 = new JLabel("Estado:");
		lblNewLabel_7.setBounds(25, 344, 45, 13);
		contentPane.add(lblNewLabel_7);
		
		JComboBox comboBox_1 = new JComboBox();
		JComboBox<String> comboEstado = new JComboBox<>(new String[] {"Activo", "Inactivo"});
		comboEstado.setBounds(35, 367, 146, 21);
		contentPane.add(comboEstado);
		contentPane.add(comboBox_1);
		
		JButton btnNewButton = new JButton("Guardar");	
		btnNewButton.setBounds(35, 406, 146, 21);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Editar");
		btnNewButton_1.setBounds(35, 427, 146, 21);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Eliminar");
		btnNewButton_2.setBounds(35, 448, 146, 21);
		contentPane.add(btnNewButton_2);
		
		JLabel lblNewLabel_1_1 = new JLabel("Detalle Usuario");
		lblNewLabel_1_1.setFont(new Font("Arial Black", Font.PLAIN, 16));
		lblNewLabel_1_1.setBounds(10, 10, 186, 13);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setForeground(SystemColor.window);
		lblNewLabel.setBackground(SystemColor.window);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(0, 0, 351, 479);
		contentPane.add(lblNewLabel);
		lblNewLabel.setOpaque(true);
		scrollPane.setBounds(351, 0, 531, 479);
		contentPane.add(scrollPane);
		
		JTextArea textArea = new JTextArea();
		textArea.setBackground(SystemColor.activeCaption);
		scrollPane.setViewportView(textArea);
		
		addWindowListener(new java.awt.event.WindowAdapter() {
            
            public void windowClosed(java.awt.event.WindowEvent e) {
                menu.setVisible(true);

            }
		});
	}
}
