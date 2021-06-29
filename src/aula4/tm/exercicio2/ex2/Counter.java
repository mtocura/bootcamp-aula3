package aula4.tm.exercicio2.ex2;

public class Counter {
    /*
    Crie uma classe Counter (sim, contador de programação) com métodos que permitam aumentar e diminuir seu valor.
    A classe conterá um construtor padrão, um construtor com parâmetros, um construtor de cópia e os setters e getters
    correspondentes (métodos de acesso).
     */

    private Long counter;

    public Counter(Long counter) {
        this.counter = counter;
    }

    public Counter(Counter c) {
        this.counter = c.getCounter();
    }

    public Long getCounter() {
        return counter;
    }

    public void setCounter(Long counter) {
        this.counter = counter;
    }

    public void add() {
        this.counter++;
    }

    public void add(Long value) {
        this.counter += value;
    }

    public void subtract() {
        this.counter--;
    }

    public void subtract(Long value) {
        this.counter -= value;
    }

    @Override
    public String toString() {
        return "Counter{" +
                "counter=" + counter +
                '}';
    }
}
