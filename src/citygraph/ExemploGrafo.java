package citygraph;

public class ExemploGrafo {

    public static void main(String[] args) {

        Grafo grafo = new Grafo();

        //criando as cidades
        Cidade sp = new Cidade("São Paulo");
        Cidade Santos = new Cidade("Santos");
        Cidade Sorocaba = new Cidade("Sorocaba");
        Cidade Campinas = new Cidade("Campinas");


        //adicionando as cidades no grafo
        grafo.adicionarCidade(sp);
        grafo.adicionarCidade(Santos);
        grafo.adicionarCidade(Sorocaba);
        grafo.adicionarCidade(Campinas);

        //adicionando as estradas que ligam uma cidade a outra e definindo a distância entre elas
        grafo.adicionarEstrada(sp, Campinas, 100);
        grafo.adicionarEstrada(sp, Santos, 80);
        grafo.adicionarEstrada(sp, Sorocaba, 90);
        grafo.adicionarEstrada(Campinas, Sorocaba, 110);

        grafo.mostrarGrafo();

    }

}
