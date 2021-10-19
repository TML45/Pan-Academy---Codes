
public class Exercicio1 {
	public static void main(String[] args) {
		int[] array = { 87, 68, 94, 100, 83, 78, 85, 91, 76, 87 };
		int soma = 0;
		double media;
		int maior = array[0];
		int menor = array[0];
		
		for (int i : array) {
			soma = soma + i;
			if(i > maior) {
				maior = i;
			}
			if(i < menor) {
				menor = i;
			}
		}
		media = soma/(double)array.length;
		System.out.printf("A soma de todos os numeros é %d%n", soma);
		System.out.printf("A média dos numeros do array é %.2f%n", media);
		System.out.printf("O maior valor é %d%n", maior);
		System.out.printf("O menor valor é %d%n", menor);
	}

}
