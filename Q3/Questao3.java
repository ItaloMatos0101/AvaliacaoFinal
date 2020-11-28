package avFinal.Q3;

public class Questao3 {
	public static void main(String[] args) {
		ListadeCompras lista = ListadeCompras.getLista();
		lista.addLista(new Ventilador("Ventilar",120));
		lista.addLista(new Celular("Samsung",800));
		
		lista.ordemPreco();
		lista.exibeLista();
	}
}
