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
    void testEqualsSameObject() {
        Assertions.assertTrue(artigo.equals(artigo));
    }

    @Test
    void testEqualsNull() {
        Assertions.assertFalse(artigo.equals(null));
    }
    @Test
    void testEqualsDifferentClass() {
        String diferenteClasse = "string";
        Assertions.assertFalse(artigo.equals(diferenteClasse));
    }
    @Test
    void testEqualsDifferentDescricao() {
        Artigo artigo1 = new TestableArtigo("Descrição1", "Marca", 100.0, true, 0, 1, 123L, 456L);
        Artigo artigo2 = new TestableArtigo("Descrição2", "Marca", 100.0, true, 0, 1, 123L, 456L);
        Assertions.assertFalse(artigo1.equals(artigo2));
    }
    
    @Test
    void testEqualsDifferentCodigoBarras() {
        Artigo artigo1 = new TestableArtigo("Descrição", "Marca", 100.0, true, 0, 1, 123L, 456L);
        Artigo artigo2 = new TestableArtigo("Descrição", "Marca", 100.0, true, 0, 1, 123L, 456L);
        artigo1.setCodigo_barras("A1");
        artigo2.setCodigo_barras("A2");
        Assertions.assertFalse(artigo1.equals(artigo2));
    }


    @Test
    void testEqualsDifferentMarca() {
        Artigo artigo1 = new TestableArtigo("Descrição", "Marca1", 100.0, true, 0, 1, 123L, 456L);
        Artigo artigo2 = new TestableArtigo("Descrição", "Marca2", 100.0, true, 0, 1, 123L, 456L);
        Assertions.assertFalse(artigo1.equals(artigo2));
    }

    @Test
    void testEqualsDifferentPrecoBase() {
        Artigo artigo1 = new TestableArtigo("Descrição", "Marca", 100.0, true, 0, 1, 123L, 456L);
        Artigo artigo2 = new TestableArtigo("Descrição", "Marca", 200.0, true, 0, 1, 123L, 456L);
        Assertions.assertFalse(artigo1.equals(artigo2));
    }

    @Test
    void testEqualsDifferentNovo() {
        Artigo artigo1 = new TestableArtigo("Descrição", "Marca", 100.0, true, 0, 1, 123L, 456L);
        Artigo artigo2 = new TestableArtigo("Descrição", "Marca", 100.0, false, 0, 1, 123L, 456L);
        Assertions.assertFalse(artigo1.equals(artigo2));
    }

    @Test
    void testEqualsDifferentEstadoUso() {
        Artigo artigo1 = new TestableArtigo("Descrição", "Marca", 100.0, true, 0, 1, 123L, 456L);
        Artigo artigo2 = new TestableArtigo("Descrição", "Marca", 100.0, true, 1, 1, 123L, 456L);
        Assertions.assertFalse(artigo1.equals(artigo2));
    }

    @Test
    void testEqualsDifferentNUtilizadores() {
        Artigo artigo1 = new TestableArtigo("Descrição", "Marca", 100.0, true, 0, 1, 123L, 456L);
        Artigo artigo2 = new TestableArtigo("Descrição", "Marca", 100.0, true, 0, 2, 123L, 456L);
        Assertions.assertFalse(artigo1.equals(artigo2));
    }

    @Test
    void testEqualsDifferentIdTransportadora() {
        Artigo artigo1 = new TestableArtigo("Descrição", "Marca", 100.0, true, 0, 1, 123L, 456L);
        Artigo artigo2 = new TestableArtigo("Descrição", "Marca", 100.0, true, 0, 1, 124L, 456L);
        Assertions.assertFalse(artigo1.equals(artigo2));
    }

    @Test
    void testEqualsDifferentIdVendedor() {
        Artigo artigo1 = new TestableArtigo("Descrição", "Marca", 100.0, true, 0, 1, 123L, 456L);
        Artigo artigo2 = new TestableArtigo("Descrição", "Marca", 100.0, true, 0, 1, 123L, 457L);
        Assertions.assertFalse(artigo1.equals(artigo2));
    }

    @Test
    void testEqualsDifferentDisponivel() {
        Artigo artigo1 = new TestableArtigo("Descrição", "Marca", 100.0, true, 0, 1, 123L, 456L);
        Artigo artigo2 = new TestableArtigo("Descrição", "Marca", 100.0, true, 0, 1, 123L, 456L);
        artigo1.setDisponivel(true);
        artigo2.setDisponivel(false);
        Assertions.assertFalse(artigo1.equals(artigo2));
    }

    @Test
    void testEqualsDifferentDataVenda() {
        Artigo artigo1 = new TestableArtigo("Descrição", "Marca", 100.0, true, 0, 1, 123L, 456L);
        Artigo artigo2 = new TestableArtigo("Descrição", "Marca", 100.0, true, 0, 1, 123L, 456L);
        artigo1.setData_venda(LocalDate.of(2024, 5, 21));
        artigo2.setData_venda(LocalDate.of(2024, 5, 22));
        Assertions.assertFalse(artigo1.equals(artigo2));
    }

    @Test
    void testEqualsIdenticalObjects() {
        Artigo.setCodigo("A");
        Artigo.setContador(1);

        Artigo artigo1 = new TestableArtigo("Descrição", "Marca", 100.0, true, 0, 1, 123L, 456L);
        Artigo artigo2 = new TestableArtigo("Descrição", "Marca", 100.0, true, 0, 1, 123L, 456L);
        artigo1.setCodigo_barras("A1");
        artigo2.setCodigo_barras("A1");

        // Verificação detalhada dos atributos antes da comparação
        Assertions.assertEquals(artigo1.getDescricao(), artigo2.getDescricao());
        Assertions.assertEquals(artigo1.getMarca(), artigo2.getMarca());
        Assertions.assertEquals(artigo1.getPreco_base(), artigo2.getPreco_base());
        Assertions.assertEquals(artigo1.getNovo(), artigo2.getNovo());
        Assertions.assertEquals(artigo1.getEstado_uso(), artigo2.getEstado_uso());
        Assertions.assertEquals(artigo1.getN_utilizadores(), artigo2.getN_utilizadores());
        Assertions.assertEquals(artigo1.getIdTransportadora(), artigo2.getIdTransportadora());
        Assertions.assertEquals(artigo1.getIdVendedor(), artigo2.getIdVendedor());
        Assertions.assertEquals(artigo1.getCodigo_barras(), artigo2.getCodigo_barras());

        // Verificação da igualdade
        Assertions.assertTrue(artigo1.equals(artigo2));
}

    @Test
    void testToString() {
        Artigo.setCodigo("A");
        Artigo.setContador(1);
        artigo = new TestableArtigo("Descrição", "Marca", 100.0, true, 0, 1, 123L, 456L);
        artigo.setData_venda(LocalDate.of(2024, 5, 21));
    
        String expected = "Artigo:: { Código de barras: A1 Descrição: Descrição Marca: Marca Preço base: 100.0 Novo: true Estado de uso: 0 Número de utilizadores: 1 Disponivel: true Id da transportadora: 123 Id do vendedor: 456 Data de venda: 2024-05-21 }";
        Assertions.assertEquals(expected, artigo.toString().trim());
    }

    @Test
    void testMostrar() {
        artigo.setPreco_base(100.0);
        LocalDate date = LocalDate.now();
        String result = artigo.mostrar(date);
        Assertions.assertTrue(result.contains(" Preço atual: 110,00€ "));
    }

    // Testes para todos os métodos set
    @Test
    void testSetDescricao() {
        artigo.setDescricao("Nova Descrição");
        Assertions.assertEquals("Nova Descrição", artigo.getDescricao());
    }

    @Test
    void testSetMarca() {
        artigo.setMarca("Nova Marca");
        Assertions.assertEquals("Nova Marca", artigo.getMarca());
    }

    @Test
    void testSetPrecoBase() {
        artigo.setPreco_base(200.0);
        Assertions.assertEquals(200.0, artigo.getPreco_base());
    }

    @Test
    void testSetNovo() {
        artigo.setNovo(true);
        Assertions.assertTrue(artigo.getNovo());
    }

    @Test
    void testSetEstadoUso() {
        artigo.setEstado_uso(2);
        Assertions.assertEquals(2, artigo.getEstado_uso());
    }

    @Test
    void testSetNUtilizadores() {
        artigo.setN_utilizadores(10);
        Assertions.assertEquals(10, artigo.getN_utilizadores());
    }

    @Test
    void testSetTransportadora() {
        artigo.setTransportadora(999L);
        Assertions.assertEquals(999L, artigo.getIdTransportadora());
    }

    @Test
    void testSetVendedor() {
        artigo.setVendedor(888L);
        Assertions.assertEquals(888L, artigo.getIdVendedor());
    }

    @Test
    void testSetDisponivel() {
        artigo.setDisponivel(true);
        Assertions.assertTrue(artigo.getDisponivel());
    }

    @Test
    void testSetDataVenda() {
        LocalDate dataVenda = LocalDate.of(2024, 5, 21);
        artigo.setData_venda(dataVenda);
        Assertions.assertEquals(dataVenda, artigo.getData_venda());
    }
    
        @Test
        void testSetCodigoBarras() {
            String novoCodigo = "XYZ123";
            artigo.setCodigo_barras(novoCodigo);
            Assertions.assertEquals(novoCodigo, artigo.getCodigo_barras());
        }
}
