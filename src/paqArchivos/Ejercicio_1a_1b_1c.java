package paqArchivos;

import java.util.Scanner;

public class Ejercicio_1a_1b_1c {

	public static void main(String[] args) {
		
			int num1=15;
			int num2=22;
			int num3=3;
			char orden='d';
			
			if (num1 == 0 && num2 == 0 && num3 == 0 ) {
				
				Scanner scan = new Scanner(System.in);
				System.out.print("Ingrese 3 numeros enteros, para finalizar Enter: ");
				num1 = scan.nextInt();
				num2 = scan.nextInt();
				num3 = scan.nextInt();
				System.out.print("Ingrese a: ascendente o d: descendente ");
				String ordenString = scan.next();
				ordenString.charAt(0);
				orden= ordenString.charAt(0);
				
				int[] resultado = ordenar(num1,num2,num3,orden);
				System.out.println(" ");
				System.out.println(String.valueOf(resultado[0])+" "+ String.valueOf(resultado[1])+" "+String.valueOf(resultado[2]));
				scan.close();
				
			}else {
				
				ordenar(num1,num2,num3,orden);
					int[] resultado = ordenar(num1,num2,num3, orden);
					System.out.println(String.valueOf(resultado[0])+" "+ String.valueOf(resultado[1])+" "+String.valueOf(resultado[2]));
			}	
		}
		
		public static int[] ordenar(int num1, int num2, int num3, char orden) {
			int[] numOrdenados = new int[3];
			numOrdenados[0] = num1;
			numOrdenados[1] = num2;
			numOrdenados[2] = num3;
			
			if(orden == 'd') {
				for(int i = 0; i < numOrdenados.length ; i++) {
					for(int j = i + 1; j < numOrdenados.length ; j++) {
						if(numOrdenados[i] < numOrdenados[j]) {
							int auxiliar = numOrdenados[i];
							numOrdenados[i] = numOrdenados[j];
							numOrdenados[j] = auxiliar;
						}
					}
				}
			}
		if(orden == 'a') {
			for(int i = 0; i < numOrdenados.length ; i++) {
				for(int j = i + 1; j < numOrdenados.length ; j++) {
					if(numOrdenados[i] > numOrdenados[j]) {
						int auxiliar = numOrdenados[i];
						numOrdenados[i] = numOrdenados[j];
						numOrdenados[j] = auxiliar;
						}
					}
				}
			}
			return numOrdenados;
	}

	}


