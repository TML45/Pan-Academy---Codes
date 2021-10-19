
public class Aluno1Teste {
	
	public static void main(String[] args) {
		
		Aluno1 Joao = new Aluno1();
		double[] notas = {10, 5.0, 7.0, 9.0, 10.0};
		Joao.nome = "João";
		Joao.setAprovado(notas);
		Joao.setMaiorNota(notas);
		
		Aluno1 Maria = new Aluno1();
		double[] notas1 = {9, 5.0, 6, 9.0, 3.0};
		Maria.nome = "Maria";
		Maria.setAprovado(notas1);
		Maria.setMaiorNota(notas1);
		
		System.out.println(Joao.nome);
		Joao.getAprovado();
		System.out.println("A maior nota é " + Joao.getMaiorNota());
		System.out.println("A média é " + Joao.getMedia());
		
		System.out.println(Maria.nome);
		Maria.getAprovado();
		System.out.println("A maior nota é " + Maria.getMaiorNota());
		System.out.println("A média é " + Maria.getMedia());
	}

}
