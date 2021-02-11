import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class MiVentana3Centrada extends JFrame {
	//Declaramos los componentes de la ventana
	
		JLabel etiqueta;
		JTextField cajadeTexto;
		JButton boton;
		
		//Programamos constructor 
		
		public MiVentana3Centrada() {
			
			
			Toolkit tl = Toolkit.getDefaultToolkit();
			Dimension tam = tl.getScreenSize();
			int alturaPantalla = tam.height;
			int anchoPantalla = tam.width;
			setSize(anchoPantalla/2 , alturaPantalla/2);
			setLocation(anchoPantalla/4,alturaPantalla/4);
			
			//Cambiar el icono
			Image imagen = tl.getImage("src/colegio.jpg");
			setIconImage(imagen);
			
			//Poner un título
			
			this.setTitle("Conversor dólares/euros");
			
			//Terminar el programa al darle al botón de cierre
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
			boton = new JButton("Convertir a dólares");
		}
	}

