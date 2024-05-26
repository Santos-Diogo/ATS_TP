import static org.junit.jupiter.api.Assertions.*;
import java.time.LocalDate;
import org.junit.jupiter.api.*;

public class TshirtTest {

    private Tshirt tshirt1;
    private Tshirt tshirt2;

    @BeforeEach
    void setUp() {
        tshirt1 = new Tshirt("Descrição1", "Marca1", 100.0, true, 2, 3, 1L, 2L, Tamanho.M, Padrao.riscas);
        tshirt1.setCodigo_barras("T1");
        tshirt2 = new Tshirt(tshirt1);
    }

    @Test
    void testConstrutorVazio() {
        Tshirt tshirt = new Tshirt();
        assertNotNull(tshirt);
        assertNull(tshirt.getTamanho());
        assertNull(tshirt.getPadrao());
    }

    @Test
    void testConstrutorCompleto() {
        assertNotNull(tshirt1);
        assertEquals(Tamanho.M, tshirt1.getTamanho());
        assertEquals(Padrao.riscas, tshirt1.getPadrao());
    }

    @Test
    void testConstrutorCopia() {
        assertNotNull(tshirt2);
        assertEquals(tshirt1, tshirt2);
        assertNotSame(tshirt1, tshirt2);
    }

    @Test
    void testSetTamanho() {
        tshirt1.setTamanho(Tamanho.L);
        assertEquals(Tamanho.L, tshirt1.getTamanho(), "O tamanho não foi definido corretamente");
    }

    @Test
    void testSetPadrao() {
        tshirt1.setPadrao(Padrao.liso);
        assertEquals(Padrao.liso, tshirt1.getPadrao(), "O padrão não foi definido corretamente");
    }

    @Test
    void testToString() {
        String expected = "T-shirt:: {Artigo:: { Código de barras: T1 Descrição: Descrição1 Marca: Marca1 Preço base: 100.0 Novo: true Estado de uso: 2 Número de utilizadores: 3 Disponivel: true Id da transportadora: 1 Id do vendedor: 2 } Tamanho: M Padrão: riscas}";
        assertEquals(expected, tshirt1.toString(), "A representação em string não está correta");
    }

    @Test
    void testEquals() {
        Tshirt tshirt3 = new Tshirt("Descrição1", "Marca1", 100.0, true, 2, 3, 1L, 2L, Tamanho.M, Padrao.riscas);
        tshirt3.setCodigo_barras(tshirt1.getCodigo_barras());
        assertTrue(tshirt1.equals(tshirt3));
    }

    @Test
    void testEqualsSameObject() {
        assertTrue(tshirt1.equals(tshirt1));
    }

    @Test
    void testEqualsNull() {
        assertFalse(tshirt1.equals(null));
    }

    @Test
    void testEqualsDifferentClass() {
        String diferenteClasse = "string";
        assertFalse(tshirt1.equals(diferenteClasse));
    }

    @Test
    void testEqualsDifferentDescricao() {
        Tshirt tshirt1 = new Tshirt("Descrição1", "Marca", 100.0, true, 0, 1, 123L, 456L, Tamanho.M, Padrao.riscas);
        Tshirt tshirt2 = new Tshirt("Descrição2", "Marca", 100.0, true, 0, 1, 123L, 456L, Tamanho.M, Padrao.riscas);
        assertFalse(tshirt1.equals(tshirt2));
    }

    @Test
    void testEqualsDifferentCodigoBarras() {
        Tshirt tshirt1 = new Tshirt("Descrição", "Marca", 100.0, true, 0, 1, 123L, 456L, Tamanho.M, Padrao.riscas);
        Tshirt tshirt2 = new Tshirt("Descrição", "Marca", 100.0, true, 0, 1, 123L, 456L, Tamanho.M, Padrao.riscas);
        tshirt1.setCodigo_barras("A1");
        tshirt2.setCodigo_barras("A2");
        assertFalse(tshirt1.equals(tshirt2));
    }

