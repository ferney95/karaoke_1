package persistencia;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JFileChooser;

public class ArchivoPlano {

	private File file;
	private FileWriter fileWriter;
	private BufferedWriter bufferedWriter;

	public FileReader fileReader;
	public BufferedReader bufferedReader;

	public ArchivoPlano() {

	}

	public void crearArchivoPlano() {
		JFileChooser jf = new JFileChooser("src/musica");
		int opcion = jf.showSaveDialog(null);	
		if (opcion == JFileChooser.APPROVE_OPTION) {
			file = new File(jf.getSelectedFile().getPath()+ ".txt");
		}
	}

	public void leerArchivoPlano()  throws IOException{
		JFileChooser jf = new JFileChooser("src/musica");
		int opcion = jf.showOpenDialog(null);	
		if (opcion == JFileChooser.APPROVE_OPTION) {
			file = new File(jf.getSelectedFile().getPath());
		}

		fileReader= new FileReader(file);
		bufferedReader = new BufferedReader(fileReader);
		int c;
		while ((c= bufferedReader.read())!= -1) {
			c=(char) fileReader.read();
			System.out.println((char)c);			
		}
	}

	public void escribirArchivoPlano() throws IOException {
		fileWriter = new FileWriter(file);
		bufferedWriter = new BufferedWriter(fileWriter);
		bufferedWriter.write("Hola");
		//fileWriter.write("Hola");
		//fileWriter.close(); bufferedwriter cierra fileWriter
		bufferedWriter.close();

	}


	public static void main(String[] args) {

		ArchivoPlano ap = new ArchivoPlano();
		ap.crearArchivoPlano();
		try {
			ap.escribirArchivoPlano();
			ap.leerArchivoPlano();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
