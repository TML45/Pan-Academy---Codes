import java.util.Scanner;
public class Exercicio3 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int lado1, lado2, lado3;
		boolean cont = true;
		while(cont == true) {
			System.out.println("Digite o tamanho do primeiro lado:");
			lado1 = sc.nextInt();
			System.out.println("Digite o tamanho do segundo lado:");
			lado2 = sc.nextInt();
			System.out.println("Digite o tamanho do terceiro lado:");
			lado3 = sc.nextInt();
			
			if(lado1 == lado2 && lado2 == lado1) {
				System.out.println("É um triângulo Equilátero");		
			} else if(lado1 == lado2 || lado2 == lado3 || lado1 == lado3) {
				System.out.println("É um triângulo Isósceles");		
			} else {
				System.out.println("É um triângulo Escaleno");		
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
