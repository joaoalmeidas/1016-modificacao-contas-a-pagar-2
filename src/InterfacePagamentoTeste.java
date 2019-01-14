
public class InterfacePagamentoTeste {

	public static void main(String[] args) {
		
		Pagamento[] pagamentos = new Pagamento[6];
		
		pagamentos[0] = new Fatura("01234", "banco", 2, 75.3);
		pagamentos[1] = new Fatura("56789", "pneu", 5, 43.3);
		pagamentos[2] = new FuncionarioAssalariado("João", "Almeida", "12546566812", 2124);
		pagamentos[3] = new FuncionarioHorario("Maria", "Almeida", "12524566812", 40, 50);
		pagamentos[4] = new FuncionarioComissionado("Pedro", "Geromel", "12524566812", 90000, 0.5);
		pagamentos[5] = new FuncionarioBaseMaisComissao("Walter", "Kannemann", "12524566812", 100000, 0.1, 5000);
		
		System.out.printf("%nPagamentos das faturas e dos funcionários processados polimorficamente.");
		
		for(Pagamento pagamentoAtual: pagamentos) {
			
			System.out.printf("%n%s %n%s: $%,.2f%n", pagamentoAtual.toString(), "valor a pagar", pagamentoAtual.calculaQuantiaPagamento());
			
		}
		
		for(Pagamento pagamentoAtual: pagamentos) {
			
			if(pagamentoAtual instanceof FuncionarioBaseMaisComissao) {
				
				FuncionarioBaseMaisComissao funbase = (FuncionarioBaseMaisComissao) pagamentoAtual;
				
				funbase.setSalarioBase(funbase.getSalarioBase() + funbase.getSalarioBase() * 0.1);
				
				System.out.println("Aumento de 10% no salário de funcionários do tipo "+funbase.getClass().getName());
				
				System.out.printf("%n%s %n%s: $%,.2f%n", funbase.toString(), "valor a pagar", funbase.calculaQuantiaPagamento());
				
			}
			
			
			
		}

	}

}
