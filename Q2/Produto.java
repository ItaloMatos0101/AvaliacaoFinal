package avFinal.Q2;

public abstract class Produto implements IEletronico {
	protected boolean ligar = false;
	protected String marca;
	
	public Produto(String marca) {this.marca = marca;}
	
	public abstract void ligar();
	public abstract void desligar();
	
	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	public boolean getLigar() {
		return this.ligar;
	}
	
	public void setLigar(boolean ligar) { 
		this.ligar = ligar;
	}
}
