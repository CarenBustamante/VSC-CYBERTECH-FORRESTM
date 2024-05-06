package co.edu.unbosque.model.persistence;

import java.io.File;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;

public class ParrillaDAO {
	
	
	ArrayList<ParrillaDTO> parrillas;
	
	
	public ParrillaDAO () {
		parrillas =  new ArrayList<ParrillaDTO>();
		
	}
	
	
	public void agregarParrilla(String emisora, PistasDTO pista) {
		ParrillaDTO parrilla = new ParrillaDTO(emisora, pista);
		parrillas.add(parrilla);
	}

	
	public void mostrarParrilla () {
		for (int i = 0; i < parrillas.size(); i++) {
			System.out.println(parrillas.get(i).getPista().getArchivo().toPath() + parrillas.get(i).getEmisora());
		}
	}
	
	public ArrayList<String> mostrarParrillaPorEmisora (String emisora) {
		ArrayList<String> datos = new ArrayList<String>();
		String mensaje = "";
		for (int i = 0; i < parrillas.size(); i++) {
			if(emisora.equals(parrillas.get(i).getEmisora())) {
				mensaje = parrillas.get(i).getEmisora() + "-"+parrillas.get(i).getPista().getNombreCancion()+"-"+parrillas.get(i).getPista().getNombreArtista()+"-"+parrillas.get(i).getPista().getGeneroMusical()+"-"+parrillas.get(i).getPista().getArchivo().toPath();
				datos.add(mensaje);
				mensaje = "";
			}
		}
		return datos;
	}
	
	public ArrayList<File> cancionesEmisora (String emisora) {
		ArrayList<File> datos = new ArrayList<File>();
		for (int i = 0; i < parrillas.size(); i++) {
			if(emisora.equals(parrillas.get(i).getEmisora())) {
			
				datos.add(parrillas.get(i).getPista().getArchivo());
			}
		}
		return datos;
	}
	


	public ArrayList<ParrillaDTO> getParrillas() {
		return parrillas;
	}


	public void setParrillas(ArrayList<ParrillaDTO> parrillas) {
		this.parrillas = parrillas;
	}
	
	
	

}
