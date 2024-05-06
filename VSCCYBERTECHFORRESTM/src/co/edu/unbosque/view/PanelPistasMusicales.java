package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

public class PanelPistasMusicales extends JPanel {
	private JLabel etiquetaNombreCan;
	private JLabel etiquetaNombreArtista;
	private JLabel etiquetaGeneroMusical;

	private JTextField txtNombreCan;
	private JTextField txtNombreArtista;
	private JComboBox<String> generoMusical;

	private JButton aceptar;
	private JButton volver;
	private JButton visualizar;
	private JButton borrar;

	public PanelPistasMusicales() {
		Color colorfondo = new Color(230,230,221,255);
		setBackground(colorfondo);
		TitledBorder borde = BorderFactory.createTitledBorder("Crear Pista Musical");
		setBorder(borde);
		setLayout(new GridLayout(0, 2, 5, 5));

		etiquetaNombreCan = new JLabel("Nombre de la Canción");
		txtNombreCan = new JTextField(5);

		etiquetaNombreArtista = new JLabel("Nombre del Artista");
		txtNombreArtista =  new JTextField(5);
		
		Color colorboton1 = new Color(127, 179, 213); 

		etiquetaGeneroMusical = new JLabel("Género Musical");
		generoMusical = new JComboBox<>();	
		generoMusical.addItem("Reggaeton");
		generoMusical.addItem("Vallenato");
		generoMusical.addItem("Rock");
		generoMusical.addItem("Pop");
		generoMusical.addItem("Popular");
		generoMusical.addItem("Salsa");
		generoMusical.addItem("Merengue");
		generoMusical.addItem("Carranga");

		aceptar = new JButton("Crear Pista");
		aceptar.setActionCommand("ACEPTARPISTAS");
		aceptar.setBackground(colorboton1);
		aceptar.setFont(new Font("Times New Roman", Font.BOLD, 20)); 
		aceptar.setEnabled(true);

		volver = new JButton("Volver");
		volver.setActionCommand("VOLVER");
		volver.setBackground(colorboton1);
		volver.setFont(new Font("Times New Roman", Font.BOLD, 20)); 
		volver.setEnabled(true);

		visualizar = new JButton("Mostrar Información");
		visualizar.setActionCommand("MOSTRARPISTAS");
		visualizar.setBackground(colorboton1);
		visualizar.setFont(new Font("Times New Roman", Font.BOLD, 20)); 
		visualizar.setEnabled(true);

		borrar = new JButton("Borrar");
		borrar.setActionCommand("BORRARPISTAS");
		borrar.setBackground(colorboton1);
		borrar.setFont(new Font("Times New Roman", Font.BOLD, 20)); 
		borrar.setEnabled(true);


		add(etiquetaNombreCan);
		add(txtNombreCan);

		add(etiquetaNombreArtista);
		add(txtNombreArtista);
		
		add(etiquetaGeneroMusical);
		add(generoMusical);
		
		add(aceptar);
		add(visualizar);
		add(borrar);		
		add(volver);


	}


	public JLabel getEtiquetaNombreCan() {
		return etiquetaNombreCan;
	}

	public void setEtiquetaNombreCan(JLabel etiquetaNombreCan) {
		this.etiquetaNombreCan = etiquetaNombreCan;
	}

	public JLabel getEtiquetaNombreArtista() {
		return etiquetaNombreArtista;
	}

	public void setEtiquetaNombreArtista(JLabel etiquetaNombreArtista) {
		this.etiquetaNombreArtista = etiquetaNombreArtista;
	}

	public JLabel getEtiquetaGeneroMusical() {
		return etiquetaGeneroMusical;
	}

	public void setEtiquetaGeneroMusical(JLabel etiquetaGeneroMusical) {
		this.etiquetaGeneroMusical = etiquetaGeneroMusical;
	}

	public JTextField getTxtNombreCan() {
		return txtNombreCan;
	}

	public void setTxtNombreCan(JTextField txtNombreCan) {
		this.txtNombreCan = txtNombreCan;
	}

	public JTextField getTxtNombreArtista() {
		return txtNombreArtista;
	}

	public void setTxtNombreArtista(JTextField txtNombreArtista) {
		this.txtNombreArtista = txtNombreArtista;
	}

	public JComboBox<String> getGeneroMusical() {
		return generoMusical;
	}

	public void setGeneroMusical(JComboBox<String> generoMusical) {
		this.generoMusical = generoMusical;
	}

	public JButton getAceptar() {
		return aceptar;
	}

	public void setAceptar(JButton aceptar) {
		this.aceptar = aceptar;
	}

	public JButton getVolver() {
		return volver;
	}

	public void setVolver(JButton volver) {
		this.volver = volver;
	}

	public JButton getVisualizar() {
		return visualizar;
	}

	public void setVisualizar(JButton visualizar) {
		this.visualizar = visualizar;
	}

	public JButton getBorrar() {
		return borrar;
	}

	public void setBorrar(JButton borrar) {
		this.borrar = borrar;
	}
	
}