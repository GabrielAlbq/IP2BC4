
public class Array {
	

	public static void main(String[] args) {
		
		double total = 0;
		Conta[] contas = new Conta[10];
		String numero = null;
		double saldo = 0;
		for(int i = 0; i < contas.length ; i++){
			numero =""+i;
			saldo = i*100;
			contas[i] = new Conta(numero, saldo);
			//System.out.println(contas[i]);
		}
		for(Conta c : contas){
			c.Creditar(10);
			total += c.getSaldo();
			System.out.println(c);
		}
		System.out.println(total);
	}

}
