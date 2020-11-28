package avFinal.Q3;

import java.util.ArrayList;
import java.util.Collections;

public class ListadeCompras {
	private static final ListadeCompras LISTA = new ListadeCompras();
	public static ListadeCompras getLista() {
		return LISTA;
		}
	ArrayList<Produto> produtos = new ArrayList<Produto>();
	
	public void addLista(Produto produto) {
		produtos.add(produto);
		//Depois daqui ordenar lista e depois volta para lista
	}
	
	
	public void ordemPreco() {
		Collections.sort (produtos);
	}
	
	public void exibeLista() {
		for (Produto produto : produtos) {
			System.out.println("Marca: "+produto.getMarca()+"  Preço: "+produto.getPreco());
		}
	}
}
