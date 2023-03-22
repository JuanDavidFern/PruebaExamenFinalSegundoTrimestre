package views;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import org.w3c.dom.stylesheets.LinkStyle;

import controllers.IdiomaController;
import controllers.PaisController;
import controllers.UsuarioController;
import models.Idioma;
import models.Pais;
import models.Usuario;

import java.awt.GridBagLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.GridBagConstraints;
import javax.swing.JTextField;
import java.awt.Insets;
import javax.swing.JComboBox;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.List;
import java.awt.event.ActionEvent;

public class Ventana extends JPanel {

	private JPanel contentPane;
	private JTextField jtfEmail;
	private JTextField jtfUsuario;
	private JTextField jtfPassword;
	private JTextField jtfRepeticion;
	private JButton btnGuardar;
	private JComboBox<Pais> jcbPais;
	private JComboBox<Idioma> jcbIdioma;
	private JCheckBox check;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ventana frame = new Ventana();
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
	public Ventana() {
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.rowWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0 };
		gbl_contentPane.columnWeights = new double[] { 0.0, 1.0 };
//		gbl_contentPane.columnWidths = new int[]{0};
//		gbl_contentPane.rowHeights = new int[]{0};
//		gbl_contentPane.columnWeights = new double[]{Double.MIN_VALUE};
//		gbl_contentPane.rowWeights = new double[]{Double.MIN_VALUE};
		setLayout(gbl_contentPane);

		JLabel lblNewLabel = new JLabel("Email");
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel.gridx = 0;
		gbc_lblNewLabel.gridy = 0;
		add(lblNewLabel, gbc_lblNewLabel);

		jtfEmail = new JTextField();
		GridBagConstraints gbc_jtfEmail = new GridBagConstraints();
		gbc_jtfEmail.insets = new Insets(0, 0, 5, 0);
		gbc_jtfEmail.fill = GridBagConstraints.HORIZONTAL;
		gbc_jtfEmail.gridx = 1;
		gbc_jtfEmail.gridy = 0;
		add(jtfEmail, gbc_jtfEmail);
		jtfEmail.setColumns(10);

		JLabel lblNewLabel_1 = new JLabel("Usuario");
		GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
		gbc_lblNewLabel_1.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_1.gridx = 0;
		gbc_lblNewLabel_1.gridy = 1;
		add(lblNewLabel_1, gbc_lblNewLabel_1);

		jtfUsuario = new JTextField();
		GridBagConstraints gbc_jtfUsuario = new GridBagConstraints();
		gbc_jtfUsuario.insets = new Insets(0, 0, 5, 0);
		gbc_jtfUsuario.fill = GridBagConstraints.HORIZONTAL;
		gbc_jtfUsuario.gridx = 1;
		gbc_jtfUsuario.gridy = 1;
		add(jtfUsuario, gbc_jtfUsuario);
		jtfUsuario.setColumns(10);

		JLabel lblNewLabel_2 = new JLabel("Password");
		GridBagConstraints gbc_lblNewLabel_2 = new GridBagConstraints();
		gbc_lblNewLabel_2.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_2.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_2.gridx = 0;
		gbc_lblNewLabel_2.gridy = 2;
		add(lblNewLabel_2, gbc_lblNewLabel_2);

		jtfPassword = new JTextField();
		jtfPassword.setText("");
		GridBagConstraints gbc_jtfPassword = new GridBagConstraints();
		gbc_jtfPassword.insets = new Insets(0, 0, 5, 0);
		gbc_jtfPassword.fill = GridBagConstraints.HORIZONTAL;
		gbc_jtfPassword.gridx = 1;
		gbc_jtfPassword.gridy = 2;
		add(jtfPassword, gbc_jtfPassword);
		jtfPassword.setColumns(10);

		JLabel lblNewLabel_3 = new JLabel("Repeticion Password");
		GridBagConstraints gbc_lblNewLabel_3 = new GridBagConstraints();
		gbc_lblNewLabel_3.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_3.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_3.gridx = 0;
		gbc_lblNewLabel_3.gridy = 3;
		add(lblNewLabel_3, gbc_lblNewLabel_3);

		jtfRepeticion = new JTextField();
		jtfRepeticion.setText("");
		GridBagConstraints gbc_jtfRepeticion = new GridBagConstraints();
		gbc_jtfRepeticion.insets = new Insets(0, 0, 5, 0);
		gbc_jtfRepeticion.fill = GridBagConstraints.HORIZONTAL;
		gbc_jtfRepeticion.gridx = 1;
		gbc_jtfRepeticion.gridy = 3;
		add(jtfRepeticion, gbc_jtfRepeticion);
		jtfRepeticion.setColumns(10);

		JLabel lblNewLabel_4 = new JLabel("Pais");
		GridBagConstraints gbc_lblNewLabel_4 = new GridBagConstraints();
		gbc_lblNewLabel_4.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_4.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_4.gridx = 0;
		gbc_lblNewLabel_4.gridy = 4;
		add(lblNewLabel_4, gbc_lblNewLabel_4);

