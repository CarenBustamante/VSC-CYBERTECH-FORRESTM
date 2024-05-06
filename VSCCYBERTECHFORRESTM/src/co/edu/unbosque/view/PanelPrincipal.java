package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Image;
import java.awt.Insets;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class PanelPrincipal extends JPanel {
	private JButton emisora;
	private JButton crearPistasMusicales;
	private JButton crearParrillaProgramacion;
	private JButton reproducirEmisora;

	public PanelPrincipal() {
		Color colorfondo = new Color(230,230,221,255);
		setBackground(colorfondo);
		setLayout(new GridBagLayout());
		JLabel fondo = new JLabel();
		
		GridBagConstraints gbc = new GridBagConstraints();
		gbc.insets.top = 10;
		gbc.ipadx = 20;
		gbc.ipady = 10;
		start(gbc);
	}

	public void start(GridBagConstraints gbc) {
		JLabel imgFondo = new JLabel();
		Image img = new ImageIcon("src/co/edu/unbosque/view/fondoPrinci.png").getImage();
		ImageIcon imgT = new ImageIcon(img.getScaledInstance(200, 200, Image.SCALE_FAST));
		imgFondo.setIcon(imgT);
		gbc.gridx = 1;
        gbc.gridy = -1;
        gbc.gridheight = 0;
		add(imgFondo, gbc);
		/*
		titulo = new JLabel("Nombre de la Cancion");
        gbc.gridx = 1;
        gbc.gridy = 0;
        gbc.gridheight = 1;
		add(titulo, gbc);*/
		JButton botonSiguiente = new JButton();
		botonSiguiente.setBounds(630, 524, 40, 40);
		botonSiguiente.setContentAreaFilled(false);
		add(botonSiguiente);
		emisora = createButton("Emisora");
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridheight = 2;
        gbc.insets = new Insets(5, 5, 5, 5);
        emisora.setFont(new Font("Times New Roman", Font.BOLD, 16));

       
        add(emisora, gbc);
        emisora.setBackground(Color.pink);
	
        crearPistasMusicales = createButton("Pistas Musicales");
        gbc.gridx = 2;
        gbc.gridy = 0;
        gbc.gridheight = 1; 
        add(crearPistasMusicales, gbc);
        crearPistasMusicales.setBackground(Color.pink);
        crearPistasMusicales.setFont(new Font("Times New Roman", Font.BOLD, 14));

        
        reproducirEmisora = createButton("Reproducir Emisora");
        gbc.gridx = 2;
        gbc.gridy = 1;
        gbc.gridheight = 2; 
        add(reproducirEmisora, gbc);
        reproducirEmisora.setBackground(Color.pink);
        reproducirEmisora.setFont(new Font("Times New Roman", Font.BOLD, 12));

        
        crearParrillaProgramacion = createButton("Parrilla Musical"); 
        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.gridheight = 1; 
        gbc.insets = new Insets(5, 5, 5, 5);
        add(crearParrillaProgramacion, gbc);
        crearParrillaProgramacion.setBackground(Color.pink);
        crearParrillaProgramacion.setFont(new Font("Times New Roman", Font.BOLD, 15));

	}

	public JButton createButton(String label) {

		JButton button = new JButton(label);
		button.setFont(new Font("Arial", Font.PLAIN, 12));
		button.setPreferredSize(new Dimension(120, 30));
		button.setFocusPainted(false);
		button.setBorderPainted(false);
		button.setOpaque(true);
		button.setActionCommand(label.toUpperCase());
		return button;

	}
	
	

	public JButton getEmisora() {
		return emisora;
	}

	public void setEmisora(JButton emisora) {
		this.emisora = emisora;
	}

	public JButton getCrearPistasMusicales() {
		return crearPistasMusicales;
	}

	public void setCrearPistasMusicales(JButton crearPistasMusicales) {
		this.crearPistasMusicales = crearPistasMusicales;
	}

	public JButton getCrearParrillaProgramacion() {
		return crearParrillaProgramacion;
	}

	public void setCrearParrillaProgramacion(JButton crearParrillaProgramacion) {
		this.crearParrillaProgramacion = crearParrillaProgramacion;
	}

	public JButton getReproducirEmisora() {
		return reproducirEmisora;
	}

	public void setReproducirEmisora(JButton reproducirEmisora) {
		this.reproducirEmisora = reproducirEmisora;
	}
	
	
	
}