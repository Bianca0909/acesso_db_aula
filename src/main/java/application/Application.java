package application;

import dao.PessoaDao;
import domain.Pessoa;

public class Application {

	public static void main(String[] args) {
		
		Pessoa p = new Pessoa();
		p.setNome("João");
		p.setApelido("Joaozinho");
		
		PessoaDao pessoadao = new PessoaDao();
		pessoadao.inserir(p);

	}

}
