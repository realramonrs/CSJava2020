import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MiVentana2 extends JFrame {

	private JPanel contentPane;
	private JTextField txtResultado;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MiVentana2 frame = new MiVentana2();
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
	public MiVentana2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		JButton btnDolares = new JButton("D\u00F3lares");
		btnDolares.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
			}
		});
		btnDolares.setBounds(50, 140, 89, 38);
		contentPane.add(btnDolares);
		
		JButton btnEuros = new JButton("Euros");
		btnEuros.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnEuros.setBounds(161, 140, 89, 38);
		contentPane.add(btnEuros);
		
		txtResultado = new JTextField();
		txtResultado.setFont(new Font("Arial Black", Font.BOLD, 14));
		txtResultado.setBounds(53, 93, 197, 36);
		contentPane.add(txtResultado);
		txtResultado.setColumns(10);
	}
	
}