    @Test
    void testEqualsDifferentMarca() {
        Tshirt tshirt1 = new Tshirt("Descrição", "Marca1", 100.0, true, 0, 1, 123L, 456L, Tamanho.M, Padrao.riscas);
        Tshirt tshirt2 = new Tshirt("Descrição", "Marca2", 100.0, true, 0, 1, 123L, 456L, Tamanho.M, Padrao.riscas);
        assertFalse(tshirt1.equals(tshirt2));
    }

    @Test
    void testEqualsDifferentPrecoBase() {
        Tshirt tshirt1 = new Tshirt("Descrição", "Marca", 100.0, true, 0, 1, 123L, 456L, Tamanho.M, Padrao.riscas);
        Tshirt tshirt2 = new Tshirt("Descrição", "Marca", 200.0, true, 0, 1, 123L, 456L, Tamanho.M, Padrao.riscas);
        assertFalse(tshirt1.equals(tshirt2));
    }

    @Test
    void testEqualsDifferentNovo() {
        Tshirt tshirt1 = new Tshirt("Descrição", "Marca", 100.0, true, 0, 1, 123L, 456L, Tamanho.M, Padrao.riscas);
        Tshirt tshirt2 = new Tshirt("Descrição", "Marca", 100.0, false, 0, 1, 123L, 456L, Tamanho.M, Padrao.riscas);
        assertFalse(tshirt1.equals(tshirt2));
    }

    @Test
    void testEqualsDifferentEstadoUso() {
        Tshirt tshirt1 = new Tshirt("Descrição", "Marca", 100.0, true, 0, 1, 123L, 456L, Tamanho.M, Padrao.riscas);
        Tshirt tshirt2 = new Tshirt("Descrição", "Marca", 100.0, true, 1, 1, 123L, 456L, Tamanho.M, Padrao.riscas);
        assertFalse(tshirt1.equals(tshirt2));
    }

    @Test
    void testEqualsDifferentNUtilizadores() {
        Tshirt tshirt1 = new Tshirt("Descrição", "Marca", 100.0, true, 0, 1, 123L, 456L, Tamanho.M, Padrao.riscas);
        Tshirt tshirt2 = new Tshirt("Descrição", "Marca", 100.0, true, 0, 2, 123L, 456L, Tamanho.M, Padrao.riscas);
        assertFalse(tshirt1.equals(tshirt2));
    }

    @Test
    void testEqualsDifferentIdTransportadora() {
        Tshirt tshirt1 = new Tshirt("Descrição", "Marca", 100.0, true, 0, 1, 123L, 456L, Tamanho.M, Padrao.riscas);
        Tshirt tshirt2 = new Tshirt("Descrição", "Marca", 100.0, true, 0, 1, 124L, 456L, Tamanho.M, Padrao.riscas);
        assertFalse(tshirt1.equals(tshirt2));
    }

    @Test
    void testEqualsDifferentIdVendedor() {
        Tshirt tshirt1 = new Tshirt("Descrição", "Marca", 100.0, true, 0, 1, 123L, 456L, Tamanho.M, Padrao.riscas);
        Tshirt tshirt2 = new Tshirt("Descrição", "Marca", 100.0, true, 0, 1, 123L, 457L, Tamanho.M, Padrao.riscas);
        assertFalse(tshirt1.equals(tshirt2));
    }

    @Test
    void testEqualsDifferentDisponivel() {
        Tshirt tshirt1 = new Tshirt("Descrição", "Marca", 100.0, true, 0, 1, 123L, 456L, Tamanho.M, Padrao.riscas);
        Tshirt tshirt2 = new Tshirt("Descrição", "Marca", 100.0, true, 0, 1, 123L, 456L, Tamanho.M, Padrao.riscas);
        tshirt1.setDisponivel(true);
        tshirt2.setDisponivel(false);
        assertFalse(tshirt1.equals(tshirt2));
    }

