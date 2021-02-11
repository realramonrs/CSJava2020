package eventos;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class MiVentana2JCheckBox extends JFrame {

	private JLabel etiqueta1;
	private JCheckBox casilla1;
	private JCheckBox casilla2;
	private JCheckBox casilla3;
	private JLabel etiqueta2;
	
	public MiVentana2JCheckBox() {
		setSize(600,250);
		setLocation(350 , 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		
		//Crear controles
		initializeComponents();
		
		//Situar controles en ContentPane
		setLayout(null);
		
		etiqueta1.setBounds(25, 20, 270, 30);
		casilla1.setBounds(25, 55, 100, 30);
		casilla2.setBounds(135, 55, 100, 30);
		casilla3.setBounds(240, 55, 120, 30);
		etiqueta2.setBounds(25, 95, 370, 30);
		
		add(etiqueta1);
		add(casilla1);
		add(casilla2);
		add(casilla3);
		add(etiqueta2);
		
		//Asociar eventos a las casillas
		EscuchadorCasillas e = new EscuchadorCasillas();
		casilla1.addItemListener(e);
		casilla2.addItemListener(e);
		casilla3.addItemListener(e);
		
		setVisible(true);
	}

	private void initializeComponents() {
		// TODO Auto-generated method stub
		etiqueta1 = new JLabel("Seleccione sus delanteros :");
		casilla1 = new JCheckBox("Maxi Gómez");
		casilla2 = new JCheckBox("Iago Aspas");
		casilla3 = new JCheckBox("Pione Sisto");
		etiqueta2 = new JLabel("");
		
		
	}
	
	class EscuchadorCasillas implements ItemListener{
		public void itemStateChanged(ItemEvent ie) {
			//Obtener casilla que generó el evento
			JCheckBox casilla = (JCheckBox)ie.getItem();
			casilla.setForeground(Color.green);
			
			String jugadores="";
				
			if(casilla1.isSelected()) {
				jugadores+= "Maxi Gomez ";
			}
			if(casilla2.isSelected()) {
				jugadores+="Iago Aspas ";
			}
			if(casilla3.isSelected()) {
				jugadores+="Pione Sisto";
			}
			
			etiqueta2.setText("Delanteros escogidos: " + jugadores);
			
			
		}
	}
}
