package laChiqui;

import java.util.*;

public class Evento {
    /*
    Como podemos ter fogos indivuais, pacotes e pacotes de pacotes, imaginei que a melhor solução seria um Map.
    Primeiro para garantir a tipagem das listas de fogos, pois para permitir que uma lista tivesse outra lista dentro,
    fora os fogos individuais isso necessitaria criar uma List<Object> ou algo do tipo, o que não é uma boa prática.
    E, com o Map, conseguimos ter os índices (chave como int) e as listas de fogos, para fogos individuais, são listas
    com um único fogo de artificio. Para pacotes de pacotes, na teoria são duas listas concatenadas, então no momento
    de instanciar um pacote desse tipo basta criar uma lista que concatena com algum pacote anterior
     */
    private List<Convidado> convidados;
    private Map<Integer, List<FogoArtificio>> fogos;
    private int contadorFogos;

    public Evento(List<Convidado> convidados) {
        this.convidados = convidados;
        this.fogos = new HashMap<>();
        this.contadorFogos = 0;
    }

    public List<Convidado> getConvidados() {
        return convidados;
    }

    public void setConvidados(List<Convidado> convidados) {
        this.convidados = convidados;
    }

    public Map<Integer, List<FogoArtificio>> getFogos() {
        return fogos;
    }

    public void setFogos(Map<Integer, List<FogoArtificio>> fogos) {
        this.fogos = fogos;
    }

    public void inserirFogos(FogoArtificio fogoArtificio) {
        this.fogos.put(this.contadorFogos, Arrays.asList(new FogoArtificio[]{fogoArtificio}));
        this.contadorFogos++;
    }

    public void inserirFogos(List<FogoArtificio> fogosArtificio) {
        this.fogos.put(this.contadorFogos, fogosArtificio);
        this.contadorFogos++;
    }

    public void estourarFogos() {
        System.out.println("Se preparem para os fogos!!!");
        for(Map.Entry<Integer, List<FogoArtificio>> mapFogos : this.fogos.entrySet()) {
            List<FogoArtificio> fogosArtificio = mapFogos.getValue();

            fogosArtificio.forEach(System.out::println);
        }
    }

    public void cortarBolo() {
        System.out.println("Hora de corta o bolo!!");
        this.convidados.forEach(convidado -> convidado.comerBolo());
    }
}
