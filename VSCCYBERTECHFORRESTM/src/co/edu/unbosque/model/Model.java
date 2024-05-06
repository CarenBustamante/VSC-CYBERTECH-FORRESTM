package co.edu.unbosque.model;

import java.io.File;

import co.edu.unbosque.model.persistence.EmisoraDAO;
import co.edu.unbosque.model.persistence.EmisoraDTO;
import co.edu.unbosque.model.persistence.ParrillaDTO;
import co.edu.unbosque.model.persistence.ParrillaDAO;
import co.edu.unbosque.model.persistence.PistasDAO;
import co.edu.unbosque.model.persistence.PistasDTO;

public class Model {
	private EmisoraDAO emisoraDAO;
	private EmisoraDTO emisoraDTO;
	private PistasDAO pistasDAO;
	private PistasDTO pistasDTO;
	private ParrillaDAO parrillaDAO;
	private ParrillaDTO parrillaDTO;
	

	public Model(){
		File file = null;
		emisoraDTO = new EmisoraDTO("", "", "");
		pistasDTO = new PistasDTO("", "", "", file);
		parrillaDTO = new ParrillaDTO();

		
		try {
			emisoraDAO = new EmisoraDAO();
			pistasDAO = new PistasDAO();
			parrillaDAO = new ParrillaDAO();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public EmisoraDAO getEmisoraDAO() {
		return emisoraDAO;
	}

	public void setEmisoraDAO(EmisoraDAO emisoraDAO) {
		this.emisoraDAO = emisoraDAO;
	}

	public EmisoraDTO getEmisoraDTO() {
		return emisoraDTO;
	}

	public void setEmisoraDTO(EmisoraDTO emisoraDTO) {
		this.emisoraDTO = emisoraDTO;
	}

	public PistasDAO getPistasDAO() {
		return pistasDAO;
	}

	public void setPistasDAO(PistasDAO pistasDAO) {
		this.pistasDAO = pistasDAO;
	}

	public PistasDTO getPistasDTO() {
		return pistasDTO;
	}

	public void setPistasDTO(PistasDTO pistasDTO) {
		this.pistasDTO = pistasDTO;
	}

	public ParrillaDAO getParrillaDAO() {
		return parrillaDAO;
	}

	public void setParrillaDAO(ParrillaDAO parrillaDAO) {
		this.parrillaDAO = parrillaDAO;
	}

	public ParrillaDTO getParrillaDTO() {
		return parrillaDTO;
	}

	public void setParrillaDTO(ParrillaDTO parrillaDTO) {
		this.parrillaDTO = parrillaDTO;
	}

}