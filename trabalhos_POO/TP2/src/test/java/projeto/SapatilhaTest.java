package projeto;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;
import java.time.LocalDate;

public class SapatilhaTest {

    private Sapatilha sapatilha1;
    private Sapatilha sapatilha2;

    @BeforeEach
    void setUp() {
        sapatilha1 = new Sapatilha("Descrição1", "Marca1", 100.0, true, 2, 3, 1L, 2L, 42, true, "Preto", 2022, true, 10.0);
        sapatilha1.setCodigo_barras("S1");
        sapatilha2 = new Sapatilha(sapatilha1);
    }

    @Test
    void testConstrutorVazio() {
        Sapatilha sapatilha = new Sapatilha();
        assertNotNull(sapatilha);
        assertEquals(0, sapatilha.getTamanho());
        assertFalse(sapatilha.isAtacadores());
        assertEquals("", sapatilha.getCor());
        assertEquals(0, sapatilha.getAnoColecao());
        assertFalse(sapatilha.isPremium());
        assertEquals(0.0, sapatilha.getDesconto());
    }

    @Test
    void testConstrutorCompleto() {
        assertNotNull(sapatilha1);
        assertEquals(42, sapatilha1.getTamanho());
        assertTrue(sapatilha1.isAtacadores());
        assertEquals("Preto", sapatilha1.getCor());
        assertEquals(2022, sapatilha1.getAnoColecao());
        assertTrue(sapatilha1.isPremium());
        assertEquals(10.0, sapatilha1.getDesconto());
    }

    @Test
    void testConstrutorCopia() {
        assertNotNull(sapatilha2);
        assertEquals(sapatilha1, sapatilha2);
        assertNotSame(sapatilha1, sapatilha2);
    }

    @Test
    void testSetTamanho() {
        sapatilha1.setTamanho(44);
        assertEquals(44, sapatilha1.getTamanho(), "O tamanho não foi definido corretamente");
    }

    @Test
    void testSetAtacadores() {
        sapatilha1.setAtacadores(false);
        assertFalse(sapatilha1.isAtacadores(), "O status dos atacadores não foi definido corretamente");
    }

    @Test
    void testSetCor() {
        sapatilha1.setCor("Branco");
        assertEquals("Branco", sapatilha1.getCor(), "A cor não foi definida corretamente");
    }

    @Test
    void testSetAnoColecao() {
        sapatilha1.setAnoColecao(2023);
        assertEquals(2023, sapatilha1.getAnoColecao(), "O ano da coleção não foi definido corretamente");
    }

    @Test
    void testSetPremium() {
        sapatilha1.setPremium(false);
        assertFalse(sapatilha1.isPremium(), "O status de premium não foi definido corretamente");
    }

    @Test
    void testSetDesconto() {
        sapatilha1.setDesconto(15.0);
        assertEquals(15.0, sapatilha1.getDesconto(), "O desconto não foi definido corretamente");
    }

    @Test
    void testToString() {
        String expected = "Sapatilhas:: {Artigo:: { Código de barras: S1 Descrição: Descrição1 Marca: Marca1 Preço base: 100.0 Novo: true Estado de uso: 2 Número de utilizadores: 3 Disponivel: true Id da transportadora: 1 Id do vendedor: 2 } Tamanho: 42 Atacadores: true Cor: Preto Data da Coleção: 2022 Premium: true Desconto: 10.0}";
        assertEquals(expected, sapatilha1.toString(), "A representação em string não está correta");
    }

    @Test
    void testEquals() {
        Sapatilha sapatilha3 = new Sapatilha("Descrição1", "Marca1", 100.0, true, 2, 3, 1L, 2L, 42, true, "Preto", 2022, true, 10.0);
        sapatilha3.setCodigo_barras(sapatilha1.getCodigo_barras());
        assertTrue(sapatilha1.equals(sapatilha3));
    }

    @Test
    void testEqualsSameObject() {
        assertTrue(sapatilha1.equals(sapatilha1));
    }

    @Test
    void testEqualsNull() {
        assertFalse(sapatilha1.equals(null));
    }

    @Test
    void testEqualsDifferentClass() {
        String diferenteClasse = "string";
        assertFalse(sapatilha1.equals(diferenteClasse));
    }

    @Test
    void testEqualsDifferentDescricao() {
        Sapatilha sapatilha1 = new Sapatilha("Descrição1", "Marca", 100.0, true, 0, 1, 123L, 456L, 42, true, "Preto", 2022, true, 10.0);
        Sapatilha sapatilha2 = new Sapatilha("Descrição2", "Marca", 100.0, true, 0, 1, 123L, 456L, 42, true, "Preto", 2022, true, 10.0);
        assertFalse(sapatilha1.equals(sapatilha2));
    }

