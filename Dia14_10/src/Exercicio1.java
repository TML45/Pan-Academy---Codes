import java.util.Scanner;

public class Exercicio1 {
	Scanner entrada = new Scanner(System.in);
	int quantidadeNotas = 0;
	double nota = 0.0;
	double total;
	
	while(nota != -1) {
		System.out.println("Digite a proxima nota: ");
		nota = entrada.nextDouble();
		
		if(nota >= 0 && nota<= 10) {
			quantidadeNotas += 1;
			total += nota;
		}else if(nota == -1) {
			double media = total / quantidades;
			System.out.println("Quantidades de notas totais");
			
		}else {
			System.out.println("Nota inválida");
		}
	}

}
