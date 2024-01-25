public class firstMethod {
    public static int sum(int x, int y){
        System.out.println((x + y));
        return (x+y);
    }

    public static void main(String[] args) {
        System.out.println(sum(3,4));
        sum(5,6);
    }
}