package aula4.ex5;

public class Program {
    public static void main(String[] args) {
        Data data = new Data(21, 6, 2021);

        System.out.println(data);

        data.addDay();
        System.out.println(data);

       System.out.println("É válido? " + data.checkDate("4/1/2021"));
    }
}
