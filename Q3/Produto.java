package avFinal.Q3;

public class Produto implements Comparable<Produto>{
	protected String marca;
	protected double preco;
	
	public Produto(String marca, double preco) {
		this.marca = marca;
		this.preco = preco;
	}
	
	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	
	@Override
	public int compareTo(Produto outroProduto) {
		if (this.preco > outroProduto.getPreco()) { 
			  return -1; 
			  } if (this.preco < outroProduto.getPreco()) { 
			  return 1; 
			  } 
		return 0;
	}

	

}
