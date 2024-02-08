import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class arrayList {
    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(4);
        arrayList.add(5);
        //System.out.println(arrayList);
        arrayList.add(2,3);
        //System.out.println(arrayList);
        List<Integer> list2 = Arrays.asList(6,7,8,9);
        arrayList.addAll(list2);
        System.out.println(arrayList);
    }
}