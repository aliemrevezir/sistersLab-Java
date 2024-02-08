import java.lang.reflect.Array;
import java.util.Arrays;

public class matris {
    public static void main(String[] args) {
        int[][] matris = new int[2][2];
        matris[0][0] = 0;
        matris[0][1] = 1;
        matris[1][0] = 2;
        matris[1][1] = 3;

        int[][] matris2 = {
                {0, 1},
                {2, 3}
        };
        System.out.println(Arrays.deepToString(matris) + " " + Arrays.deepToString(matris2) + " birbirine eşittir.");
    }
}
