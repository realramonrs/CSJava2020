import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MiVentana5BorderLayout extends JFrame {

	
	
	public MiVentana5BorderLayout() {
		setSize(400,300);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		add(new JButton("Norte"),BorderLayout.NORTH);
		add(new JButton("Sur"),BorderLayout.SOUTH);
		add(new JButton("Este"),BorderLayout.EAST);
		add(new JButton("Oeste"),BorderLayout.WEST);
		add(new JButton("Centro"),BorderLayout.CENTER);
		
		setVisible(true);
	}
}

