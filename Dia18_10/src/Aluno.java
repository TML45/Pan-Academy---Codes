
public class Aluno {
	public String nome;
	double media;
	double maiorNota;
	
	public Aluno() {
		
	}
	
	public void getAprovado() {
		if(media>7) {
			System.out.println("Aprovado");
		}else {
			System.out.println("Reprovado");
		}
	}
	
	public void setAprovado(double[] notas) {
		double soma = 0;
		double media;
		for (double i : notas) {
			soma += i;}
		media = soma /notas.length;
		this.media = media;
	}
	
	public double getMaiorNota() {
		return maiorNota;
	}
	
	public void setMaiorNota(double[] notas) {
		double maior = notas[0];
		for (double i : notas) {
			if(i > maior) {
				maior = i;
			}
		this.maiorNota = maior;
		}
	}

}
