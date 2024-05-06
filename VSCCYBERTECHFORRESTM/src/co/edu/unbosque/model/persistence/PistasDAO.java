package co.edu.unbosque.model.persistence;

import java.io.File;
import java.util.ArrayList;

public class PistasDAO {

	ArrayList<PistasDTO> pistas;
	BinariosFile file;

	public PistasDAO() throws Exception {
		file = new BinariosFile();
		try {
			pistas = file.readArrayPi();
		} catch (Exception e) {
			// TODO: handle exception
			pistas = new ArrayList<PistasDTO>(); 
		}
		
	}

	public void agregarPista(String nombreCancion, String nombreArtista, String genero, File archivo) throws Exception {
		PistasDTO infoPistas = new PistasDTO(nombreCancion, nombreArtista, genero, archivo);
		pistas.add(infoPistas);
		file.writeArrayPi(pistas);
	}

	public ArrayList<String> mostrar() {
		ArrayList<String> emisoraString = new ArrayList<String>();
		for (int i = 0; i < pistas.size(); i++) {

			emisoraString.add(pistas.get(i).getNombreCancion() + "-" + pistas.get(i).getNombreArtista() + "-"
					+ pistas.get(i).getGeneroMusical());
		}
		return emisoraString;
	}

	public boolean eliminar(String nombre) {
		boolean encontrado = false;
		for (int i = 0; i < pistas.size(); i++) {
			if (nombre.equals(pistas.get(i).getNombreCancion())) {
				pistas.remove(i);
				encontrado = true;
			}
		}
		return encontrado;
	}
	public PistasDTO buscarPorNombre(String nombre) {
		PistasDTO cancion = new PistasDTO();
		for (int i = 0; i < pistas.size(); i++) {
			if (nombre.equals(pistas.get(i).getNombreCancion())) {
			//	emisora.remove(i);
				cancion = pistas.get(i);
			}
		}
		return cancion;
	}

}
