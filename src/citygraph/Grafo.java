package citygraph;
import java.util.*;

public class Grafo {


    // criando as listas para armazenar cidades e estradas
    private List<Cidade> cidades;
    private List<Estrada> estradas;



    //metodos construtor
    public Grafo() {
        cidades = new ArrayList<>();
        estradas = new ArrayList<>();
    }


    //metodo para add cidade
    public void adicionarCidade(Cidade c) {
        cidades.add(c);
    }

    public void adicionarEstrada(Cidade origem, Cidade destino, int distancia) {
        Estrada estrada = new Estrada(origem, destino, distancia);
        estradas.add(estrada);
    }

    public void mostrarGrafo() {
        System.out.println("Cidades:");
        for (Cidade c : cidades) {
            System.out.println("- " + c);
        }

        System.out.println("\nEstradas:");
        for (Estrada e : estradas) {
            System.out.println("- " + e);
        }
    }
}
