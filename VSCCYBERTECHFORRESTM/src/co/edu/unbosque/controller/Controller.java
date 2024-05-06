package co.edu.unbosque.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

import co.edu.unbosque.model.Model;
import co.edu.unbosque.model.persistence.EmisoraDAO;
import co.edu.unbosque.model.persistence.ParrillaDAO;
import co.edu.unbosque.model.persistence.PistasDAO;
import co.edu.unbosque.view.FrameEmisora;
import co.edu.unbosque.view.FrameParrillaMusical;
import co.edu.unbosque.view.FramePistasMusicales;
import co.edu.unbosque.view.FrameReproducir;
import co.edu.unbosque.view.FrameTablaEmisoras;
import co.edu.unbosque.view.FrameTablaPistas;
import co.edu.unbosque.view.PanelTabla;
import co.edu.unbosque.view.View; 

public class Controller implements ActionListener {
	private View view;
	private Model model;
	private File file;
	private JFileChooser chooser;
	private FrameEmisora frameEmisora;
	private EmisoraDAO emisoraDAO;
	private PistasDAO pistasDAO;
	private ParrillaDAO parrillaDAO;
	private FramePistasMusicales framePistasMusicales;
	private FrameTablaEmisoras tabla;
	private FrameTablaPistas tablaPistas;
	private FrameParrillaMusical frameParrillaMusical;
	private FrameReproducir frameReproducir;
	private PanelTabla panelTablaParrilla;
	private ParrillaDAO parrilaDAO;
	private Clip clip = null;



