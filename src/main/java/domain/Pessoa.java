package domain;

public class Pessoa {

	private Integer id;
	private String nome;
	private String apelido;
	
	public Pessoa() {

	}
	
	public Pessoa(Integer id, String nome, String apelido) {
		super();
		this.id = id;
		this.nome = nome;
		this.apelido = apelido;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getApelido() {
		return apelido;
	}

	public void setApelido(String apelido) {
		this.apelido = apelido;
	}
	
	
}
