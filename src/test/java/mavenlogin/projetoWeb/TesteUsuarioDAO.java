package mavenlogin.projetoWeb;

import br.com.projetoweb.persistence.entidade.Usuario;
import br.com.projetoweb.persistence.jdbc.UsuarioDAO;

public class TesteUsuarioDAO {

	public static void main(String[] args) {
		testDelete();

	}

	public static void testDelete() {

		Usuario usu = new Usuario();
		usu.setId(1);
		usu.setNome("Joãod223");
		usu.setLogin("joaoosss");
		usu.setPass("123sss");

		// cadastrando no banco de dados
		UsuarioDAO usuDAO = new UsuarioDAO();
		usuDAO.deletar(usu);

		System.out.println("Deletado com sucesso");

	}

	public static void testAlterar() {
		// criando usuário
		Usuario usu = new Usuario();
		usu.setId(1);
		usu.setNome("Joãod223");
		usu.setLogin("joaoosss");
		usu.setPass("123sss");

		// cadastrando no banco de dados
		UsuarioDAO usuDAO = new UsuarioDAO();
		usuDAO.alterar(usu);

		System.out.println("Alterado com sucesso");
	}

	public static void testCadastrar() {
		// criando usuário
		Usuario usu = new Usuario();
		usu.setNome("Joãod");
		usu.setLogin("joaoo");
		usu.setPass("123");

		// cadastrando no banco de dados
		UsuarioDAO usuDAO = new UsuarioDAO();
		usuDAO.cadastrar(usu);

		System.out.println("Cadastro com sucesso");
	}

}
