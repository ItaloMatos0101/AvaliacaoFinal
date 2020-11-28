package avFinal.Q1;
//Classe Aluno que é uma subclasse de Pessoa
public class Aluno extends Pessoa{
	//Variavel private e conterá métodos getters e setters
	private long matricula;
	
	//Construtor para Aluno
	public Aluno(String nome, long matricula) {
		//Ira preencher o construtor ja imposto na superclasse
		super(nome);
		this.matricula = matricula;
	}
	//Getters
	public long getMatricula() {
		return matricula;
	}
	//Setters
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	
	@Override
	public void meuNome() {
		System.out.println("Aluno: "+this.nome+ "\nMatrícula: "+this.matricula);
	}
}
