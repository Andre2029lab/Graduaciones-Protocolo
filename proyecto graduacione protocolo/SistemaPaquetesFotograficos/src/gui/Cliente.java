package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import Arreglos.ArrClientes;
import Clases.Clientes;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import java.awt.Font;
import java.awt.TextArea;

import javax.swing.JTextField;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Cliente extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtDoc;
	private JTextField txtNom;
	private JTextField txtCorreo;
	private JTextField txtNumtlf;
	private JTextField txtDire;
	private JButton btnNewButton;
	private DefaultTableModel modelo;
	private JTable tabla;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Cliente frame = new Cliente();
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
	public Cliente() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 751, 580);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("REGISTRAR CLIENTE");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_1.setBounds(10, 10, 197, 32);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Nro Documento:");
		lblNewLabel_1_1.setBounds(10, 52, 123, 13);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_2 = new JLabel("Nombre Completo:");
		lblNewLabel_2.setBounds(10, 100, 123, 13);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Correo:");
		lblNewLabel_3.setBounds(10, 151, 45, 13);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Nro Telefono:");
		lblNewLabel_4.setBounds(10, 205, 113, 13);
		contentPane.add(lblNewLabel_4);
		
		txtDoc = new JTextField();
		txtDoc.setBounds(10, 75, 156, 19);
		contentPane.add(txtDoc);
		txtDoc.setColumns(10);
		
		txtNom = new JTextField();
		txtNom.setBounds(10, 122, 156, 19);
		contentPane.add(txtNom);
		txtNom.setColumns(10);
		
		txtCorreo = new JTextField();
		txtCorreo.setBounds(10, 174, 156, 19);
		contentPane.add(txtCorreo);
		txtCorreo.setColumns(10);
		
		txtNumtlf = new JTextField();
		txtNumtlf.setBounds(10, 228, 156, 19);
		contentPane.add(txtNumtlf);
		txtNumtlf.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("Direccion:");
		lblNewLabel_5.setBounds(10, 274, 113, 13);
		contentPane.add(lblNewLabel_5);
		
		txtDire = new JTextField();
		txtDire.setBounds(10, 297, 156, 19);
		contentPane.add(txtDire);
		txtDire.setColumns(10);
		modelo = new DefaultTableModel(
			    new Object[]{"Nro. Documento", "Correo", "Nombre", "Teléfono", "Dirección"},
			    0);
		tabla = new JTable(modelo);
		
		JScrollPane scrollPane = new JScrollPane(tabla);
		scrollPane.setBounds(303, 0, 424, 543);
		contentPane.add(scrollPane);
		
		
		btnNewButton = new JButton("Listar");
		btnNewButton.addActionListener(this);
		btnNewButton.setBounds(10, 343, 133, 33);
		contentPane.add(btnNewButton);
		
		btnNewButton_1 = new JButton("Buscar");
		btnNewButton_1.addActionListener(this);
		btnNewButton_1.setBounds(153, 343, 128, 32);
		contentPane.add(btnNewButton_1);
		
		btnNewButton_2 = new JButton("Editar");
		btnNewButton_2.addActionListener(this);
		btnNewButton_2.setBounds(10, 386, 133, 26);
		contentPane.add(btnNewButton_2);
		
		btnNewButton_3 = new JButton("Adicionar");
		btnNewButton_3.addActionListener(this);
		btnNewButton_3.setBounds(153, 386, 128, 26);
		contentPane.add(btnNewButton_3);
		
		btnNewButton_4 = new JButton("Eliminar");
		btnNewButton_4.addActionListener(this);
		btnNewButton_4.setBounds(85, 430, 122, 33);
		contentPane.add(btnNewButton_4);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(0, 0, 304, 483);
		contentPane.add(lblNewLabel);
		

	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnNewButton_4) {
			do_btnNewButton_4_actionPerformed(e);
		}
		if (e.getSource() == btnNewButton_2) {
			do_btnNewButton_2_actionPerformed(e);
		}
		if (e.getSource() == btnNewButton_1) {
			do_btnNewButton_1_actionPerformed(e);
		}
		if (e.getSource() == btnNewButton_3) {
			do_btnNewButton_3_actionPerformed(e);
		}
		if (e.getSource() == btnNewButton) {
			do_btnNewButton_actionPerformed(e);
		}
	}
	
	private JButton btnNewButton_3;
	
	protected void do_btnNewButton_actionPerformed(ActionEvent e) {
		Listado();
	    JOptionPane.showMessageDialog(this, "Cantidad de Clientes: " + cli.Tamaño());
	}
	void Listado() {
		modelo.setRowCount(0); 

		for (int i = 0; i < cli.Tamaño(); i++) {
	        Clientes c = cli.Obtener(i);
	        modelo.addRow(new Object[]{
	            c.getDoc(),
	            c.getCorreo(),
	            c.getNombreComp(),
	            c.getNroTelefono(),
	            c.getDireccion()
	        });
	        
	    }
	}
	ArrClientes cli= new ArrClientes();
	private JButton btnNewButton_1;
	private JButton btnNewButton_2;
	private JButton btnNewButton_4;

	int LeerNroDoc() {
		return Integer.parseInt(txtDoc.getText());
	}
	String Correo() {
		return txtCorreo.getText();
	}
	String NombreCompleto() {
		return txtNom.getText();
	}
	int Telefono() {
		return Integer.parseInt(txtNumtlf.getText());
	}
	String Direccion() {
		return txtDire.getText();
	}
	protected void do_btnNewButton_3_actionPerformed(ActionEvent e) {
		
		Clientes c = cli.Buscar(LeerNroDoc());
		if(c==null) {
			Clientes c1 = new Clientes(LeerNroDoc(), Telefono(), NombreCompleto(), Correo(), Direccion());
			cli.Adicionar(c1);
			
		}
		else JOptionPane.showMessageDialog(this, "Número de Documento ya existente");


	}
	protected void do_btnNewButton_1_actionPerformed(ActionEvent e) {
		try {
	        int nroDoc = LeerNroDoc(); 
	        Clientes c = cli.Buscar(nroDoc); 

	        if (c != null) {
	            txtNom.setText(c.getNombreComp());
	            txtCorreo.setText(c.getCorreo());
	            txtNumtlf.setText(String.valueOf(c.getNroTelefono()));
	            txtDire.setText(c.getDireccion());
	            modelo.setRowCount(0);
	            modelo.addRow(new Object[]{
	                    c.getDoc(),
	                    c.getNombreComp(),
	                    c.getCorreo(),
	                    c.getNroTelefono(),
	                    c.getDireccion()
	                });
	            JOptionPane.showMessageDialog(this, "Cliente encontrado.");
	        } else {
	            JOptionPane.showMessageDialog(this, "No se encontró el cliente con ese número de documento.");
	        }

	    } catch (NumberFormatException ex) {
	        JOptionPane.showMessageDialog(this, "Ingrese un número de documento válido.");
	    }
	}
	
	protected void do_btnNewButton_2_actionPerformed(ActionEvent e) {
		try {
	        int nroDoc = LeerNroDoc();
	        Clientes c = cli.Buscar(nroDoc);

	        if (c != null) {
	            if (Correo().isEmpty() || NombreCompleto().isEmpty()) {
	                JOptionPane.showMessageDialog(this, "Los campos de correo y nombre no pueden estar vacíos.");
	                return;
	            }
	            c.setCorreo(Correo());
	            c.setNombreComp(NombreCompleto());
	            c.setNroTelefono(Telefono());
	            c.setDireccion(Direccion());

	            Listado(); 
	            JOptionPane.showMessageDialog(this, "Cliente con documento " + nroDoc + " actualizado correctamente.");
	        } else {
	            JOptionPane.showMessageDialog(this, "No se encontró ningún cliente con documento " + nroDoc + ".");
	        }

	    } catch (NumberFormatException ex) {
	        JOptionPane.showMessageDialog(this, "El número de documento debe ser un valor numérico.");
	    } catch (Exception ex) {
	        JOptionPane.showMessageDialog(this, "Ocurrió un error al actualizar: " + ex.getMessage());
	        ex.printStackTrace();
	    }
	}
	protected void do_btnNewButton_4_actionPerformed(ActionEvent e) {
		 try {
		        int filaSeleccionada = tabla.getSelectedRow(); 
		        
		        if (filaSeleccionada == -1) {
		            JOptionPane.showMessageDialog(this, 
		                "Por favor selecciona un usuario de la tabla para eliminar.",
		                "Sin selección", JOptionPane.WARNING_MESSAGE);
		            return;
		        }

		        
		        int dni = Integer.parseInt(tabla.getValueAt(filaSeleccionada, 0).toString());

		        Clientes c = cli.Buscar(dni);
		        if (c != null) {
		            int confirm = JOptionPane.showConfirmDialog(this,
		                "¿Seguro que deseas eliminar al usuario con DNI " + dni + "?",
		                "Confirmar eliminación", JOptionPane.YES_NO_OPTION);

		            if (confirm == JOptionPane.YES_OPTION) {
		                cli.Eliminar(c);
		                Listado(); 
		                JOptionPane.showMessageDialog(this, "Usuario eliminado correctamente.");
		            }
		        } else {
		            JOptionPane.showMessageDialog(this, 
		                "No se encontró un usuario con ese DNI.",
		                "Error", JOptionPane.ERROR_MESSAGE);
		        }

		    } catch (NumberFormatException ex) {
		        JOptionPane.showMessageDialog(this,
		            "El DNI debe ser un número válido.",
		            "Error de formato", JOptionPane.ERROR_MESSAGE);
		    } catch (Exception ex) {
		        JOptionPane.showMessageDialog(this,
		            "Ocurrió un error al eliminar: " + ex.getMessage(),
		            "Error inesperado", JOptionPane.ERROR_MESSAGE);
		        ex.printStackTrace();
		    }
	}
}
