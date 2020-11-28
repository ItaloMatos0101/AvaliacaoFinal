package avFinal.Q1;

//importanto o ArrayList
import java.util.ArrayList;

public class Escola {
	//Instanciado uma lista
	private ArrayList<SaladeAula> salas = new ArrayList<SaladeAula>();
	private int id = 0;
	
	//Getters
	public ArrayList<SaladeAula> getSalas() {
		return salas;
	}
	
	//Setters
	public void setSalas(ArrayList<SaladeAula> salas) {
		this.salas = salas;
	}
	
	//Fará um foreach para percorrer a lista e implementara matricula++ a cada aluno q entrará na escola
	public void entraEscola(int id, Pessoa pessoa) {
		for (SaladeAula sala : salas){
			if(sala.getId()==id) {
				Aluno aluno = (Aluno) pessoa;
				aluno.setMatricula(++this.id);
				sala.entraSala(aluno);
			}
		}
	}
}
