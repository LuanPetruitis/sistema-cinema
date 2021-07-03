 package cinema;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import MDC.Mdc;

import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JList;
import javax.swing.JFormattedTextField;
import java.awt.Choice;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class plataforma extends JFrame {

	private JPanel contentPane;
	private JTextField textQuantity;
	private JTextField textTotal;
	private JTextField textCadastro;
	private JTextField textConfirmado;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					plataforma frame = new plataforma();
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
	public plataforma() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Cinema");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 27));
		lblNewLabel.setBounds(158, 0, 99, 25);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Escolha o filme");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_1.setBounds(10, 38, 133, 25);
		contentPane.add(lblNewLabel_1);
		
		JComboBox comboFilme = new JComboBox();
		comboFilme.setModel(new DefaultComboBoxModel(new String[] {"Velozes e Furiosos 9 ", "Vingadores", "Minha m\u00E3e \u00E9 uma pe\u00E7a", "Um espi\u00E3o e meio"}));
		comboFilme.setBounds(178, 36, 179, 27);
		contentPane.add(comboFilme);
		
		JLabel lblNewLabel_1_1 = new JLabel("Quantidade de ingressos");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_1_1.setBounds(10, 74, 204, 25);
		contentPane.add(lblNewLabel_1_1);
		
		textQuantity = new JTextField();
		textQuantity.setBounds(224, 74, 86, 20);
		contentPane.add(textQuantity);
		textQuantity.setColumns(10);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Total");
		lblNewLabel_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_1_1_1.setBounds(10, 110, 59, 25);
		contentPane.add(lblNewLabel_1_1_1);
		
		textTotal = new JTextField();
		textTotal.setEditable(false);
		textTotal.setColumns(10);
		textTotal.setBounds(87, 115, 86, 20);
		contentPane.add(textTotal);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("Cadastro");
		lblNewLabel_1_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_1_1_1_1.setBounds(10, 146, 80, 25);
		contentPane.add(lblNewLabel_1_1_1_1);
		
		textCadastro = new JTextField();
		textCadastro.setColumns(10);
		textCadastro.setBounds(93, 146, 164, 20);
		contentPane.add(textCadastro);
		
		JButton btnNewButton = new JButton("Confirmar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				total t = new total();
				t.quantidade = Integer.parseInt(textQuantity.getText());
				t.filme = comboFilme.getSelectedItem().toString();
				t.cadastro = textCadastro.getText();
				float total = t.Total();
				textTotal.setText(String.valueOf(total));
				textConfirmado.setText("Agente trás o resultado se for gravado");
			}
		});
		btnNewButton.setBounds(158, 216, 152, 23);
		contentPane.add(btnNewButton);
		
		textConfirmado = new JTextField();
		textConfirmado.setEditable(false);
		textConfirmado.setColumns(10);
		textConfirmado.setBounds(10, 187, 190, 20);
		contentPane.add(textConfirmado);
	}
}
