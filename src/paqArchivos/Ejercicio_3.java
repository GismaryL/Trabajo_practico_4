package paqArchivos;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;

public class Ejercicio_3 {

	public static void main(String[] args) {
		
		String nombres = "maria;yesica;antonia;david;monica;gabriel;ana;cecilia;edison;jonatan";
		String urlDoc = "listaDenombres.txt"; // guardar el nombre del documento en una variable
		
		
		String [] listaNombres = nombres.split(";");
		
		File archivo = new File(urlDoc);
		FileWriter fw = null;
		BufferedWriter bw = null;
		PrintWriter pw = null;
		
		try {
			fw = new FileWriter(archivo);
			bw = new BufferedWriter(fw);
			pw = new PrintWriter(bw);
			
			for(int i = 0; i < listaNombres.length; i++) { 
				pw.write(listaNombres[i] + "\n");
			}
			
			System.out.println("¡El documento de ha creado exitosamente!");
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			if(pw != null) {
				pw.close();
			}
		}
		
		
		
	}

}

