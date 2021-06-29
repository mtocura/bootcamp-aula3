package saveTheRopa;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GuardaRoupa {
    private static Integer contador = 0;
    private static Map<Integer, List<Vestuario>> roupas = new HashMap<>();

    public GuardaRoupa() {
        this.contador++;
    }

    public Integer guardarVestuario(List<Vestuario> listaDeVestuario) {
        this.roupas.put(this.contador, listaDeVestuario);

        return this.contador;
    }

    public void mostrarVestuario() {
        for(Map.Entry<Integer, List<Vestuario>> guardaRoupa : this.roupas.entrySet()) {
            int key = guardaRoupa.getKey();
            List<Vestuario> vestuarios = guardaRoupa.getValue();

            vestuarios.forEach(vestuario -> System.out.println(key + ": " + vestuario));
        }
    }

    public List<Vestuario> devolverVestuarios(Integer id) {
        if(this.roupas.containsKey(id)) {
            return this.roupas.get(id);
        }

        return null;
    }
}
