import org.junit.jupiter.api.*;
import java.time.LocalDate;

public class ArtigoTest {

    private TestableArtigo artigo;

    @BeforeEach
    void setUp() {
        artigo = new TestableArtigo();
        Artigo.setCodigo("A");
        Artigo.setContador(1);
    }

    @Test
    void testCriaCodigo() {
        String code = Artigo.criaCodigo();
        Assertions.assertEquals("A1", code);
        Assertions.assertEquals(2, Artigo.getContador());
    }

    @Test
    void testSetCodigo() {
        Artigo.setCodigo("B");
        Assertions.assertEquals("B", Artigo.getCodigo());
    }

    @Test
    void testConstructorWithParams() {
        LocalDate date = LocalDate.now();
        artigo = new TestableArtigo("Descrição", "Marca", 100.0, true, 0, 1, 123L, 456L);
        Assertions.assertEquals("Descrição", artigo.getDescricao());
        Assertions.assertEquals(100.0, artigo.getPreco_base());
        Assertions.assertTrue(artigo.getNovo());
    }

    @Test
    void testEquals() {
        Artigo artigo1 = new TestableArtigo(artigo);
        Assertions.assertTrue(artigo.equals(artigo1));
    }

    @Test
    void testToString() {
        String expected = "Artigo:: { Código de barras: A1 Descrição: Artigo invalido Marca: Artigo invalido Preço base: 0.0 Novo: false Estado de uso: -1 Número de utilizadores: -1 Disponivel: false Id da transportadora: -1 Id do vendedor: -1 }";
        Assertions.assertEquals(expected, artigo.toString().trim());
    }

    @Test
    void testMostrar() {
        // Assuming implementation of preco_atual() as given above.
        LocalDate date = LocalDate.now();
        String result = artigo.mostrar(date);
        Assertions.assertTrue(result.contains("Preço atual: 0.00€"));
    }

    // Additional tests can be written to cover more methods and conditions.
}
