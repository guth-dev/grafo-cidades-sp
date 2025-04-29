package citygraph;

public class Estrada {

    // uma estrada precisa de um ponto de origem, um ponto de destino e uma distancia(peso) a ser percorrida de um ponto a outro
    private Cidade origem;
    private Cidade destino;
    private int distancia; 

    public Estrada(Cidade origem, Cidade destino, int distancia) {
        this.origem = origem;
        this.destino = destino;
        this.distancia = distancia;
    }

    public Cidade getOrigem() {
        return origem;
    }

    public Cidade getDestino() {
        return destino;
    }

    public int getDistancia() {
        return distancia;
    }


    //metodo para mostrar estrada a distância entre um ponto e outro
    @Override
    public String toString() {
        return origem + " <-> " + destino + " (Distancia: " + distancia + " km " + ")";
    }
 }
