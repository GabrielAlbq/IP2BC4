package Cliente;
public class Conta {
	
	//ATRIBUTOS
	private String numero;
	private double saldo;
	private Cliente[] clientes;
	
	//CONSTRUTORES
	public Conta(String numero,double saldo)
	{
		this.numero = numero;
		this.saldo = saldo;
	}
	public Conta(){
		
	}
	
	//METODOS GET E SET
	
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public Double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public Cliente[] getClientes() {
		return clientes;
	}
	public void setClientes(Cliente[] clientes) {
		this.clientes = clientes;
	}
	//FUNCOES
	public void Creditar(double saldo){
		this.saldo += saldo;
	}
	public void Debitar(double saldo){
		this.saldo -= saldo;
	}
	
	//EQUALS
	public boolean equals(Conta contaRecebida) {
		if (this == contaRecebida)
			return true;
		if (contaRecebida == null)
			return false;
		if (getClass() != contaRecebida.getClass())
			return false;
		return false;
	}
	
	public String toString() {
		return "Conta [numero=" + this.numero + ", saldo=" + this.saldo + "]";
	}
	
	
}
