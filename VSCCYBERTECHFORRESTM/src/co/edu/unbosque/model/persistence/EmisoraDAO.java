package co.edu.unbosque.model.persistence;

import java.util.ArrayList;

public class EmisoraDAO  {
	ArrayList<EmisoraDTO> emisora;
	BinariosFile file;

	public EmisoraDAO() throws Exception {
		file = new BinariosFile();
		try {
			emisora = file.readArray();
		} catch (Exception e) {
			// TODO: handle exception
			emisora = new ArrayList<EmisoraDTO>(); 
		}
		
	}

	public void agregarEmisora(String nombreEmisora, String tipoDeTransmision, String tipoDeMusica) throws Exception {
		EmisoraDTO infoEmisora = new EmisoraDTO(nombreEmisora, tipoDeTransmision, tipoDeMusica);
		emisora.add(infoEmisora);
		file.writeArray(emisora);
	}

	public ArrayList<String> mostrar() {
		ArrayList<String> emisoraString = new ArrayList<String>();
		for (int i = 0; i < emisora.size(); i++) {

			emisoraString.add(emisora.get(i).getNombreEmisora() + "-" + emisora.get(i).getTipoDeTransmision() + "-"
					+ emisora.get(i).getTipoDeMusica());
		}
		return emisoraString;
	}

	public boolean eliminar(String nombre) {
		boolean encontrado = false;
		for (int i = 0; i < emisora.size(); i++) {
			if (nombre.equals(emisora.get(i).getNombreEmisora())) {
				emisora.remove(i);
				encontrado = true;
			}
		}
		return encontrado;
	}
	public boolean buscarPorNombre(String nombre) {
		boolean encontrado = false;
		for (int i = 0; i < emisora.size(); i++) {
			if (nombre.equals(emisora.get(i).getNombreEmisora())) {
			//	emisora.remove(i);
				encontrado = true;
			}
		}
		return encontrado;
	}
}