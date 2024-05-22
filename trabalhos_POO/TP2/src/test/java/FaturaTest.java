import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
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
    void testConstrutorVazio() {
        Fatura faturaVazia = new Fatura();
        assertFalse(faturaVazia.isCompra());
        assertEquals(0L, faturaVazia.getIdEncomenda());
        assertEquals(0L, faturaVazia.getNifComprador());
        assertTrue(faturaVazia.getArtigos().isEmpty());
        assertEquals(0.0, faturaVazia.getCustoProdutos());
        assertEquals(0.0, faturaVazia.getAlteracaoPreco());
        assertEquals(0.0, faturaVazia.getPrecoFinal());
    }

    @Test
    public void testEquals() {
        Fatura fatura1 = new Fatura();
        fatura1.setId(1);
        fatura1.setCompra(true);
        fatura1.setIdEncomenda(1);
        fatura1.setNifComprador(123456789);
        fatura1.setArtigos(new HashSet<>(Arrays.asList("Artigo1", "Artigo2")));
        fatura1.setCustoProdutos(100.00);
        fatura1.setAlteracaoPreco(20.00);
        fatura1.setPrecoFinal(120.00);

        Fatura fatura2 = new Fatura();
        fatura2.setId(1);
        fatura2.setCompra(true);
        fatura2.setIdEncomenda(1);
        fatura2.setNifComprador(123456789);
        fatura2.setArtigos(new HashSet<>(Arrays.asList("Artigo1", "Artigo2")));
        fatura2.setCustoProdutos(100.00);
        fatura2.setAlteracaoPreco(20.00);
        fatura2.setPrecoFinal(120.00);

        Fatura fatura3 = new Fatura();
        fatura3.setId(2); // Diferente de fatura1 e fatura2
        fatura3.setCompra(false); // Diferente de fatura1 e fatura2
        fatura3.setIdEncomenda(2); // Diferente de fatura1 e fatura2
        fatura3.setNifComprador(987654321); // Diferente de fatura1 e fatura2
        fatura3.setArtigos(new HashSet<>(Arrays.asList("Artigo3", "Artigo4")));
        fatura3.setCustoProdutos(200.00); // Diferente de fatura1 e fatura2
        fatura3.setAlteracaoPreco(40.00); // Diferente de fatura1 e fatura2
        fatura3.setPrecoFinal(240.00); // Diferente de fatura1 e fatura2

        assertTrue(fatura1.equals(fatura2)); // Deve ser verdadeiro
        assertFalse(fatura1.equals(fatura3)); // Deve ser falso
    }
        
        @Test
        public void testEqualsNull() {
            Fatura fatura = new Fatura();
            fatura.setId(1);
            fatura.setCompra(true);
            fatura.setIdEncomenda(1);
            fatura.setNifComprador(123456789);
            fatura.setArtigos(new HashSet<>(Arrays.asList("Artigo1", "Artigo2")));
            fatura.setCustoProdutos(100.00);
            fatura.setAlteracaoPreco(20.00);
            fatura.setPrecoFinal(120.00);

            assertFalse(fatura.equals(null)); // Deve retornar false
    }

    @Test
    public void testEqualsSelf() {
        Fatura fatura = new Fatura();
        fatura.setId(1);
        fatura.setCompra(true);
        fatura.setIdEncomenda(1);
        fatura.setNifComprador(123456789);
        fatura.setArtigos(new HashSet<>(Arrays.asList("Artigo1", "Artigo2")));
        fatura.setCustoProdutos(100.00);
        fatura.setAlteracaoPreco(20.00);
        fatura.setPrecoFinal(120.00);

        assertTrue(fatura.equals(fatura)); // Deve retornar true
    }

    @Test
    void testClone() {
        Fatura clone = fatura.clone();
        assertFaturasIguais(fatura, clone);
        assertNotSame(fatura, clone);
    }

    @Test
    public void testToString() {
        Fatura fatura = new Fatura();
        fatura.setId(1);
        fatura.setCompra(true);
        fatura.setNifComprador(123456789);
        fatura.setArtigos(new HashSet<>(Arrays.asList("Artigo1", "Artigo2")));
        fatura.setCustoProdutos(100.00);
        fatura.setAlteracaoPreco(20.00);
        fatura.setPrecoFinal(120.00);

        String expected = "Fatura 1 - Compra\n" +
                  "NIF do comprador: 123456789\n" +
                  "Artigos vendidos: [Artigo1, Artigo2]\n" +
                  "\n" +
                  "Custo dos produtos: 100,00€\n" +
                  "Custo do transporte: 20,00€\n" +
                  "Preço final: 120,00€\n";

        assertEquals(expected, fatura.toString());
    }
    @Test
    public void testToStringVenda() {
        Fatura fatura = new Fatura();
        fatura.setId(1);
        fatura.setCompra(false); // Agora é uma venda
        fatura.setNifComprador(123456789);
        fatura.setArtigos(new HashSet<>(Arrays.asList("Artigo1", "Artigo2")));
        fatura.setCustoProdutos(100.00);
        fatura.setAlteracaoPreco(20.00); // Agora é a taxa vintage
        fatura.setPrecoFinal(120.00);

        String expected = "Fatura 1 - Venda\n" + // Agora é uma venda
                        "NIF do comprador: 123456789\n" +
                        "Artigos vendidos: [Artigo1, Artigo2]\n" +
                        "\n" +
                        "Custo dos produtos: 100,00€\n" +
                        "Taxa Vintage: 20,00€\n" + // Agora é a taxa vintage
                        "Preço final: 120,00€\n";

        assertEquals(expected, fatura.toString());
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

    @Test
    void testSetId() {
        fatura.setId(999);
        assertEquals(999, fatura.getId());
    }

    @Test
    void testSetCompra() {
        fatura.setCompra(false);
        assertFalse(fatura.isCompra());
    }

    @Test
    void testSetIdEncomenda() {
        fatura.setIdEncomenda(999);
        assertEquals(999, fatura.getIdEncomenda());
    }

    @Test
    void testSetNifComprador() {
        fatura.setNifComprador(987654321L);
        assertEquals(987654321L, fatura.getNifComprador());
    }

    @Test
    void testSetArtigos() {
        Set<String> novosArtigos = new HashSet<>();
        novosArtigos.add("Art3");
        fatura.setArtigos(novosArtigos);
        assertEquals(novosArtigos, fatura.getArtigos());
    }

    @Test
    void testSetCustoProdutos() {
        fatura.setCustoProdutos(200.0);
        assertEquals(200.0, fatura.getCustoProdutos());
    }

    @Test
    void testSetAlteracaoPreco() {
        fatura.setAlteracaoPreco(20.0);
        assertEquals(20.0, fatura.getAlteracaoPreco());
    }

    @Test
    void testSetPrecoFinal() {
        fatura.setPrecoFinal(220.0);
        assertEquals(220.0, fatura.getPrecoFinal());
    }

    private void assertFaturasIguais(Fatura f1, Fatura f2) {
        assertEquals(f1.isCompra(), f2.isCompra());
        assertEquals(f1.getIdEncomenda(), f2.getIdEncomenda());
        assertEquals(f1.getNifComprador(), f2.getNifComprador());
        assertEquals(f1.getArtigos(), f2.getArtigos());
        assertEquals(f1.getCustoProdutos(), f2.getCustoProdutos());
        assertEquals(f1.getAlteracaoPreco(), f2.getAlteracaoPreco());
        assertEquals(f1.getPrecoFinal(), f2.getPrecoFinal());
    }
}
