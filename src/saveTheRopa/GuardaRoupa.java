package saveTheRopa;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GuardaRoupa {
    // decidi criar atributos de classe para que o roupa possa atuar parecido com um banco de dados
    // onde o ID sempre é incrementado para cada objeto instanciado
    // e, portanto, mais de uma pessoa estaria guardando suas roupas no mesmo guarda roupa.
    // Se eu usasse atributos para cada instância, a diferença seria de que cada pessoa teria seu próprio
    // guarda roupa, porém teríamos que criar uma instância de guarda roupa nova para cada pessoa.
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
            List<Vestuario> res = this.roupas.remove(id);
            return res;
        }

        return null;
    }
}
