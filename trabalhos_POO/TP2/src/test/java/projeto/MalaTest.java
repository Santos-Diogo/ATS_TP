package projeto;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

public class MalaTest {

    private Mala mala1;
    private Mala mala2;

    @BeforeEach
    void setUp() {
        mala1 = new Mala("Descrição1", "Marca1", 100.0, true, 2, 3, 1L, 2L, 30, "Couro", 2022, true, 0.5f);
        mala1.setCodigo_barras("A1");
        mala2 = new Mala(mala1);
    }

    @Test
    void testConstrutorVazio() {
        Mala mala = new Mala();
        assertNotNull(mala);
        assertEquals(0, mala.getDimensao());
        assertEquals("", mala.getMaterial());
        assertEquals(0, mala.getAno_colecao());
        assertFalse(mala.isPremium());
        assertEquals(0.0f, mala.getValorizacao());
    }

    @Test
    void testConstrutorCompleto() {
        assertNotNull(mala1);
        assertEquals(30, mala1.getDimensao());
        assertEquals("Couro", mala1.getMaterial());
        assertEquals(2022, mala1.getAno_colecao());
        assertTrue(mala1.isPremium());
        assertEquals(0.5f, mala1.getValorizacao());
    }

    @Test
    void testConstrutorCopia() {
        assertNotNull(mala2);
        assertEquals(mala1, mala2);
        assertNotSame(mala1, mala2);
    }
    @Test
    void testSetDimensao() {
        mala1.setDimensao(35);
        assertEquals(35, mala1.getDimensao(), "The dimensao was not set correctly");
    }

    @Test
    void testSetMaterial() {
        mala1.setMaterial("Tecido");
        assertEquals("Tecido", mala1.getMaterial(), "The material was not set correctly");
    }

    @Test
    void testSetAnoColecao() {
        mala1.setAno_colecao(2023);
        assertEquals(2023, mala1.getAno_colecao(), "The ano_colecao was not set correctly");
    }

    @Test
    void testSetPremium() {
        mala1.setPremium(false);
        assertFalse(mala1.isPremium(), "The premium status was not set correctly");

        mala1.setPremium(true);
        assertTrue(mala1.isPremium(), "The premium status was not set correctly");
    }

    @Test
    void testSetValorizacao() {
        mala1.setValorizacao(1.0f);
        assertEquals(1.0f, mala1.getValorizacao(), 0.001, "The valorizacao was not set correctly");
    }

 @Test
    void testEquals() {
        Mala mala3 = new Mala("Descrição1", "Marca1", 100.0, true, 2, 3, 1L, 2L, 30, "Couro", 2022, true, 0.5f);
        mala3.setCodigo_barras(mala1.getCodigo_barras());
        Assertions.assertTrue(mala1.equals(mala3));
    }

    @Test
    void testEqualsSameObject() {
        Assertions.assertTrue(mala1.equals(mala1));
    }

    @Test
    void testEqualsNull() {
        Assertions.assertFalse(mala1.equals(null));
    }

    @Test
    void testEqualsDifferentClass() {
        String diferenteClasse = "string";
        Assertions.assertFalse(mala1.equals(diferenteClasse));
    }

    @Test
    void testEqualsDifferentDescricao() {
        Mala mala1 = new Mala("Descrição1", "Marca", 100.0, true, 0, 1, 123L, 456L, 30, "Couro", 2022, true, 0.5f);
        Mala mala2 = new Mala("Descrição2", "Marca", 100.0, true, 0, 1, 123L, 456L, 30, "Couro", 2022, true, 0.5f);
        Assertions.assertFalse(mala1.equals(mala2));
    }

    @Test
    void testEqualsDifferentCodigoBarras() {
        Mala mala1 = new Mala("Descrição", "Marca", 100.0, true, 0, 1, 123L, 456L, 30, "Couro", 2022, true, 0.5f);
        Mala mala2 = new Mala("Descrição", "Marca", 100.0, true, 0, 1, 123L, 456L, 30, "Couro", 2022, true, 0.5f);
        mala1.setCodigo_barras("A1");
        mala2.setCodigo_barras("A2");
        Assertions.assertFalse(mala1.equals(mala2));
    }

