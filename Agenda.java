
public class Agenda {
	private String nome;
	private long telefone;
	
	public Agenda(String nome, long telefone) {
		super();
		this.nome = nome;
		this.telefone = telefone;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public long getTel() {
		return telefone;
	}

	public void setTel(long telefone) {
		this.telefone = telefone;
	}
}
