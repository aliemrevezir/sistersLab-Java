public class carpimTablosuYazdirma {
    public static void main(String[] args) {
        System.out.println("Carpim Tablosu Yazdırmaya Hoşgeldiniz...");
        for(int i=9;i>=1; i-=1){
            for (int j = 9; j >= 1; j--) {
                System.out.println(i+"*"+j+"="+i*j);
            }
        }
    }
}