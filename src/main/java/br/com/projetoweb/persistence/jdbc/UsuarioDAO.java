package br.com.projetoweb.persistence.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.com.projetoweb.persistence.entidade.Usuario;

public class UsuarioDAO {

	private Connection con = ConexaoFactory.getConnection();

	public void cadastrar(Usuario usu) {

		String sql = "INSERT INTO usuario (nome, login, pass) VALUES (?,?,?)";

		try (PreparedStatement preparador = con.prepareStatement(sql)) {
			preparador.setString(1, usu.getNome());
			preparador.setString(2, usu.getLogin());
			preparador.setString(3, usu.getPass());

			preparador.execute();

		} catch (SQLException e) {

			e.printStackTrace();
		}

	}

	public void alterar(Usuario usu) {

		String sql = "update usuario set nome=?, login=?, pass=? where id=?";

		try (PreparedStatement preparador = con.prepareStatement(sql)) {
			preparador.setString(1, usu.getNome());
			preparador.setString(2, usu.getLogin());
			preparador.setString(3, usu.getPass());
			preparador.setInt(4, usu.getId());

			preparador.execute();

		} catch (SQLException e) {

			e.printStackTrace();
		}

	}

	public void deletar(Usuario usu) {

		String sql = "delete from usuario where login=? and id=?";

		try (PreparedStatement preparador = con.prepareStatement(sql)) {
			preparador.setString(1, usu.getLogin());
			preparador.setInt(2, usu.getId());

			preparador.execute();

		} catch (SQLException e) {

			e.printStackTrace();
		}
		
	}

}
