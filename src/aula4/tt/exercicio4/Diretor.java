package aula4.tt.exercicio4;

import java.math.BigDecimal;

public class Diretor implements CLT{
    private BigDecimal salarioBase;
    private Double porcentagemLucros;
    private BigDecimal lucro;

    public Diretor(BigDecimal salarioBase, Double porcentagemLucros, BigDecimal lucro) {
        this.salarioBase = salarioBase;
        this.porcentagemLucros = porcentagemLucros;
        this.lucro = lucro;
    }

    public BigDecimal getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(BigDecimal salarioBase) {
        this.salarioBase = salarioBase;
    }

    public Double getPorcentagemLucros() {
        return porcentagemLucros;
    }

    public void setPorcentagemLucros(Double porcentagemLucros) {
        this.porcentagemLucros = porcentagemLucros;
    }

    public BigDecimal getLucro() {
        return lucro;
    }

    public void setLucro(BigDecimal lucro) {
        this.lucro = lucro;
    }

    @Override
    public void pagarSalario() {
        double valor = this.salarioBase.doubleValue() + (this.porcentagemLucros * this.lucro.doubleValue());
        BigDecimal total = BigDecimal.valueOf(valor);

        System.out.println("Salário base Diretor: R$" + String.format("%.2f", this.salarioBase.doubleValue()) + "\nValor a receber: R$ " + String.format("%.2f", total.doubleValue()));
    }
}
