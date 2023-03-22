package views;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JTabbedPane;

public class MyJMenuBar extends JMenuBar {

	JTabbedPane tablon = null;
	
	
	public MyJMenuBar (JTabbedPane deAnunsios) {
		this.tablon = deAnunsios;
		
		JMenu abrir = new JMenu("Abril");
		this.add(abrir);
		
		JMenuItem abrirTab1 = new JMenuItem("Principal");
		abrirTab1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				deAnunsios.setSelectedIndex(0);
			}
		});	
		abrir.add(abrirTab1);
		JMenuItem abrirTab2 = new JMenuItem("2");
		abrirTab2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				deAnunsios.setSelectedIndex(1);
			}
		});	
		abrir.add(abrirTab2);
		
		
		JMenu menu = new JMenu("menu");
		abrir.add(menu);
		
		JMenuItem abrirTab3 = new JMenuItem("3");
		abrirTab3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				deAnunsios.setSelectedIndex(2);
			}
		});	
		menu.add(abrirTab3);
		
		JMenuItem abrirTab4 = new JMenuItem("4");
		abrirTab4.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				deAnunsios.setSelectedIndex(3);
			}
		});	
		menu.add(abrirTab4);
		
		JMenu menusito = new JMenu("menusito");
		menu.add(menusito);

		JMenuItem abrirTab5 = new JMenuItem("5");
		abrirTab5.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				deAnunsios.setSelectedIndex(4);
			}
		});	
		menusito.add(abrirTab5);
	
	}
}
