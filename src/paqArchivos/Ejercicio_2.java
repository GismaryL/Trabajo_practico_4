package paqArchivos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class Ejercicio_2 {

	public static void main(String[] args) {
		
				
				File arch = null;
				FileReader fr = null;
				BufferedReader br = null;
				String archivoDeNumeros = "";// Variable String ( una caja que va a contener algo que sea te tipo string)
				int sumaNum = 0;
				
				try {
					arch = new File("numeros.txt");
					fr = new FileReader(arch);
					br = new BufferedReader(fr);
					
					String linea = "";
					
					while((linea = br.readLine()) != null) {
						archivoDeNumeros = archivoDeNumeros + linea;
					}
					
				}catch(Exception e) {
					e.printStackTrace();
				} finally {
					try {
						if(br != null) {
							br.close();
						}
					}catch(Exception e) {
						e.printStackTrace();
					}
					
				}
		
				
				 String[] Stringnumeros = archivoDeNumeros.split(";");

			      for (int i = 0; i < Stringnumeros.length; i++) {
					
			    	  sumaNum = Integer.parseInt(Stringnumeros[i])+sumaNum;
			    	  
			      } 
			      
			      System.out.println("La suma de los numeros es: "+sumaNum);
				   	
			}
		  
		     
		




	}


