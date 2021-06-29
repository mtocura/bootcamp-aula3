package aula4.tm.exercicio2.ex1;

import java.math.BigDecimal;

public class Program {
    public static void main(String[] args) {
        ContaCorrente c1 = new ContaCorrente("1010-2", "1234", BigDecimal.valueOf(1050.93));
        ContaCorrente c2 = new ContaCorrente("1215-2", "2345", BigDecimal.valueOf(5647.20));
        ContaCorrente c3 = new ContaCorrente(c1);

        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);

        System.out.println();
        System.out.println("=========== depóstio c1 ==========");
        c1.deposito(BigDecimal.valueOf(2000.0));

        System.out.println();
        System.out.println("=========== saque c2 ==============");
        c2.saque(BigDecimal.valueOf(6000.0));

        System.out.println();
        System.out.println("============ transferencia c1 para c2============");
        c1.transferencia(BigDecimal.valueOf(100.0), c2);

        System.out.println();
        System.out.println("============ devolução c3 ===============");
        c3.devolucao(BigDecimal.valueOf(250.20));
    }
}
