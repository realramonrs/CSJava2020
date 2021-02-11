package eventos;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MiVentana1ClickBoton extends JFrame {

	private JTextField cajaTexto;
	private JButton boton1 ,boton2,boton3;
	private JButton botonBorrar;
	private JButton btnCambiarColor;
	int contador = 0;
	public MiVentana1ClickBoton() {
		
		Toolkit tl = Toolkit.getDefaultToolkit();
		setSize(tl.getScreenSize().width/2 - 250,tl.getScreenSize().height/2 - 50);
		setLocation(tl.getScreenSize().width/4,tl.getScreenSize().height/4);
		setTitle("Ventana con evento");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		initializeComponents();		
		
		//Distribución
		setLayout(null);
		cajaTexto.setBounds(100, 50, 160, 30);
		boton1.setBounds(100,90,50,30);
		boton2.setBounds(155, 90, 50, 30);
		boton3.setBounds(210, 90, 50, 30);
		botonBorrar.setBounds(100 , 130 , 120 , 30 );
		btnCambiarColor.setBounds(100,170,120,30);
		
		//Añadir escuchadores de eventos
		
		boton1.addActionListener(new EscuchadorNumerico());
		boton2.addActionListener(new EscuchadorNumerico());
		boton3.addActionListener(new EscuchadorNumerico());
		botonBorrar.addActionListener(new EscuchadorBorrado());
		
		btnCambiarColor.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				if(contador==0) {
				cajaTexto.setForeground(Color.BLUE);					
				contador++;
				}
				else if(contador == 1) {
					cajaTexto.setForeground(Color.GREEN);
					contador++;
				}
				else {
					cajaTexto.setForeground(Color.RED);
					contador = 0;
				}
			}
			
		});
		
		//Escuchar la tecla Enter en la caja de texto
		cajaTexto.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				JOptionPane.showMessageDialog(getParent(), "Has pulsado Enter");
			}
			
		});
		
		
		//Añadimos al contentpane
		add(cajaTexto);
		add(boton1);
		add(boton2);
		add(boton3);
		add(botonBorrar);
		add(btnCambiarColor);
		
		setVisible(true);
	}

	private void initializeComponents() {
		// TODO Auto-generated method stub
		cajaTexto = new JTextField();
		Font fuente = new Font("Calibri",2,20);
		cajaTexto.setForeground(Color.gray);
		cajaTexto.setFont(fuente);
		
		boton1 = new JButton("1");
		boton2 = new JButton("2");
		boton3 = new JButton("3");
		botonBorrar = new JButton("Borrar");
		btnCambiarColor = new JButton("Cambiar color");
	
	}	
	
	class EscuchadorNumerico implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub
			//Obtener el botón que provocó el evento
			JButton btn = (JButton)arg0.getSource();
			
			if(btn.getActionCommand().equals("Borrar")) {
				//Código para el botón borrar
				cajaTexto.setText("");
			}
			else {
			String texto = cajaTexto.getText() + btn.getText();
			cajaTexto.setText(texto);
			}
		
		}
		
		
		
	}
	
	class EscuchadorBorrado implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			cajaTexto.setText("");
		}
		
	}
	
	
	
}
