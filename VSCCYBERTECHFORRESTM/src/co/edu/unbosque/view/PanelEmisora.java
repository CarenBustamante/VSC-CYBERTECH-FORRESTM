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

public class PanelEmisora extends JPanel {

	private JLabel etiquetaNombre;
	private JLabel etiquetaTipoTransmision;
	private JLabel etiquetaTipoMusica;

	private JTextField txtNombre;
	private JComboBox<String> tipoTransmision;
	private JComboBox<String> tipoMusica;

	private JButton aceptar;
	private JButton volver;
	private JButton visualizar;
	private JButton borrar;

	public PanelEmisora() {
		Color colorfondo = new Color(230,230,221,255);

		setBackground(colorfondo);
		TitledBorder borde = BorderFactory.createTitledBorder("Crear Emisora");
		setBorder(borde);
		setLayout(new GridLayout(0, 2, 5, 5));

		etiquetaNombre = new JLabel("Nombre de la Emisora");
		
		txtNombre = new JTextField(5);

		etiquetaTipoTransmision = new JLabel("Tipo de Transmisión");
		tipoTransmision = new JComboBox<>();
		tipoTransmision.addItem("AM");
		tipoTransmision.addItem("FM");
		tipoTransmision.addItem("Streaming");

		etiquetaTipoMusica = new JLabel("Tipo de Música");
		tipoMusica = new JComboBox<>();
		tipoMusica.addItem("Crossover");
		tipoMusica.addItem("Reggaeton");
		tipoMusica.addItem("Vallenato");
		tipoMusica.addItem("Rock");
		tipoMusica.addItem("Pop");
		tipoMusica.addItem("Popular");
		tipoMusica.addItem("Carranga");
		
		Color colorboton1 = new Color(127, 179, 213);
		
		aceptar = new JButton("Crear Emisora");
		aceptar.setActionCommand("ACEPTAR");
		aceptar.setBackground(colorboton1);
		aceptar.setFont(new Font("Times New Roman", Font.BOLD, 20));
		aceptar.setEnabled(true);

		volver = new JButton("Volver");
		volver.setActionCommand("VOLVER");
		volver.setBackground(colorboton1);
		volver.setFont(new Font("Times New Roman", Font.BOLD, 20));
		volver.setEnabled(true);

		visualizar = new JButton("Mostrar Información");
		visualizar.setActionCommand("MOSTRAREMISORA");
		visualizar.setBackground(colorboton1);
		visualizar.setFont(new Font("Times New Roman", Font.BOLD, 20));
		visualizar.setEnabled(true);

		borrar = new JButton("Borrar");
		borrar.setActionCommand("BORRAREMISORA");
		borrar.setBackground(colorboton1);
		borrar.setFont(new Font("Times New Roman", Font.BOLD, 20));
        borrar.setEnabled(true);

		add(etiquetaNombre);
		add(txtNombre);

		add(etiquetaTipoTransmision);
		add(tipoTransmision);

		add(etiquetaTipoMusica);
		add(tipoMusica);

		add(aceptar);
		add(visualizar);
		add(borrar);
		add(volver);
		
	}

	public JLabel getEtiquetaNombre() {
		return etiquetaNombre;
	}

	public void setEtiquetaNombre(JLabel etiquetaNombre) {
		this.etiquetaNombre = etiquetaNombre;
	}

	public JLabel getEtiquetaTipoTransmision() {
		return etiquetaTipoTransmision;
	}

	public void setEtiquetaTipoTransmision(JLabel etiquetaTipoTransmision) {
		this.etiquetaTipoTransmision = etiquetaTipoTransmision;
	}

	public JLabel getEtiquetaTipoMusica() {
		return etiquetaTipoMusica;
	}

	public void setEtiquetaTipoMusica(JLabel etiquetaTipoMusica) {
		this.etiquetaTipoMusica = etiquetaTipoMusica;
	}

	public JTextField getTxtNombre() {
		return txtNombre;
	}

	public void setTxtNombre(JTextField txtNombre) {
		this.txtNombre = txtNombre;
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

	public JComboBox<String> getTipoTransmision() {
		return tipoTransmision;
	}

	public void setTipoTransmision(JComboBox<String> tipoTransmision) {
		this.tipoTransmision = tipoTransmision;
	}

	public JComboBox<String> getTipoMusica() {
		return tipoMusica;
	}

	public void setTipoMusica(JComboBox<String> tipoMusica) {
		this.tipoMusica = tipoMusica;
	}

	public JButton getBorrar() {
		return borrar;
	}

	public void setBorrar(JButton borrar) {
		this.borrar = borrar;
	}
}