	public Controller() {
		view = new View();
		model = new Model();
		frameEmisora = new FrameEmisora();
		framePistasMusicales = new FramePistasMusicales();
		frameParrillaMusical = new FrameParrillaMusical();
		frameReproducir = new FrameReproducir();

		parrilaDAO = new ParrillaDAO();
		asignarOyentes();

		try {
			emisoraDAO = new EmisoraDAO();
			tabla = new FrameTablaEmisoras(emisoraDAO.mostrar());
			pistasDAO = new PistasDAO();
			tablaPistas = new FrameTablaPistas(pistasDAO.mostrar());
			parrillaDAO = new ParrillaDAO();


					
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void asignarOyentes() {
		view.getPanelPrincipal().getEmisora().addActionListener(this);
		view.getPanelPrincipal().getCrearPistasMusicales().addActionListener(this);
		view.getPanelPrincipal().getCrearParrillaProgramacion().addActionListener(this);
		view.getPanelPrincipal().getReproducirEmisora().addActionListener(this);

		frameEmisora.getPanelEmisora().getVolver().addActionListener(this);
		frameEmisora.getPanelEmisora().getAceptar().addActionListener(this);
		frameEmisora.getPanelEmisora().getVisualizar().addActionListener(this);
		frameEmisora.getPanelEmisora().getBorrar().addActionListener(this);
		
		framePistasMusicales.getPanelPistasMusicales().getVolver().addActionListener(this);
		framePistasMusicales.getPanelPistasMusicales().getAceptar().addActionListener(this);
		framePistasMusicales.getPanelPistasMusicales().getVisualizar().addActionListener(this);
		framePistasMusicales.getPanelPistasMusicales().getBorrar().addActionListener(this);
		
		frameParrillaMusical.getPanelParrillaMusical().getEmisora().addActionListener(this);
		frameParrillaMusical.getPanelParrillaMusical().getPistas().addActionListener(this);
		frameParrillaMusical.getPanelParrillaMusical().getVolver().addActionListener(this);
		
		frameReproducir.getPanelReproducir().getReproducir().addActionListener(this);
		frameReproducir.getPanelReproducir().getPausar().addActionListener(this);
		frameReproducir.getPanelReproducir().getVolver().addActionListener(this);



	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		
		
		File file = null;
		// TODO Auto-generated method stub
		if (e.getActionCommand().equals("EMISORA")) {
			frameEmisora.setVisible(true);
			view.setVisible(false);

		}
		if (e.getActionCommand().equals("MOSTRAREMISORA")) {
			tabla = new FrameTablaEmisoras(emisoraDAO.mostrar());
			tabla.getPanelTabla().setDatos(emisoraDAO.mostrar());
			tabla.getPanelTabla().llenarTabla();
			tabla.setVisible(true);
		}
		if (e.getActionCommand().equals("BORRAREMISORA")) {
			ArrayList<String> nombres = new ArrayList<String>();

			for (int i = 0; i < emisoraDAO.mostrar().size(); i++) {
				nombres.add(emisoraDAO.mostrar().get(i).split("-")[0]);
			}
			String nombreEliminado = view.llenarLista(nombres);
			if (nombreEliminado != null) {
				if (emisoraDAO.eliminar(nombreEliminado)) {
					view.mostrarMensaje("Se eliminó a " + nombreEliminado);
				} else {
					view.mostrarError("No se encontró a " + nombreEliminado);
				}
			}
		}
		if (e.getActionCommand().equals("PISTAS MUSICALES")) {
			framePistasMusicales.setVisible(true);
			view.setVisible(false);
		}

		if (e.getActionCommand().equals("MOSTRARPISTAS")) {
			tablaPistas = new FrameTablaPistas(pistasDAO.mostrar());
			tablaPistas.getPanelTabla().setDatos(pistasDAO.mostrar());
			tablaPistas.getPanelTabla().llenarTabla();
			tablaPistas.setVisible(true);
		}
		if (e.getActionCommand().equals("BORRARPISTAS")) {
			ArrayList<String> nombres = new ArrayList<String>();

			for (int i = 0; i < pistasDAO.mostrar().size(); i++) {
				nombres.add(pistasDAO.mostrar().get(i).split("-")[0]);
			}
			String nombreEliminado = view.llenarLista(nombres);
			if (nombreEliminado != null) {
				if (pistasDAO.eliminar(nombreEliminado)) {
					view.mostrarMensaje("Se eliminó a " + nombreEliminado);
				} else {
					view.mostrarError("No se encontró a " + nombreEliminado);
				}
			}
		}

		if (e.getActionCommand().equals("PARRILLA MUSICAL")) {
			frameParrillaMusical.setVisible(true);
			view.setVisible(false);

		}
		if (e.getActionCommand().equals("SELECCIONAREMISORA")) {
			ArrayList<String> nombres = new ArrayList<String>();

			for (int i = 0; i < emisoraDAO.mostrar().size(); i++) {
				nombres.add(emisoraDAO.mostrar().get(i).split("-")[0]);
			}
			String nombreEliminado = view.llenarEmisoras(nombres);
			if (nombreEliminado != null) {
				if (emisoraDAO.buscarPorNombre(nombreEliminado)) {
					frameParrillaMusical.getPanelTabla().getNombreEmisora().setText(nombreEliminado);
					
				} else {
					view.mostrarError("No se encontró a " + nombreEliminado);
				}
			}
		}
		if (e.getActionCommand().equals("SELECCIONARPISTA")) {
			ArrayList<String> nombres = new ArrayList<String>();

			for (int i = 0; i < pistasDAO.mostrar().size(); i++) {
				nombres.add(pistasDAO.mostrar().get(i).split("-")[0]);
			}
			String nombreEliminado = view.llenarLista(nombres);
			if (nombreEliminado != null) {
				
					String pista = nombreEliminado;
					
					String	emisora = frameParrillaMusical.getPanelTabla().getNombreEmisora().getText();
					System.out.println(emisora);
					System.out.println(pista);
					parrilaDAO.agregarParrilla(emisora, pistasDAO.buscarPorNombre(pista));
			}
		}
		if (e.getActionCommand().equals("REPRODUCIR EMISORA")) {
			frameReproducir.setVisible(true);
			view.setVisible(false);

		}
		
		if (e.getActionCommand().equals("VOLVER")) {
			view.setVisible(true);
			frameEmisora.setVisible(false);
			framePistasMusicales.setVisible(false);
			frameParrillaMusical.setVisible(false);
			frameReproducir.setVisible(false);

		}
		if (e.getActionCommand().equals("ACEPTAR")) {

			try {
				String nombre = frameEmisora.getPanelEmisora().getTxtNombre().getText();
				String tipoTra = (String) frameEmisora.getPanelEmisora().getTipoTransmision().getSelectedItem();
				String tipoMu = (String) frameEmisora.getPanelEmisora().getTipoMusica().getSelectedItem();
				
				emisoraDAO.agregarEmisora(nombre, tipoTra, tipoMu);

				frameEmisora.getPanelEmisora().getTxtNombre().setText("");

				view.mostrarMensaje("Emisora Guardada");

			} catch (Exception e2) {
				// TODO: handle exception
				view.mostrarError("Hay datos no aceptados");
			}
		}
		if (e.getActionCommand().equals("ACEPTARPISTAS")) {
			try {
				String nombreCan = framePistasMusicales.getPanelPistasMusicales().getTxtNombreCan().getText();
				String nombreArtsta = framePistasMusicales.getPanelPistasMusicales().getTxtNombreArtista().getText();
				String generoMusical = (String) framePistasMusicales.getPanelPistasMusicales().getGeneroMusical().getSelectedItem();
				file = guardarPista();
				
				System.out.println(file.toPath());
				pistasDAO.agregarPista(nombreCan, nombreArtsta, generoMusical, file);

				framePistasMusicales.getPanelPistasMusicales().getTxtNombreCan().setText("");

				view.mostrarMensaje("Cancion Guardada");

			} catch (Exception e2) {
				// TODO: handle exception
				view.mostrarError("Hay datos no aceptados");
				System.out.println(e2.getMessage());
			}
		}
		
		if (e.getActionCommand().equals("REPRODUCIR")) {
			
			ArrayList<String> nombres = new ArrayList<String>();
			for (int i = 0; i < emisoraDAO.mostrar().size(); i++) {
				nombres.add(emisoraDAO.mostrar().get(i).split("-")[0]);
			}
			
			String emis = view.llenarEmisoras(nombres);
			
			
			reproducirPista(parrilaDAO.cancionesEmisora(emis));
		}
		
		if (e.getActionCommand().equals("DETENER")) {
			detener();
		}
	}


	public void guardarFichero(String cadena, String nombre, File ruta){

	    File archivo = new File(nombre);
	    FileWriter escribir;
	    try {

	        escribir = new FileWriter(archivo, true);
	        escribir.write(cadena);
	        escribir.close();

	    } catch (FileNotFoundException ex) {
	        JOptionPane.showMessageDialog(null, "Error al guardar, ponga nombre al archivo");
	    } catch (IOException ex) {
	        JOptionPane.showMessageDialog(null, "Error al guardar, en la salida");
	    }
	}
	
	public File guardarPista() {
		boolean siguiente = true;
		chooser = new JFileChooser();
		FileNameExtensionFilter filtroMP3 = new FileNameExtensionFilter("Archivos MP3", "wav");
		chooser.setFileFilter(filtroMP3);
		int escoger = chooser.showOpenDialog(null);

		try {
			if (escoger == JFileChooser.CANCEL_OPTION) {
				siguiente = false;
				view.mostrarError("Selección de archivo cancelada");
			} else {
				file = chooser.getSelectedFile(); 
				if (escoger == JFileChooser.APPROVE_OPTION) {
					if (!file.getName().toLowerCase().endsWith(".mp3")) {
						throw new Exception();
					}
				}
			}
		} catch (Exception e) {
		}

		if(siguiente) {
		view.mostrarMensaje("Se guardó la selección correctamente");

		}
		return file;
	}
	public void reproducirPista(ArrayList<File> pistas) {
		
		
		for (int i = 0; i < pistas.size(); i++) {
			AudioInputStream audioInputStream;
			try {
				audioInputStream = AudioSystem.getAudioInputStream(pistas.get(i));
				try {
					clip = AudioSystem.getClip();
				} catch (LineUnavailableException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				try {
					clip.open(audioInputStream);
				} catch (LineUnavailableException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				clip.start();
				
				
			} catch (UnsupportedAudioFileException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		}
		public void detener() {
		if(clip != null && clip.isRunning()) {
			clip.stop();
		}
	}
}