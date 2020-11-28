package avFinal.Q1;
import java.util.ArrayList;

public class SaladeAula{
	private Professor prof;
	private ArrayList<Aluno> alunos = new ArrayList<Aluno>();
	private int id;
	
	public SaladeAula(Professor prof) {
		this.prof = prof;
	}

	public Professor getProf() {
		return prof;
	}

	public void setProf(Professor prof) {
		this.prof = prof;
	}

	public ArrayList<Aluno> getAlunos() {
		return alunos;
	}

	public void setAlunos(ArrayList<Aluno> alunos) {
		this.alunos = alunos;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public void entraSala(Aluno aluno) {
		alunos.add(aluno);
	}
	
}
