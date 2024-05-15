	package moedas;

public abstract class Moeda {

	private double valor;

	public Moeda(double valor) {
		this.valor = valor;
	}

	public double getValor() {
		return valor;
	}
	
	public abstract void info();
	
	public abstract double converter();
	
	public abstract boolean equals(Object moeda);
}
