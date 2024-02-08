import java.util.HashSet;
import java.util.Iterator;

public class hashset {
    public static void main(String[] args) {
        HashSet<String> ornekHash = new HashSet<>();
        ornekHash.add("Java");
        ornekHash.add("Python");
        ornekHash.add("C");
        ornekHash.add("Go");
        ornekHash.add("Go"); //Pythondaki setlere karşılık
        ornekHash.add("GO");
        System.out.println(ornekHash);
        for(String element: ornekHash){
            System.out.println(element);
        }
        ornekHash.remove("GO");
        Iterator<String> iterator = ornekHash.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}