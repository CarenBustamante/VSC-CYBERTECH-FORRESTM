package co.edu.unbosque.model.persistence;

import java.io.Serializable;

public class EmisoraDTO implements Serializable{
    private String nombreEmisora;
    private String tipoDeTransmision;
    private String tipoDeMusica;
    
	public EmisoraDTO(String nombreEmisora, String tipoDeTransmision, String tipoDeMusica) {
		this.nombreEmisora = nombreEmisora;
		this.tipoDeTransmision = tipoDeTransmision;
		this.tipoDeMusica = tipoDeMusica;
	}
	public String getNombreEmisora() {
		return nombreEmisora;
	}
	public void setNombreEmisora(String nombreEmisora) {
		this.nombreEmisora = nombreEmisora;
	}
	public String getTipoDeTransmision() {
		return tipoDeTransmision;
	}
	public void setTipoDeTransmision(String tipoDeTransmision) {
		this.tipoDeTransmision = tipoDeTransmision;
	}
	public String getTipoDeMusica() {
		return tipoDeMusica;
	}
	public void setTipoDeMusica(String tipoDeMusica) {
		this.tipoDeMusica = tipoDeMusica;
	}   
}