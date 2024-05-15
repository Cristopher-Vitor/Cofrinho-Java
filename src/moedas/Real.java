package moedas;

public class Real extends Moeda {

	public Real(double valor) {
		super(valor);
	}

	@Override
	public void info() {
		System.out.println("Real - " + getValor());
	}

	@Override
	public double converter() {
		return this.getValor();
	}

	@Override
	public boolean equals(Object moeda) {
		if(this.getClass() != moeda.getClass()) {
			return false;
		}
		
		else if(this.getValor() != ((Real) moeda).getValor()) {
			return false;
		}
		
		else {
			return true;
		}
	}
	
}
