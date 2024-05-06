package co.edu.unbosque.view;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.lang.reflect.Array;
import java.util.ArrayList;

import javax.swing.JFrame;

public class FrameParrillaMusical extends JFrame   {

	private PanelParrillaMusical panelParrillaMusical;
	private PanelTabla panelTabla;
	
	
	private ArrayList<String> datos = new ArrayList<String>();

	public FrameParrillaMusical () {
		setTitle("Universal RadioMusic");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setResizable(false);
		this.setSize(900,400);
		this.setLocationRelativeTo(null);
		this.setLayout(new BorderLayout());
		panelParrillaMusical= new PanelParrillaMusical();

		
	
		panelTabla = new PanelTabla(datos);
		add(panelParrillaMusical, BorderLayout.WEST);

		add(panelTabla, BorderLayout.EAST);


		this.setVisible(false);
	}
	
	
	
	public void recargar () {
		panelTabla = new PanelTabla(datos);

		add(panelTabla, BorderLayout.EAST);
	}

	public PanelParrillaMusical getPanelParrillaMusical() {
		return panelParrillaMusical;
	}

	public void setPanelParrillaMusical(PanelParrillaMusical panelParrillaMusical) {
		this.panelParrillaMusical = panelParrillaMusical;
	}

	public PanelTabla getPanelTabla() {
		return panelTabla;
	}

	public void setPanelTabla(PanelTabla panelTabla) {
		this.panelTabla = panelTabla;
	}

	public ArrayList<String> getDatos() {
		return datos;
	}

	public void setDatos(ArrayList<String> datos) {
		this.datos = datos;
	}

	
	
}
