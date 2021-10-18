package heranca_new;

public class ProfissionalTIGestao extends ProfissionalTI {
	
	@Override
	public double bonusSalario() {
		return this.getSalario() * 0.50;
	}

}
