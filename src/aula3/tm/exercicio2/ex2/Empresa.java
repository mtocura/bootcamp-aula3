package aula3.tm.exercicio2.ex2;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Empresa {
    private String name;
    private Double value;
    private Double growth;
    private Calendar calendar;
    private DateFormat df = new SimpleDateFormat("dd/MM/yyyy");

    public Empresa(String name, double value, double growth, Calendar calendar) {
        this.name = name;
        this.value = value;
        this.growth = growth;
        this.calendar = calendar;
    }

    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
    }

    public Double getGrowth() {
        return growth;
    }

    public void setGrowth(Double growth) {
        this.growth = growth;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Calendar getCalendar() {
        return calendar;
    }

    public void setCalendar(Calendar calendar) {
        this.calendar = calendar;
    }

    @Override
    public String toString() {
        return name + " - " + df.format(calendar.getTime()) + " - Valor da Empresa: " + String.format("%.2f", value) + "m";
    }
}
