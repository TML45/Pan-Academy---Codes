
public class AlunoTeste {
	
	public static void main(String[] args) {
		
		Aluno Joao = new Aluno();
		double[] notas = {10, 5.0, 7.0, 9.0, 10.0};
		double soma = 0;
		double media;
		for (double i : notas) {
			soma += i;}
		media = soma /notas.length;
		Joao.nome = "João";
		Joao.setAprovado(media);
		Joao.setMaiorNota(notas);
		
		System.out.println(Joao.nome);
		Joao.getAprovado();
		System.out.println("A maior nota é " + Joao.getMaiorNota());
		System.out.println("A média é " + Joao.getMedia());
	}

}
