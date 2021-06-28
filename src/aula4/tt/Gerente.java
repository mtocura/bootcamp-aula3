package aula4.tt;

import java.math.BigDecimal;

public class Gerente implements CLT{
    private BigDecimal salarioBase;
    private Double horasSemanais;
    private Double fimDeSemana;
    private Double bonificacao;
    private Integer metaAtingida;

    public Gerente(BigDecimal salarioBase, Double horasSemanais, Double fimDeSemana, Double bonificacao, Integer metaAtingida) {
        this.salarioBase = salarioBase;
        this.horasSemanais = horasSemanais;
        this.fimDeSemana = fimDeSemana;
        this.bonificacao = bonificacao;
        this.metaAtingida = metaAtingida;
    }

    public BigDecimal getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(BigDecimal salarioBase) {
        this.salarioBase = salarioBase;
    }

    public Double getHorasSemanais() {
        return horasSemanais;
    }

    public void setHorasSemanais(Double horasSemanais) {
        this.horasSemanais = horasSemanais;
    }

    public Double getFimDeSemana() {
        return fimDeSemana;
    }

    public void setFimDeSemana(Double fimDeSemana) {
        this.fimDeSemana = fimDeSemana;
    }

    public Double getBonificacao() {
        return bonificacao;
    }

    public void setBonificacao(Double bonificacao) {
        this.bonificacao = bonificacao;
    }

    public Integer getMetaAtingida() {
        return metaAtingida;
    }

    public void setMetaAtingida(Integer metaAtingida) {
        this.metaAtingida = metaAtingida;
    }

    @Override
    public void pagarSalario() {
        double valor = this.salarioBase.doubleValue() + (this.metaAtingida * this.bonificacao * this.salarioBase.doubleValue());
        BigDecimal total = BigDecimal.valueOf(valor);

        System.out.println("Salário base Gerente: R$" + String.format("%.2f", this.salarioBase.doubleValue()) + "\nValor a receber: R$ " + String.format("%.2f", total.doubleValue()));
    }
}
