import java.util.Scanner;
public class aluno {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double nota1, nota2, media;
		System.out.println("Escreva");
		nota1 = sc.nextDouble();
		System.out.println("Escreva");
		nota2 = sc.nextDouble();
		media = (nota1+nota2)/2;
		if(media==10) {
			System.out.println("Aprovado com Distinção");
			System.out.printf("Sua média foi: %.2f", media);
		}else if(media >= 7)
			System.out.println("Aprovado");
		else
			System.out.println("Reprovado");
		
		sc.close();
		


	}

}
