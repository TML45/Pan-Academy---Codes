public class Exercicio1 {
	public static void main(String[] args) {
		int[] salaryArray = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100, 110, 120, 130, 140, 150, 160, 170, 180, 190, 200};
		int[] numChildrenArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
		
		int sumSalary = 0;
		int numPeople = 0;
		int biggestSalary = 0;
		int numSalarySmallerThan100 = 0;
		int sumChildren = 0;
		int numPeople2 = 0;
		
		for (int i : salaryArray) {
			if(i >= biggestSalary) {
				biggestSalary = i;}

			if(i <= 100) {
				numSalarySmallerThan100 = numSalarySmallerThan100 + 1 ;}
			
			sumSalary = sumSalary + i;
			numPeople +=1;
		}
		

		for (int i : numChildrenArray) {
			sumChildren = sumChildren + i;
			numPeople2 +=1;	
		}
		
		System.out.println(sumSalary/numPeople + " é a média dos salarios.");
		System.out.println(biggestSalary + " é o maior salário.");
		System.out.println(sumChildren/numPeople2 + " é o numero médio de crianças por família.");
		double perc = numSalarySmallerThan100/(double)numPeople*100;
		System.out.printf("%.0f%% é o percentual de salários menor do que R$100.", perc);
	}
}
