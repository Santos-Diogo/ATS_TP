import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.AfterEach;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class EncomendaTest {
    private Encomenda encomenda;
    private Set<String> artigos;

    @BeforeEach
    void setUp() {
        // Reset the static codigo to 1 before each test
        Encomenda.setCodigo(1);
        Encomenda.setDiasDevolver(2); // Set the maximum days for return

        artigos = new HashSet<>();
        artigos.add("Art1");
        artigos.add("Art2");

        encomenda = new Encomenda(artigos, 123, Dimensao.Medio, LocalDate.now());
        encomenda.setDataEntrega(LocalDate.now()); // Ensure dataEntrega is set
    }

    @AfterEach
    void tearDown() {
        // Clean up after each test if needed
    }

    @Test
    void testCriaCodigo() {
        Encomenda.setCodigo(1);
        long newCode = Encomenda.criaCodigo(); // Isso agora definirá o código para 2
        assertEquals(2, Encomenda.getCodigo());
        assertEquals(1, newCode);
    }

    @Test
    void testConstrutorParametrizado() {
        assertEquals(artigos, encomenda.getEncomenda());
        assertEquals(123, encomenda.getIdComprador());
        assertEquals(Dimensao.Medio, encomenda.getDimensao());
        assertEquals(Estado.Pendente, encomenda.getEstado());
        assertNotNull(encomenda.getData());
        assertNotNull(encomenda.getDataEntrega());
    }

    @Test
    void testSetEncomenda() {
        Set<String> newArtigos = new HashSet<>();
        newArtigos.add("Art3");
        newArtigos.add("Art4");

        encomenda.setEncomenda(newArtigos);
        assertEquals(newArtigos, encomenda.getEncomenda());
    }

    @Test
    void testAdicionaArtigo() {
        String novoArtigo = "Art3";
        assertDoesNotThrow(() -> encomenda.adicionaArtigo(novoArtigo));
        assertTrue(encomenda.getEncomenda().contains(novoArtigo));

        assertThrows(ArtigoExistenteException.class, () -> encomenda.adicionaArtigo("Art3"));
    }

    @Test
    void testRemoveArtigo() {
        assertDoesNotThrow(() -> encomenda.removeArtigo("Art1"));
        assertFalse(encomenda.getEncomenda().contains("Art1"));

        assertThrows(ArtigoNaoEncontradoException.class, () -> encomenda.removeArtigo("Art3"));
    }

    @Test
    void testRemoveTudo() {
        Set<String> removidos = encomenda.removeTudo();
        assertEquals(artigos, removidos);
        assertTrue(encomenda.getEncomenda().isEmpty());
        encomenda.defineTamanho();
        assertEquals(Dimensao.Pequeno, encomenda.getDimensao());
    }

    @Test
    void testDefineTamanho() throws ArtigoExistenteException, ArtigoNaoEncontradoException {
        encomenda.defineTamanho();
        assertEquals(Dimensao.Medio, encomenda.getDimensao());

        encomenda.adicionaArtigo("Art3");
        encomenda.adicionaArtigo("Art4");
        encomenda.adicionaArtigo("Art5");
        encomenda.adicionaArtigo("Art6");
        encomenda.defineTamanho();
        assertEquals(Dimensao.Grande, encomenda.getDimensao());

        encomenda.removeArtigo("Art1");
        encomenda.removeArtigo("Art2");
        encomenda.removeArtigo("Art3");
        encomenda.defineTamanho();
        assertEquals(Dimensao.Medio, encomenda.getDimensao());

        encomenda.removeTudo();
        encomenda.defineTamanho();
        assertEquals(Dimensao.Pequeno, encomenda.getDimensao());
    }

    @Test
    void testNumeroArtigos() {
        assertEquals(2, encomenda.numeroArtigos());
    }

    @Test
    void testEquals() {
        // Teste quando o objeto comparado é o mesmo
        assertTrue(encomenda.equals(encomenda));

        // Teste quando o objeto comparado é null
        assertFalse(encomenda.equals(null));

        // Teste quando o objeto comparado é de uma classe diferente
        assertFalse(encomenda.equals("Not an Encomenda"));

        // Teste para objetos diferentes
        Encomenda sameEncomenda = new Encomenda(encomenda);
        sameEncomenda.setDataEntrega(encomenda.getDataEntrega()); // Ensure dataEntrega is set
        Encomenda differentEncomenda = new Encomenda();
        differentEncomenda.setDataEntrega(LocalDate.now()); // Ensure dataEntrega is set

        assertEquals(encomenda, sameEncomenda);
        assertNotEquals(encomenda, differentEncomenda);
    }

    @Test
    void testClone() {
        Encomenda clonedEncomenda = encomenda.clone();
        clonedEncomenda.setDataEntrega(encomenda.getDataEntrega()); // Ensure dataEntrega is set
        assertEquals(encomenda, clonedEncomenda);
        assertNotSame(encomenda, clonedEncomenda);
    }


    @Test
    void testToString() {
        String toStringResult = encomenda.toString();
        assertNotNull(toStringResult);
        assertTrue(toStringResult.contains("Código: 1"));
    }

    @Test
void testToStringForNullDates() {
    // Crie uma encomenda com dataCriacao e dataEntrega como null
    Encomenda encomendaComNullDates = new Encomenda(new HashSet<>(), 123, Dimensao.Pequeno, null);
    encomendaComNullDates.setDataEntrega(null);

    String toStringResult = encomendaComNullDates.toString();
    assertNotNull(toStringResult);

    // Verifique se a string contém as partes específicas esperadas
    assertTrue(toStringResult.contains("Data de criação: N/A"));
    assertTrue(toStringResult.contains("Data de entrega: N/A"));
}


    @Test
    void testPodeDevolver() {
        // Setting delivery date to today for testing purpose
        encomenda.setDataEntrega(LocalDate.now());
        encomenda.setEstado(Estado.Expedida);
        assertTrue(encomenda.podeDevolver(LocalDate.now().plusDays(1)));
        assertFalse(encomenda.podeDevolver(LocalDate.now().plusDays(3)));
    }

    // Additional tests for methods not covered yet
    @Test
    void testGetAndSetCodigo() {
        Encomenda.setCodigo(100);
        assertEquals(100, Encomenda.getCodigo());
    }

    @Test
    void testGetAndSetDiasDevolver() {
        Encomenda.setDiasDevolver(5);
        assertEquals(5, Encomenda.getDiasDevolver());
    }

    @Test
    void testGetAndSetId() {
        encomenda.setId(500);
        assertEquals(500, encomenda.getId());
    }

    @Test
    void testGetAndSetIdComprador() {
        encomenda.setIdComprador(321);
        assertEquals(321, encomenda.getIdComprador());
    }

    @Test
    void testGetAndSetDimensao() {
        encomenda.setDimensao(Dimensao.Grande);
        assertEquals(Dimensao.Grande, encomenda.getDimensao());
    }

    @Test
    void testGetAndSetEstado() {
        encomenda.setEstado(Estado.Expedida);
        assertEquals(Estado.Expedida, encomenda.getEstado());
    }

    @Test
    void testGetAndSetData() {
        LocalDate newDate = LocalDate.of(2023, 1, 1);
        encomenda.setData(newDate);
        assertEquals(newDate, encomenda.getData());
    }

    @Test
    void testGetAndSetDataEntrega() {
        LocalDate entregaDate = LocalDate.of(2023, 1, 10);
        encomenda.setDataEntrega(entregaDate);
        assertEquals(entregaDate, encomenda.getDataEntrega());
    }
}
