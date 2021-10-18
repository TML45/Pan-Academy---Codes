package poo;

public class Carro implements Controlador {
	
	private String Cor;
	private boolean ligado;
	private String marca;
	private String placa;
	private int ano;
	private int velocidade;
	
	
	
	public Carro(String, boolean, String, String, int, int) {
		String Cor = Cor;
		boolean ligado = ligado;
		String marca = marca;
		String placa = placa;
		int ano = ano;
		int velocidade = velocidade;
		
	} 
			
	public String getCor() {
		return Cor;
	}

	public void setCor(String cor) {
		Cor = cor;
	}

	public boolean isLigado() {
		return ligado;
	}

	public void setLigado(boolean ligado) {
		this.ligado = ligado;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public int getVelocidade() {
		return velocidade;
	}

	public void setVelocidade(int velocidade) {
		this.velocidade = velocidade;
	}

	public void getvelocidade() {
		return velocidade;
	}
	public void setvelocidade(int velocidade) {
		this.velocidade = velocidade;
	}
	public String getPlaca() {
		return placa;
	}
	
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	@Override
	public void acelerar() {
		System.out.println("Aumentando a velocidade em 5Km/h");
		this.velocidade = getVelocidade() + 5; 
	}
	
	
}
