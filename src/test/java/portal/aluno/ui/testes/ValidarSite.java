package portal.aluno.ui.testes;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import portal.aluno.ui.config.Navegadores;
import portal.aluno.ui.elementos.Elementos;
import portal.aluno.ui.metodos.MetodosTestes;

public class ValidarSite {

	MetodosTestes metodo = new MetodosTestes();
	Elementos el = new Elementos();

	@BeforeEach
	public void setup() {
		Navegadores.IniciarTeste();

	}

	@AfterEach
	public void tearDown() {
		// Navegadores.finalizarTeste();

	}

	@Test
	public void testTtitle() {
		metodo.validarTitle("Plataforma do ALuno - E2E Treinamentos");

	}

	@Test
	public void testTitulo() {
		metodo.validarTexto(el.getTituloPrincipal(), "Plataforma do ALuno - E2E Treinamentos");

	}

	@Test
	public void loginComSucesso() {
		metodo.escrever(el.getUsuario(), "e2etreinamentos");
		metodo.escrever(el.getSenha(), "e2e@123");
		metodo.clicar(el.getBtnLogin());
		String logado = "Bem vindo a plataforma do Aluno E2E Treinamentos!";
		metodo.validarTexto(el.getTituloLogado(), logado);
	}
	
	@Test
	void usuarioBranco() {
		metodo.escrever(el.getUsuario(), "e2etreinamentos");
		metodo.escrever(el.getSenha(), "e2e@123");
		metodo.validarAlert("Usuário e senha são obrigatórios");
		
	}

	void senhaBranco() {
		metodo.escrever(el.getUsuario(), "e2etreinamentos");
		metodo.clicar(el.getBtnLogin());
		metodo.validarAlert("Usuário e senha são obrigatórios");
		
	}
	
	void usuarioInvalido() {
		metodo.escrever(el.getUsuario(), "errado");
		metodo.escrever(el.getSenha(), "e2e@123");
		metodo.validarAlert("Usuário ou senha são obrigatórios");
		
	}
	
	void senhaInvalida() {
		metodo.escrever(el.getUsuario(), "errado");
		metodo.escrever(el.getSenha(), "e2e@123");
		metodo.validarAlert("Usuário ou senha são obrigatórios");
		
	}
}

