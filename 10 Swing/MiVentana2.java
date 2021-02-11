import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class MiVentana2 extends JFrame {
	//Declaramos los componentes de la ventana
	
		JLabel etiqueta;
		JTextField cajadeTexto;
		JButton boton;
		
		//Programamos constructor 
		
		public MiVentana2() {
			//Establecer un tama�o
//			setSize(300,150);
//			setLocation(450,0);
			
			setBounds(450,0,300,150);
			
			//Poner un t�tulo
			
			this.setTitle("Conversor d�lares/euros");
			
			//Terminar el programa al darle al bot�n de cierre
			this.setDefaultCloseOperation(EXIT_ON_CLOSE);
			
			//Crear los componentes
			initialiceComponents();
			
			//Establecer layoutmanager
			
			this.setLayout(new FlowLayout());
			//Agregarlos al panel de contenido
			add(etiqueta);
			add(cajadeTexto);
			getContentPane().add(boton);
			setVisible(true);
		}

		private void initialiceComponents() {
			// TODO Auto-generated method stub
			etiqueta = new JLabel("Introduce cantidad en euros");
			cajadeTexto = new JTextField(15);
			boton = new JButton("Convertir a d�lares");
		}
	}

