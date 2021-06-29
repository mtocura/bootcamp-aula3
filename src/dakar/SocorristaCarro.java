package dakar;

public class SocorristaCarro extends Veiculo{
    public SocorristaCarro(Double velocidade, Double aceleracao, Integer anguloDeGiro, String placa) {
        super(velocidade, aceleracao, anguloDeGiro, placa, 1000.0, 4);
    }

    public void socorrer(Carro carro) {
        System.out.println("Socorrendo carro");
    }
}
