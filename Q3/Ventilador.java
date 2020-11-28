package avFinal.Q3;

public final class Ventilador extends Produto {
	private boolean ligar;
	
	public Ventilador(String marca, double preco) {
		super(marca,preco);
	}
	
	public void ligar() {
		if(!this.ligar) {
			this.ligar = true;
			System.out.println("Ligado...");
		}
	}
	
	public void desligar() {
		if(this.ligar) {
			this.ligar = false;
			System.out.println("Desligado...");
		}
	}
	
}
