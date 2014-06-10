package persistencia;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.swing.JFileChooser;

public class ArchivoBinario {
	private File file;
	private FileOutputStream fileOutputStream;
	private FileInputStream fileInputStream;


	public void crearArchivo() {
		JFileChooser jf = new JFileChooser("src/musica");
		int opcion = jf.showSaveDialog(null);	
		if (opcion == JFileChooser.APPROVE_OPTION) {
			file = new File(jf.getSelectedFile().getPath()+ ".mgb");
		}
	}

	public void EscribirArchivo () throws IOException {
		fileOutputStream = new FileOutputStream(file);
		for (int i = 0; i < 256; i++) {
			fileOutputStream.write(i);
		
		}
		fileOutputStream.close();
	}

	public void leerArchivo() throws IOException {
		JFileChooser jf = new JFileChooser("src/musica");
		int opcion = jf.showOpenDialog(null);	
		if (opcion == JFileChooser.APPROVE_OPTION) {
			file = new File(jf.getSelectedFile().getPath());
		}
		fileInputStream = new FileInputStream(file);
//		int c;
		int x=0;
		int pintar =0;
		while( x < 300){
//			System.out.println(Integer.toBinaryString(c));
		//	System.out.println(fileInputStream.read());
			pintar=pintar+fileInputStream.read();
			System.out.println(pintar);
			x++;
		}
	}



	public static void main(String[] args) {
		ArchivoBinario archivoBinario = new ArchivoBinario();
		//archivoBinario.crearArchivo();
		try {
			archivoBinario.leerArchivo();
//			archivoBinario.EscribirArchivo();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
