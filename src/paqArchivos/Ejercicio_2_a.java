package paqArchivos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Scanner;

public class Ejercicio_2_a {


	public static void main(String[] args) {
		
			String url = "numeros.txt";
		
		OperacionNumDoc(url);
		
		
	}
		
		public static void OperacionNumDoc(String urlDoc) {
			File arch = null;
			FileReader fr = null;
			BufferedReader br = null;
			Scanner print = new Scanner(System.in);
			String archivoDeNum = "";
			
			try {
				arch = new File(urlDoc);
				fr = new FileReader(arch);
				br = new BufferedReader(fr);
				
				String linea = "";
				
				while((linea = br.readLine()) != null) {
					archivoDeNum = archivoDeNum + linea;
				}
				
			}catch(Exception e) {
				e.printStackTrace();
			}finally {
				try {
					if(br != null) {
						br.close();
					}
				}catch(Exception e) {
					e.printStackTrace();
				}
			}
			
			
			char multiplicacion = '*';
			char suma = '+';
			char opcion;
			
			String [] arrayDeNum = archivoDeNum.split(";");
			
			System.out.println("Los numeros del documento son: \n" +archivoDeNum);
			System.out.println("");
			
			do{
				System.out.println("Seleccione una opcion:");
				System.out.println("+ --> Sumar los numeros");
				System.out.println("* --> Multiplicar los numeros");
				opcion = print.next().charAt(0); // metodo para imprimir el siguiente el primer caracter que encuentre
				
			}while(opcion != suma && opcion != multiplicacion);
			
			print.close();
		
		if (opcion == suma) {
			int operSuma = 0;
			for(int i = 0;  i < arrayDeNum.length; i++) {
				operSuma = operSuma + Integer.parseInt(arrayDeNum[i]);
			
		}

			System.out.println("La suma de los numeros es: " + operSuma);
		
		
		}
		
		if (opcion == multiplicacion) {
			
			
			double operMulti= 0;
			
			for(int i = 0;  i < arrayDeNum.length; i++) {
				
				if(operMulti == 0) {
					operMulti = Double.parseDouble(arrayDeNum[i]);
				
				}else
					
				operMulti *= Double.parseDouble(arrayDeNum[i]);
			}
			//El primer % indica la posición  * .2 n° de decimales. * La f n° es de tipo float. * El valor a escribir se encuentra a continuación de las comillas.
			System.out.printf("La multiplicacion de los numeros es: %.2f" , operMulti); // printf para dar formato float a los datos de salida	                                           
                                 
					                                            
		}
		

		
		}
}


