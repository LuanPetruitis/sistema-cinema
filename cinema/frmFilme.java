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
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class frmFilme extends JFrame {

	private JPanel contentPane;
	private JTextField codigotxt;
	private JTextField nomefilmetxt;
	private JTextField precotxt;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frmFilme frame = new frmFilme();
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
	public frmFilme() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("FILME");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 40));
		lblNewLabel.setBounds(123, 11, 221, 74);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("C\u00F3digo");
		lblNewLabel_1.setBounds(10, 98, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Nome");
		lblNewLabel_2.setBounds(10, 121, 46, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Pre\u00E7o");
		lblNewLabel_3.setBounds(10, 144, 46, 14);
		contentPane.add(lblNewLabel_3);
		
		codigotxt = new JTextField();
		codigotxt.setBounds(66, 96, 86, 20);
		contentPane.add(codigotxt);
		codigotxt.setColumns(10);
		
		nomefilmetxt = new JTextField();
		nomefilmetxt.setBounds(66, 118, 86, 20);
		contentPane.add(nomefilmetxt);
		nomefilmetxt.setColumns(10);
		
		precotxt = new JTextField();
		precotxt.setBounds(66, 141, 86, 20);
		contentPane.add(precotxt);
		precotxt.setColumns(10);
		
		JButton btnIncluir = new JButton("Incluir");
		btnIncluir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnIncluir.setBounds(66, 193, 89, 23);
		contentPane.add(btnIncluir);
		
		JButton btnAlterar = new JButton("Alterar");
		btnAlterar.setBounds(177, 193, 89, 23);
		contentPane.add(btnAlterar);
		
		JButton btnPesquisar = new JButton("Pesquisar");
		btnPesquisar.setBounds(66, 227, 89, 23);
		contentPane.add(btnPesquisar);
		
		JButton btnExcluir = new JButton("Excluir");
		btnExcluir.setBounds(335, 227, 89, 23);
		contentPane.add(btnExcluir);
		
		JButton btnConsultar = new JButton("Consultar");
		btnConsultar.setBounds(177, 227, 89, 23);
		contentPane.add(btnConsultar);
	}
}
