package Cliente;

public class Endereco {
	private String logradouro;
	private String cidade;
	private String numero;
	
	public Endereco(String logradouro, String cidade, String numero) {
		this.logradouro = logradouro;
		this.cidade = cidade;
		this.numero = numero;
	}
	
	public Endereco(){
		
	}

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}
	
	public String toString() {
		return "Endereco [logradouro=" + logradouro + ", cidade=" + cidade + ", numero=" + numero + "]";
	}
	
	
}
