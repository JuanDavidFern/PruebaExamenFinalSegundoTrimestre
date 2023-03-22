package views;

import javax.swing.JPanel;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JTextField;
import javax.swing.filechooser.FileFilter;

import java.awt.Insets;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;

public class Ventana2 extends JPanel {
	private JTextField textfieldopath;
	private JButton botonFachero;
	private JFileChooser laCosaDeSeleccionarArxivos;
	private JTextArea abuelaEnTakaTaka;

	/**
	 * Create the panel.
	 */
	public Ventana2() {
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.rowWeights = new double[]{0.0, 1.0};
		gridBagLayout.columnWeights = new double[]{1.0, 0.0};
//		gridBagLayout.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0};
//		gridBagLayout.rowHeights = new int[]{0, 0, 0, 0, 0, 0};
//		gridBagLayout.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
//		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		
		textfieldopath = new JTextField();
		GridBagConstraints gbc_textfieldopath = new GridBagConstraints();
		gbc_textfieldopath.insets = new Insets(0, 0, 5, 5);
		gbc_textfieldopath.fill = GridBagConstraints.HORIZONTAL;
		gbc_textfieldopath.gridx = 0;
		gbc_textfieldopath.gridy = 0;
		add(textfieldopath, gbc_textfieldopath);
		textfieldopath.setColumns(10);
		
		botonFachero = new JButton("Bastonsillo");
		botonFachero.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				seleccionaFichero();
			}
		});
		GridBagConstraints gbc_btnNewButton = new GridBagConstraints();
		gbc_btnNewButton.insets = new Insets(0, 0, 5, 0);
		gbc_btnNewButton.gridx = 1;
		gbc_btnNewButton.gridy = 0;
		add(botonFachero, gbc_btnNewButton);
		
		JScrollPane scrollPane = new JScrollPane();
		GridBagConstraints gbc_scrollPane = new GridBagConstraints();
		gbc_scrollPane.gridwidth = 2;
		gbc_scrollPane.insets = new Insets(0, 0, 0, 5);
		gbc_scrollPane.fill = GridBagConstraints.BOTH;
		gbc_scrollPane.gridx = 0;
		gbc_scrollPane.gridy = 1;
		add(scrollPane, gbc_scrollPane);
		
		abuelaEnTakaTaka = new JTextArea();
		scrollPane.setViewportView(abuelaEnTakaTaka);
		
		

	}
	
	private void seleccionaFichero () {
		this.laCosaDeSeleccionarArxivos = new JFileChooser();
		
		// Configurando el componente
		
		// Establecimiento de la carpeta de inicio
		this.laCosaDeSeleccionarArxivos.setCurrentDirectory(new File("C:\\"));
		
		// Tipo de selección que se hace en el diálogo
//		this.jfileChooser.setFileSelectionMode(JFileChooser.FILES_ONLY); // Sólo selecciona ficheros
		//this.jfileChooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY); // Sólo selecciona ficheros
		this.laCosaDeSeleccionarArxivos.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES); // Selecciona ficheros y carpetas
		
		// Filtro del tipo de ficheros que puede abrir
		this.laCosaDeSeleccionarArxivos.setFileFilter(new FileFilter() {
			
			@Override
			public String getDescription() {
				return "Cozas altamente secretas && mamadisimas *.sql";
			}
			
			@Override
			public boolean accept(File f) {
				if (f.isDirectory() || f.getAbsolutePath().endsWith(".sql")) 
					return true;
				return false;
			}
		});
		
		// Abro el diálogo para la elección del usuario
		int usuarioQueSeleccioneEsteCampoNoSeMuyBiemParaQueSirve = laCosaDeSeleccionarArxivos.showOpenDialog(null);
		
		if (usuarioQueSeleccioneEsteCampoNoSeMuyBiemParaQueSirve == JFileChooser.APPROVE_OPTION) {
			File fichero = this.laCosaDeSeleccionarArxivos.getSelectedFile();
			
			// Vuelco el nombre del fichero sobre el JTextField
			this.textfieldopath.setText(fichero.getAbsolutePath());
			
			if (fichero.isFile()) {
				try {
					FileReader lectoDeFixeros = new FileReader(fichero);
					BufferedReader buffetLibre = new BufferedReader(lectoDeFixeros);
			
					StringBuffer sb = new StringBuffer();
					String lineaDelFichero;
			
					// Lectura del fichero línea a línea
					while ((lineaDelFichero = buffetLibre.readLine()) != null) {
						sb.append(lineaDelFichero + "\n");
					}
					
					// Volcamos el contenido del fichero al JTextArea
					this.abuelaEnTakaTaka.setText(sb.toString());
				}
				catch (Exception ex) {
					ex.printStackTrace();
				}
			}
		}
	}

}
