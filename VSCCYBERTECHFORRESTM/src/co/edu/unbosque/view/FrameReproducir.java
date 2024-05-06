package co.edu.unbosque.view;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JFrame;

public class FrameReproducir extends JFrame   {

	private PanelReproducir panelReproducir;

	public FrameReproducir () {
		setTitle("Universal RadioMusic");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setResizable(false);
		this.setSize(600,400);
		this.setLocationRelativeTo(null);
		this.setLayout(new GridLayout());
		panelReproducir= new PanelReproducir();
		add(panelReproducir, BorderLayout.CENTER);
		this.setVisible(false);
	}

	public PanelReproducir getPanelReproducir() {
		return panelReproducir;
	}

	public void setPanelReproducir(PanelReproducir panelReproducir) {
		this.panelReproducir = panelReproducir;
	}
	
}
