
public class AlunoTeste {
	
	public static void main(String[] args) {
		
		Aluno Joao = new Aluno();
		double[] notas = {10, 5.0, 7.0, 9.0, 0.0};
		Joao.nome = "João";
		Joao.setAprovado(notas);
		Joao.setMaiorNota(notas);
		
		System.out.println(Joao.nome);
		Joao.getAprovado();
		System.out.println(Joao.getMaiorNota());
	}

}
