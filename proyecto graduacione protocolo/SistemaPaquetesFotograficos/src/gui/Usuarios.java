package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Arreglos.ArglUsuarios;
import Clases.Usuario;

import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.SystemColor;
import javax.swing.JTextField;
import javax.swing.JList;
import javax.swing.JOptionPane;

import java.awt.Checkbox;
import javax.swing.JComboBox;
import javax.crypto.AEADBadTagException;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.HeadlessException;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Usuarios extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtnrodocumento;
	private JTextField txtnomcom;
	private JTextField txtcorreo;
	private JTextField txtcontr;
	private JTextField txtconfcont;
	private Menu menu;
	private JButton btnNewButton_2;
	private JScrollPane scrollPane_1;
	private JTextArea txtS;
	private JButton btnNewButton;
	private JTextArea textArea;
	private JButton btnNewButton_1;
	private JButton btnNewButton_3_1;
	
	public Usuarios(Menu menu) throws HeadlessException {
		
		this.menu = menu;
	
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 896, 516);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.desktop);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		btnNewButton_3_1 = new JButton("Adicionar");
		btnNewButton_3_1.addActionListener(this);
		btnNewButton_3_1.setBounds(153, 426, 123, 23);
		contentPane.add(btnNewButton_3_1);
		
		btnNewButton_3 = new JButton("Buscar");
		btnNewButton_3.addActionListener(this);
		btnNewButton_3.setBounds(153, 404, 123, 23);
		contentPane.add(btnNewButton_3);
		
		JLabel lblNewLabel_1 = new JLabel("Nro Documento:");
		lblNewLabel_1.setBounds(25, 39, 123, 13);
		contentPane.add(lblNewLabel_1);
		
		txtnrodocumento = new JTextField();
		txtnrodocumento.setBounds(35, 62, 146, 19);
		contentPane.add(txtnrodocumento);
		txtnrodocumento.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Nombre Completo:");
		lblNewLabel_2.setBounds(25, 91, 123, 13);
		contentPane.add(lblNewLabel_2);
		
		txtnomcom = new JTextField();
		txtnomcom.setBounds(35, 114, 146, 19);
		contentPane.add(txtnomcom);
		txtnomcom.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Correo:");
		lblNewLabel_3.setBounds(25, 143, 45, 13);
		contentPane.add(lblNewLabel_3);
		
		txtcorreo = new JTextField();
		txtcorreo.setBounds(35, 166, 146, 19);
		contentPane.add(txtcorreo);
		txtcorreo.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("Contraseña:");
		lblNewLabel_4.setBounds(25, 195, 91, 13);
		contentPane.add(lblNewLabel_4);
		
		txtcontr = new JTextField();
		txtcontr.setBounds(35, 218, 146, 19);
		contentPane.add(txtcontr);
		txtcontr.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("Confirmar Contraseña:");
		lblNewLabel_5.setBounds(25, 247, 141, 13);
		contentPane.add(lblNewLabel_5);
		
		txtconfcont = new JTextField();
		txtconfcont.setBounds(35, 270, 146, 19);
		contentPane.add(txtconfcont);
		txtconfcont.setColumns(10);
		
		JLabel lblNewLabel_6 = new JLabel("Rol:");
		lblNewLabel_6.setBounds(25, 300, 45, 13);
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
		
		btnNewButton = new JButton("Listar");	
		btnNewButton.addActionListener(this);
		btnNewButton.setBounds(20, 405, 123, 21);
		contentPane.add(btnNewButton);
		
		btnNewButton_1 = new JButton("Editar");
		btnNewButton_1.addActionListener(this);
		btnNewButton_1.setBounds(20, 427, 123, 21);
		contentPane.add(btnNewButton_1);
		
		btnNewButton_2 = new JButton("Eliminar");
		btnNewButton_2.addActionListener(this);
		btnNewButton_2.setBounds(73, 445, 123, 21);
		contentPane.add(btnNewButton_2);
		
		JLabel lblNewLabel_1_1 = new JLabel("Detalle Usuario");
		lblNewLabel_1_1.setFont(new Font("Arial Black", Font.PLAIN, 16));
		lblNewLabel_1_1.setBounds(10, 10, 186, 13);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setForeground(SystemColor.window);
		lblNewLabel.setBackground(SystemColor.window);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(0, 0, 301, 479);
		contentPane.add(lblNewLabel);
		lblNewLabel.setOpaque(true);
		
		scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(301, 0, 271, 479);
		contentPane.add(scrollPane_1);
		
		txtS = new JTextArea();
		scrollPane_1.setViewportView(txtS);
		
		textArea = new JTextArea();
		textArea.setBounds(569, -11, 301, 488);
		contentPane.add(textArea);
		
		addWindowListener(new java.awt.event.WindowAdapter() {
            
            public void windowClosed(java.awt.event.WindowEvent e) {
                menu.setVisible(true);

            }
		});
	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnNewButton_3) {
			do_btnNewButton_3_actionPerformed(e);
		}
		if (e.getSource() == btnNewButton_3_1) {
			do_btnNewButton_3_1_actionPerformed(e);
		}
		if (e.getSource() == btnNewButton_1) {
			do_btnNewButton_1_actionPerformed(e);
		}
		if (e.getSource() == btnNewButton) {
			do_btnNewButton_actionPerformed(e);
		}
		if (e.getSource() == btnNewButton_2) {
			do_btnNewButton_2_actionPerformed(e);
		}
	}
	protected void do_btnNewButton_2_actionPerformed(ActionEvent e) {
		
	}
	protected void do_btnNewButton_actionPerformed(ActionEvent e) {
		txtS.setText("");
		Listado();
		txtS.append("\nCantidad de usuarios: "+au.Tamaño());
	}
	void Listado() {
		txtS.append("Nro.Documento\tCorreo\tNombre");
		for (int i=0; i < au.Tamaño(); i++) {
			txtS.append("\n"+au.Obtener(i).getDoc()+"\t"+au.Obtener(i).getCorreo()+"\t"+
		    au.Obtener(i).getNom());
		}
	}
	protected void do_btnNewButton_1_actionPerformed(ActionEvent e) {
		txtS.setText("");
		Usuario us=au.Buscar(LeerNroDoc());
		if(us!=null) {	
			us.setCorreo(NombreCorreo());
			us.setNom(NombreCompleto());
			Listado();
		}
	}
	protected void do_btnNewButton_3_1_actionPerformed(ActionEvent e) {
		
	}
	private JButton btnNewButton_3;
	
	ArglUsuarios au= new ArglUsuarios();
	protected void do_btnNewButton_3_actionPerformed(ActionEvent e) {

	}
	
	int LeerNroDoc() {
		return Integer.parseInt(txtnrodocumento.getText());
	}
	String NombreCorreo() {
		return txtcorreo.getText();
	}
	String NombreCompleto() {
		return txtnomcom.getText();
	}
	String Contraseña() {
		return txtcontr.getText();
	}
}
