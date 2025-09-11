package gui;

import java.awt.EventQueue;

import javax.swing.Box;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import java.awt.SystemColor;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.HeadlessException;

import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Menu extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Menu frame = new Menu();
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
	public Menu() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 823, 599);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.window);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("GRADUACIONES PROTOCOLO");
		lblNewLabel_1.setForeground(SystemColor.menu);
		lblNewLabel_1.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 20));
		lblNewLabel_1.setBounds(10, 10, 341, 44);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setEnabled(false);
		lblNewLabel.setBackground(SystemColor.activeCaption);
		lblNewLabel.setBounds(0, 0, 799, 62);
		contentPane.add(lblNewLabel);
		lblNewLabel.setOpaque(true);
		
		
		JButton btbUsuario = new JButton("USUARIOS");
		btbUsuario.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Usuarios ventanaUsuarios = new Usuarios(Menu.this);
				ventanaUsuarios.setVisible(true);
				Menu.this.setVisible(false);
			}
		});
		btbUsuario.setBounds(0, 61, 120, 67);
		contentPane.add(btbUsuario);
		
		JButton btnClientes = new JButton("CLIENTES");
		btnClientes.setBounds(117, 61, 113, 67);
		contentPane.add(btnClientes);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(0, 126, 799, 426);
		contentPane.add(scrollPane);
		
		JTextArea textArea = new JTextArea();
		scrollPane.setViewportView(textArea);

	}
}
