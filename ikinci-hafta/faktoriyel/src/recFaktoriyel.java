public class recFaktoriyel {
    public static int faktoriyel(int number){
        if (number ==1 || number ==0){
            return 1;
        }else{
            return number * faktoriyel(number-1);
        }

    }

    public static void main(String[] args) {
        System.out.println(faktoriyel(5));
    }
}
