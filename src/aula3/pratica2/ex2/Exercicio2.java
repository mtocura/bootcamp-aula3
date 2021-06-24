package aula3.pratica2.ex2;

import java.util.Calendar;

public class Exercicio2 {
    public static void main(String[] args) {
        Empresa empresaX = new Empresa("Empresa X", 1.13, 2.48, Calendar.getInstance());
        Empresa empresaY = new Empresa("Empresa Y", 18.4, 1.32, Calendar.getInstance());

        System.out.println(empresaX);
        System.out.println(empresaY);

        while(empresaX.getValue() < empresaY.getValue()) {
            double newValueX = empresaX.getValue() * empresaX.getGrowth();
            empresaX.setValue(newValueX);
            empresaX.getCalendar().add(Calendar.YEAR, 1);
            System.out.println(empresaX);

            double newValueY = empresaY.getValue() * empresaY.getGrowth();
            empresaY.setValue(newValueY);
            empresaY.getCalendar().add(Calendar.YEAR, 1);
            System.out.println(empresaY);
        }
    }
}
