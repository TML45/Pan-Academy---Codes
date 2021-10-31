package tabuada;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int op = 0;
		Scanner sc = new Scanner(System.in);
		
		char continuar;
		do {
			try {
				System.out.println("Forneça o valor da tabuada");
				op = sc.nextInt();
				for(int i = 1; i < 11; i++) {
					System.out.println(i + " x " + op + " = " + op*i);
				}			
			} catch (InputMismatchException e) {
				System.out.println("Por favor, forneça somente números.");
				//e.printStackTrace();
				sc.nextLine();
			}finally {
			      System.out.println("Quer continuar? S/N");
			      continuar = sc.next().charAt(0);
		    }
		}while(continuar == 'S' || continuar == 's');
	}
}
