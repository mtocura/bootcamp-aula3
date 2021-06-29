package dakar;

import java.math.BigDecimal;

public class Program {
    public static void main(String[] args) {
        SocorristaCarro socorristaCarro = new SocorristaCarro(100.0, 2.5, 3, "ABC1234");
        SocorristaMoto socorristaMoto = new SocorristaMoto(100.0, 2.5, 3, "ABC1235");

        Corrida corrida = new Corrida(10.5, BigDecimal.valueOf(10000.0), "Corrida Maluca", 4, socorristaCarro, socorristaMoto);

        corrida.registrarCarro(250.0, 5, 3, "PLC1234");
        corrida.registrarCarro(300.0, 2, 6, "PLC1235");
        corrida.registrarCarro(220.0, 3, 2, "PLC1236");
        corrida.registrarMoto(210.0, 4, 3, "PLC1237");
        corrida.registrarMoto(230.0, 7, 7, "PLC1238");

        Veiculo vencedor = corrida.vencedor();
        System.out.println("Veiculo vencedor: " + vencedor);

        corrida.removerVeiculoPorPlaca("PLC1234");
        corrida.socorrerCarro("PLC1235");
        corrida.socorrerMoto("PLC1238");
    }
}
