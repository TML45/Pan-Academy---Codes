import java.util.Scanner;
public class Exercicio1_modificado {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int salary, numChildren;
		
		int sumSalary = 0;
		int numPeople = 0;
		int biggestSalary = 0;
		int numSalarySmallerThan100 = 0;
		int sumChildren = 0;
		int numPeople2 = 0;
		
		for (int i = 0; i< 2; ++i) {
			System.out.println("Digite o salário:");
			salary = sc.nextInt();
			if(salary >= biggestSalary) {
				biggestSalary = salary;}

			if(salary <= 100) {
				numSalarySmallerThan100 = numSalarySmallerThan100 + 1 ;}
			
			sumSalary = sumSalary + salary;
			numPeople +=1;
		}
		

		for (int i = 0; i< 2; ++i) {
			System.out.println("Digite o número de filhos:");
			numChildren = sc.nextInt();
			sumChildren = sumChildren + numChildren;
			numPeople2 +=1;	
		}
		
		System.out.println(sumSalary/numPeople + " é a média dos salarios.");
		System.out.println(biggestSalary + " é o maior salário.");
		System.out.println(sumChildren/numPeople2 + " é o numero médio de crianças por família.");
		double perc = numSalarySmallerThan100/(double)numPeople*100;
		System.out.printf("%.0f%% é o percentual de salários menor do que R$100.", perc);
	}
}