import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;
class Gestor_ArtigosTest {
    private Gestor_Artigos gestorArtigos;
    private String codigoBarrasArtigo1, codigoBarrasArtigo2, codigoBarrasArtigo3;

    @BeforeEach
    void setUp() {
        Gestor_Artigos.setTaxaNovo(0.5);
        Gestor_Artigos.setTaxaUsado(0.25);

        gestorArtigos = new Gestor_Artigos();
        codigoBarrasArtigo1 = gestorArtigos.criar_artigo_sapatilhas("Descricao1", "Marca1", 100.0, true, 0, 1, 1L, 1L, 42, true, "Preto", 2022, true, 0.1);
        codigoBarrasArtigo2 = gestorArtigos.criar_artigo_tshirt("Descricao2", "Marca2", 50.0, false, 1, 2, 2L, 2L, Tamanho.M, Padrao.liso);
        codigoBarrasArtigo3 = gestorArtigos.criar_artigo_mala("Descricao3", "Marca3", 150.0, true, 2, 3, 3L, 3L, 30, "Couro", 2021, true, 0.2f);
    }

    @Test
    void testGestorArtigosInitialization() {
        Map<Integer, Artigo> initialMap = new HashMap<>();
        Gestor_Artigos gestor = new Gestor_Artigos(initialMap);

        assertNotNull(gestor.getArtigos(), "O campo artigos deve ser inicializado");
        assertTrue(gestor.getArtigos().isEmpty(), "O campo artigos deve estar vazio após a inicialização");
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
        novosArtigos.put(codigoBarrasArtigo1, gestorArtigos.getArtigos().get(codigoBarrasArtigo1));
        novosArtigos.put(codigoBarrasArtigo2, gestorArtigos.getArtigos().get(codigoBarrasArtigo2));
        novosArtigos.put(codigoBarrasArtigo3, gestorArtigos.getArtigos().get(codigoBarrasArtigo3));
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
        assertTrue(gestorArtigos.pesquisar_artigo_id(codigoBarrasArtigo1));
        assertFalse(gestorArtigos.pesquisar_artigo_id("Art4"));
    }

    @Test
    void testEquals() {
        // Cria um novo gestor com os mesmos dados
        Gestor_Artigos outroGestor = new Gestor_Artigos(gestorArtigos);
        assertEquals(gestorArtigos, outroGestor);
    
        // Verifica se o mesmo objeto é igual a si próprio
        assertEquals(gestorArtigos, gestorArtigos);
    
        // Verifica se objetos diferentes são diferentes
        Gestor_Artigos gestorDiferente = new Gestor_Artigos();
        assertNotEquals(gestorArtigos, gestorDiferente);
    
        // Verifica se é diferente de null
        assertNotEquals(gestorArtigos, null);
    
        // Verifica se é diferente de um objeto de outra classe
        assertNotEquals(gestorArtigos, "String diferente");
    
        // Adiciona um artigo diferente ao outroGestor e verifica se eles são diferentes
        outroGestor.criar_artigo_sapatilhas("DescricaoDiferente", "MarcaDiferente", 200.0, true, 0, 1, 2L, 2L, 42, true, "Azul", 2023, true, 0.1);
        assertNotEquals(gestorArtigos, outroGestor);
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
        // Caso onde o artigo existe
        assertDoesNotThrow(() -> gestorArtigos.tirar_disponivel_artigo(codigoBarrasArtigo1));
        assertFalse(gestorArtigos.getArtigos().get(codigoBarrasArtigo1).getDisponivel());
    
        // Caso onde o artigo não existe
        String codigoBarrasInvalido = "codigoInvalido";
        Exception exception = assertThrows(ArtigoNaoEncontradoException.class, () -> gestorArtigos.tirar_disponivel_artigo(codigoBarrasInvalido));
        assertEquals("O artigo " + codigoBarrasInvalido + " não existe!", exception.getMessage());
    }
    

    @Test
    void testColocarDisponivelArtigo() {
        // Caso onde o artigo existe
        assertDoesNotThrow(() -> {
            gestorArtigos.tirar_disponivel_artigo(codigoBarrasArtigo1); // First make it unavailable
            gestorArtigos.colocar_disponivel_artigo(codigoBarrasArtigo1);
        });
        assertTrue(gestorArtigos.getArtigos().get(codigoBarrasArtigo1).getDisponivel());
    
        // Caso onde o artigo não existe
        String codigoBarrasInvalido = "codigoInvalido";
        Exception exception = assertThrows(ArtigoNaoEncontradoException.class, () -> gestorArtigos.colocar_disponivel_artigo(codigoBarrasInvalido));
        assertEquals("O artigo " + codigoBarrasInvalido + " não existe!", exception.getMessage());
    }
    

