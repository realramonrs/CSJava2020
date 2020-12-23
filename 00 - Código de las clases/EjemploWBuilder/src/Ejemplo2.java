import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import java.awt.Font;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;
import javax.swing.JComponent;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JMenu;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Ejemplo2 extends JFrame {

	private JPanel contentPane;
	private JTextField txtTareas;
	private JTextArea txtAreaListaTareas;
	private ArrayList<String> tareas;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ejemplo2 frame = new Ejemplo2();
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
	public Ejemplo2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 613, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		JButton btnAñadir = new JButton("A\u00F1adir");
		btnAñadir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Añadir una tarea a la lista
				String texto = txtTareas.getText();
				//Añadirlo a la lista
				tareas.add(texto);
			}
		});
		btnAñadir.setBounds(29, 102, 89, 23);
		contentPane.add(btnAñadir);
		
		JButton btnContar = new JButton("Contar");
		btnContar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Tareas pendientes: " +tareas.size());
			}
		});
		btnContar.setBounds(29, 151, 89, 23);
		contentPane.add(btnContar);
		
		JButton btnEliminar = new JButton("Eliminar");
		btnEliminar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String tareaEliminar = txtTareas.getText();
				
				//Si la encuentro la elimino
				if(tareas.contains(tareaEliminar)) {
					tareas.remove(tareaEliminar);
				}
			}
		});
		btnEliminar.setBounds(29, 200, 89, 23);
		contentPane.add(btnEliminar);
		
		txtTareas = new JTextField();
		txtTareas.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				((JComponent)e.getSource()).setBackground(Color.GREEN);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				((JComponent)e.getSource()).setBackground(Color.WHITE);
			}
		});
		
		txtTareas.setBounds(182, 93, 124, 23);
		contentPane.add(txtTareas);
		txtTareas.setColumns(10);
		//txtTareas.addMouseListener(new EscuchadorRaton());
		
		JList list = new JList();
		list.setBounds(194, 234, 94, -79);
		contentPane.add(list);
		
		JButton btnVerTareas = new JButton("Ver Tareas");
		btnVerTareas.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnVerTareas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Recorrer el ArrayList y volcar  las tareas a la caja de texto
				String listaTareas ="";
				for(String t : tareas) {
					listaTareas+=t+"\n";
				}
				txtAreaListaTareas.setText(listaTareas);
			}
		});
		btnVerTareas.setBounds(352, 199, 103, 23);
		contentPane.add(btnVerTareas);
		
		 txtAreaListaTareas = new JTextArea();
		txtAreaListaTareas.setBounds(182, 150, 124, 85);
		contentPane.add(txtAreaListaTareas);
		
		JRadioButton rdbOpcion2 = new JRadioButton("New radio button");
		rdbOpcion2.setBounds(359, 132, 109, 23);
		contentPane.add(rdbOpcion2);
		
		JRadioButton rdbOpcion = new JRadioButton("New radio button");
		rdbOpcion.setBounds(359, 102, 109, 23);
		contentPane.add(rdbOpcion);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("New check box");
		chckbxNewCheckBox.setBounds(450, 21, 97, 23);
		contentPane.add(chckbxNewCheckBox);
		
		JCheckBox chckbxNewCheckBox_1 = new JCheckBox("New check box");
		chckbxNewCheckBox_1.setBounds(450, 56, 97, 23);
		contentPane.add(chckbxNewCheckBox_1);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(10, 0, 97, 21);
		contentPane.add(menuBar);
		
		JMenu mnArchivo = new JMenu("Archivo");
		menuBar.add(mnArchivo);
		
		JMenuItem mntmAbrir = new JMenuItem("Abrir");
		mnArchivo.add(mntmAbrir);
		
		JMenuItem mntmCerrar = new JMenuItem("Cerrar");
		mnArchivo.add(mntmCerrar);
		
		tareas = new ArrayList<String>();
		
		
	}
	
	private void initComponents() {
		
	}
	
	/*class EscuchadorRaton extends MouseAdapter {
		public void mouseEntered(MouseEvent e) {
			((JComponent)e.getSource()).setBackground(Color.red);
		}
		@Override
		public void mouseExited(MouseEvent e) {
			
		}
	}*/
	
	
}
