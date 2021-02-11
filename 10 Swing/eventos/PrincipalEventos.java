package eventos;


import javax.swing.*;
import java.awt.*;
public class PrincipalEventos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				new MiVentana2JCheckBox();
			}
		});
	}

}
