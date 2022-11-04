package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import config.ConfigConexao;
import domain.Pessoa;

public class PessoaDao {

	private String sqlInsert = "INSERT INTO PESSOA(nome, apelido) values(?, ?)";

	public void inserir(Pessoa p) {
		try {
			Connection connection = ConfigConexao.getConexao(); // Chama conexão com o database
			PreparedStatement preparedStatement = connection.prepareStatement(sqlInsert); // chama o comando
			
			preparedStatement.setString(1, p.getNome()); // Seta os dados
			preparedStatement.setString(2, p.getApelido());
			preparedStatement.execute(); // Executa o sql
			
		} catch (Exception e) {
			System.err.print(e.getMessage()); // Mensagem de erro caso o Try der errado
		}
	}
}
