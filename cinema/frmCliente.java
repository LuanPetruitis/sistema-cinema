package cinema;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;

public class frmCliente extends JFrame {

	private JPanel contentPane;
	private JTextField textCPF;
	private JTextField textNome;
	private JTextField textEmail;
	private JTextField textTelefone;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frmCliente frame = new frmCliente();
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
	public frmCliente() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("CLIENTE");
		lblNewLabel.setBounds(127, 0, 131, 54);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 30));
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("CPF");
		lblNewLabel_1.setBounds(32, 68, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		textCPF = new JTextField();
		textCPF.setBounds(79, 65, 86, 20);
		contentPane.add(textCPF);
		textCPF.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Nome");
		lblNewLabel_2.setBounds(32, 94, 46, 14);
		contentPane.add(lblNewLabel_2);
		
		textNome = new JTextField();
		textNome.setBounds(79, 91, 146, 20);
		contentPane.add(textNome);
		textNome.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("E-mail");
		lblNewLabel_3.setBounds(32, 119, 46, 14);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Telefone");
		lblNewLabel_4.setBounds(32, 148, 46, 14);
		contentPane.add(lblNewLabel_4);
		
		textEmail = new JTextField();
		textEmail.setBounds(79, 116, 146, 20);
		contentPane.add(textEmail);
		textEmail.setColumns(10);
		
		textTelefone = new JTextField();
		textTelefone.setBounds(79, 145, 86, 20);
		contentPane.add(textTelefone);
		textTelefone.setColumns(10);
		
		JButton btnNewButton = new JButton("Incluir");
		btnNewButton.setBounds(48, 193, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Alterar");
		btnNewButton_1.setBounds(147, 193, 89, 23);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Consultar");
		btnNewButton_2.setBounds(147, 227, 89, 23);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Pesquisar");
		btnNewButton_3.setBounds(48, 227, 89, 23);
		contentPane.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("Excluir");
		btnNewButton_4.setBounds(335, 227, 89, 23);
		contentPane.add(btnNewButton_4);
	}
}
