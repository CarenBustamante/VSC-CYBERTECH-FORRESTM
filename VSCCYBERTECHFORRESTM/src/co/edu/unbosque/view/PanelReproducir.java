package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Image;

import javax.swing.BorderFactory;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

public class PanelReproducir extends JPanel{
	private JButton retroceder;
	private JButton reproducir;
	private JButton pausar;
	
	private JButton seguir;
	private JButton volver;


	public PanelReproducir() {
		
		JLabel imgFondo = new JLabel();
		Image img = new ImageIcon("src/co/edu/unbosque/view/fondoPrinci.png").getImage();
		ImageIcon imgT = new ImageIcon(img.getScaledInstance(200, 200, Image.SCALE_FAST));
		imgFondo.setIcon(imgT);
	
		add(imgFondo);
		
		Color colorfondo = new Color(230,230,221,255);
		setBackground(colorfondo);
		TitledBorder borde = BorderFactory.createTitledBorder("Reproducir");
		setBorder(borde);


		
		reproducir = new JButton("");
		reproducir.setActionCommand("REPRODUCIR");	
		reproducir.setBounds(200, 100, 50, 50);
		ImageIcon im = new ImageIcon("src/co/edu/unbosque/view/play.png");
		Icon i= new ImageIcon(im.getImage().getScaledInstance(reproducir.getWidth(), reproducir.getHeight(), Image.SCALE_DEFAULT));
		reproducir.setIcon(i);
		reproducir.setFont(new Font("Times New Roman", Font.BOLD, 20)); 
		reproducir.setEnabled(true);
		
		pausar = new JButton("");
		pausar.setActionCommand("DETENER");	
		pausar.setBounds(200, 100, 50, 50);
		ImageIcon ima = new ImageIcon("src/co/edu/unbosque/view/stop.png");
		Icon o= new ImageIcon(ima.getImage().getScaledInstance(pausar.getWidth(), pausar.getHeight(), Image.SCALE_DEFAULT));
		pausar.setIcon(o);
		pausar.setFont(new Font("Times New Roman", Font.BOLD, 20)); 
		pausar.setEnabled(true);
		
		
		
		
		
		Color colorboton1 = new Color(127, 179, 213); 
		volver = new JButton("Volver");
		volver.setActionCommand("VOLVER");
		volver.setBackground(colorboton1);
		volver.setFont(new Font("Times New Roman", Font.BOLD, 20)); 
		volver.setEnabled(true);
		
		
		add(reproducir);
		add(pausar);
	   
	    
		add(volver);

	}


	public JButton getRetroceder() {
		return retroceder;
	}


	public void setRetroceder(JButton retroceder) {
		this.retroceder = retroceder;
	}


	public JButton getSeguir() {
		return seguir;
	}


	public void setSeguir(JButton seguir) {
		this.seguir = seguir;
	}


	public JButton getPausar() {
		return pausar;
	}


	public void setPausar(JButton pausar) {
		this.pausar = pausar;
	}


	public JButton getReproducir() {
		return reproducir;
	}


	public void setReproducir(JButton reproducir) {
		this.reproducir = reproducir;
	}

	public JButton getVolver() {
		return volver;
	}


	public void setVolver(JButton volver) {
		this.volver = volver;
	}

	
}
