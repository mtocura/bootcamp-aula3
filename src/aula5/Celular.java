package aula5;

public class Celular implements Precedente{
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
    public int precede(Object o) {
        return this.number.compareToIgnoreCase(((Celular) o).getNumber());
    }

    @Override
    public String toString() {
        return "Celular{" +
                "holder='" + holder + '\'' +
                ", number='" + number + '\'' +
                '}';
    }
}
