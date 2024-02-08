import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;

public class evenOddList {
/*

Soru: Cift Sayilari Filtreleme
Bir ArrayList icinde rastgele sayilari saklayin.
Cift sayilari bir HashSet icine ekleyip,
tek sayilari bir ArrayList icine ekleyen bir program yazin.
 */
    public static void main(String[] args) {
        Random rand = new Random(20);
        int[] arr = new int[20];
        for (int i = 0; i< arr.length;i++){
            arr[i] = rand.nextInt(200);
        }
        HashSet<Integer> cift = new HashSet<>();
        ArrayList<Integer> tek = new ArrayList<>();
        for (int j : arr) {
            if (j % 2 == 0) {
                cift.add(j);
            } else {
                tek.add(j);
            }
        }
        System.out.println("**************************************************");
        System.out.println("Rastgele sayılardan oluşan listenin tek sayıları:");
        for (int i : tek){
            System.out.print(i+" ");
        }
        System.out.println();
        System.out.println("**************************************************");
        System.out.println("Rastgele sayılardan oluşan listenin çift sayıları:");
        for (int i : cift){
            System.out.print(i+" ");
        }
    }
}