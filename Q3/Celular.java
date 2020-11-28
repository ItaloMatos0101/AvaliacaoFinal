package avFinal.Q3;

public final class Celular extends Produto {
	private boolean ligar;
	
	public Celular(String marca,double preco) {
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
