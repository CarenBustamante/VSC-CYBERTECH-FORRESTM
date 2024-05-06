package co.edu.unbosque.view;

import java.awt.Color;
import java.util.ArrayList;

import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class PanelTablaEmisoras extends JPanel{
	
	
	private ArrayList<String> datos = new ArrayList<String>();
	
	public PanelTablaEmisoras (ArrayList<String> datos1) {
		Color colorfondo = new Color(230,230,221,255);
		setBackground(colorfondo);
		try {
			String[] columnas = {"Nombre Emisora", "Tipo de transmisión", "Tipo de Música"};
			JTable tabla = new JTable();
			DefaultTableModel modelo = new DefaultTableModel();
			modelo.setColumnIdentifiers(columnas);
			tabla.setModel(modelo);
			for (int i = 0; i < datos1.size(); i++) {
				String[] row = datos1.get(i).split("-");
				modelo.addRow(new Object[] {row[0], row[1], row[2]});

			}
			JScrollPane scroll = new JScrollPane(tabla);
			add(scroll);
		} catch (Exception e) {
			// TODO: handle exception
			JOptionPane.showMessageDialog(null, e);
		}
	}
	
	
	public void llenarTabla() {
		try {
			String[] columnas = {"Emisoras guardadas"};
			JTable tabla = new JTable();
			DefaultTableModel modelo = new DefaultTableModel();
			modelo.setColumnIdentifiers(columnas);
			tabla.setModel(modelo);
			for (int i = 0; i < datos.size(); i++) {
				String[] row = datos.get(i).split("-");
			//	modelo.addRow(new Object[] {row[0], row[1]});
				modelo.addRow(new Object[] {"hola", "adios"});

			}
			JScrollPane scroll = new JScrollPane(tabla);
			add(scroll);
		} catch (Exception e) {
			// TODO: handle exception
			JOptionPane.showMessageDialog(null, e);
		}
	}

	public ArrayList<String> getDatos() {
		return datos;
	}

	public void setDatos(ArrayList<String> datos) {
		this.datos = datos;
	}
	
	

}
