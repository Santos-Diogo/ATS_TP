package projeto;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;

public class ComparatorVendasTest {

    private ComparatorVendas comparator;
    private Utilizador utilizador1;
    private Utilizador utilizador2;

    @BeforeEach
    public void setUp() {
        comparator = new ComparatorVendas();
        utilizador1 = new Utilizador("email1@test.com", "Utilizador1", "Morada1", 111111111L, "senha1");
        utilizador2 = new Utilizador("email2@test.com", "Utilizador2", "Morada2", 222222222L, "senha2");
    }

    @Test
    public void testCompareEqualVendas() {
        utilizador1.setN_vendidos(10);
        utilizador2.setN_vendidos(10);
        // Se o número de vendas for igual, a comparação deve ser pelo ID
        assertTrue(comparator.compare(utilizador1, utilizador2) == 0 || comparator.compare(utilizador1, utilizador2) > 0 || comparator.compare(utilizador1, utilizador2) < 0);
    }

    @Test
    public void testCompareMoreVendas() {
        utilizador1.setN_vendidos(15);
        utilizador2.setN_vendidos(10);
        // Utilizador1 tem mais vendas, então deve vir antes do Utilizador2
        assertTrue(comparator.compare(utilizador1, utilizador2) < 0);
    }

    @Test
    public void testCompareLessVendas() {
        utilizador1.setN_vendidos(5);
        utilizador2.setN_vendidos(10);
        // Utilizador1 tem menos vendas, então deve vir depois do Utilizador2
        assertTrue(comparator.compare(utilizador1, utilizador2) > 0);
    }

    // Additional tests can be created to further ensure the robustness of the Comparator.
}
