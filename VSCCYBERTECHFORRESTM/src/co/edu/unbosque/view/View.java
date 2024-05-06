package co.edu.unbosque.view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class View extends JFrame {

	private PanelPrincipal panelPrincipal;
	 
	public void inicializarPanel() {
		panelPrincipal = new PanelPrincipal();
	}

	public View() {
		getContentPane().setLayout(new BorderLayout(20, 20));
		setTitle("VSC CyberTech");
		setSize(600, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		inicializarPanel();
		start(panelPrincipal);

		setResizable(false);
		setLocationRelativeTo(null);
		setVisible(true);
		getContentPane().setBackground(Color.black);
	}
	
	public void start(JPanel jpanel) {
		jpanel.setVisible(true);
		add(jpanel, BorderLayout.CENTER);
	}

	public void mostrarMensaje(String mensaje) {
		JOptionPane.showMessageDialog(null, mensaje);
	}

	public void mostrarError(String mensaje) {
		JOptionPane.showMessageDialog(null, mensaje, "ERROR", JOptionPane.ERROR_MESSAGE);
	}
	
	public String llenarLista(ArrayList<String> datos) {

		String borrarEmisora = (String) JOptionPane.showInputDialog(null, "Cuál es la emisora que deseas eliminar?",
				"Seleccionalo", JOptionPane.QUESTION_MESSAGE, null, datos.toArray(), "Seleccione...");

		return borrarEmisora;

	}

	public String llenarEmisoras(ArrayList<String> datos) {

		String llenarEmisoras = (String) JOptionPane.showInputDialog(null, "Cuál es la emisora que deseas seleccionar?",
				"Seleccionalo", JOptionPane.QUESTION_MESSAGE, null, datos.toArray(), "Seleccione...");

		return llenarEmisoras;

	}
	
	public PanelPrincipal getPanelPrincipal() {
		return panelPrincipal;
	}

	public void setPanelPrincipal(PanelPrincipal panelPrincipal) {
		this.panelPrincipal = panelPrincipal;
	}

	public Object getPanelTabla() {
		// TODO Auto-generated method stub
		return null;
	}

	
}