
public class Fatura implements Pagamento {
	
	private final String partNumero;
	private final String partDescricao;
	private int quantidade;
	private double precoPorItem;
	
	
	public Fatura(String partNumero, String partDescricao, int quantidade, double precoPorItem) {
		super();
		
		if(quantidade < 0) {
			
			throw new IllegalArgumentException("Quantidade deve ser >= 0");
			
		}
		
		if(precoPorItem < 0) {
			
			throw new IllegalArgumentException("Preço precisa ser >= 0");
			
		}
		
		this.partNumero = partNumero;
		this.partDescricao = partDescricao;
		this.quantidade = quantidade;
		this.precoPorItem = precoPorItem;
	}


	public int getQuantidade() {
		return quantidade;
	}


	public void setQuantidade(int quantidade) {
		
		if(quantidade < 0) {
			
			throw new IllegalArgumentException("Quantidade deve ser >= 0");
			
		}
		
		this.quantidade = quantidade;
	}


	public double getPrecoPorItem() {
		return precoPorItem;
	}


	public void setPrecoPorItem(double precoPorItem) {
		
		if(precoPorItem < 0) {
			
			throw new IllegalArgumentException("Preço precisa ser >= 0");
			
		}
		
		this.precoPorItem = precoPorItem;
	}


	public String getPartNumero() {
		return partNumero;
	}


	public String getPartDescricao() {
		return partDescricao;
	}


	@Override
	public double calculaQuantiaPagamento() {
		
		return getQuantidade() * getPrecoPorItem();
		
	}
	
	@Override
	public String toString() {
		
		return String.format("%s: %n%s: %s (%s) %n%s: %d%n%s: %,.2f", "fatura", "número da peça", getPartNumero(), getPartDescricao(), "quantidade",
				getQuantidade(), "preço por item", getPrecoPorItem());
		
	}
	
	
	
	
	
	
}
