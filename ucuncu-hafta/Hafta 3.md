# Collections
## Diziler
Java'da array tanımlamak için öncelikle satır başına arrayin içindeki değerlerin türü belirtilmelidir. Örneğin
```java
import java.util.Arrays;  
  
public class array {  
    public static void main(String[] args) {  
        int[] sayilar = new int[5];  
        sayilar[2] = 4;  
        String[] strings = new String[3];  
        strings[0] = "Samsung";  
        strings[1] = "Apple";  
        strings[2] = "Huawei";  
        System.out.println(Arrays.toString(deneme));  
        System.out.println(Arrays.toString(strings));  
    }  
}
```
Arrayleri ekrana yazdırmak için Arrays.toString methodu kullanılmalıdır. Yukarıdaki kod bloğunun çıktısı ise:

>  [0, 0, 4, 0, 0]\
[Samsung, Apple, Huawei]

```java
import java.util.Arrays;  
  
public class array2 {  
    public static void main(String[] args) {  
        int[] sayilar = {0,0,4,0,0};  
        String[] strings= {"Samsung","Apple","Huawei"};  
        System.out.println(Arrays.toString(sayilar));  
        System.out.println(Arrays.toString(strings));  
    }  
}
```
Yukarıdaki blok ile bu blok aynı çıktıları vermektedir.

#### Çok boyutlu diziler
Java'da iki boyutlu dizi tanımlamak için:
```java
public class matris {  
    public static void main(String[] args) {  
        int[][] sayilar=new int[satir][sutün];
    }  
}
```
Dizi elemanlarına erişmek için ise tek boyutlulardaki gibi yine köşeli parantezlerin için index numarası yazılır.

## Dizilerin uzunluğu
Arraylerin uzunluğu arrayİsmi.length komutu ile çağırılır.

## Hashset
Hashsetler kümeleri temsil etmektedir. Oluşturulan hashsetin boyutu arrayler gibi direkt tanımlanmaz. Hashsetin boyutu veri ekledikçe büyütülebilir. ornekHash adında hashset tanımlamak için:
```java
import java.util.HashSet;  

public class hashset {  
    public static void main(String[] args) {  
        HashSet<String> ornekHash = new HashSet<>();  
        ornekHash.add("Java");  
        ornekHash.add("Python");  
        ornekHash.add("C");  
        ornekHash.add("Go");  
        ornekHash.add("Go");
        ornekHash.remove("Python");
        }  
    }  
}
```
Eleman eklemek için add metodu kullanılırken, çıkarmak için remove metodu kullanılmaktadır. Ayrıca 8. satırda "Go" elemanını eklediğimizden ve küme olduğu için bir daha "Go" eklediğimizde yeni bir eleman eklenmeyecektir.
Hashsetin içindeki elemanların tek tek yazdırılması için for döngüsü kullanılabilir.
```java
import java.util.HashSet;  

public class hashset {  
    public static void main(String[] args) {  
        HashSet<String> ornekHash = new HashSet<>();  
        ornekHash.add("Java");  
        ornekHash.add("Python");  
        ornekHash.add("C");  
        ornekHash.add("Go");  
        for(String element: ornekHash){  
            System.out.println(element);  
        }
    }  
}
```
Hashsetteki elemanların index numaraları sabit kalmayabilir. Index numaraları önemli olduğunda LinkedHashSet kullanılmalıdır.
## LinkedHashSet
LinkedHashSet oluşturmak ve metodları HashSet'lere benzerdir. Yine bir küme olduğundan içerisinde benzersiz elemanları tutmaktadır. LinkedHashSet oluşturmak ve sırarsıyla ekrana yazdırmak için:
```java
import java.util.LinkedHashSet;  
import java.util.Set;  
  
public class linkedHashSet {  
    public static void main(String[] args) {  
        Set<String> linkedHashSet = new LinkedHashSet<>();  
        linkedHashSet.add("Java");  
        linkedHashSet.add("Python");  
        linkedHashSet.add("Go");  
        linkedHashSet.add("C++");  
        for(String eleman: linkedHashSet){  
            System.out.println(eleman);  
        }  
    }  
}
```
Her bir eleman birbirine bağlıdır (blokzincire benzetilebilir). Iterasyon oluşturarak da elemanlar arasında gezilebilir. hasNext metodu adından da anlaşılacağı üzere sırada veri olup olmadığını kontrol edip boolean döndürür.
```java
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
```
## ArrayList
LinkedHashSet'e benzer yapıdadır. Küme yerine liste şeklindedir. Bu nedenle aynı eleman birden fazla eklenebilir. Farklı olarak add metodu input olarak index numarası da alır böylece istenilen indexe istenilen eleman eklenebilir.
```java
import java.util.ArrayList;  
import java.util.List;  
  
public class arrayList {  
    public static void main(String[] args) {  
        List<Integer> arrayList = new ArrayList<>();  
        arrayList.add(1);  
        arrayList.add(2);  
        arrayList.add(4);  
        arrayList.add(5);  
        System.out.println(arrayList);  
        arrayList.add(2,3);  
        System.out.println(arrayList);  
    }  
}
```
ArrayList tanımlarken Arrays.asList komutuyla direkt olarak birden fazla eleman eklenebilir. Ayrıca iki listeyi birbirine ekleyebiliriz.
```java
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
```
İstenilen indexteki eleman get metoduyla çağırılır input olarak ise index numarası verilir. indexOf metoduyla istenilen obje var ise index numarasını döndürür. Eğer yok ise -1 (False) döndürür. Uzunluğu için ise size komutu çağırılır. Contains, isEmpty...
## HashMap
Python'daki sözlüklere benzetilebilir. İçerisindeki verilen anahtar - değer (key-value) şeklinde atanır. Her bir anahtar değeri benzersizken, değerler aynı olabilir. put metoduyla yeni anahtar - değer elemanları eklenir. get metoduyla anahtarın değeri çağırılabilir.
```java
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
        System.out.println(hashMapEx.containsKey("Ankara"));//Anahtarın     varlığını kontrol eder. Boolean döndürür.  
        System.out.println(hashMapEx.containsValue(07));//Değerin varlığını kontrol eder. Boolean döndürür.    
        for (String key: hashMapEx.keySet()){//Sırayla key value değerlerini yazdırır.  
		    System.out.println(key + " : " + hashMapEx.get(key));  
		}
    }  
}
```
Anahtarlar aracılığıyla değerleri çağırabiliriz. Fakat değerlerden anahtar gelmez (Ancak farklı yollarla elde edilebilir.). Çünkü anahtarlar benzersizken, değerler birden fazla olabilir. 
