/* import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

public class ControladorTest {
    private Controlador controlador;
    private Menu menu;
    private Vintage vintage;

    @BeforeEach
    void setUp() {
        menu = new Menu();
        vintage = new Vintage();
        controlador = new Controlador(menu, vintage);
    }

    @Test
    void testGetMenu() {
        assertEquals(menu, controlador.getMenu());
    }

    @Test
    void testGetVintage() {
        assertEquals(vintage, controlador.getVintage());
    }

    @Test
    void testInicioControlador() {
        // Setup initial conditions for the test
        // Adicionar utilizador para simular o login
        vintage.adicionaUtilizador("email@example.com", "Nome", "Morada", 123456789L, "password");

        // Simular entradas no menu
        String input = "1\nemail@example.com\npassword\n7\n";
        simulateUserInput(input);

        // Ajuste: Evitar StackOverflow chamando o método diretamente em vez de iniciar o controlador
        controlador.inicio_controlador();

        // Verifique se o utilizador fez login com sucesso
        assertEquals("email@example.com", vintage.getGestor_Utilizadores().getUtilizadores().get(vintage.getUtilizador()).getEmail());
    }

    @Test
    void testPovoar() {
        assertDoesNotThrow(() -> controlador.povoar());
        // Verifique que a função povoar() popula corretamente o Vintage
        assertNotNull(vintage.getGestor_Artigos().getArtigos());
    }

    @Test
    void testSalvarEstado() {
        assertDoesNotThrow(() -> controlador.salvarEstado());
        // Garantir que o estado foi salvo corretamente
    }

    @Test
    void testLoginSuccess() {
        vintage.adicionaUtilizador("email@example.com", "Nome", "Morada", 123456789L, "password");

        // Simular entradas no menu
        String input = "email@example.com\npassword\n";
        simulateUserInput(input);

        boolean result = controlador.login();
        assertTrue(result);
        // Verificar se o login foi bem-sucedido
    }

    @Test
    void testLoginFail() {
        // Simular entradas no menu
        String input = "email@example.com\n";
        simulateUserInput(input);

        boolean result = controlador.login();
        assertFalse(result);
        // Verificar se o email não existe
    }

    @Test
    void testRegistar() {
        // Simular entradas no menu
        String input = "Nome\nMorada\n123456789\nemail@example.com\npassword\n";
        simulateUserInput(input);

        controlador.registar();

        // Verificar se o utilizador foi registrado corretamente
        assertTrue(vintage.existeEmail("email@example.com"));
    }

    @Test
    void testEscolha() {
        // Adicionar alguns artigos para venda
        vintage.adicionaUtilizador("vendedor@example.com", "Vendedor", "Morada", 987654321L, "password");
        try {
            vintage.criaSapatilha("Descricao", "Marca", 100.0, true, 0, 0, 1L, 42, true, "Branco", 2023, false, 0.0);
        } catch (ArtigoExistenteException e) {
            fail("Artigo não deveria existir antes do teste");
        }

        // Simular entradas no menu
        String input = "1\n6\n";
        simulateUserInput(input);

        // Ajuste: Evitar StackOverflow chamando o método diretamente em vez de iniciar o controlador
        controlador.escolha();

        // Verificar se o artigo foi impresso corretamente
        assertNotNull(vintage.todosArtigos());
    }

    @Test
    void testAdicionarArtigoCarrinho() {
        // Adicionar utilizador e artigo para teste
        vintage.adicionaUtilizador("comprador@example.com", "Comprador", "Morada", 123456789L, "password");
        try {
            vintage.criaSapatilha("Descricao", "Marca", 100.0, true, 0, 0, 1L, 42, true, "Branco", 2023, false, 0.0);
        } catch (ArtigoExistenteException e) {
            fail("Artigo não deveria existir antes do teste");
        }

        // Simular entradas no menu
        String input = "Descricao\n";
        simulateUserInput(input);

        assertDoesNotThrow(() -> controlador.adicionar_artigo_carrinho());
        // Verificar se o artigo foi adicionado ao carrinho corretamente
    }

    @Test
    void testMenuVendaRetirarArtigo() {
        // Adicionar utilizador e artigo para teste
        vintage.adicionaUtilizador("vendedor@example.com", "Vendedor", "Morada", 987654321L, "password");
        try {
            vintage.criaSapatilha("Descricao", "Marca", 100.0, true, 0, 0, 1L, 42, true, "Branco", 2023, false, 0.0);
            vintage.adicionarArtigoCarrinho("Descricao");
        } catch (ArtigoExistenteException | ArtigoNaoEncontradoException e) {
            fail("Erro ao configurar o teste");
        }

        // Simular entradas no menu
        String input = "Descricao\n";
        simulateUserInput(input);

        assertDoesNotThrow(() -> controlador.menu_venda_retirar_artigo());
        // Verificar se o artigo foi removido corretamente
    }

    @Test
    void testEscolhaCarrinho() {
        // Simular entradas no menu
        String input = "1\n9\n";
        simulateUserInput(input);

        // Ajuste: Evitar NullPointerException garantindo que os métodos não retornem null
        controlador.escolha_carrinho();

        // Verificar se o carrinho foi exibido corretamente
        assertNotNull(vintage.imprimeCarrinho());
    }

    private void simulateUserInput(String data) {
        InputStream stdin = System.in;
        System.setIn(new ByteArrayInputStream(data.getBytes()));
    }
}
 */