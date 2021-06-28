package aula4.tm.ex6;

public class Program {
    public static void main(String[] args) {
        System.out.println(StringUtil.rpad("Teste", '0', 5));
        System.out.println(StringUtil.ltrim("    teste"));
        System.out.println(StringUtil.rtrim("testando         "));
        System.out.println(StringUtil.trim("     trim      "));
        System.out.println(StringUtil.indexOfN("John | Paul | George | Ringo", 'g', 2));
    }
}
