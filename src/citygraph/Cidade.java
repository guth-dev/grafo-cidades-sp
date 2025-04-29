package citygraph;

// classe cidade representa o vertice/nodes
public class Cidade {

    private String nome;

    
    public Cidade(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return nome;
    }
}
