package aula4.tm.exercicio2.ex2;

public class Program {
    public static void main(String[] args) {
        Counter c1 = new Counter(0l);
        Counter c2 = new Counter(10l);
        Counter c3 = new Counter(c1);

        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);

        System.out.println();
        System.out.println("===================");
        c1.add();
        System.out.println(c1);

        c2.add(10l);
        System.out.println(c2);

        System.out.println();
        System.out.println("===================");
        c3.subtract();
        System.out.println(c3);
        c3.add(9l);
        System.out.println(c3);
        c3.subtract(9l);
        System.out.println(c3);
    }
}
