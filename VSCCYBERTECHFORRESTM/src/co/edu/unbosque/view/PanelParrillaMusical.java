package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.util.ArrayList;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

public class PanelParrillaMusical extends JPanel {
	
	private JLabel etiquetaEmisora;
	private JLabel etiquetaPistas;

	private JButton emisora;
	private JButton pistas;
	private JButton volver;

	public PanelParrillaMusical() {
		Color colorfondo = new Color(230,230,221,255);
		setBackground(colorfondo);
		TitledBorder borde = BorderFactory.createTitledBorder("Crear Parrilla");
		setBorder(borde);
		   setSize(400, 300);
		setLayout(new GridLayout(3, 2, 5, 15));

		Color colorboton1 = new Color(127, 179, 213);

		etiquetaEmisora = new JLabel("Emisoras a seleccionar");
		emisora = new JButton("Seleccionar Emisora");
		emisora.setActionCommand("SELECCIONAREMISORA");
		emisora.setBackground(colorboton1);
		emisora.setFont(new Font("Times New Roman", Font.BOLD, 20));
		emisora.setEnabled(true);


		etiquetaPistas = new JLabel("Pistas a seleccionar");
		pistas = new JButton("Seleccionar Pistas");
		pistas.setActionCommand("SELECCIONARPISTA");
		pistas.setBackground(colorboton1);
		pistas.setFont(new Font("Times New Roman", Font.BOLD, 20));
		pistas.setEnabled(true);

		volver = new JButton("Volver");
		volver.setActionCommand("VOLVER");
		volver.setBackground(colorboton1);
		volver.setFont(new Font("Times New Roman", Font.BOLD, 20));
		volver.setEnabled(true);

		add(etiquetaEmisora);
		add(emisora);

		add(etiquetaPistas);
		add(pistas);

		add(volver);
		
	}

	public JLabel getEtiquetaEmisora() {
		return etiquetaEmisora;
	}

	public void setEtiquetaEmisora(JLabel etiquetaEmisora) {
		this.etiquetaEmisora = etiquetaEmisora;
	}

	public JLabel getEtiquetaPistas() {
		return etiquetaPistas;
	}

	public void setEtiquetaPistas(JLabel etiquetaPistas) {
		this.etiquetaPistas = etiquetaPistas;
	}

	

	public JButton getEmisora() {
		return emisora;
	}

	public void setEmisora(JButton emisora) {
		this.emisora = emisora;
	}

	public JButton getPistas() {
		return pistas;
	}

	public void setPistas(JButton pistas) {
		this.pistas = pistas;
	}

	public JButton getVolver() {
		return volver;
	}

	public void setVolver(JButton volver) {
		this.volver = volver;
	}

}
