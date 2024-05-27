package projeto;

import java.time.LocalDate;
public class TestableArtigo extends Artigo {

    public TestableArtigo(String descricao, String marca, double preco_base, boolean novo, int estado_uso, int n_utilizadores, long idTransportadora, long idVendedor) {
        // Aqui você precisa chamar o construtor da superclasse que aceita estes parâmetros
        // Se esse construtor não existir em Artigo, você também precisará criar lá
        super(descricao, marca, preco_base, novo, estado_uso, n_utilizadores, idTransportadora, idVendedor);
    }

    @Override
    public double preco_atual(LocalDate data) {
        // Implement a simple return based on some business logic for testing.
        return getPreco_base() * 1.10;  // Assuming a 10% markup for simplicity.
    }

    @Override
    public Artigo clone() {
        return new TestableArtigo(this);
    }

    public TestableArtigo() {
        super();
    }

    public TestableArtigo(Artigo a) {
        super(a);
    }
}
