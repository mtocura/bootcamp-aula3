package saveTheRopa;

import java.util.Arrays;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        GuardaRoupa guardaRoupa = new GuardaRoupa();

        Vestuario camiseta = new Vestuario("Uniqlo", "U Airism Cotton Oversized Crew Neck T-Shirt");
        Vestuario calca = new Vestuario("Uniqlo", "Men Smart Dry-Ex Ultra Stretch Ankle-Length Pants");

        List<Vestuario> roupas = Arrays.asList(new Vestuario[]{camiseta, calca});

        guardaRoupa.guardarVestuario(roupas);
        guardaRoupa.mostrarVestuario();

        System.out.println();
        List<Vestuario> roupasRetiradas = guardaRoupa.devolverVestuarios(1);

        // não irá mostrar nada, pois removemos as roupas guardadas do Map
        guardaRoupa.mostrarVestuario();

        roupasRetiradas.forEach(System.out::println);
    }
}
