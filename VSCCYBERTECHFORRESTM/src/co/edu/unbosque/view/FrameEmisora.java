package co.edu.unbosque.view;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JFrame;

public class FrameEmisora extends JFrame   {

	private PanelEmisora panelEmisora;

	public FrameEmisora () {
		setTitle("Universal RadioMusic");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setResizable(false);
		this.setSize(600,400);
		this.setLocationRelativeTo(null);
		this.setLayout(new GridLayout());
		panelEmisora= new PanelEmisora();
		add(panelEmisora, BorderLayout.CENTER);
		this.setVisible(false);
	}

	public PanelEmisora getPanelEmisora() {
		return panelEmisora;
	}

	public void setPanelEmisora(PanelEmisora panelEmisora) {
		this.panelEmisora = panelEmisora;
	}
	
}
