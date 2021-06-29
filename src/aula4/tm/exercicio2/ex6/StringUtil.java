package aula4.tm.exercicio2.ex6;

import java.util.*;

public class StringUtil {
    /*
    Partindo da classe StringUtil (que usamos para resolver Radix Sort), agregar os seguintes métodos estáticos:

    public static String rpad (String s, char c, int n); idem lpad, mas adicionando caracteres à direita.
    public static String ltrim (String s); Retorna uma string idêntica a s, mas sem espaços à esquerda.
    public static String rtrim (String s); idem ltrim, mas sem espaços à direita.
    public static String trim(String s);  idem lpad, mas sem espaços à direita ou à esquerda.
    public static int indexOfN (String s, char c, int n); Retorna a posição da enésima ocorrência do caractere c em s,
    ou -1 se s não contiver c. Por exemplo, se s = "John | Paul | George | Ringo", c = ‘|’ e n = 2, a função deve retornar
    a posição da segunda ocorrência do caractere ‘|’ (barra vertical) dentro da string s. Que, neste caso, é: 9.
     */

    public static String rpad(String s, char c, int n) {
        StringBuilder str = new StringBuilder();
        str.append(s);

        for(int i = 0; i < n; i++) {
            str.append(c);
        }

        return str.toString();
    }

    public static String ltrim(String s) {
        int i = 0;
        while (i < s.length() && Character.isWhitespace(s.charAt(i))) {
            i++;
        }
        return s.substring(i);
    }

    public static String rtrim(String s) {
        int i = s.length() - 1;
        while(i >= 0 && Character.isWhitespace(s.charAt(i))) {
            i--;
        }

        return s.substring(0, i+1);
    }

    public static String trim(String s) {
//         return s.trim();
        return rtrim(ltrim(s));
    }

    public static int indexOfN(String s, char c, int n) {
        String str = s.replaceAll("\\s+","").toLowerCase();
        int existeChar = str.indexOf(c);

        if(existeChar != -1) {
            Map<Character, List<Integer>> characterListMap = new HashMap<>();
            char[] charArray = str.toCharArray();

            for(int i = 0; i < charArray.length; i++) {
                if(characterListMap.containsKey(charArray[i])) {
                    List<Integer> list = characterListMap.get(charArray[i]);
                    list.add(i);
                } else {
                    List<Integer> list = new ArrayList<>();
                    list.add(i);
                    characterListMap.put(charArray[i], list);
                }
            }

            List<Integer> positions = characterListMap.get(c);

            if(positions.size() >= n) {
                return positions.get(n - 1);
            } else {
                return -1;
            }
        }

        return -1;
    }
}
