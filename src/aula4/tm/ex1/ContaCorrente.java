package aula4.tm.ex1;

import java.math.BigDecimal;

public class ContaCorrente {
    /*
    Crie uma classe Conta Corrente, com os métodos: depósito, saque, devolução e transferência.
    A classe conterá um construtor padrão, um com parâmetros e outro que receberá uma conta corrente da qual copiará
    todos os seus dados. Além disso, os métodos de acesso devem ser desenvolvidos para cada variável de instância da
    classe, desenvolvendo um método set e outro método get. Por exemplo: se a classe tem uma variável double saldo,
    seus métodos de acesso serão: double getSaldo () e void setSaldo (double s) Os protótipos dos métodos e construtores
    devem ser discutidos e projetados em equipe.
    */

    private String cc;
    private String agencia;
    private BigDecimal saldo;

    public ContaCorrente(String cc, String agencia, BigDecimal saldo) {
        this.cc = cc;
        this.agencia = agencia;
        this.saldo = saldo;
    }

    public ContaCorrente(ContaCorrente conta) {
        this.cc = conta.getCc();
        this.agencia = conta.getAgencia();
        this.saldo = conta.getSaldo();
    }

    public String getCc() {
        return cc;
    }

    public void setCc(String cc) {
        this.cc = cc;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public BigDecimal getSaldo() {
        return saldo;
    }

    public void setSaldo(BigDecimal saldo) {
        this.saldo = saldo;
    }

    public void deposito(BigDecimal valor) {
        this.saldo = this.saldo.add(valor);
        System.out.println("Déposito realizado com sucesso! Saldo atual de R$ " + String.format("%.2f", this.saldo.doubleValue()));
    }

    public void saque(BigDecimal valor) {
        int podeSacar = valor.compareTo(this.saldo);
        if(podeSacar == -1 || podeSacar == 0) {
            this.saldo = this.saldo.subtract(valor);
            System.out.println("Saque feito com sucesso! Saldo atual de R$ " + String.format("%.2f", this.saldo.doubleValue()));
        } else {
            System.out.println("Valor a ser sacado é maior do que o saldo em conta! Saldo atual de R$ " + String.format("%.2f", this.saldo.doubleValue()));
        }
    }

    public void transferencia(BigDecimal valor, ContaCorrente conta) {
        int podeTransferir = valor.compareTo(this.saldo);

        if(podeTransferir == 0 || podeTransferir == -1) {
            this.saldo = this.saldo.subtract(valor);
            System.out.println("Transferência para a conta " + conta.getCc() + "feita com sucesso! Saldo atual de R$" + String.format("%.2f", this.saldo.doubleValue()));
        } else {
            System.out.println("Valor a ser transferido é maior do que o saldo em conta! Saldo atual de R$ " + String.format("%.2f", this.saldo.doubleValue()));
        }
    }

    public void devolucao(BigDecimal valor) {
        this.saldo = this.saldo.add(valor);
        System.out.println("Valor recebido de devolução R " + String.format("%.2f", valor.doubleValue()) + "\nSaldo atual de R$" + String.format("%.2f", this.saldo.doubleValue()));
    }

    @Override
    public String toString() {
        return "ContaCorrente{" +
                "cc='" + cc + '\'' +
                ", agencia='" + agencia + '\'' +
                ", saldo= R$" + String.format("%.2f", this.saldo.doubleValue()) +
                '}';
    }
}
