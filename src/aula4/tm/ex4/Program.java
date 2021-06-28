package aula4.tm.ex4;

public class Program {
    public static void main(String[] args) {
        Fracao fr = new Fracao(1, 2);

        fr.add(2, 9);
        fr.add(1);

        fr.subtracao(3, 4);
        fr.subtracao(1);

        fr.multiplicacao(4, 5);
        fr.multiplicacao(2);

        fr.divisao(2, 7);
        fr.divisao(2);
    }
}
