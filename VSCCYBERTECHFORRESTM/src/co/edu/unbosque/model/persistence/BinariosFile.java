package co.edu.unbosque.model.persistence;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class BinariosFile {

	private static String rutaEmisora = "./data/emisoras.dat";
	private static String rutaPistas = "./data/pistas.dat";


	public static void writeArray(ArrayList<EmisoraDTO> array) throws IOException {
		
		 FileOutputStream fileOutputStream = new FileOutputStream(rutaEmisora);
		 ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
		   objectOutputStream.writeObject(array);
		    objectOutputStream.close();
	}
	public static ArrayList<EmisoraDTO> readArray() throws IOException, ClassNotFoundException {
	    try (ObjectInputStream in = new ObjectInputStream(
	            new FileInputStream(rutaEmisora))) {
	        return (ArrayList<EmisoraDTO>) in.readObject();
	    }
	}
	
	public static void writeArrayPi(ArrayList<PistasDTO> array) throws IOException {
		
		 FileOutputStream fileOutputStream = new FileOutputStream(rutaPistas);
		 ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
		   objectOutputStream.writeObject(array);
		    objectOutputStream.close();
	}
	public static ArrayList<PistasDTO> readArrayPi() throws IOException, ClassNotFoundException {
	    try (ObjectInputStream in = new ObjectInputStream(
	            new FileInputStream(rutaPistas))) {
	        return (ArrayList<PistasDTO>) in.readObject();
	    }
	}
}