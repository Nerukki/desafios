public class Musica {
    String titulo;
    String artista;
    int anoDeLancamento;
    double avaliacaoTotal;
    int numeroDeAvaliacoes;

    void verFichaTecnica(){
        System.out.println("nome da musica: " + titulo);
        System.out.println("artista" + artista);
        System.out.println("ano de lancamento: " + anoDeLancamento);
        System.out.println("nota: " + avaliacaoTotal);
        System.out.println("total de avaliacoes: " + numeroDeAvaliacoes);
    }

    void getAvaliacao(double nota){
    avaliacaoTotal += nota;
    numeroDeAvaliacoes++;
    }

    double getMediaDasAvaliacoes(){
    return avaliacaoTotal / numeroDeAvaliacoes;
    }

}
