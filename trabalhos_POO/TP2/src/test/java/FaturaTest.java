import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class FaturaTest {
    Fatura fatura;
    Set<String> artigos;

    @BeforeEach
    void setUp() {
        artigos = new HashSet<>();
        artigos.add("Art1");
        artigos.add("Art2");
        Fatura.setCodigo(1); // Resetar o código para um valor conhecido antes de cada teste
        fatura = new Fatura(true, 1L, 123456789L, artigos, 100.0, 10.0, 110.0);
    }

    @Test
    void testCriaCodigo() {
        assertEquals(2, Fatura.getCodigo()); // O código deve ser incrementado após a criação da fatura
    }

    @Test
    void testConstrutorParametrizado() {
        assertTrue(fatura.isCompra());
        assertEquals(1L, fatura.getIdEncomenda());
        assertEquals(123456789L, fatura.getNifComprador());
        assertEquals(artigos, fatura.getArtigos());
        assertEquals(100.0, fatura.getCustoProdutos());
        assertEquals(10.0, fatura.getAlteracaoPreco());
        assertEquals(110.0, fatura.getPrecoFinal());
    }

    @Test
    void testEquals() {
        Fatura outra = new Fatura(fatura);
        assertEquals(fatura, outra);
    }

    @Test
    void testClone() {
        Fatura clone = fatura.clone();
        assertEquals(fatura, clone);
        assertNotSame(fatura, clone);
    }

    @Test
    void testToString() {
        String toStringResult = fatura.toString();
        assertNotNull(toStringResult);
        assertTrue(toStringResult.startsWith("Fatura"));
    }

    @Test
    void testAtualizaFatura() {
        fatura.atualizaFatura("Art3", 50.0, 5.0, 55.0);
        assertEquals(3, fatura.getArtigos().size());
        assertTrue(fatura.getArtigos().contains("Art3"));
        assertEquals(150.0, fatura.getCustoProdutos());
        assertEquals(15.0, fatura.getAlteracaoPreco());
        assertEquals(165.0, fatura.getPrecoFinal());
    }
}
