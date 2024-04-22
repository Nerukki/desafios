public class Carro {
    String modelo;
    int anoDoCarro;
    String cor;
    int anoAtual;

    void fichaTecnicaCarro(){
        System.out.println("modelo do carro: " + modelo);
        System.out.println("ano do carro: " + anoDoCarro);
        System.out.println("cor do carro: " + cor);
    }

    double calcularIdadeDoCarro(){
        return  anoAtual - anoDoCarro;
    }
}
