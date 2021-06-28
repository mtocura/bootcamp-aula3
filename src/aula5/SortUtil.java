package aula5;

public class SortUtil {
    public static <T> void sort(Precedente<T> arr[]) {
        for(int i = arr.length - 1; i >= 1; i--) {
            for(int j = 1; j <= i; j++) {
                if(arr[j].precede((T)arr[j-1]) <= 0) {
                    Precedente<T> aux = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = aux;
                }
            }
        }
    }
}
