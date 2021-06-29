package laChiqui;

public class Meli extends Convidado{
    public Meli(String nome) {
        super(nome);
    }

    @Override
    public void comerBolo() {
        System.out.println("Viva la Chiqui !!");
    }
}
