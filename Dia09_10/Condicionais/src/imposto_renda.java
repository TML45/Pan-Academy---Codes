import java.util.Scanner;
public class imposto_renda {
 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1, num2, num3;
		System.out.println("Escreva");
		num1 = sc.nextInt();
		System.out.println("Escreva");
		num2 = sc.nextInt();
		System.out.println("Escreva");
		num3 = sc.nextInt();
		if(num1<num2 && num1<num3) {
			System.out.println(num1 + " é o menor");
		}
		if(num2<num1 && num2<num3) {
			System.out.println(num2 + " é o menor");
		}
		if(num3<num1 && num3<num2) {
			System.out.println(num3 + " é o menor");
		}
		if(num3>num1 && num3>num2) {
			System.out.println(num3 + " é o maior");
		}
		if(num1>num3 && num1>num2) {
			System.out.println(num1 + " é o maior");
		}
		if(num2>num3 && num2>num3) {
			System.out.println(num2 + " é o maior");
		}
		sc.close();
	}
}
