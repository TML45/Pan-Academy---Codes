import java.util.Scanner;
public class Exercicio1 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int angulo1, angulo2, angulo3;
		boolean cont = true;
		while(cont == true) {
			System.out.println("Digite o primeiro angulo:");
			angulo1 = sc.nextInt();
			System.out.println("Digite o segundo angulo:");
			angulo2 = sc.nextInt();
			System.out.println("Digite o terceiro angulo:");
			angulo3 = sc.nextInt();
		
			if(angulo1 + angulo2 + angulo3 != 180) {
				System.out.println("Não é um triângulo");
			
			} else if(angulo1 == 90 || angulo2 == 90 || angulo3 == 90) {
				System.out.println("É um triângulo retângulo");		
			} else if(angulo1 > 90 || angulo2 > 90 || angulo3 > 90) {
				System.out.println("É um triângulo obtusângulo");
			} else {
				System.out.println("É um triângulo acutângulo");
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
