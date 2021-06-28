package aula4.tm.ex4;

public class Fracao {
    /*
    Crie uma classe Fracao com métodos necessários para adicionar, subtrair, multiplicar e dividir frações. [
    Todos os métodos devem ser sobrecarregados para que também possam ser usados para operar entre frações e
    números inteiros (por exemplo: ⅗ + 2 ou ⅝ * 4).
     */
    private Integer dividendo;
    private Integer divisor;

    public Fracao(Integer dividendo, Integer divisor) {
        this.dividendo = dividendo;
        this.divisor = divisor;
    }

    public Integer getDividendo() {
        return dividendo;
    }

    public void setDividendo(Integer dividendo) {
        this.dividendo = dividendo;
    }

    public Integer getDivisor() {
        return divisor;
    }

    public void setDivisor(Integer divisor) {
        this.divisor = divisor;
    }

    private static int mdc(int a, int b){
        while(b != 0){
            int r = a % b;
            a = b;
            b = r;
        }
        return a;
    }

    private static int mmc(int a, int b){
        return a * (b / mdc(a, b));
    }

    public void add(int dividendo, int divisor) {
        int mmc = mmc(this.divisor, divisor);

        int dividendo1 = (mmc / this.divisor) * this.dividendo;
        int dividendo2 = (mmc / divisor) * dividendo;
        
        int soma = dividendo1 + dividendo2;

        String resultado = this.dividendo + " / " + this.divisor + " + " + dividendo + " / " + divisor + " = " + soma + " / " + mmc + " ou " + (double)soma/mmc;

        System.out.println(resultado);
    }

    public void add(int inteiro) {
        int mmc = mmc(this.divisor, 1);

        int dividendo1 = (mmc / this.divisor) * this.dividendo;
        int dividendo2 = (mmc / 1) * inteiro;

        int soma = dividendo1 + dividendo2;

        String resultado = this.dividendo + " / " + this.divisor + " + " + inteiro + " = " + soma + " / " + mmc + " ou " + (double)soma/mmc;

        System.out.println(resultado);
    }

    public void subtracao(int dividendo, int divisor) {
        int mmc = mmc(this.divisor, divisor);

        int dividendo1 = (mmc / this.divisor) * this.dividendo;
        int dividendo2 = (mmc / divisor) * dividendo;

        int sub = dividendo1 - dividendo2;

        String resultado = this.dividendo + " / " + this.divisor + " - " + dividendo + " / " + divisor + " = " + sub + " / " + mmc + " ou " + (double)sub/mmc;

        System.out.println(resultado);
    }

    public void subtracao(int inteiro) {
        int mmc = mmc(this.divisor, 1);

        int dividendo1 = (mmc / this.divisor) * this.dividendo;
        int dividendo2 = (mmc / 1) * inteiro;

        int sub = dividendo1 - dividendo2;

        String resultado = this.dividendo + " / " + this.divisor + " - " + inteiro + " = " + sub + " / " + mmc + " ou " + (double)sub/mmc;

        System.out.println(resultado);
    }

    public void multiplicacao(int dividendo, int divisor) {
        int multDivisor = this.divisor * divisor;
        int multDividendo = this.dividendo * dividendo;

        String resultado = this.dividendo + " / " + this.divisor + " * " + dividendo + " / " + divisor + " = " + multDividendo + " / " + multDivisor + " ou " + (double)multDividendo/multDivisor;

        System.out.println(resultado);
    }

    public void multiplicacao(int inteiro) {
        int multDividendo = this.dividendo * inteiro;

        String resultado = this.dividendo + " / " + this.divisor + " * " + inteiro + " = " + multDividendo + " / " + this.divisor + " ou " + (double)multDividendo/this.divisor;

        System.out.println(resultado);
    }

    public void divisao(int dividendo, int divisor) {
        int divDividendo = this.dividendo * divisor;
        int divDivisor = this.divisor * dividendo;

        String resultado = this.dividendo + " / " + this.divisor + " / " + dividendo + " / " + divisor + " = " + divDividendo + " / " + divDivisor + " ou " + (double)divDividendo/divDivisor;

        System.out.println(resultado);
    }

    public void divisao(int inteiro) {
        int divDivisor = this.divisor * inteiro;

        String resultado = this.dividendo + " / " + this.divisor + " / " + inteiro + " = " + this.dividendo + " / " + divDivisor + " ou " + (double)this.dividendo/divDivisor;

        System.out.println(resultado);
    }
}
