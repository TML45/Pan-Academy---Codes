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
			System.out.println("Digite o sal�rio:");
			salary = sc.nextInt();
			if(salary >= biggestSalary) {
				biggestSalary = salary;}

			if(salary <= 100) {
				numSalarySmallerThan100 = numSalarySmallerThan100 + 1 ;}
			
			sumSalary = sumSalary + salary;
			numPeople +=1;
		}
		

		for (int i = 0; i< 2; ++i) {
			System.out.println("Digite o n�mero de filhos:");
			numChildren = sc.nextInt();
			sumChildren = sumChildren + numChildren;
			numPeople2 +=1;	
		}
		
		System.out.println(sumSalary/numPeople + " � a m�dia dos salarios.");
		System.out.println(biggestSalary + " � o maior sal�rio.");
		System.out.println(sumChildren/numPeople2 + " � o numero m�dio de crian�as por fam�lia.");
		double perc = numSalarySmallerThan100/(double)numPeople*100;
		System.out.printf("%.0f%% � o percentual de sal�rios menor do que R$100.", perc);
	}
}