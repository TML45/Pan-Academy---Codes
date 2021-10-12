import java.util.Scanner;
public class Exercicio2 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int lados;
		boolean cont = true;
		while(cont == true) {
			System.out.println("Digite o número de lados:");
			lados = sc.nextInt();
			
			if(lados < 3) {
				System.out.println("NÃO É UM POLÍGONO.");
			} else if(lados > 5) {
				System.out.println("POLÍGONO NÃO IDENTIFICADO, Pesquisa no Google");				
			}else if(lados == 3) {
				System.out.println("É um triângulo");				
			}
			else if(lados == 4) {
				System.out.println("É um Quadrado");				
			}
			else if(lados == 5) {
				System.out.println("É um Pentagono");				
			}
			System.out.println("Quer continuar? Y/N");
			char conti = sc.next().charAt(0);
			if(conti == 'Y' || conti == 'y') {
				cont = true;
			}else { 
				cont = false;
			}
		} 
	}	

}
