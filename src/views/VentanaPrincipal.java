package views;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

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
//		JTabbedPane tabedPane = new JTabbedPane();
//
//		tabedPane.add("Principal", new Ventana());
//		tabedPane.add("2", new Ventana2());
//		tabedPane.add("3", new Ventana3());
//		tabedPane.add("4", new Ventana4());
//		tabedPane.add("5", new VentanaSinco());
//		this.setMinimumSize(new Dimension(800, 600));
//
//		this.setContentPane(tabedPane);
//		this.setJMenuBar(new MyJMenuBar(tabedPane));
		
		
		JPanel ventana = new Ventana();
		add(ventana);
		JPanel ventana2 = new Ventana2();
		JPanel ventana3 = new Ventana3();
		JPanel ventana4 = new Ventana4();
		JPanel ventana5 = new VentanaSinco();
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);


		JMenu menuEnMenu = new JMenu("menu");
		menuBar.add(menuEnMenu);

		JMenuItem mntmNewMenuItem_1 = new JMenuItem("examenPrueba");
		mntmNewMenuItem_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ponerPaneles(ventana);
			}
		});
		menuEnMenu.add(mntmNewMenuItem_1);

		JMenuItem mntmNewMenuItem_2 = new JMenuItem("ficheros");
		mntmNewMenuItem_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ponerPaneles(ventana2);
			}
		});
		menuEnMenu.add(mntmNewMenuItem_2);

		JMenuItem mntmNewMenuItem_3 = new JMenuItem("fotos");
		mntmNewMenuItem_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ponerPaneles(ventana3);
			}
		});
		menuEnMenu.add(mntmNewMenuItem_3);
		
		JMenu menuEnMenu2 = new JMenu("menu");
		menuEnMenu.add(menuEnMenu2);
		
		JMenuItem mntmNewMenuItem_5 = new JMenuItem("chooser");
		mntmNewMenuItem_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ponerPaneles(ventana5);
			}
		});
		menuEnMenu2.add(mntmNewMenuItem_5);
		
		JMenuItem mntmNewMenuItem_4 = new JMenuItem("radio");
		mntmNewMenuItem_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ponerPaneles(ventana4);
			}
		});
		menuEnMenu.add(mntmNewMenuItem_4);
		
		
		

	}

	private void ponerPaneles(JPanel panel) {
		getContentPane().removeAll();
		getContentPane().add(panel);
		getContentPane().revalidate();
		getContentPane().repaint();
	}

}
