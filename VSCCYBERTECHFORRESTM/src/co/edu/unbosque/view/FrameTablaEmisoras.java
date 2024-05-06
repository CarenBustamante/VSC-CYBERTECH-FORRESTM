package co.edu.unbosque.view;

import java.awt.BorderLayout;
import java.util.ArrayList;

import javax.swing.JFrame;

public class FrameTablaEmisoras extends JFrame {
	public PanelTablaEmisoras panelTabla;
	
	public FrameTablaEmisoras(ArrayList<String> datos) {
		setLayout(new BorderLayout());
		setBounds(500,100,500,400);
		setVisible(false);
		panelTabla = new PanelTablaEmisoras(datos);
		add(panelTabla, BorderLayout.CENTER);

	}
	public PanelTablaEmisoras getPanelTabla() {
		return panelTabla;
	}
	public void setPanelTabla(PanelTablaEmisoras panelTabla) {
		this.panelTabla = panelTabla;
}
}
