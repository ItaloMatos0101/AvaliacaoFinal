package avFinal.Q2;

public class Ventilador extends Produto{
	
	private Helice helice;

	public Ventilador(String marca) {
		super(marca);
		helice = new Helice("Italachi");
	}
	
	public void ligar() {
		if(!this.ligar) {
			this.ligar = true;
			System.out.println(this.marca+" Ligado...");
		}
	}
	
	public void desligar() {
		if(this.ligar) {
			this.ligar = false;
			System.out.println(this.marca+" Desligado...");
		}
	}
	
	class Helice extends Produto{
		public Helice(String marca) {
			super(marca);
		}
		
		public void ligar() {}
		
		public void desligar() {}
	}
}
