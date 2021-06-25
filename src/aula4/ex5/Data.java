package aula4.ex5;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Data {
    /*
    Crie uma classe Data. A classe conterá, além dos construtores que você considera apropriados,
    métodos de acesso e o método toString, conforme explicamos no exercício anterior, um método para verificar
    se a data está correta e outro para adicionar um dia ao valor atual da data. A classe GregorianCalendar deve ser
    investigada e usada para implementar os construtores e métodos Date.
     */

    private Integer dia;
    private Integer mes;
    private Integer ano;
    private GregorianCalendar data;

    private SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    public Data(Integer dia, Integer mes, Integer ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
        this.data = new GregorianCalendar(ano, mes - 1 , dia);
    }

    public Integer getDia() {
        return dia;
    }

    public void setDia(Integer dia) {
        this.dia = dia;
    }

    public Integer getMes() {
        return mes;
    }

    public void setMes(Integer mes) {
        this.mes = mes;
    }

    public Integer getAno() {
        return ano;
    }

    public void setAno(Integer ano) {
        this.ano = ano;
    }

    public GregorianCalendar getData() {
        return data;
    }

    public void addDay() {
        this.data.add(Calendar.DAY_OF_MONTH, 1);
    }

    public boolean checkDate(String data) {
        boolean isValid = false;

        DateFormat date = new SimpleDateFormat("dd/MM/yyyy");
        date.setLenient(false);

        try {
            date.parse(data);
            isValid = true;
        } catch (Exception e) {
            return false;
        }

        return isValid;
    }

    @Override
    public String toString() {
        return "Data atual: " + sdf.format(this.data.getTime());
    }
}
