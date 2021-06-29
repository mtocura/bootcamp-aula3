package dakar;

public class SocorristaMoto extends Veiculo{
    public SocorristaMoto(Double velocidade, Double aceleracao, Integer anguloDeGiro, String placa) {
        super(velocidade, aceleracao, anguloDeGiro, placa, 300.0, 2);
    }

    public void socorrer(Moto moto) {
        System.out.println("Socorrendo moto");
    }
}
