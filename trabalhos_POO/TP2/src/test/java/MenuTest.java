import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.time.LocalDate;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class MenuTest {

    private Menu menu;

    @BeforeEach
    void setUp() {
        menu = new Menu();
    }

    @Test
    void testIniciarMenu() {
        String input = "1";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        int escolha = menu.iniciar_menu();
        assertEquals(1, escolha);
    }

/*     @Test
    void testIniciarMenuInvalidInput() {
        String input = "invalid\n1";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        int escolha = menu.iniciar_menu();
        assertEquals(1, escolha);
    }

    @Test
    void testIniciarMenuOutOfRange() {
        String input = "8\n1";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        int escolha = menu.iniciar_menu();
        assertEquals(1, escolha);
    } */

    @Test
    void testTempoVintage() {
        menu.tempo_vintage("2024-05-25");
    }

    @Test
    void testClear() {
        menu.clear();
    }

    @Test
    void testPedirEmail() {
        String input = "test@example.com";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        String email = menu.pedir_email();
        assertEquals("test@example.com", email);
    }

    @Test
    void testPedirNome() {
        String input = "John Doe";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        String nome = menu.pedir_nome();
        assertEquals("John Doe", nome);
    }

    @Test
    void testPedirNif() {
        String input = "123456789";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        long nif = menu.pedir_nif();
        assertEquals(123456789, nif);
    }

    @Test
    void testPedirMorada() {
        String input = "Lisboa\nRua 1";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        String morada = menu.pedir_morada();
        assertEquals("Lisboa Rua 1", morada);
    }

    @Test
    void testPedirPassword() {
        String input = "password";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        String password = menu.pedir_password();
        assertEquals("password", password);
    }

    @Test
    void testEmailNaoExiste() {
        menu.email_nao_existe();
    }

    @Test
    void testPasswordIncorreta() {
        menu.password_incorreta();
    }

    @Test
    void testLoginSucesso() {
        menu.login_sucesso();
    }

    @Test
    void testLogin() {
        menu.login();
    }

    @Test
    void testRegisto() {
        menu.registo();
    }

    @Test
    void testRegistoSucesso() {
        menu.registo_sucesso();
    }

    @Test
    void testEmailJaExistePrint() {
        menu.email_ja_existe_print();
    }

    @Test
    void testSairPrint() {
        menu.sair_print();
    }

    @Test
    void testMenuEscolha() {
        String input = "1";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        int escolha = menu.menu_escolha();
        assertEquals(1, escolha);
    }

    @Test
    void testMenuFaturas() {
        String input = "1";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        int escolha = menu.menu_faturas();
        assertEquals(1, escolha);
    }

    @Test
    void testFaturasCompras() {
        menu.faturas_compras();
    }

    @Test
    void testFaturasVendas() {
        menu.faturas_vendas();
    }

    @Test
    void testPrintDeComprar() {
        menu.print_de_comprar();
    }

    @Test
    void testMenuPesquisas() {
        String input = "1";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        int escolha = menu.menu_pesquisas();
        assertEquals(1, escolha);
    }

    @Test
    void testArtigoNEncontrado() {
        menu.artigo_n_encontrado();
    }

    @Test
    void testPedirIdArtigo() {
        String input = "A123";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        String id = menu.pedir_id_artigo();
        assertEquals("A123", id);
    }

    @Test
    void testMenuPesquisasTipo() {
        String input = "1";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        int escolha = menu.menu_pesquisas_tipo();
        assertEquals(1, escolha);
    }

    @Test
    void testMenuSapatilhaPesquisa() {
        String input = "1";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        int escolha = menu.menu_sapatilha_pesquisa();
        assertEquals(1, escolha);
    }

    @Test
    void testMenuTshirtPesquisa() {
        String input = "1";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        int escolha = menu.menu_tshirt_pesquisa();
        assertEquals(1, escolha);
    }

    @Test
    void testMenuMalasPesquisa() {
        String input = "1";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        int escolha = menu.menu_malas_pesquisa();
        assertEquals(1, escolha);
    }

    @Test
    void testPedirMarca() {
        String input = "Nike";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        String marca = menu.pedir_marca();
        assertEquals("Nike", marca);
    }

    @Test
    void testPedirTamanhoSapatilha() {
        String input = "42";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        int tamanho = menu.pedir_tamanho_sapatilha();
        assertEquals(42, tamanho);
    }

    @Test
    void testPedirTamanhoTshirt() {
        String input = "M";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        Tamanho tamanho = menu.pedir_tamanho_tshirt();
        assertEquals(Tamanho.M, tamanho);
    }

    @Test
    void testPedirTamanhoMala() {
        String input = "50";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        int tamanho = menu.pedir_tamanho_mala();
        assertEquals(50, tamanho);
    }

    @Test
    void testPedirNumeroUtilizador() {
        String input = "3";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        int numero = menu.pedir_numero_utlizador();
        assertEquals(3, numero);
    }

    @Test
    void testPedirEstado() {
        String input = "5";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        int estado = menu.pedir_estado();
        assertEquals(5, estado);
    }

    @Test
    void testAtacadores() {
        String input = "true";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        boolean atacadores = menu.atacadores();
        assertTrue(atacadores);
    }

    @Test
    void testPedirCor() {
        String input = "Azul";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        String cor = menu.pedir_cor();
        assertEquals("Azul", cor);
    }

    @Test
    void testPedirNovo() {
        String input = "true";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        boolean novo = menu.pedir_novo();
        assertTrue(novo);
    }

    @Test
    void testPesquisaFalhou() {
        menu.pesquisa_falhou();
    }

    @Test
    void testPedirPadrao() {
        String input = "liso";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        Padrao padrao = menu.pedir_padrao();
        assertEquals(Padrao.liso, padrao);
    }

    @Test
    void testPedirAno() {
        String input = "2023";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        int ano = menu.pedir_ano();
        assertEquals(2023, ano);
    }

    @Test
    void testPedirMaterial() {
        String input = "Couro";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        String material = menu.pedir_material();
        assertEquals("Couro", material);
    }

    @Test
    void testPedirDimensao() {
        String input = "30";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        int dimensao = menu.pedir_dimensao();
        assertEquals(30, dimensao);
    }

    @Test
    void testPedirAnoColecao() {
        String input = "2022";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        int ano = menu.pedir_ano_colecao(LocalDate.now());
        assertEquals(2022, ano);
    }

    @Test
    void testMenuVenda() {
        String input = "1";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        int escolha = menu.menu_venda();
        assertEquals(1, escolha);
    }

    @Test
    void testArtigoAVenda() {
        menu.artigo_a_venda();
    }

    @Test
    void testMeusArtigos() {
        menu.meusArtigos();
    }

    @Test
    void testArtigoRetirado() {
        menu.artigo_retirado();
    }

    @Test
    void testMenuVendaTipos() {
        String input = "1";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        int escolha = menu.menu_venda_tipos();
        assertEquals(1, escolha);
    }

    @Test
    void testPrintTirarProdutosVenda() {
        menu.print_tirar_produtos_venda();
    }

    @Test
    void testPedirData() {
        String input = "2023-05-25";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        LocalDate data = menu.pedir_data();
        assertEquals(LocalDate.of(2023, 5, 25), data);
    }

/*     @Test
    void testPedirPreco() {
        String input = "100.50";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        double preco = menu.pedir_preco();
        assertEquals(100.50, preco);
    } */

/*     @Test
    void testPedirDesconto() {
        String input = "10.5";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        double desconto = menu.pedir_desconto();
        assertEquals(10.5, desconto);
    } */

    @Test
    void testMenuTransportadoras() {
        String input = "1";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        int escolha = menu.menuTrasnportadoras();
        assertEquals(1, escolha);
    }

    @Test
    void testPedirNomeTransportadora() {
        String input = "Transportadora X";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        String nome = menu.pedirNomeTransportadora();
        assertEquals("Transportadora X", nome);
    }

    @Test
    void testPrintTransportadoras() {
        menu.print_transportadoras();
    }

    @Test
    void testPedirTransportadora() {
        String input = "12345";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        long numero = menu.pedir_transportadora();
        assertEquals(12345, numero);
    }

    @Test
    void testPedirDescricao() {
        String input = "Descrição do artigo";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        String descricao = menu.pedir_descricao();
        assertEquals("Descrição do artigo", descricao);
    }

    @Test
    void testPedirPremium() {
        String input = "true";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        boolean premium = menu.pedir_premium();
        assertTrue(premium);
    }

/*     @Test
    void testPedirValorizacao() {
        String input = "5.5";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        float valorizacao = menu.pedir_valorizacao();
        assertEquals(5.5f, valorizacao);
    } */

    @Test
    void testMenuEncomendas() {
        String input = "1";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        int escolha = menu.menu_encomedas();
        assertEquals(1, escolha);
    }

    @Test
    void testPrintCarrinho() {
        menu.print_carrinho();
    }

    @Test
    void testPedirArtigoAdicionar() {
        String input = "A123";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        String artigo = menu.pedir_artigo_adicionar();
        assertEquals("A123", artigo);
    }

    @Test
    void testPedirArtigoRemover() {
        String input = "A123";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        String artigo = menu.pedir_artigo_remover();
        assertEquals("A123", artigo);
    }

    @Test
    void testImprimir() {
        menu.imprimir("Teste de impressão");
    }

    @Test
    void testEncomendaId() {
        String input = "12345";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        long id = menu.encomeda_id();
        assertEquals(12345, id);
    }

    @Test
    void testPrintEncomendasRealizadas() {
        menu.print_encomendas_realizadas();
    }

    @Test
    void testEncomendasRetiradas() {
        menu.encomendas_retiradas();
    }

    @Test
    void testEncomendasDevolvidas() {
        menu.encomedas_devolvidas();
    }

    @Test
    void testFinalizar() {
        menu.finalizar();
    }

    @Test
    void testAdicionarTransportadora() {
        menu.adicionar_trasnportadora();
    }

/*     @Test
    void testPedirValorPequeno() {
        String input = "10.5";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        double valor = menu.pedir_valor_pequeno();
        assertEquals(10.5, valor);
    } */

/*     @Test
    void testPedirValorMedio() {
        String input = "15.5";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        double valor = menu.pedir_valor_medio();
        assertEquals(15.5, valor);
    } */

    @Test
    void testPrecoFinal() {
        menu.preco_final();
    }

/*     @Test
    void testPedirValorGrande() {
        String input = "20.5";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        double valor = menu.pedir_valor_grande();
        assertEquals(20.5, valor);
    } */

/*     @Test
    void testPedirImpostos() {
        String input = "23.5";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        double impostos = menu.pedir_impostos();
        assertEquals(23.5 / 100, impostos);
    } */

/*     @Test
    void testPedirMargemLucro() {
        String input = "30.5";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        double margem = menu.pedir_margem_lucro();
        assertEquals(30.5 / 100, margem);
    } */

    @Test
    void testPedirFormula() {
        String input = "1";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        int formula = menu.pedir_formula(3);
        assertEquals(1, formula);
    }

    @Test
    void testPerguntarSair() {
        String input = "true";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        boolean sair = menu.perguntar_sair();
        assertTrue(sair);
    }

    @Test
    void testEscolhaQuerys() {
        String input = "1";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        int escolha = menu.escolha_querys();
        assertEquals(1, escolha);
    }

    @Test
    void testPrintVendedorMaisFaturou() {
        menu.print_vendedor_mais_facturou();
    }

    @Test
    void testPedirDataInicio() {
        String input = "2023\n5\n25";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        LocalDate data = menu.pedir_data_inicio();
        assertEquals(LocalDate.of(2023, 5, 25), data);
    }

    @Test
    void testPedirDataFim() {
        String input = "2023\n5\n25";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        LocalDate data = menu.pedir_data_fim(LocalDate.of(2023, 5, 1));
        assertEquals(LocalDate.of(2023, 5, 25), data);
    }

    @Test
    void testTransportadoraMaisFaturou() {
        menu.transportadora_mais_facturou();
    }

    @Test
    void testNMaiores() {
        String input = "5";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        int n = menu.n_maiores();
        assertEquals(5, n);
    }

    @Test
    void testVendedorFaturou() {
        menu.vendedor_facturou();
    }

    @Test
    void testTransportadorasPremium() {
        menu.transportadoras_premium();
    }

    @Test
    void testTempoAvancado() {
        menu.tempo_avançado();
    }

    @Test
    void testTempoAvancar() {
        String input = "2023\n5\n25";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        LocalDate data = menu.tempo_avançar(LocalDate.of(2023, 5, 1));
        assertEquals(LocalDate.of(2023, 5, 25), data);
    }

    @Test
    void testPedirVendedor() {
        String input = "12345";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        long id = menu.pedir_vendedor();
        assertEquals(12345, id);
    }

    @Test
    void testVendedorNEncontrado() {
        menu.vendedor_n_encontrado();
    }

    @Test
    void testPedirLocalFicheiro() {
        String input = "caminho/do/ficheiro";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        String local = menu.pedir_local_ficheiro();
        assertEquals("caminho/do/ficheiro", local);
    }

}
