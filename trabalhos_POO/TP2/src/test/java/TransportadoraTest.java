import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TransportadoraTest {

    private Transportadora transportadora1;
    private Transportadora transportadora2;

    @BeforeEach
    void setUp() {
        transportadora1 = new Transportadora("Transportadora Teste", 10.0, 20.0, 30.0, 0.1, 0.2, true, 1);
        transportadora2 = new Transportadora(transportadora1);
    }

    @Test
    void testConstrutorVazio() {
        Transportadora transportadora = new Transportadora();
        assertNotNull(transportadora);
        assertEquals("Transportadora Invalida", transportadora.getNome());
        assertEquals(0, transportadora.getValor_pequenas());
        assertEquals(0, transportadora.getValor_medio());
        assertEquals(0, transportadora.getValor_grande());
        assertEquals(0, transportadora.getImpostos());
        assertEquals(0, transportadora.getMargemlucro());
        assertEquals(0, transportadora.getTotalLucro());
        assertFalse(transportadora.isPremium());
        assertEquals(0, transportadora.getFormula());
    }

    @Test
    void testConstrutorCompleto() {
        assertNotNull(transportadora1);
        assertEquals("Transportadora Teste", transportadora1.getNome());
        assertEquals(10.0, transportadora1.getValor_pequenas());
        assertEquals(20.0, transportadora1.getValor_medio());
        assertEquals(30.0, transportadora1.getValor_grande());
        assertEquals(0.1, transportadora1.getImpostos());
        assertEquals(0.2, transportadora1.getMargemlucro());
        assertTrue(transportadora1.isPremium());
        assertEquals(1, transportadora1.getFormula());
    }

    @Test
    void testConstrutorCopia() {
        assertNotNull(transportadora2);
        assertEquals(transportadora1, transportadora2);
        assertNotSame(transportadora1, transportadora2);
    }

    @Test
    public void testGetCodigo() {
        long expectedCodigo = 123L;
        Transportadora.setCodigo(expectedCodigo);
        long actualCodigo = Transportadora.getCodigo();
        assertEquals(expectedCodigo, actualCodigo, "The actual codigo did not match the expected codigo");
    }

    @Test
    public void testSetCodigo() {
        long expectedCodigo = 456L;
        Transportadora.setCodigo(expectedCodigo);
        long actualCodigo = Transportadora.getCodigo();
        assertEquals(expectedCodigo, actualCodigo, "The actual codigo did not match the expected codigo");
    }

    @Test
    void testSetNome() {
        transportadora1.setNome("Nova Transportadora");
        assertEquals("Nova Transportadora", transportadora1.getNome());
    }

    @Test
    void testSetValorPequenas() {
        transportadora1.setValor_pequenas(15.0);
        assertEquals(15.0, transportadora1.getValor_pequenas());
    }

    @Test
    void testSetValorMedio() {
        transportadora1.setValor_medio(25.0);
        assertEquals(25.0, transportadora1.getValor_medio());
    }

    @Test
    void testSetValorGrande() {
        transportadora1.setValor_grande(35.0);
        assertEquals(35.0, transportadora1.getValor_grande());
    }

    @Test
    void testSetMargemLucro() {
        transportadora1.setMargemlucro(0.3);
        assertEquals(0.3, transportadora1.getMargemlucro());
    }

    @Test
    void testSetTotalLucro() {
        transportadora1.setTotalLucro(100.0);
        assertEquals(100.0, transportadora1.getTotalLucro());
    }

    @Test
    void testSetImpostos() {
        transportadora1.setImpostos(0.15);
        assertEquals(0.15, transportadora1.getImpostos());
    }

    @Test
    void testSetId() {
        transportadora1.setId(999);
        assertEquals(999, transportadora1.getId());
    }

    @Test
    void testSetPremium() {
        transportadora1.setPremium(false);
        assertFalse(transportadora1.isPremium());

        transportadora1.setPremium(true);
        assertTrue(transportadora1.isPremium());
    }

    @Test
    void testSetFormula() {
        transportadora1.setFormula(3);
        assertEquals(3, transportadora1.getFormula());
    }

    @Test
    void testEquals() {
        Transportadora transportadora3 = new Transportadora("Transportadora Teste", 10.0, 20.0, 30.0, 0.1, 0.2, true, 1);
        transportadora3.setId(transportadora1.getId());
        assertEquals(transportadora1, transportadora3);
    }

    @Test
    void testEqualsSameObject() {
        assertEquals(transportadora1, transportadora1);
    }

    @Test
    void testEqualsNull() {
        assertNotEquals(transportadora1, null);
    }

    @Test
    void testEqualsDifferentClass() {
        String differentClass = "string";
        assertNotEquals(transportadora1, differentClass);
    }

    @Test
    void testEqualsDifferentNome() {
        Transportadora transportadora3 = new Transportadora("Nome Diferente", 10.0, 20.0, 30.0, 0.1, 0.2, true, 1);
        transportadora3.setId(transportadora1.getId());
        assertNotEquals(transportadora1, transportadora3);
    }

    @Test
    void testEqualsDifferentValorPequenas() {
        Transportadora transportadora3 = new Transportadora("Transportadora Teste", 15.0, 20.0, 30.0, 0.1, 0.2, true, 1);
        transportadora3.setId(transportadora1.getId());
        assertNotEquals(transportadora1, transportadora3);
    }

    @Test
    void testEqualsDifferentValorMedio() {
        Transportadora transportadora3 = new Transportadora("Transportadora Teste", 10.0, 25.0, 30.0, 0.1, 0.2, true, 1);
        transportadora3.setId(transportadora1.getId());
        assertNotEquals(transportadora1, transportadora3);
    }

    @Test
    void testEqualsDifferentValorGrande() {
        Transportadora transportadora3 = new Transportadora("Transportadora Teste", 10.0, 20.0, 35.0, 0.1, 0.2, true, 1);
        transportadora3.setId(transportadora1.getId());
        assertNotEquals(transportadora1, transportadora3);
    }

    @Test
    void testEqualsDifferentImpostos() {
        Transportadora transportadora3 = new Transportadora("Transportadora Teste", 10.0, 20.0, 30.0, 0.15, 0.2, true, 1);
        transportadora3.setId(transportadora1.getId());
        assertNotEquals(transportadora1, transportadora3);
    }

    @Test
    void testEqualsDifferentMargemLucro() {
        Transportadora transportadora3 = new Transportadora("Transportadora Teste", 10.0, 20.0, 30.0, 0.1, 0.25, true, 1);
        transportadora3.setId(transportadora1.getId());
        assertNotEquals(transportadora1, transportadora3);
    }

    @Test
    void testEqualsDifferentTotalLucro() {
        Transportadora transportadora3 = new Transportadora("Transportadora Teste", 10.0, 20.0, 30.0, 0.1, 0.2, true, 1);
        transportadora3.setId(transportadora1.getId());
        transportadora3.setTotalLucro(50.0);
        assertNotEquals(transportadora1, transportadora3);
    }

    @Test
    void testEqualsDifferentPremium() {
        Transportadora transportadora3 = new Transportadora("Transportadora Teste", 10.0, 20.0, 30.0, 0.1, 0.2, false, 1);
        transportadora3.setId(transportadora1.getId());
        assertNotEquals(transportadora1, transportadora3);
    }

    @Test
    void testEqualsDifferentFormula() {
        Transportadora transportadora3 = new Transportadora("Transportadora Teste", 10.0, 20.0, 30.0, 0.1, 0.2, true, 2);
        transportadora3.setId(transportadora1.getId());
        assertNotEquals(transportadora1, transportadora3);
    }

    @Test
    void testToString() {
        String expected = "Transportadora:: { Id: " + transportadora1.getId() +
                " Nome: Transportadora Teste Valor da encomenda pequena: 10.0 Valor da encomenda média: 20.0 Valor da encomenda grande: 30.0 Imposto: 0.1 Margem de lucro: 0.2 É premium: true Formula atual: 1 Total lucro: 0.0}";
        assertEquals(expected, transportadora1.toString());
    }

    @Test
    void testClone() {
        Transportadora cloned = transportadora1.clone();
        assertEquals(transportadora1, cloned);
        assertNotSame(transportadora1, cloned);
    }

    @Test
    void testPrecoTransportadora1() {
        double preco1 = transportadora1.preco_transportadora1(1);
        assertEquals(((10.0 * 0.2 * (1 + 0.1)) * 0.9), preco1, 1e-6);
        
        double preco2 = transportadora1.preco_transportadora1(3);
        assertEquals(((20.0 * 0.2 * (1 + 0.1)) * 0.9), preco2, 1e-6);
        
        double preco3 = transportadora1.preco_transportadora1(6);
        assertEquals(((30.0 * 0.2 * (1 + 0.1)) * 0.9), preco3, 1e-6);
    }

    @Test
    void testPrecoTransportadora2() {
        double preco1 = transportadora1.preco_transportadora2(1);
        assertEquals((10.0 * (1 + 0.2 + 0.1) * 0.7), preco1, 1e-6);
        
        double preco2 = transportadora1.preco_transportadora2(3);
        assertEquals((20.0 * (1 + 0.2 + 0.1) * 0.7), preco2, 1e-6);
        
        double preco3 = transportadora1.preco_transportadora2(6);
        assertEquals((30.0 * (1 + 0.2 + 0.1) * 0.7), preco3, 1e-6);
    }

    @Test
    void testPrecoTransportadora3() {
        double preco1 = transportadora1.preco_transportadora3(1);
        assertEquals(((10.0 * 0.2 * (1 + 0.1)) * 1.5), preco1, 1e-6);
        
        double preco2 = transportadora1.preco_transportadora3(3);
        assertEquals(((20.0 * 0.2 * (1 + 0.1)) * 1.5), preco2, 1e-6);
        
        double preco3 = transportadora1.preco_transportadora3(6);
        assertEquals(((30.0 * 0.2 * (1 + 0.1)) * 1.5), preco3, 1e-6);
    }

    @Test
    void testFormula1() {
        String expected = "(ValorBase * MargemLucroTransportadora * (1 + Imposto)) * 0,9";
        assertEquals(expected, transportadora1.formula1());
    }

    @Test
    void testFormula2() {
        String expected = "ValorBase * (1 + MargemLucroTransportadora + Imposto) * 0,7";
        assertEquals(expected, transportadora1.formula2());
    }

    @Test
    void testFormula3() {
        String expected = "(ValorBase * MargemLucroTransportadora * (1 + Imposto)) * 1,5";
        assertEquals(expected, transportadora1.formula3());
    }
}
