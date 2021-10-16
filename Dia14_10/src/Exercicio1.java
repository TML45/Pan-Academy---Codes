import java.util.Scanner;

public class Exercicio1 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner entrada = new Scanner(System.in);
		int quantidadeNotas = 0;
		double nota = 0;
		double total = 0;
		
		while(nota != -1) {
			System.out.println("Digite a proxima nota: ");
			nota = entrada.nextDouble();
			
			if(nota >= 0 && nota<= 10) {
				quantidadeNotas += 1;
				total += nota;
			}else if(nota == -1) {
				double media = total / (double)quantidadeNotas;
				System.out.println("Quantidades de notas totais "+ quantidadeNotas);
				System.out.printf("%.2f é a media das notas.", media);
				
			}else {
				System.out.println("Nota inválida");}
	}
}
}