    @Test
    void testIdArtigoParaIdVendedor() {
        Long idVendedor = gestorArtigos.id_artigo_para_id_vendedor(codigoBarrasArtigo1);
        assertEquals(1L, idVendedor);
    }

    @Test
    void testIdArtigoParaIdTransportadora() {
        Long idTransportadora = gestorArtigos.id_artigo_para_id_transportadora(codigoBarrasArtigo1);
        assertEquals(1L, idTransportadora);
    }

    @Test
    void testArtigoToString() {
        String result = gestorArtigos.artigoToString(codigoBarrasArtigo1);
        assertTrue(result.contains("Descricao1"));
    }

    @Test
    void testAlteraData() throws ArtigoNaoEncontradoException {
        Set<String> idsArtigos = new HashSet<>();
        idsArtigos.add(codigoBarrasArtigo1);
        Encomenda encomenda = new Encomenda(idsArtigos, 1L, Dimensao.Medio, LocalDate.now());
        encomenda.setDataEntrega(LocalDate.now());
        
        // Caso onde o artigo está indisponível
        gestorArtigos.tirar_disponivel_artigo(codigoBarrasArtigo1); // Certifique-se de que o artigo está indisponível antes de alterar a data
        gestorArtigos.alteraData(encomenda);
        assertEquals(LocalDate.now(), gestorArtigos.getArtigos().get(codigoBarrasArtigo1).getData_venda());
        
        // Caso onde o artigo está disponível
        gestorArtigos.colocar_disponivel_artigo(codigoBarrasArtigo1); // Certifique-se de que o artigo está disponível
        LocalDate dataVendaAntes = gestorArtigos.getArtigos().get(codigoBarrasArtigo1).getData_venda();
        gestorArtigos.alteraData(encomenda);
        LocalDate dataVendaDepois = gestorArtigos.getArtigos().get(codigoBarrasArtigo1).getData_venda();
        
        // Verifique se a data de venda permanece inalterada
        assertEquals(dataVendaAntes, dataVendaDepois);
    }

    @Test
    void testAlteraDataToInicio() {
        gestorArtigos.alteraDataToInicio(codigoBarrasArtigo1);
        assertEquals(LocalDate.MIN, gestorArtigos.getArtigos().get(codigoBarrasArtigo1).getData_venda());
    }

    @Test
    void testVendaTotal() {
        Set<String> idsArtigos = new HashSet<>();
        idsArtigos.add(codigoBarrasArtigo1);
        idsArtigos.add(codigoBarrasArtigo2);
        idsArtigos.add(codigoBarrasArtigo3);
    
        // Certifique-se de que as datas de venda e os preços estão configurados corretamente
        gestorArtigos.getArtigos().get(codigoBarrasArtigo1).setData_venda(LocalDate.now());
        gestorArtigos.getArtigos().get(codigoBarrasArtigo2).setData_venda(LocalDate.now());
        gestorArtigos.getArtigos().get(codigoBarrasArtigo3).setData_venda(LocalDate.now());
    
        double totalVenda = gestorArtigos.vendaTotal(idsArtigos, LocalDate.now());
        double precoEsperadoArtigo1 = gestorArtigos.getArtigos().get(codigoBarrasArtigo1).preco_atual(LocalDate.now());
        double precoEsperadoArtigo2 = gestorArtigos.getArtigos().get(codigoBarrasArtigo2).preco_atual(LocalDate.now());
        double precoEsperadoArtigo3 = gestorArtigos.getArtigos().get(codigoBarrasArtigo3).preco_atual(LocalDate.now());
    
        double totalEsperado = precoEsperadoArtigo1 + precoEsperadoArtigo2 + precoEsperadoArtigo3;
        assertEquals(totalEsperado, totalVenda);
    }

