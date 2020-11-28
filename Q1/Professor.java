package avFinal.Q1;

public class Professor extends Pessoa{
	private String registro;
	
	public Professor(String nome, String reg) {
		super(nome);
		this.registro = reg;
	}
	
	public String getRegistro() {
		return registro;
	}

	public void setRegistro(String registro) {
		this.registro = registro;
	}
	
	@Override
	public void meuNome() {
		System.out.println("Professor: "+this.nome+ "\nRegistro: "+this.registro);
	}
}
