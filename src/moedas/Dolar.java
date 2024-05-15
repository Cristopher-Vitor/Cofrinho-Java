package moedas;

public class Dolar extends Moeda{

	public Dolar(double valor) {
		super(valor);
		
	}

	@Override
	public void info() {
		System.out.println("Dolar - " + getValor());
	}

	@Override
	public double converter() {
		return this.getValor() * 5.14;
	}

	@Override
	public boolean equals(Object moeda) {
		if(this.getClass() != moeda.getClass()) {
			return false;
		}
		
		else if(this.getValor() != ((Dolar) moeda).getValor()) {
			return false;
		}
		
		else {
			return true;
		}
	}

}