    @Test
    void testEqualsDifferentCodigoBarras() {
        Sapatilha sapatilha1 = new Sapatilha("Descrição", "Marca", 100.0, true, 0, 1, 123L, 456L, 42, true, "Preto", 2022, true, 10.0);
        Sapatilha sapatilha2 = new Sapatilha("Descrição", "Marca", 100.0, true, 0, 1, 123L, 456L, 42, true, "Preto", 2022, true, 10.0);
        sapatilha1.setCodigo_barras("A1");
        sapatilha2.setCodigo_barras("A2");
        assertFalse(sapatilha1.equals(sapatilha2));
    }

    @Test
    void testEqualsDifferentMarca() {
        Sapatilha sapatilha1 = new Sapatilha("Descrição", "Marca1", 100.0, true, 0, 1, 123L, 456L, 42, true, "Preto", 2022, true, 10.0);
        Sapatilha sapatilha2 = new Sapatilha("Descrição", "Marca2", 100.0, true, 0, 1, 123L, 456L, 42, true, "Preto", 2022, true, 10.0);
        assertFalse(sapatilha1.equals(sapatilha2));
    }

    @Test
    void testEqualsDifferentPrecoBase() {
        Sapatilha sapatilha1 = new Sapatilha("Descrição", "Marca", 100.0, true, 0, 1, 123L, 456L, 42, true, "Preto", 2022, true, 10.0);
        Sapatilha sapatilha2 = new Sapatilha("Descrição", "Marca", 200.0, true, 0, 1, 123L, 456L, 42, true, "Preto", 2022, true, 10.0);
        assertFalse(sapatilha1.equals(sapatilha2));
    }

    @Test
    void testEqualsDifferentNovo() {
        Sapatilha sapatilha1 = new Sapatilha("Descrição", "Marca", 100.0, true, 0, 1, 123L, 456L, 42, true, "Preto", 2022, true, 10.0);
        Sapatilha sapatilha2 = new Sapatilha("Descrição", "Marca", 100.0, false, 0, 1, 123L, 456L, 42, true, "Preto", 2022, true, 10.0);
        assertFalse(sapatilha1.equals(sapatilha2));
    }

    @Test
    void testEqualsDifferentEstadoUso() {
        Sapatilha sapatilha1 = new Sapatilha("Descrição", "Marca", 100.0, true, 0, 1, 123L, 456L, 42, true, "Preto", 2022, true, 10.0);
        Sapatilha sapatilha2 = new Sapatilha("Descrição", "Marca", 100.0, true, 1, 1, 123L, 456L, 42, true, "Preto", 2022, true, 10.0);
        assertFalse(sapatilha1.equals(sapatilha2));
    }

    @Test
    void testEqualsDifferentNUtilizadores() {
        Sapatilha sapatilha1 = new Sapatilha("Descrição", "Marca", 100.0, true, 0, 1, 123L, 456L, 42, true, "Preto", 2022, true, 10.0);
        Sapatilha sapatilha2 = new Sapatilha("Descrição", "Marca", 100.0, true, 0, 2, 123L, 456L, 42, true, "Preto", 2022, true, 10.0);
        assertFalse(sapatilha1.equals(sapatilha2));
    }

    @Test
    void testEqualsDifferentIdTransportadora() {
        Sapatilha sapatilha1 = new Sapatilha("Descrição", "Marca", 100.0, true, 0, 1, 123L, 456L, 42, true, "Preto", 2022, true, 10.0);
        Sapatilha sapatilha2 = new Sapatilha("Descrição", "Marca", 100.0, true, 0, 1, 124L, 456L, 42, true, "Preto", 2022, true, 10.0);
        assertFalse(sapatilha1.equals(sapatilha2));
    }

    @Test
    void testEqualsDifferentIdVendedor() {
        Sapatilha sapatilha1 = new Sapatilha("Descrição", "Marca", 100.0, true, 0, 1, 123L, 456L, 42, true, "Preto", 2022, true, 10.0);
        Sapatilha sapatilha2 = new Sapatilha("Descrição", "Marca", 100.0, true, 0, 1, 123L, 457L, 42, true, "Preto", 2022, true, 10.0);
        assertFalse(sapatilha1.equals(sapatilha2));
    }

