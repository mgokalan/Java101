import java.util.Arrays;

public class ListDublicate {

    static boolean isFind(int[] arr, int value) {
        for (int i : arr) {
            if (i == value) {
                return true;
            }
        }
        return false;
    }


    public static void main(String[] args) {
        int[] array = {1, 0, 1, 2, 3, 4, 5, 5, 6, 6, 7, 8, 20, 9, 20, 0, 0};
        int[] dublicate = new int[array.length];
        int value = 0;
        boolean x = false;


        for (int i = 0; i < array.length; i++) {
            for (int j = i; j < array.length; j++) {
                if (i != j && array[i] == array[j] && array[i] % 2 == 0) {
                    if (!isFind(dublicate, array[i])) {
                        dublicate[value++] = array[i];
                    }
                }
            }
        }
        for (int i : dublicate) {
            if (i != 0) {
                System.out.println(i);
            }
        }
    }
}
