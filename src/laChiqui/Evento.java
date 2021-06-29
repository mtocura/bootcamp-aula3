package laChiqui;

import java.util.List;
import java.util.Map;

public class Evento {
    private List<Convidado> convidados;
    private Map<Integer, List<FogoArtificio>> fogos;

    public Evento(List<Convidado> convidados, Map<Integer, List<FogoArtificio>> fogos) {
        this.convidados = convidados;
        this.fogos = fogos;
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

    public void estourarFogos() {
        for(Map.Entry<Integer, List<FogoArtificio>> mapFogos : this.fogos.entrySet()) {
            List<FogoArtificio> fogosArtificio = mapFogos.getValue();

            fogosArtificio.forEach(System.out::println);
        }
    }

    public void cortarBolo() {
        this.convidados.forEach(convidado -> convidado.comerBolo());
    }
}
