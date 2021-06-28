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
    }
}