    @Test
    void testEqualsDifferentMarca() {
        Mala mala1 = new Mala("Descrição", "Marca1", 100.0, true, 0, 1, 123L, 456L, 30, "Couro", 2022, true, 0.5f);
        Mala mala2 = new Mala("Descrição", "Marca2", 100.0, true, 0, 1, 123L, 456L, 30, "Couro", 2022, true, 0.5f);
        Assertions.assertFalse(mala1.equals(mala2));
    }

    @Test
    void testEqualsDifferentPrecoBase() {
        Mala mala1 = new Mala("Descrição", "Marca", 100.0, true, 0, 1, 123L, 456L, 30, "Couro", 2022, true, 0.5f);
        Mala mala2 = new Mala("Descrição", "Marca", 200.0, true, 0, 1, 123L, 456L, 30, "Couro", 2022, true, 0.5f);
        Assertions.assertFalse(mala1.equals(mala2));
    }

    @Test
    void testEqualsDifferentNovo() {
        Mala mala1 = new Mala("Descrição", "Marca", 100.0, true, 0, 1, 123L, 456L, 30, "Couro", 2022, true, 0.5f);
        Mala mala2 = new Mala("Descrição", "Marca", 100.0, false, 0, 1, 123L, 456L, 30, "Couro", 2022, true, 0.5f);
        Assertions.assertFalse(mala1.equals(mala2));
    }

    @Test
    void testEqualsDifferentEstadoUso() {
        Mala mala1 = new Mala("Descrição", "Marca", 100.0, true, 0, 1, 123L, 456L, 30, "Couro", 2022, true, 0.5f);
        Mala mala2 = new Mala("Descrição", "Marca", 100.0, true, 1, 1, 123L, 456L, 30, "Couro", 2022, true, 0.5f);
        Assertions.assertFalse(mala1.equals(mala2));
    }

    @Test
    void testEqualsDifferentNUtilizadores() {
        Mala mala1 = new Mala("Descrição", "Marca", 100.0, true, 0, 1, 123L, 456L, 30, "Couro", 2022, true, 0.5f);
        Mala mala2 = new Mala("Descrição", "Marca", 100.0, true, 0, 2, 123L, 456L, 30, "Couro", 2022, true, 0.5f);
        Assertions.assertFalse(mala1.equals(mala2));
    }

    @Test
    void testEqualsDifferentIdTransportadora() {
        Mala mala1 = new Mala("Descrição", "Marca", 100.0, true, 0, 1, 123L, 456L, 30, "Couro", 2022, true, 0.5f);
        Mala mala2 = new Mala("Descrição", "Marca", 100.0, true, 0, 1, 124L, 456L, 30, "Couro", 2022, true, 0.5f);
        Assertions.assertFalse(mala1.equals(mala2));
    }

    @Test
    void testEqualsDifferentIdVendedor() {
        Mala mala1 = new Mala("Descrição", "Marca", 100.0, true, 0, 1, 123L, 456L, 30, "Couro", 2022, true, 0.5f);
        Mala mala2 = new Mala("Descrição", "Marca", 100.0, true, 0, 1, 123L, 457L, 30, "Couro", 2022, true, 0.5f);
        Assertions.assertFalse(mala1.equals(mala2));
    }

    @Test
    void testEqualsDifferentDisponivel() {
        Mala mala1 = new Mala("Descrição", "Marca", 100.0, true, 0, 1, 123L, 456L, 30, "Couro", 2022, true, 0.5f);
        Mala mala2 = new Mala("Descrição", "Marca", 100.0, true, 0, 1, 123L, 456L, 30, "Couro", 2022, true, 0.5f);
        mala1.setDisponivel(true);
        mala2.setDisponivel(false);
        Assertions.assertFalse(mala1.equals(mala2));
    }

