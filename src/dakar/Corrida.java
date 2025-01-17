package dakar;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Corrida {
    private Double distancia;
    private BigDecimal premioEmDolares;
    private String nome;
    private Integer quantidadeVeiculosPermitidos;
    private List<Veiculo> listaVeiculos;
    private SocorristaCarro socorristaCarro;
    private SocorristaMoto socorristaMoto;

    public Corrida(Double distancia, BigDecimal premioEmDolares, String nome, Integer quantidadeVeiculosPermitidos, SocorristaCarro socorristaCarro, SocorristaMoto socorristaMoto) {
        this.distancia = distancia;
        this.premioEmDolares = premioEmDolares;
        this.nome = nome;
        this.quantidadeVeiculosPermitidos = quantidadeVeiculosPermitidos;
        this.socorristaCarro = socorristaCarro;
        this.socorristaMoto = socorristaMoto;
        this.listaVeiculos = new ArrayList<>();
    }

    public Double getDistancia() {
        return distancia;
    }

    public void setDistancia(Double distancia) {
        this.distancia = distancia;
    }

    public BigDecimal getPremioEmDolares() {
        return premioEmDolares;
    }

    public void setPremioEmDolares(BigDecimal premioEmDolares) {
        this.premioEmDolares = premioEmDolares;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getQuantidadeVeiculosPermitidos() {
        return quantidadeVeiculosPermitidos;
    }

    public void setQuantidadeVeiculosPermitidos(Integer quantidadeVeiculosPermitidos) {
        this.quantidadeVeiculosPermitidos = quantidadeVeiculosPermitidos;
    }

    public SocorristaCarro getSocorristaCarro() {
        return socorristaCarro;
    }

    public void setSocorristaCarro(SocorristaCarro socorristaCarro) {
        this.socorristaCarro = socorristaCarro;
    }

    public SocorristaMoto getSocorristaMoto() {
        return socorristaMoto;
    }

    public void setSocorristaMoto(SocorristaMoto socorristaMoto) {
        this.socorristaMoto = socorristaMoto;
    }

    public List<Veiculo> getListaVeiculos() {
        return listaVeiculos;
    }

    public void setListaVeiculos(List<Veiculo> listaVeiculos) {
        this.listaVeiculos = listaVeiculos;
    }

    public void registrarCarro(double velocidade, double aceleracao, int anguloDeGiro, String placa) {
        if(this.listaVeiculos.size() < this.quantidadeVeiculosPermitidos) {
            this.listaVeiculos.add(new Carro(velocidade, aceleracao, anguloDeGiro, placa));
        } else {
            System.out.println("Quantidade máxima de veículos já atingida!");
        }
    }

    public void registrarMoto(double velocidade, double aceleracao, int anguloDeGiro, String placa) {
        if(this.listaVeiculos.size() < this.quantidadeVeiculosPermitidos) {
            this.listaVeiculos.add(new Moto(velocidade, aceleracao, anguloDeGiro, placa));
        } else {
            System.out.println("Quantidade máxima de veículos já atingida!");
        }
    }

    public void removerVeiculo(Veiculo veiculo) {
        this.listaVeiculos.remove(veiculo);
    }

    public void removerVeiculoPorPlaca(String placa) {
        int index = findIndexPlaca(placa);

        if(index != -1) {
            this.listaVeiculos.remove(index);
        }
    }

    public Veiculo vencedor() {
        int maior = 0;
        List<Double> velocidade = new ArrayList<>();

        for(Veiculo veiculo : this.listaVeiculos) {
            double valor = (veiculo.getVelocidade() * veiculo.getAceleracao()) / (veiculo.getAnguloDeGiro() * (veiculo.getPeso() - veiculo.getRodas() * 100));
            velocidade.add(valor);
        }

        for(int i = 1; i <= velocidade.size() - 1; i++) {
            if(velocidade.get(maior) < velocidade.get(i)) {
                maior = i;
            }
        }

        return this.listaVeiculos.size() > 0 ? this.listaVeiculos.get(maior) : null;
    }

    public void socorrerCarro(String documento) {
        int index = findIndexPlaca(documento);

        if(index != -1) {
            this.socorristaCarro.socorrer((Carro) this.listaVeiculos.get(index));
        } else {
            System.out.println("Carro não inscrito na corrida!");
        }
    }

    public void socorrerMoto(String documento) {
        int index = findIndexPlaca(documento);

        if(index != -1) {
            this.socorristaMoto.socorrer((Moto) this.listaVeiculos.get(index));
        } else {
            System.out.println("Moto não inscrito na corrida!");
        }
    }

    private int findIndexPlaca(String placa) {
        int index = -1;

        for(int i = 0; i < this.listaVeiculos.size(); i++) {
            if(this.listaVeiculos.get(i).getPlaca().equals(placa)) {
                index = i;
            }
        }

        return index;
    }
}
