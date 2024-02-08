import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class linkedHashSet {
    public static void main(String[] args) {
        Set<Integer> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add(1);
        linkedHashSet.add(2);
        linkedHashSet.add(3);
        linkedHashSet.add(4);
        for(int eleman: linkedHashSet){
            System.out.println(eleman);
        }
        Iterator<Integer> iterator = linkedHashSet.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
