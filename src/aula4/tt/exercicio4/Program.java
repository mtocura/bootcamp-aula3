package aula4.tt.exercicio4;

import java.math.BigDecimal;

public class Program {
    public static void main(String[] args) {
        CLT tecnico = new Tecnico(BigDecimal.valueOf(3200.00), 40.0, 0.0, 0.05, 5);
        CLT analista = new Analista(BigDecimal.valueOf(4000.00), 40.0, 4.0, 0.08, 7);
        CLT gerente = new Gerente(BigDecimal.valueOf(6000.00), 36.0, 4.0, 0.125, 3);
        CLT diretor = new Diretor(BigDecimal.valueOf(15000.00), 0.03, BigDecimal.valueOf(1000000.00));

        tecnico.pagarSalario();
        System.out.println();
        analista.pagarSalario();
        System.out.println();
        gerente.pagarSalario();
        System.out.println();
        diretor.pagarSalario();
    }
}
