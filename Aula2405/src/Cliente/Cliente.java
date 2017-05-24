package Cliente;

public class Cliente {
	
	//ATRIBUTOS
	private String cpf;
	private String nome;
	private Endereco endereco;
	
	//CONSTRUTORES
	public Cliente(){
		
	}
	
	public Cliente(String cpf,String nome){
		this.cpf = cpf;
		this.nome = nome;
	}
	
	public Cliente(String cpf,String nome,Endereco endereco){
		this(cpf, nome);
		this.endereco = endereco;
	}
	
	
	//METODOS GET/SET
	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public boolean equals(Cliente cliente){
		return cliente != null && cliente.cpf != null && cliente.cpf.equals(this.cpf);
	}
	public String toString(){
		return "Cleinte [cpf: " + this.cpf + "; nome: " + this.nome + "]";
	}
	
}
