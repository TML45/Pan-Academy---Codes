import java.util.Scanner;
public class Exercicio4 {
	public static void main(String[] args){
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int numMacas;
		boolean cont = true;
		while(cont == true) {
			System.out.println("Quantas maçãs comprou?");
			numMacas = sc.nextInt();
			if(numMacas >= 12) {
				System.out.println("Valor total da compra é:" + 0.25*numMacas);
			}else {
				System.out.println("Valor total da compra é:" + 0.3*numMacas);
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
