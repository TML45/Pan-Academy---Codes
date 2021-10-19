
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
	
	public void setAprovado(double media) {
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
	
	public double getMedia() {
		return media;
	}
	public void setMedia(double media) {
		this.media = media;		
	}

}
