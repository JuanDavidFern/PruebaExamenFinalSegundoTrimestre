package views;

import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class VentanaSinco extends JPanel {
	JTextField federicoGarciaLorca = new JTextField();
	JButton raphael = new JButton("Seleccionar color");
	JPanel vileda = new JPanel();
	JColorChooser chenoa;

	/**
	 * Create the panel.
	 */
	public VentanaSinco() {
		super();

		this.setLayout(new GridBagLayout());
		GridBagConstraints constraints = new GridBagConstraints();
		constraints.insets = new Insets(5, 5, 5, 5);

		// Incluyo el JTextField del nombre del fichero
		constraints.gridx = 0;
		constraints.gridy = 0;
		constraints.fill = GridBagConstraints.HORIZONTAL;
		constraints.weightx = 1;
		this.add(federicoGarciaLorca, constraints);

		// Incluyo el botón que abrirá el dialogo del JFileChooser
		constraints.gridx = 1;
		constraints.gridy = 0;
		constraints.fill = GridBagConstraints.HORIZONTAL;
		constraints.weightx = 0.25;
		this.add(raphael, constraints);

		// Incluyo el área de texto que mostrará el fichero
		constraints.gridx = 0;
		constraints.gridy = 1;
		constraints.gridwidth = 2;
		constraints.fill = GridBagConstraints.BOTH;
		constraints.weighty = 1;
		this.add(this.vileda, constraints);

		// Funcionalidad al botón
		raphael.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				seleccionaColor();
			}
		});
	}

	/**
	 * 
	 */
	private void seleccionaColor() {
		Color color = chenoa.showDialog(null, "Seleccione un Color", Color.gray);
		// Si el usuario pulsa sobre aceptar, el color elegido no será nulo
		if (color != null) {
			String strColor = "#" + Integer.toHexString(color.getRGB()).substring(2);
			this.federicoGarciaLorca.setText(strColor);
			this.vileda.setBackground(color);
		}

	}

}
