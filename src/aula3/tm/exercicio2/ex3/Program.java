package aula3.tm.exercicio2.ex3;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Produto> produtos = new ArrayList<>();

        for(int i = 1; i <= 3; i++) {
            System.out.println("Produto " + i);
            String name = sc.nextLine();

            double price = sc.nextDouble();
            sc.nextLine();

            int quantity = sc.nextInt();
            sc.nextLine();

            produtos.add(new Produto(name, price, quantity));
        }

        double total = 0;

        for(Produto prod : produtos) {
            total += prod.getPrice() * prod.getQuantity();

            System.out.println(prod);
            System.out.println();
        }

        System.out.println("Valor Total: R$ " + String.format("%.2f", total));

        sc.close();
    }
}
