package co.edu.unbosque.view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.util.ArrayList;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class PanelTabla extends JPanel{
	
	private JLabel nombreEmisora;


	ArrayList<String> datos = new ArrayList<String>();


    public PanelTabla(ArrayList<String> datos) {
    	Color colorfondo = new Color(230,230,221,255);
		setBackground(colorfondo);
        this.datos = datos;
        cargarTabla();
    }
    
    
	public PanelTabla () {
		
		
		this.setLayout(new BorderLayout());
		
		System.out.println("datos del panel");
		for (int i = 0; i < datos.size(); i++) {
			System.out.println(datos.get(i));
		}
	
		try {
			String[] columnas = {"Nombre Canción", "Nombre Artista", "Género Musical", "archivo"};
			JTable tabla = new JTable();
			DefaultTableModel modelo = new DefaultTableModel();
			modelo.setColumnIdentifiers(columnas);
			tabla.setModel(modelo);
			for (int i = 0; i < datos.size(); i++) {
				String[] row = datos.get(i).split("-");
				modelo.addRow(new Object[] {row[0], row[1], row[2]});
			}
			JScrollPane scroll = new JScrollPane(tabla);
			nombreEmisora = new JLabel("");
			nombreEmisora.setFont(new Font("Times New Roman", Font.BOLD, 30));

			add(scroll, BorderLayout.LINE_START);

			add(nombreEmisora, BorderLayout.NORTH);

			

		} catch (Exception e) {
			// TODO: handle exception
			JOptionPane.showMessageDialog(null, e);
		}
	}
	
	
	public void cargarTabla() {
	        try {
	            String[] columnas = {"Nombre Canción", "Nombre Artista", "Género Musical", "Archivo"};
	            DefaultTableModel modelo = new DefaultTableModel();
	            modelo.setColumnIdentifiers(columnas);
	            for (int i = 0; i < datos.size(); i++) {
	                String[] row = datos.get(i).split("-");
	                modelo.addRow(new Object[] {row[0], row[1], row[2]});
	            }
	            JTable tabla = new JTable(modelo);
	            JScrollPane scroll = new JScrollPane(tabla);
	            nombreEmisora = new JLabel("");
	            nombreEmisora.setFont(new Font("Times New Roman", Font.BOLD, 30));

	            removeAll(); // Limpiar el panel antes de agregar nuevos componentes
	            setLayout(new BorderLayout());
	            add(scroll, BorderLayout.CENTER);
	            add(nombreEmisora, BorderLayout.NORTH);

	            revalidate(); // Actualizar la vista
	            repaint();
	        } catch (Exception e) {
	            JOptionPane.showMessageDialog(null, e);
	        }
	    }
	
	
	public void llenarTabla (ArrayList<String>datos) {
		System.out.println("datos del panel metodo" +"\n");
		for (int i = 0; i < datos.size(); i++) {
			System.out.println(i+"---"+datos.get(i));
		}
		
		try {
			String[] columnas = {"Nombre Canción", "Nombre Artista", "Genero Musical", "archivo"};
			JTable tabla = new JTable();
			DefaultTableModel modelo = new DefaultTableModel();
			modelo.setColumnIdentifiers(columnas);
			tabla.setModel(modelo);
			for (int i = 0; i < datos.size(); i++) {
				String[] row = datos.get(i).split("-");
				modelo.addRow(new Object[] {row[0], row[1], row[2]});

			}
			JScrollPane scroll = new JScrollPane(tabla);
			nombreEmisora = new JLabel("");
			nombreEmisora.setFont(new Font("Times New Roman", Font.BOLD, 30));

			add(scroll, BorderLayout.LINE_START);

			add(nombreEmisora, BorderLayout.NORTH);

			

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


	public JLabel getNombreEmisora() {
		return nombreEmisora;
	}


	public void setNombreEmisora(JLabel nombreEmisora) {
		this.nombreEmisora = nombreEmisora;
	}



	
	
}
