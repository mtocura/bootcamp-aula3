package aula5;

import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {
       Pessoa p1 = new Pessoa("João", "12135456");
       Pessoa p2 = new Pessoa("Mauricio", "921392378");
       Pessoa p3 = new Pessoa("Ângelo", "502852234");
       Pessoa p4 = new Pessoa("Amanda", "3107419287");
       Pessoa p5 = new Pessoa("Caio", "30132989038");

       Pessoa[] arr = {p1, p2, p3, p4, p5};

       SortUtil.sort(arr);

       for(Pessoa p : arr) {
           System.out.println(p);
       }

       Celular c1 = new Celular("011", "4332-6789");
       Celular c2 = new Celular("012", "1239-6789");
       Celular c3 = new Celular("011", "5039-6789");
       Celular c4 = new Celular("011", "2309-6789");
       Celular c5 = new Celular("012", "6079-6789");

       Celular[] celulares = {c1, c2, c3, c4, c5};

       SortUtil.sort(celulares);

       for(Celular c : celulares) {
           System.out.println(c);
       }

       /*
       Resposta Discussão Exercício 2: Nesta implementação caso quiséssemos mudar o método precede
       teríamos que ir na classe Pessoa e/ou Celular e modificar a sobrescrita do método.
       Acredito que para uma aplicação de pequeno/médio porte uma implementação desta maneira ainda é aceitável,
       porém com o aumento do tamanho do projeto acredito que seria interessante usarmos o default methods na interface
       ou modificarmos a assinatura do sort no SortUtil para ele também receber um Comparator, uma vez que, normalmente,
       estamos fazendo o compare em variáveis de tipos primitivos, poderíamos passar via method referece o compare,
       tornando o código um pouco mais dinâmico. Por exemplo SortUtil.sort(pessoas, String::compareTo)
        */
    }
}