		jcbPais = new JComboBox<Pais>();
		jcbPais.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (jcbPais != null) {
					cargarIdioma();
				}
			}
		});
		GridBagConstraints gbc_jcbPais = new GridBagConstraints();
		gbc_jcbPais.insets = new Insets(0, 0, 5, 0);
		gbc_jcbPais.fill = GridBagConstraints.HORIZONTAL;
		gbc_jcbPais.gridx = 1;
		gbc_jcbPais.gridy = 4;
		add(jcbPais, gbc_jcbPais);

		JLabel lblNewLabel_5 = new JLabel("Idioma");
		GridBagConstraints gbc_lblNewLabel_5 = new GridBagConstraints();
		gbc_lblNewLabel_5.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_5.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_5.gridx = 0;
		gbc_lblNewLabel_5.gridy = 5;
		add(lblNewLabel_5, gbc_lblNewLabel_5);

		jcbIdioma = new JComboBox<Idioma>();
		jcbIdioma.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (jcbIdioma.getSelectedItem() != null) {
					check.setText(textCheck());
				}
			}
		});
		GridBagConstraints gbc_jcbIdioma = new GridBagConstraints();
		gbc_jcbIdioma.insets = new Insets(0, 0, 5, 0);
		gbc_jcbIdioma.fill = GridBagConstraints.HORIZONTAL;
		gbc_jcbIdioma.gridx = 1;
		gbc_jcbIdioma.gridy = 5;
		add(jcbIdioma, gbc_jcbIdioma);

		check = new JCheckBox("Texto");
		check.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (check.isSelected()) {
					btnGuardar.setEnabled(true);
				} else {
					btnGuardar.setEnabled(false);
				}

			}
		});
		GridBagConstraints gbc_check = new GridBagConstraints();
		gbc_check.insets = new Insets(0, 0, 5, 0);
		gbc_check.anchor = GridBagConstraints.WEST;
		gbc_check.gridwidth = 2;
		gbc_check.gridx = 0;
		gbc_check.gridy = 6;
		add(check, gbc_check);

		btnGuardar = new JButton("Guardar");
		btnGuardar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				guardar();
			}
		});
		GridBagConstraints gbc_btnNewButton = new GridBagConstraints();
		gbc_btnNewButton.insets = new Insets(0, 0, 5, 0);
		gbc_btnNewButton.anchor = GridBagConstraints.EAST;
		gbc_btnNewButton.gridx = 1;
		gbc_btnNewButton.gridy = 7;
		add(btnGuardar, gbc_btnNewButton);

		JPanel panel = new JPanel();
		GridBagConstraints gbc_panel = new GridBagConstraints();
		gbc_panel.fill = GridBagConstraints.BOTH;
		gbc_panel.gridx = 1;
		gbc_panel.gridy = 8;
		add(panel, gbc_panel);
		cargarPais();
		btnGuardar.setEnabled(false);
	}

	private void cargarPais() {
		List<Pais> li = PaisController.cargarPaises();

		for (Pais pais : li) {
			jcbPais.addItem(pais);
		}

	}

	private void cargarIdioma() {
		Pais p = (Pais) jcbPais.getSelectedItem();
		List<Idioma> li = IdiomaController.cargarIdiomas(p.getId());

		jcbIdioma.removeAllItems();

		for (Idioma idioma : li) {
			jcbIdioma.addItem(idioma);
		}

	}

	private String textCheck() {
		String str = null;
		Idioma i = (Idioma) jcbIdioma.getSelectedItem();
		str = IdiomaController.textCheck(i.getId());
		return str;
	}

	private void guardar() {
		Usuario u = new Usuario();
		u.setEmail(jtfEmail.getText());
		u.setUsuario(jtfUsuario.getText());
		u.setPassword(jtfPassword.getText());
		u.setIdioma((Idioma) jcbIdioma.getSelectedItem());
		if (comprobaciones()) {
			UsuarioController.guardarNuevo(u);
		}

	}

	private boolean comprobaciones() {
		if (UsuarioController.comprobarUsuario(jtfUsuario.getText())) {
			JOptionPane.showMessageDialog(null, "El usuario ya existe");
			return false;
		}

		if (!(jtfEmail.getText().lastIndexOf('.') > jtfEmail.getText().lastIndexOf('@'))) {
			JOptionPane.showMessageDialog(null, "El email no es válido");
			return false;
		}

		if (jtfUsuario.getText().length() < 8) {
			JOptionPane.showMessageDialog(null, "El usuario debe tener minimo 8 caracteres");
			return false;
		}

		String str = jtfPassword.getText();
		str.trim();
		int contMayus = 0, contMinus = 0, contNum = 0;
		String str1[] = str.split("[ ]{1,}");
		for (int i = 0; i < str1.length; i++) {
			char[] letra = str1[i].toCharArray();
			contMayus = 0;
			contMinus = 0;
			contNum = 0;
			for (int j = 0; j < letra.length; j++) {
				if (Character.isUpperCase(letra[j]))
					contMayus++;
				if (Character.isLowerCase(letra[j]))
					contMinus++;
				if (Character.isDigit(letra[j]))
					contNum++;
			}

			if (!(contMayus > 0 && contMinus > 0 && contNum > 0)) {
				JOptionPane.showMessageDialog(null, "La contraseña no es valida");
				return false;
			}
		}

		if (!jtfPassword.getText().equals(jtfPassword.getText())) {
			JOptionPane.showMessageDialog(null, "Las contraseñas no coinciden");
			return false;
		}

		return true;
	}

}
