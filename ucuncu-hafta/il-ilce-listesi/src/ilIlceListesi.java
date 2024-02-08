import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class ilIlceListesi {
    public static void main(String[] args) {
        HashMap<String, String[]> il_ilce = new HashMap<>();
        il_ilce.put("Afyonkarahisar", new String[]{"Çay, Bolvadin, Sandıklı, Dinar"});
        il_ilce.put("Ankara", new String[]{"Polatlı, Çankaya, Keçiören, Beypazarı"});
        il_ilce.put("İstanbul", new String[]{"Beşiktaş, Kadıköy, Ataşehir, Ataköy, Kağıthane"});
        System.out.println("Lütfen ilçelerini görmek istediğiniz ili giriniz...\n(İller: Afyonkarahisar, İstanbul, Ankara)");
        Scanner key = new Scanner(System.in);
        String il = key.nextLine();
        if (il_ilce.containsKey(il)) {
            for (String ilce : il_ilce.get(il)) {
                System.out.println(il + " ilinin ilçeleri: " + ilce);
            }
        }else{
            System.out.println("Girdiğiniz il listede bulunmamaktadır.");
        }
    }
}