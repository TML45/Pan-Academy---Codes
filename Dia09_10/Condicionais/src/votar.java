import java.util.Scanner;
public class votar {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int ano;
		System.out.println("Escreva");
		ano = sc.nextInt();
		if (2021 - ano >= 18)
			System.out.println("Voc� pode votar");
		else
			System.out.println("Voc� n�o pode votar");
		sc.close();


	}

}