    @Test
    void testEqualsDifferentDataVenda() {
        Tshirt tshirt1 = new Tshirt("Descrição", "Marca", 100.0, true, 0, 1, 123L, 456L, Tamanho.M, Padrao.riscas);
        Tshirt tshirt2 = new Tshirt("Descrição", "Marca", 100.0, true, 0, 1, 123L, 456L, Tamanho.M, Padrao.riscas);
        tshirt1.setData_venda(LocalDate.of(2024, 5, 21));
        tshirt2.setData_venda(LocalDate.of(2024, 5, 22));
        assertFalse(tshirt1.equals(tshirt2));
    }

    @Test
    void testEqualsDifferentTamanho() {
        Tshirt tshirt1 = new Tshirt("Descrição", "Marca", 100.0, true, 0, 1, 123L, 456L, Tamanho.M, Padrao.riscas);
        Tshirt tshirt2 = new Tshirt("Descrição", "Marca", 100.0, true, 0, 1, 123L, 456L, Tamanho.L, Padrao.riscas);
        assertFalse(tshirt1.equals(tshirt2));
    }

    @Test
    void testEqualsDifferentPadrao() {
        Tshirt tshirt1 = new Tshirt("Descrição", "Marca", 100.0, true, 0, 1, 123L, 456L, Tamanho.M, Padrao.riscas);
        Tshirt tshirt2 = new Tshirt("Descrição", "Marca", 100.0, true, 0, 1, 123L, 456L, Tamanho.M, Padrao.liso);
        assertFalse(tshirt1.equals(tshirt2));
    }

    @Test
    void testEqualsIdenticalObjects() {
        Tshirt tshirt1 = new Tshirt("Descrição", "Marca", 100.0, true, 0, 1, 123L, 456L, Tamanho.M, Padrao.riscas);
        Tshirt tshirt2 = new Tshirt("Descrição", "Marca", 100.0, true, 0, 1, 123L, 456L, Tamanho.M, Padrao.riscas);
        tshirt1.setCodigo_barras("T1");
        tshirt2.setCodigo_barras("T1");

        // Verificação detalhada dos atributos antes da comparação
        Assertions.assertEquals(tshirt1.getDescricao(), tshirt2.getDescricao());
        Assertions.assertEquals(tshirt1.getMarca(), tshirt2.getMarca());
        Assertions.assertEquals(tshirt1.getPreco_base(), tshirt2.getPreco_base());
        Assertions.assertEquals(tshirt1.getNovo(), tshirt2.getNovo());
        Assertions.assertEquals(tshirt1.getEstado_uso(), tshirt2.getEstado_uso());
        Assertions.assertEquals(tshirt1.getN_utilizadores(), tshirt2.getN_utilizadores());
        Assertions.assertEquals(tshirt1.getIdTransportadora(), tshirt2.getIdTransportadora());
        Assertions.assertEquals(tshirt1.getIdVendedor(), tshirt2.getIdVendedor());
        Assertions.assertEquals(tshirt1.getCodigo_barras(), tshirt2.getCodigo_barras());
        Assertions.assertEquals(tshirt1.getTamanho(), tshirt2.getTamanho());
        Assertions.assertEquals(tshirt1.getPadrao(), tshirt2.getPadrao());

        // Verificação da igualdade
        Assertions.assertTrue(tshirt1.equals(tshirt2));
    }

    @Test
    void testPrecoAtual() {
        LocalDate data = LocalDate.of(2023, 5, 15);
        
        // Cenário 1: Padrão não liso e não novo
        tshirt1.setPadrao(Padrao.riscas);
        tshirt1.setNovo(false);
        double precoEsperado = tshirt1.getPreco_base() * 0.5;
        assertEquals(precoEsperado, tshirt1.preco_atual(data), 1e-6); // Tolerância de 1e-6

        // Cenário 2: Padrão liso ou novo
        tshirt1.setPadrao(Padrao.liso);
        precoEsperado = tshirt1.getPreco_base();
        assertEquals(precoEsperado, tshirt1.preco_atual(data), 1e-6); // Tolerância de 1e-6
        
        tshirt1.setPadrao(Padrao.riscas);
        tshirt1.setNovo(true);
        precoEsperado = tshirt1.getPreco_base();
        assertEquals(precoEsperado, tshirt1.preco_atual(data), 1e-6); // Tolerância de 1e-6
    }
}
