package laChiqui;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Program {
    public static void main(String[] args) {
        // fogos de artificio individuais
        FogoArtificio fogo1 = new FogoArtificio("BUMM");
        FogoArtificio fogo2 = new FogoArtificio("FIIIIIII.... Puff");
        FogoArtificio fogo3 = new FogoArtificio("PU PU PU.... POW");

        // pacotes de fogos de artificio
        List<FogoArtificio> pacote1 = Arrays.asList(new FogoArtificio[]{new FogoArtificio("KABUM"), new FogoArtificio("KAPOW")});
        List<FogoArtificio> pacote2 = Arrays.asList(new FogoArtificio[]{new FogoArtificio("Puff"), new FogoArtificio("POWOW")});

        // pacote de pacotes
        List<FogoArtificio> pacote3 = Stream.concat(pacote1.stream(), pacote2.stream()).collect(Collectors.toList());
        pacote3.add(new FogoArtificio("Katapimbas"));

        // convidados meli
        Convidado meli1 = new Meli("João");
        Convidado meli2 = new Meli("Maurício");
        Convidado meli3 = new Meli("Adriana");
        Convidado meli4 = new Meli("Ângelo");
        Convidado meli5 = new Meli("Amanda");
        Convidado meli6 = new Meli("Roberto");

        // convidados standard
        Convidado std1 = new Standard("Josué");
        Convidado std2 = new Standard("Jéssica");
        Convidado std3 = new Standard("Carol");
        Convidado std4 = new Standard("Lucas");
        Convidado std5 = new Standard("Enzo");

        // lista de convidados
        List<Convidado> convidados = Arrays.asList(new Convidado[]{meli1, std1, std2, meli4, meli5, meli6, std5, meli3, std3, std4, meli2});

        // instanciando evento
        Evento laChiqui = new Evento(convidados);

        // inserindo fogos
        laChiqui.inserirFogos(fogo1);
        laChiqui.inserirFogos(pacote2);
        laChiqui.inserirFogos(fogo3);
        laChiqui.inserirFogos(fogo2);
        laChiqui.inserirFogos(pacote1);
        laChiqui.inserirFogos(pacote3);

        // momentos
        laChiqui.estourarFogos();
        System.out.println();
        laChiqui.cortarBolo();
    }
}
