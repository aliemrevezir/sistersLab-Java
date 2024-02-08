import java.util.Arrays;

public class arrayInverse {
    public static void main(String[] args) {
        int[] arr = {3, 24, 64, 23, 6, 8, 9};
        System.out.println(Arrays.toString(inverseArray(arr)));
    }

    public static int[] inverseArray(int[] arr) {
        int[] yeniListe = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            yeniListe[i] = arr[arr.length - 1 - i];
        }
        return yeniListe;
    }
}
