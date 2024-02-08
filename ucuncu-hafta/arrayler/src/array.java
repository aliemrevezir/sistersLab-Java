import java.util.Arrays;

public class array {
    public static void main(String[] args) {
        int[] deneme = new int[5];
        deneme[2] = 4;
        String[] strings = new String[3];
        strings[0] = "Samsung";
        strings[1] = "Apple";
        strings[2] = "Huawei";
        System.out.println(Arrays.toString(deneme));
        System.out.println(Arrays.toString(strings));
    }
}