    @Test
    void testEqualsDifferentDataVenda() {
        Mala mala1 = new Mala("Descrição", "Marca", 100.0, true, 0, 1, 123L, 456L, 30, "Couro", 2022, true, 0.5f);
        Mala mala2 = new Mala("Descrição", "Marca", 100.0, true, 0, 1, 123L, 456L, 30, "Couro", 2022, true, 0.5f);
        mala1.setData_venda(LocalDate.of(2024, 5, 21));
        mala2.setData_venda(LocalDate.of(2024, 5, 22));
        Assertions.assertFalse(mala1.equals(mala2));
    }

    @Test
    void testEqualsIdenticalObjects() {
        Mala mala1 = new Mala("Descrição", "Marca", 100.0, true, 0, 1, 123L, 456L, 30, "Couro", 2022, true, 0.5f);
        Mala mala2 = new Mala("Descrição", "Marca", 100.0, true, 0, 1, 123L, 456L, 30, "Couro", 2022, true, 0.5f);
        mala1.setCodigo_barras("A1");
        mala2.setCodigo_barras("A1");

        // Verificação detalhada dos atributos antes da comparação
        Assertions.assertEquals(mala1.getDescricao(), mala2.getDescricao());
        Assertions.assertEquals(mala1.getMarca(), mala2.getMarca());
        Assertions.assertEquals(mala1.getPreco_base(), mala2.getPreco_base());
        Assertions.assertEquals(mala1.getNovo(), mala2.getNovo());
        Assertions.assertEquals(mala1.getEstado_uso(), mala2.getEstado_uso());
        Assertions.assertEquals(mala1.getN_utilizadores(), mala2.getN_utilizadores());
        Assertions.assertEquals(mala1.getIdTransportadora(), mala2.getIdTransportadora());
        Assertions.assertEquals(mala1.getIdVendedor(), mala2.getIdVendedor());
        Assertions.assertEquals(mala1.getCodigo_barras(), mala2.getCodigo_barras());
        Assertions.assertEquals(mala1.getDimensao(), mala2.getDimensao());
        Assertions.assertEquals(mala1.getMaterial(), mala2.getMaterial());
        Assertions.assertEquals(mala1.getAno_colecao(), mala2.getAno_colecao());
        Assertions.assertEquals(mala1.isPremium(), mala2.isPremium());
        Assertions.assertEquals(mala1.getValorizacao(), mala2.getValorizacao());

        // Verificação da igualdade
        Assertions.assertTrue(mala1.equals(mala2));
    }

    @Test
    void testPrecoAtual() {
    LocalDate data = LocalDate.of(2023, 5, 15);

    // Cenário 1: Premium e data de venda é LocalDate.MIN
    double precoEsperado = 100.0;
    int anos = data.getYear() - mala1.getAno_colecao();
    for (int i = 0; i < anos; i++) {
        precoEsperado *= (1 + (0.5 / 100));
    }
    assertEquals(precoEsperado, mala1.preco_atual(data), 1e-6); // Tolerância de 1e-6

    // Cenário 2: Premium e data de venda não é LocalDate.MIN
    mala1.setData_venda(LocalDate.of(2023, 1, 1));
    precoEsperado = 100.0;
    anos = LocalDate.of(2023, 1, 1).getYear() - mala1.getAno_colecao();
    for (int i = 0; i < anos; i++) {
        precoEsperado *= (1 + (0.5 / 100));
    }
    assertEquals(precoEsperado, mala1.preco_atual(data), 1e-6); // Tolerância de 1e-6

    // Cenário 3: Não é premium e não é novo
    mala1.setPremium(false);
    mala1.setNovo(false);
    precoEsperado = 100.0 - (100.0 * 3 / (30 * 2));
    if (precoEsperado <= 0.01) precoEsperado = 0.01;
    assertEquals(precoEsperado, mala1.preco_atual(data), 1e-6); // Tolerância de 1e-6

    // Cenário 4: Não é premium, não é novo e preço reduzido a 0.01
    mala1.setPreco_base(0.02);
    precoEsperado = 0.02 - (0.02 * 3 / (30 * 2));
    if (precoEsperado <= 0.01) precoEsperado = 0.01;
    assertEquals(precoEsperado, mala1.preco_atual(data), 1e-6); // Tolerância de 1e-6
    }

    

}