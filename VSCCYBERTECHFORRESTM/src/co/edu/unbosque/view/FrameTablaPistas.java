package co.edu.unbosque.view;

import java.awt.BorderLayout;
import java.util.ArrayList;

import javax.swing.JFrame;

public class FrameTablaPistas extends JFrame {
	public PanelTablaPistas panelTabla;
	
	public FrameTablaPistas(ArrayList<String> datos) {
		setLayout(new BorderLayout());
		setBounds(500,100,500,400);
		setVisible(false);
		panelTabla = new PanelTablaPistas(datos);
		add(panelTabla, BorderLayout.CENTER);

	}

	public PanelTablaPistas getPanelTabla() {
		return panelTabla;
	}

	public void setPanelTabla(PanelTablaPistas panelTabla) {
		this.panelTabla = panelTabla;
	}
	
}
