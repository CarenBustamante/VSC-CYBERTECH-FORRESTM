package co.edu.unbosque.model.persistence;

import java.util.ArrayList;

public class ParrillaDTO {
	
	private String emisora;
	private PistasDTO pista;
	
	public ParrillaDTO () {
		
	}

	public ParrillaDTO(String emisora, PistasDTO pista) {
		super();
		this.emisora = emisora;
		this.pista = pista;
	}

	public String getEmisora() {
		return emisora;
	}

	public void setEmisora(String emisora) {
		this.emisora = emisora;
	}

	public PistasDTO getPista() {
		return pista;
	}

	public void setPista(PistasDTO pista) {
		this.pista = pista;
	}
	
	

}
