package aula5.tm.exercicio1;

public class Celular implements Precedente<Celular>{
    private String holder;
    private String number;

    public Celular(String holder, String number) {
        this.holder = holder;
        this.number = number;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    @Override
    public int precede(Celular o) {
        return this.number.compareToIgnoreCase(o.getNumber());
    }

    @Override
    public String toString() {
        return "Celular{" +
                "holder='" + holder + '\'' +
                ", number='" + number + '\'' +
                '}';
    }
}
