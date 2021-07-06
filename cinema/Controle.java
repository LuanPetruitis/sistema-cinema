package cinema;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JMenu;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Controle extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Controle frame = new Controle();
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
	public Controle() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("CINEMA");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 40));
		lblNewLabel.setBounds(139, 89, 143, 73);
		contentPane.add(lblNewLabel);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 239, 21);
		contentPane.add(menuBar);
		
		JMenu menuCadastro = new JMenu("Cadastro");
		menuBar.add(menuCadastro);
		
		JMenuItem menuCliente = new JMenuItem("Cliente");
		menuCliente.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frmCliente fc = new frmCliente();
				fc.setVisible(true);
			}
		});
		menuCadastro.add(menuCliente);

		
		
		JMenuItem menuFilme = new JMenuItem("Filme");
		menuFilme.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				frmFilme ff = new frmFilme();
				ff.setVisible(true);
			}
		});
		menuCadastro.add(menuFilme);
		
		JMenu menuIngressos = new JMenu("Ingressos");
		menuBar.add(menuIngressos);
		
		JMenuItem menuComprar = new JMenuItem("Comprar");
		menuIngressos.add(menuComprar);
		
		JMenuItem menuMinhasCompras = new JMenuItem("Minhas compras");
		menuIngressos.add(menuMinhasCompras);
	}
}