    @Test
    void testPrecoFaturou() {
        Set<String> idsArtigos = new HashSet<>();
        idsArtigos.add(codigoBarrasArtigo1);
        idsArtigos.add(codigoBarrasArtigo2);
    
        // Configurar as datas de venda e os estados dos artigos
        LocalDate dataVenda = LocalDate.now();
        gestorArtigos.getArtigos().get(codigoBarrasArtigo1).setData_venda(dataVenda);
        gestorArtigos.getArtigos().get(codigoBarrasArtigo2).setData_venda(dataVenda);
    
        gestorArtigos.getArtigos().get(codigoBarrasArtigo1).setNovo(true);
        gestorArtigos.getArtigos().get(codigoBarrasArtigo2).setNovo(false);
    
        // Calcular o preço esperado para cada artigo
        double precoEsperadoArtigo1 = gestorArtigos.getArtigos().get(codigoBarrasArtigo1).preco_atual(dataVenda) - Gestor_Artigos.getTaxaNovo();
        double precoEsperadoArtigo2 = gestorArtigos.getArtigos().get(codigoBarrasArtigo2).preco_atual(dataVenda) - Gestor_Artigos.getTaxaUsado();
    
        // Somar os preços esperados para obter o preço total esperado
        double precoEsperado = precoEsperadoArtigo1 + precoEsperadoArtigo2;
    
        double totalPreco = gestorArtigos.precoFaturou(idsArtigos, dataVenda);
    
        assertEquals(precoEsperado, totalPreco, "The actual price did not match the expected price");
    }
    

    @Test //O resto das linhas tem a ver com datas
    void testPrecoFaturouTempoEmptyInput() {
        Set<String> idsArtigos = new HashSet<>();
        LocalDate inicio = LocalDate.of(2022, 1, 1);
        LocalDate fim = LocalDate.of(2022, 12, 31);

        double result = gestorArtigos.precoFaturouTempo(idsArtigos, inicio, fim);

        assertEquals(0, result, "Expected 0 for empty input set");
    }

    /* @Test
    void testPrecoFaturouTempoArtigosNovosDentroDoIntervalo() {
    Set<String> idsArtigos = new HashSet<>();
    idsArtigos.add(codigoBarrasArtigo1);

    LocalDate inicio = LocalDate.of(2021, 1, 1);
    LocalDate fim = LocalDate.of(2023, 12, 31);

    // Configurar a data de venda e o estado do artigo
    LocalDate dataVenda = LocalDate.of(2022, 5, 15);
    gestorArtigos.getArtigos().get(codigoBarrasArtigo1).setData_venda(dataVenda);
    gestorArtigos.getArtigos().get(codigoBarrasArtigo1).setNovo(true);

    // Calcular o preço esperado
    double precoAtual = gestorArtigos.getArtigos().get(codigoBarrasArtigo1).preco_atual(dataVenda);
    double expectedPrice = precoAtual - Gestor_Artigos.getTaxaNovo();

    // Debugging prints
    System.out.println("Data de venda: " + dataVenda);
    System.out.println("Preço atual do artigo: " + precoAtual);
    System.out.println("Taxa novo: " + Gestor_Artigos.getTaxaNovo());
    System.out.println("Preço esperado: " + expectedPrice);

    double actualPrice = gestorArtigos.precoFaturouTempo(idsArtigos, inicio, fim);

    // Verificação do resultado
    System.out.println("Preço calculado: " + actualPrice);

    assertEquals(expectedPrice, actualPrice, "The actual price for new articles within the interval did not match the expected price");
    } */

    

    

    @Test //O resto das linhas tem a ver com datas
    void testVintageFaturou() {
        double expectedPrice = 0; // Replace with the expected price
        double actualPrice = gestorArtigos.vintageFaturou();

        assertEquals(expectedPrice, actualPrice, "The actual price did not match the expected price");
    }

    @Test //O resto das linhas tem a ver com datas
    void testEntreDatas() {
        Set<String> idsArtigos = new HashSet<>();
        idsArtigos.add(codigoBarrasArtigo1);
        idsArtigos.add(codigoBarrasArtigo2);
        idsArtigos.add(codigoBarrasArtigo3);

        LocalDate inicio = LocalDate.of(2021, 1, 1);
        LocalDate fim = LocalDate.of(2023, 12, 31);

        int expectedQuantity = 0; // Replace with the expected quantity
        int actualQuantity = gestorArtigos.entreDatas(idsArtigos, inicio, fim);

        assertEquals(expectedQuantity, actualQuantity, "The actual quantity did not match the expected quantity");
    }
}



