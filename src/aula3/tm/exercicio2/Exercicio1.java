package aula3.tm.exercicio2;

public class Exercicio1 {
    /*
    Dado um vetor de 10 posições, sendo respectivamente ocupado pelos valores 52, 10, 85, 1324, 01, 13, 62, 30, 12 e 127.
    Imprima no console:
    a) Sua ordenação crescente.
    b) Sua ordenação decrescente.
     */

    public static void main(String[] args) {
        int[] array = {52, 10, 85, 1324, 01, 13, 62, 30, 12, 127};

        int[] crescente = bubbleSort(array, 'c');
        System.out.println("Ordenação crescente:");
        for(int i : crescente) {
            System.out.print(i + " ");
        }

        System.out.println();

        int[] decrescente = bubbleSort(array, 'd');
        System.out.println("Ordenação decrescente:");
        for(int i : decrescente) {
            System.out.print(i + " ");
        }
    }

    public static int[] bubbleSort(int[] arr, char tipo) {
        int[] result = arr;

        for(int i = arr.length - 1; i >= 1; i--) {
            for(int j = 1; j <= i; j++) {
                if(tipo == 'c') {
                    if(arr[j-1] > arr[j]) {
                        int aux = arr[j-1];
                        arr[j-1] = arr[j];
                        arr[j] = aux;
                    }
                } else if(tipo == 'd') {
                    if(arr[j-1] < arr[j]) {
                        int aux = arr[j-1];
                        arr[j-1] = arr[j];
                        arr[j] = aux;
                    }
                }
            }
        }

        return result;
    }
}
