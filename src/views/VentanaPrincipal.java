package views;

import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTabbedPane;

import utils.Apariencia;




public class VentanaPrincipal extends JFrame {

	static {
		Apariencia.setAparienciasOrdenadas(Apariencia.aparienciasOrdenadas);
	}

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaPrincipal frame = new VentanaPrincipal();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public VentanaPrincipal() {
		this.setExtendedState(JFrame.MAXIMIZED_BOTH);
		JTabbedPane tabedPane = new JTabbedPane();

		tabedPane.add("Principal", new Ventana());
		tabedPane.add("2", new Ventana2());
		tabedPane.add("3", new Ventana3());
		tabedPane.add("4", new Ventana4());
		tabedPane.add("5", new VentanaSinco());
		this.setMinimumSize(new Dimension(800, 600));

		this.setContentPane(tabedPane);
		this.setJMenuBar(new MyJMenuBar(tabedPane));
	}

}
