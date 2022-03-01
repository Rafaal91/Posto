
public class Clientes {
	
	public static void main(String[] args) {
		
	Combustivel joaozinho = new Combustivel();
	joaozinho.gorjeta = true;
	
	joaozinho.abastecerDiesel(2);
	joaozinho.limparVidro(1);
	
	System.out.println(joaozinho.debito);

	
	Combustivel rita = new Combustivel();
	rita.abastecerGasolina(3);
	
	System.out.println(rita.debito);
	
	Combustivel ricardo = new Combustivel();
	ricardo.abastecerEtanol(5);
	System.out.println(ricardo.debito);

	}

}
