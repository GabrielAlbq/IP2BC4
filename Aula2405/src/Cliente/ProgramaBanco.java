package Cliente;

public class ProgramaBanco {
	
	public static void main(String[] args){
		Endereco enderecoA = new Endereco("Rua A", "Recife", "01-A");
		Endereco enderecoB = new Endereco("Rua B", "Olinda", "02-B");
		
		Cliente mauricio = new Cliente("12345","Mauricio Campos",enderecoA);
		
		Cliente alfredo = new Cliente("67890","Alfredo Silva",enderecoB);
		Cliente camila = new Cliente("89620","Camila",enderecoB);
		
		Cliente[] clientes01 = {mauricio};
		Cliente[] clientes02 = {alfredo, camila};
		System.out.println("Cidade de Camila: " + camila.getEndereco().getCidade());
		
		
		Conta conta01 = new Conta("001",1000);
		conta01.setClientes(clientes01);
		Conta conta02 = new Conta("002",2000);
		conta02.setClientes(clientes02);
		
		Conta[] contas = new Conta[2];
		contas[0] = conta01;
		contas[1] = conta02;
	}
}