    @Test
    void testEqualsDifferentDisponivel() {
        Sapatilha sapatilha1 = new Sapatilha("Descrição", "Marca", 100.0, true, 0, 1, 123L, 456L, 42, true, "Preto", 2022, true, 10.0);
        Sapatilha sapatilha2 = new Sapatilha("Descrição", "Marca", 100.0, true, 0, 1, 123L, 456L, 42, true, "Preto", 2022, true, 10.0);
        sapatilha1.setDisponivel(true);
        sapatilha2.setDisponivel(false);
        assertFalse(sapatilha1.equals(sapatilha2));
    }

    @Test
    void testEqualsDifferentDataVenda() {
        Sapatilha sapatilha1 = new Sapatilha("Descrição", "Marca", 100.0, true, 0, 1, 123L, 456L, 42, true, "Preto", 2022, true, 10.0);
        Sapatilha sapatilha2 = new Sapatilha("Descrição", "Marca", 100.0, true, 0, 1, 123L, 456L, 42, true, "Preto", 2022, true, 10.0);
        sapatilha1.setData_venda(LocalDate.of(2024, 5, 21));
        sapatilha2.setData_venda(LocalDate.of(2024, 5, 22));
        assertFalse(sapatilha1.equals(sapatilha2));
    }

    @Test
    void testEqualsDifferentTamanho() {
        Sapatilha sapatilha1 = new Sapatilha("Descrição", "Marca", 100.0, true, 0, 1, 123L, 456L, 42, true, "Preto", 2022, true, 10.0);
        Sapatilha sapatilha2 = new Sapatilha("Descrição", "Marca", 100.0, true, 0, 1, 123L, 456L, 43, true, "Preto", 2022, true, 10.0);
        assertFalse(sapatilha1.equals(sapatilha2));
    }

    @Test
    void testEqualsDifferentAtacadores() {
        Sapatilha sapatilha1 = new Sapatilha("Descrição", "Marca", 100.0, true, 0, 1, 123L, 456L, 42, true, "Preto", 2022, true, 10.0);
        Sapatilha sapatilha2 = new Sapatilha("Descrição", "Marca", 100.0, true, 0, 1, 123L, 456L, 42, false, "Preto", 2022, true, 10.0);
        assertFalse(sapatilha1.equals(sapatilha2));
    }

    @Test
    void testEqualsDifferentCor() {
        Sapatilha sapatilha1 = new Sapatilha("Descrição", "Marca", 100.0, true, 0, 1, 123L, 456L, 42, true, "Preto", 2022, true, 10.0);
        Sapatilha sapatilha2 = new Sapatilha("Descrição", "Marca", 100.0, true, 0, 1, 123L, 456L, 42, true, "Branco", 2022, true, 10.0);
        assertFalse(sapatilha1.equals(sapatilha2));
    }

    @Test
    void testEqualsDifferentAnoColecao() {
        Sapatilha sapatilha1 = new Sapatilha("Descrição", "Marca", 100.0, true, 0, 1, 123L, 456L, 42, true, "Preto", 2022, true, 10.0);
        Sapatilha sapatilha2 = new Sapatilha("Descrição", "Marca", 100.0, true, 0, 1, 123L, 456L, 42, true, "Preto", 2021, true, 10.0);
        assertFalse(sapatilha1.equals(sapatilha2));
    }

    @Test
    void testEqualsDifferentPremium() {
        Sapatilha sapatilha1 = new Sapatilha("Descrição", "Marca", 100.0, true, 0, 1, 123L, 456L, 42, true, "Preto", 2022, true, 10.0);
        Sapatilha sapatilha2 = new Sapatilha("Descrição", "Marca", 100.0, true, 0, 1, 123L, 456L, 42, true, "Preto", 2022, false, 10.0);
        assertFalse(sapatilha1.equals(sapatilha2));
    }

    @Test
    void testEqualsDifferentDesconto() {
        Sapatilha sapatilha1 = new Sapatilha("Descrição", "Marca", 100.0, true, 0, 1, 123L, 456L, 42, true, "Preto", 2022, true, 10.0);
        Sapatilha sapatilha2 = new Sapatilha("Descrição", "Marca", 100.0, true, 0, 1, 123L, 456L, 42, true, "Preto", 2022, true, 15.0);
        assertFalse(sapatilha1.equals(sapatilha2));
    }

