import java.util.HashMap;

public class hashMap {
    public static void main(String[] args) {
        HashMap<String,Integer> hashMapEx = new HashMap<>();
        hashMapEx.put("Adana",01);
        hashMapEx.put("Adıyaman",02);
        hashMapEx.put("Afyonkarahisar",03);
        hashMapEx.put("Ağrı",04);
        hashMapEx.put("Amasya",05);
        hashMapEx.put("Ankara",06);
        System.out.println(hashMapEx.get("Ağrı"));
        System.out.println(hashMapEx.containsKey("Ankara"));
        System.out.println(hashMapEx.containsValue(07));
        for (String key: hashMapEx.keySet()){
            System.out.println(key + " : " + hashMapEx.get(key));
        }
    }
}