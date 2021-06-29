package laChiqui;

import java.util.*;

public class Evento {
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
