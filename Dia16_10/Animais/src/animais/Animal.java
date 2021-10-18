package animais;

public abstract class Animal {

	private String comunicar;
	private String movimentar;

	public Animal() {
	}
	
	public String getComunicar() {
		return comunicar;
	}

	public void setComunicar(String comunicar) {
		this.comunicar = comunicar;
	}

	public String getMovimentar() {
		return movimentar;
	}

	public void setMovimentar(String movimentar) {
		this.movimentar = movimentar;
	}
}
