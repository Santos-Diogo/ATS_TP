/* import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;
import java.util.Set;

class Gestor_ArtigosTest {
    private Gestor_Artigos gestorArtigos;
    private Artigo artigo1, artigo2, artigo3;

    @BeforeEach
    void setUp() {
        Gestor_Artigos.setTaxaNovo(0.5);
        Gestor_Artigos.setTaxaUsado(0.25);

        gestorArtigos = new Gestor_Artigos();
        artigo1 = new Sapatilha("Descricao1", "Marca1", 100.0, true, 0, 1, 1L, 1L, 42, true, "Preto", 2022, true, 0.1);
        artigo2 = new Tshirt("Descricao2", "Marca2", 50.0, false, 1, 2, 2L, 2L, Tamanho.M, Padrao.liso);
        artigo3 = new Mala("Descricao3", "Marca3", 150.0, true, 2, 3, 3L, 3L, 30, "Couro", 2021, true, 0.2f); // Note o 'f' após 0.2

        gestorArtigos.criar_artigo_sapatilhas("Descricao1", "Marca1", 100.0, true, 0, 1, 1L, 1L, 42, true, "Preto", 2022, true, 0.1);
        gestorArtigos.criar_artigo_tshirt("Descricao2", "Marca2", 50.0, false, 1, 2, 2L, 2L, Tamanho.M, Padrao.liso);
        gestorArtigos.criar_artigo_mala("Descricao3", "Marca3", 150.0, true, 2, 3, 3L, 3L, 30, "Couro", 2021, true, 0.2f); // Note o 'f' após 0.2    }
    }

    @Test
    void testGetTaxaNovo() {
        assertEquals(0.5, Gestor_Artigos.getTaxaNovo());
    }

    @Test
    void testGetTaxaUsado() {
        assertEquals(0.25, Gestor_Artigos.getTaxaUsado());
    }

    @Test
    void testSetTaxaNovo() {
        Gestor_Artigos.setTaxaNovo(0.6);
        assertEquals(0.6, Gestor_Artigos.getTaxaNovo());
    }

    @Test
    void testSetTaxaUsado() {
        Gestor_Artigos.setTaxaUsado(0.3);
        assertEquals(0.3, Gestor_Artigos.getTaxaUsado());
    }

    @Test
    void testGetArtigos() {
        Map<String, Artigo> artigos = gestorArtigos.getArtigos();
        assertNotNull(artigos);
        assertEquals(3, artigos.size());
    }

    @Test
    void testSetArtigos() {
        Map<String, Artigo> novosArtigos = new HashMap<>();
        novosArtigos.put(artigo1.getCodigo_barras(), artigo1);
        novosArtigos.put(artigo2.getCodigo_barras(), artigo2);
        novosArtigos.put(artigo3.getCodigo_barras(), artigo3);
        gestorArtigos.setArtigos(novosArtigos);
        assertEquals(novosArtigos, gestorArtigos.getArtigos());
    }

    @Test
    void testToString() {
        String result = gestorArtigos.toString();
        assertTrue(result.contains("Descricao1"));
        assertTrue(result.contains("Descricao2"));
        assertTrue(result.contains("Descricao3"));
    }

    @Test
    void testMostrarGestor() {
        String result = gestorArtigos.mostrar_gestor(LocalDate.now());
        assertTrue(result.contains("Descricao1"));
        assertTrue(result.contains("Descricao2"));
        assertTrue(result.contains("Descricao3"));
    }

    @Test
    void testPesquisarArtigoId() {
        assertTrue(gestorArtigos.pesquisar_artigo_id(artigo1.getCodigo_barras()));
        assertFalse(gestorArtigos.pesquisar_artigo_id("Art4"));
    }

    @Test
    void testEquals() {
        Gestor_Artigos outroGestor = new Gestor_Artigos(gestorArtigos);
        assertEquals(gestorArtigos, outroGestor);
    }

    @Test
    void testClone() {
        Gestor_Artigos clone = gestorArtigos.clone();
        assertEquals(gestorArtigos, clone);
        assertNotSame(gestorArtigos, clone);
    }

    @Test
    void testPesquisarArtigosMarcaSapatilha() {
        String result = gestorArtigos.pesquisar_artigos_marca_sapatilha("Marca1");
        assertTrue(result.contains("Descricao1"));
    }

    @Test
    void testPesquisarArtigosMarcaTshirt() {
        String result = gestorArtigos.pesquisar_artigos_marca_tshirt("Marca2");
        assertTrue(result.contains("Descricao2"));
    }

    @Test
    void testPesquisarArtigosMarcaMala() {
        String result = gestorArtigos.pesquisar_artigos_marca_mala("Marca3");
        assertTrue(result.contains("Descricao3"));
    }

    @Test
    void testPesquisarArtigosNovoSapatilhas() {
        String result = gestorArtigos.pesquisar_artigos_novo_sapatilhas(true);
        assertTrue(result.contains("Descricao1"));
    }

    @Test
    void testPesquisarArtigosNovoTshirt() {
        String result = gestorArtigos.pesquisar_artigos_novo_tshirt(false);
        assertTrue(result.contains("Descricao2"));
    }

    @Test
    void testPesquisarArtigosNovoMala() {
        String result = gestorArtigos.pesquisar_artigos_novo_mala(true);
        assertTrue(result.contains("Descricao3"));
    }

    @Test
    void testPesquipesquisarArtigosTamanhoSapatilhas() {
        String result = gestorArtigos.pesquipesquisar_artigos_tamanho_sapatilhas(42);
        assertTrue(result.contains("Descricao1"));
    }

    @Test
    void testPesquipesquisarArtigosTamanhoTshit() {
        String result = gestorArtigos.pesquipesquisar_artigos_tamanho__tshit(Tamanho.M);
        assertTrue(result.contains("Descricao2"));
    }

    @Test
    void testPesquisarArtigosDimensãoMala() {
        String result = gestorArtigos.pesquisar_artigos_dimensão_mala(30);
        assertTrue(result.contains("Descricao3"));
    }

    @Test
    void testPesquisarArtigosCor() {
        String result = gestorArtigos.pesquisar_artigos_cor("Preto");
        assertTrue(result.contains("Descricao1"));
    }

    @Test
    void testPesquisarArtigosPadrao() {
        String result = gestorArtigos.pesquisar_artigos_padrao(Padrao.liso);
        assertTrue(result.contains("Descricao2"));
    }

    @Test
    void testPesquisarArtigosMaterial() {
        String result = gestorArtigos.pesquisar_artigos_material("Couro");
        assertTrue(result.contains("Descricao3"));
    }

    @Test
    void testPesquisarArtigosAnoColecao() {
        String result = gestorArtigos.pesquisar_artigos_ano_colecao(2021);
        assertTrue(result.contains("Descricao3"));
    }

    @Test
    void testTirarDisponivelArtigo() {
        assertDoesNotThrow(() -> gestorArtigos.tirar_disponivel_artigo(artigo1.getCodigo_barras()));
        assertFalse(artigo1.getDisponivel());
    }

    @Test
    void testColocarDisponivelArtigo() {
        assertDoesNotThrow(() -> {
            gestorArtigos.tirar_disponivel_artigo(artigo1.getCodigo_barras()); // First make it unavailable
            gestorArtigos.colocar_disponivel_artigo(artigo1.getCodigo_barras());
        });
        assertTrue(artigo1.getDisponivel());
    }

    @Test
    void testIdArtigoParaIdVendedor() {
        Long idVendedor = gestorArtigos.id_artigo_para_id_vendedor(artigo1.getCodigo_barras());
        assertEquals(1L, idVendedor);
    }

    @Test
    void testIdArtigoParaIdTransportadora() {
        Long idTransportadora = gestorArtigos.id_artigo_para_id_transportadora(artigo1.getCodigo_barras());
        assertEquals(1L, idTransportadora);
    }

    @Test
    void testArtigoToString() {
        String result = gestorArtigos.artigoToString(artigo1.getCodigo_barras());
        assertTrue(result.contains("Descricao1"));
    }

    @Test
    void testAlteraData() {
        Set<String> idsArtigos = new HashSet<>();
        idsArtigos.add(artigo1.getCodigo_barras());
        Encomenda encomenda = new Encomenda(idsArtigos, 1L, Dimensao.Medio, LocalDate.now());
        encomenda.setDataEntrega(LocalDate.now());
        gestorArtigos.alteraData(encomenda);
        assertEquals(LocalDate.now(), artigo1.getData_venda());
    }

    @Test
    void testAlteraDataToInicio() {
        gestorArtigos.alteraDataToInicio(artigo1.getCodigo_barras());
        assertEquals(LocalDate.MIN, artigo1.getData_venda());
    }

    @Test
    void testVendaTotal() {
        Set<String> idsArtigos = new HashSet<>();
        idsArtigos.add(artigo1.getCodigo_barras());
        double totalVenda = gestorArtigos.vendaTotal(idsArtigos, LocalDate.now());
        assertEquals(100.0, totalVenda);
    }

    @Test
    void testPrecoFaturou() {
        Set<String> idsArtigos = new HashSet<>();
        idsArtigos.add(artigo1.getCodigo_barras());
        double totalPreco = gestorArtigos.precoFaturou(idsArtigos, LocalDate.now());
        assertEquals(99.5, totalPreco); // 100.0 (preço atual) - 0.5 (taxa novo)
    }

    @Test
    void testPrecoFaturouTempo() {
        Set<String> idsArtigos = new HashSet<>();
        idsArtigos.add(artigo1.getCodigo_barras());
        double totalPreco = gestorArtigos.precoFaturouTempo(idsArtigos, LocalDate.now().minusDays(1), LocalDate.now().plusDays(1));
        assertEquals(99.5, totalPreco); // 100.0 (preço atual) - 0.5 (taxa novo)
    }

    @Test
    void testVintageFaturou() {
        artigo1.setData_venda(LocalDate.now());
        double totalVintage = gestorArtigos.vintageFaturou();
        assertEquals(0.5, totalVintage); // taxaNovo = 0.5
    }

    @Test
    void testEntreDatas() {
        Set<String> idsArtigos = new HashSet<>();
        idsArtigos.add(artigo1.getCodigo_barras());
        int quantidade = gestorArtigos.entreDatas(idsArtigos, LocalDate.now().minusDays(1), LocalDate.now().plusDays(1));
        assertEquals(1, quantidade);
    }
}
 */