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

        artigos = new HashSet<>();
        artigos.add("Art1");
        artigos.add("Art2");

        encomenda = new Encomenda(artigos, 123, Dimensao.Medio, LocalDate.now());
    }

    @AfterEach
    void tearDown() {
        // Clean up after each test if needed
    }

    @Test
    void testCriaCodigo() {
        Encomenda.setCodigo(1);
        Encomenda.criaCodigo(); // Isso agora definirá o código para 2
        assertEquals(2, Encomenda.getCodigo());
    }

    @Test
    void testConstrutorParametrizado() {
        assertEquals(artigos, encomenda.getEncomenda());
        assertEquals(123, encomenda.getIdComprador());
        assertEquals(Dimensao.Medio, encomenda.getDimensao());
        assertEquals(Estado.Pendente, encomenda.getEstado());
        assertNotNull(encomenda.getData());
    }

    @Test
    void testAdicionaArtigo() {
        String novoArtigo = "Art3";
        assertDoesNotThrow(() -> encomenda.adicionaArtigo(novoArtigo));
        assertTrue(encomenda.getEncomenda().contains(novoArtigo));
    }

    @Test
    void testRemoveArtigo() {
        assertDoesNotThrow(() -> encomenda.removeArtigo("Art1"));
        assertFalse(encomenda.getEncomenda().contains("Art1"));
    }

    @Test
    void testRemoveTudo() {
        Set<String> removidos = encomenda.removeTudo();
        assertEquals(artigos, removidos);
        assertTrue(encomenda.getEncomenda().isEmpty());
    }

    @Test
    void testDefineTamanho() {
        encomenda.defineTamanho();
        assertEquals(Dimensao.Medio, encomenda.getDimensao());
    }

    @Test
    void testNumeroArtigos() {
        assertEquals(2, encomenda.numeroArtigos());
    }


    //TODO: Não está a ser testado o equals e o clone. Não sei como fazer!

    
    @Test
    void testToString() {
        String toStringResult = encomenda.toString();
        assertNotNull(toStringResult);
        assertTrue(toStringResult.contains("Código: 1"));
    }

    @Test
    void testPodeDevolver() {
        // Setting delivery date to today for testing purpose
        encomenda.setDataEntrega(LocalDate.now());
        encomenda.setEstado(Estado.Expedida);
        assertTrue(encomenda.podeDevolver(LocalDate.now().plusDays(1)));
        assertFalse(encomenda.podeDevolver(LocalDate.now().plusDays(3)));
    }

    // Add other tests as needed
}