    @Test
    void testEqualsIdenticalObjects() {
        Sapatilha sapatilha1 = new Sapatilha("Descrição", "Marca", 100.0, true, 0, 1, 123L, 456L, 42, true, "Preto", 2022, true, 10.0);
        Sapatilha sapatilha2 = new Sapatilha("Descrição", "Marca", 100.0, true, 0, 1, 123L, 456L, 42, true, "Preto", 2022, true, 10.0);
        sapatilha1.setCodigo_barras("S1");
        sapatilha2.setCodigo_barras("S1");

        // Verificação detalhada dos atributos antes da comparação
        Assertions.assertEquals(sapatilha1.getDescricao(), sapatilha2.getDescricao());
        Assertions.assertEquals(sapatilha1.getMarca(), sapatilha2.getMarca());
        Assertions.assertEquals(sapatilha1.getPreco_base(), sapatilha2.getPreco_base());
        Assertions.assertEquals(sapatilha1.getNovo(), sapatilha2.getNovo());
        Assertions.assertEquals(sapatilha1.getEstado_uso(), sapatilha2.getEstado_uso());
        Assertions.assertEquals(sapatilha1.getN_utilizadores(), sapatilha2.getN_utilizadores());
        Assertions.assertEquals(sapatilha1.getIdTransportadora(), sapatilha2.getIdTransportadora());
        Assertions.assertEquals(sapatilha1.getIdVendedor(), sapatilha2.getIdVendedor());
        Assertions.assertEquals(sapatilha1.getCodigo_barras(), sapatilha2.getCodigo_barras());
        Assertions.assertEquals(sapatilha1.getTamanho(), sapatilha2.getTamanho());
        Assertions.assertEquals(sapatilha1.isAtacadores(), sapatilha2.isAtacadores());
        Assertions.assertEquals(sapatilha1.getCor(), sapatilha2.getCor());
        Assertions.assertEquals(sapatilha1.getAnoColecao(), sapatilha2.getAnoColecao());
        Assertions.assertEquals(sapatilha1.isPremium(), sapatilha2.isPremium());
        Assertions.assertEquals(sapatilha1.getDesconto(), sapatilha2.getDesconto());

        // Verificação da igualdade
        Assertions.assertTrue(sapatilha1.equals(sapatilha2));
    }

    @Test
    void testPrecoAtual() {
        LocalDate data = LocalDate.of(2023, 5, 15);
    
        // Cenário 1: Premium e data de venda é LocalDate.MIN
        double precoEsperado = 100.0;
        int anos = data.getYear() - sapatilha1.getAnoColecao();
        for (int i = 0; i < anos; i++) {
            precoEsperado *= (1 + (1.0 / 10));
        }
        assertEquals(precoEsperado, sapatilha1.preco_atual(data), 1e-6); // Tolerância de 1e-6
    
        // Cenário 2: Premium e data de venda não é LocalDate.MIN
        sapatilha1.setData_venda(LocalDate.of(2023, 1, 1));
        precoEsperado = 100.0;
        anos = LocalDate.of(2023, 1, 1).getYear() - sapatilha1.getAnoColecao();
        for (int i = 0; i < anos; i++) {
            precoEsperado *= (1 + (1.0 / 10));
        }
        assertEquals(precoEsperado, sapatilha1.preco_atual(data), 1e-6); // Tolerância de 1e-6
    
        // Cenário 3: Não é premium, não é novo e tem desconto
        sapatilha1.setPremium(false);
        sapatilha1.setNovo(false);
        precoEsperado = 100.0 - (100.0 * 3 / (10 * 2));
        precoEsperado *= (100 - 10.0) / 100;
        if (precoEsperado <= 0.01) precoEsperado = 0.01;
        assertEquals(precoEsperado, sapatilha1.preco_atual(data), 1e-6); // Tolerância de 1e-6
    
        // Cenário 4: Novo, tamanho maior que 45 e com desconto
        sapatilha1.setNovo(true);
        sapatilha1.setTamanho(46);
        precoEsperado = 100.0 * (100 - 10.0) / 100;
        if (precoEsperado <= 0.01) precoEsperado = 0.01;
        assertEquals(precoEsperado, sapatilha1.preco_atual(data), 1e-6); // Tolerância de 1e-6
    
        // Cenário 5: Preço calculado menor que 0.01
        sapatilha1.setNovo(false);
        sapatilha1.setN_utilizadores(1000);
        sapatilha1.setEstado_uso(1);
        precoEsperado = 100.0 - (100.0 * 1000 / (10 * 1));
        precoEsperado *= (100 - 10.0) / 100;
        if (precoEsperado <= 0.01) precoEsperado = 0.01;
        assertEquals(0.01, sapatilha1.preco_atual(data), 1e-6); // Tolerância de 1e-6
    }
    

}
