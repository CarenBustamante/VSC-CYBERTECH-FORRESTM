package co.edu.unbosque.model.persistence;

import java.io.File;
import java.io.Serializable;

public class PistasDTO implements Serializable{
    String nombreCancion;
    String nombreArtista;
	String generoMusical;
	File archivo;
	
	public PistasDTO() {
		
	}
	
	public PistasDTO(String nombreCancion, String nombreArtista, String generoMusical, File archivo) {
		this.nombreCancion = nombreCancion;
		this.nombreArtista = nombreArtista;
		this.generoMusical = generoMusical;
		this.archivo = archivo;
	}

	
	
	public String getNombreCancion() {
		return nombreCancion;
	}

	public void setNombreCancion(String nombreCancion) {
		this.nombreCancion = nombreCancion;
	}

	public String getNombreArtista() {
		return nombreArtista;
	}

	public void setNombreArtista(String nombreArtista) {
		this.nombreArtista = nombreArtista;
	}

	public String getGeneroMusical() {
		return generoMusical;
	}

	public void setGeneroMusical(String generoMusical) {
		this.generoMusical = generoMusical;
	}

	public File getArchivo() {
		return archivo;
	}

	public void setArchivo(File archivo) {
		this.archivo = archivo;
	}
	
}
