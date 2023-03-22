package views;

import javax.swing.ButtonGroup;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class Ventana4 extends JPanel {
	
	private ButtonGroup txapote = new ButtonGroup();

	/**
	 * Create the panel.
	 */
	public Ventana4() {
		
		JRadioButton radio = new JRadioButton("Radio");
		add(radio);
		txapote.add(radio);
		
		JRadioButton piAlCuadradO = new JRadioButton("Pi al cuadrado");
		add(piAlCuadradO);
		txapote.add(piAlCuadradO);

	}

}
