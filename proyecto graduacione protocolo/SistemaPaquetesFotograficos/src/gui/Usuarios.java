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
	private JButton btnEliminar;
	private JScrollPane scrollPane_1;
	private JTextArea txtS;
	private JButton btnListar;
	private JTextArea textArea;
	private JButton btnEditar;
	private JButton btnAdicionar;
	
	public Usuarios(Menu menu) throws HeadlessException {
		
		this.menu = menu;
	
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 896, 516);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.desktop);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		btnAdicionar = new JButton("Adicionar");
		btnAdicionar.addActionListener(this);
		btnAdicionar.setBounds(153, 426, 138, 23);
		contentPane.add(btnAdicionar);
		
		btnBuscar = new JButton("Buscar");
		btnBuscar.addActionListener(this);
		btnBuscar.setBounds(153, 404, 138, 23);
		contentPane.add(btnBuscar);
		
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
		JComboBox<String> cmbrol = new JComboBox<>(new String[] {"Administrador", "Empleado"});
		cmbrol.setBounds(35, 313, 146, 21);
		contentPane.add(cmbrol);
		contentPane.add(comboBox);
		
		JLabel lblNewLabel_7 = new JLabel("Estado:");
		lblNewLabel_7.setBounds(25, 344, 45, 13);
		contentPane.add(lblNewLabel_7);
		
		JComboBox comboBox_1 = new JComboBox();
		JComboBox<String> cmbestado = new JComboBox<>(new String[] {"Activo", "Inactivo"});
		cmbestado.setBounds(35, 367, 146, 21);
		contentPane.add(cmbestado);
		contentPane.add(comboBox_1);
		
		btnListar = new JButton("Listar");	
		btnListar.addActionListener(this);
		btnListar.setBounds(0, 405, 143, 21);
		contentPane.add(btnListar);
		
		btnEditar = new JButton("Editar");
		btnEditar.addActionListener(this);
		btnEditar.setBounds(0, 427, 143, 21);
		contentPane.add(btnEditar);
		
		btnEliminar = new JButton("Eliminar");
		btnEliminar.addActionListener(this);
		btnEliminar.setBounds(73, 458, 123, 21);
		contentPane.add(btnEliminar);
		
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
		if (e.getSource() == btnBuscar) {
			do_btnNewButton_3_actionPerformed(e);
		}
		if (e.getSource() == btnAdicionar) {
			do_btnNewButton_3_1_actionPerformed(e);
		}
		if (e.getSource() == btnEditar) {
			do_btnNewButton_1_actionPerformed(e);
		}
		if (e.getSource() == btnListar) {
			do_btnNewButton_actionPerformed(e);
		}
		if (e.getSource() == btnEliminar) {
			do_btnNewButton_2_actionPerformed(e);
		}
	}
	protected void do_btnNewButton_2_actionPerformed(ActionEvent e) {
		Usuario us=au.Buscar(LeerNroDoc());
		if(us!=null) au.Eliminar(us);
		else JOptionPane.showMessageDialog(this, "No existe este Número de Documento");
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
		Usuario us= au.Buscar(LeerNroDoc());
		if(us==null) {
			Usuario u1=  new Usuario(LeerNroDoc(), NombreCorreo(), NombreCompleto(), Contraseña());
			au.Adicionar(u1);
		}
		else JOptionPane.showMessageDialog(this, "Número de Documento ya existente");
		
	}
	private JButton btnBuscar;
	
	ArglUsuarios au= new ArglUsuarios();
	protected void do_btnNewButton_3_actionPerformed(ActionEvent e) {
		txtS.setText("");
		Usuario us= au.Buscar(LeerNroDoc());
		if(us!=null) {
			txtS.append("Nro.Documento\tCorreo\t");
			txtS.append("\n"+us.getDoc()+"\t"+us.getCorreo()+"\t"+us.getNom());
		}
		else JOptionPane.showMessageDialog(this,"No existe este Número de Documento");
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
