package saveTheRopa;

import java.util.List;
import java.util.Map;

public class GuardaRoupa {
    private static Integer contador = 0;
    private static Map<Integer, List<Vestuario>> roupas;

    public GuardaRoupa() {
        this.contador++;
    }

    public Integer guardarVestuario(List<Vestuario> listaDeVestuario) {
        this.roupas.put(this.contador, listaDeVestuario);

        return this.contador;
    }

    
}
