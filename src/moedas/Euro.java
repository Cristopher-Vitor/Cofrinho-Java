package moedas;

public class Euro extends Moeda {

	public Euro(double valor) {
		super(valor);
	}

	@Override
	public void info() {
		System.out.println("Euro - " + getValor());
	}

	@Override
	public double converter() {
		return this.getValor() * 5.59;
	}

	@Override
	public boolean equals(Object moeda) {
		if(this.getClass() != moeda.getClass()) {
			return false;
		}
		
		else if(this.getValor() != ((Euro) moeda).getValor()) {
			return false;
		}
		
		else {
			return true;
		}
	}

}
