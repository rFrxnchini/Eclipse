package pack1;

public class pessoa {
	private String nome;
	private String idade;
	private String genero;
	
	public pessoa() {
		this.nome = "";
		this.idade= "";
		this.genero = "";
	}
	
	public pessoa(String nome, String idade, String genero) {
		this.nome = nome;
		this.idade = idade;
		this.genero = genero;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getidade() {
		return idade;
	}

	public void setidade(String idade) {
		this.idade = idade;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}


	@Override
	public String toString() {
		return "pessoa [nome=" + nome + ", idade=" + idade + ", genero=" + genero + "]";
	}	
}
