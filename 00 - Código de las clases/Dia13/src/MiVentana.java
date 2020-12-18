import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.*;
public class MiVentana extends JFrame {
	
	//Controles
	private JButton btnDolares;
	private JButton btnEuros;
	private JButton btnResetear;
	private JTextField cajaDeTexto;
	private JLabel lblMoneda;
	
	public MiVentana() {
		setSize(600, 450);
		this.setTitle("Mi Ventana de Repaso");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		//Objetos de distribución -->Layout --> BorderLayout -->FlowLayout-->null , setBounds
		//this.setLayout(new FlowLayout());
		this.setLayout(null);
		//this.setExtendedState(MAXIMIZED_BOTH);
		
		//Crear los componentes y añadirlos a la ventana
		inicializarComponentes();
		//Agregar a la ventana --> Panel de contenidos -->ContentPane
		this.cajaDeTexto.setBounds(25, 50, 250, 35);
		this.btnDolares.setBounds(25,110,130,50);
		this.btnEuros.setBounds(160,110,130,50);
		this.lblMoneda.setBounds(290,50,50,30);
		this.btnResetear.setBounds(300,110,130,50);
		add(btnDolares);
		add(btnEuros);
		add(cajaDeTexto);
		add(lblMoneda);
		add(btnResetear);
		//getContentPane().add(btnDolares,BorderLayout.NORTH);
		//getContentPane().add(btnEuros,BorderLayout.CENTER);
		//add(cajaDeTexto,BorderLayout.SOUTH);
		
		//Asociar control con un escuchador --> addXXXListener
		
		this.btnDolares.addActionListener(new EscuchadorClickBoton());
		this.btnEuros.addActionListener(new EscuchadorClickBoton2());
		this.btnEuros.addMouseListener(new EscuchadorMouse());
		this.btnDolares.addMouseListener(new EscuchadorMouse());
		this.btnResetear.addMouseListener(new EscuchadorMouse());
		this.cajaDeTexto.addMouseListener(new EscuchadorMouse());
		this.lblMoneda.addMouseListener(new EscuchadorMouse());
		//Asociar al botón resetear un escuchador definido directamente en el método addActionListener
		
		this.btnResetear.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				cajaDeTexto.setText("");
			}
			
		});
		
		this.setVisible(true);
	}
	
	
	
	private void inicializarComponentes() {
		btnDolares = new JButton("Pasar a dólares");
		btnEuros = new JButton("Pasar a euros");
		btnResetear = new JButton("Borrar");
		this.cajaDeTexto = new JTextField(20);
		lblMoneda = new JLabel("--");
	}
	
	//Clases gestionadoras de eventos
	
	class EscuchadorMouse implements MouseListener{

		@Override
		public void mouseClicked(MouseEvent arg0) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseEntered(MouseEvent arg0) {
			// TODO Auto-generated method stub
			//Obtener el control que disparó elevento
			Object o = arg0.getSource();
			
			((JComponent)o).setBackground(Color.green);
			
			//Suponemos que siempre es un botón
			/*if(o instanceof JButton)
			((JButton)o).setBackground(Color.LIGHT_GRAY);
			else if(o instanceof JTextField) {
				((JTextField)o).setBackground(Color.LIGHT_GRAY);
			}
			else if(o instanceof JLabel) {
				((JLabel)o).setBackground(Color.green);
			}*/
			
		}

		@Override
		public void mouseExited(MouseEvent arg0) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mousePressed(MouseEvent arg0) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseReleased(MouseEvent arg0) {
			// TODO Auto-generated method stub
			
		}
		
	}
	
	
	
	
	
	
	class EscuchadorClickBoton2 implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			//Obtener el texto de la caja de texto
			String valor = cajaDeTexto.getText();
			try {
				float valorEuros = Float.parseFloat(valor);
				float dolares = valorEuros/1.17f;
				//Pasar los euros a la caja de texto
				cajaDeTexto.setText(Float.toString(dolares));
				lblMoneda.setText("€");
			}
			catch(NumberFormatException ex) {
				if(valor.equals("")){
					JOptionPane.showMessageDialog(getParent(), "Introduzca una cantidad");
				}
				else {
					JOptionPane.showMessageDialog(getParent(), "Error en la cantidad");
				}
				}
		
			}
	
	} //Fin de la clase
	
	
	class EscuchadorClickBoton implements ActionListener{

		
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			//Obtener el texto de la caja de texto
			String valor = cajaDeTexto.getText();
			try {
				float valorDolares = Float.parseFloat(valor);
				float euros = valorDolares*1.17f;
				//Pasar los euros a la caja de texto
				cajaDeTexto.setText(Float.toString(euros));
				lblMoneda.setText("$");
			}
			catch(NumberFormatException ex) {
				if(valor.equals("")){
					JOptionPane.showMessageDialog(getParent(), "Introduzca una cantidad");
				}
				else {
					JOptionPane.showMessageDialog(getParent(), "Error en la cantidad");
				}
				
				
				
			}
			
		}
		
	}

}
