public class ebobEkok {
    public static String ebobEkok (int number, int number2) {
        int minBolen = Integer.MAX_VALUE;
        int maxBolen = Integer.MIN_VALUE;
        for (int i = 2; i < number; i++) {
            if (number %i == 0 && i<minBolen && number2 %i == 0 ) {
                minBolen = i;
            }
        }
        for (int i = 1; i < number; i++) {
            if (number %i == 0 && i>maxBolen && number2 %i == 0 ) {
                maxBolen = i;
            }
        }
        return (number+" ile " + number2 + " sayısının ekoku: " + minBolen +  "\n"+number+" ile "+number2+" sayısının ebobu: "+ maxBolen);
    }
    public static void main(String[] args) {
        System.out.println(ebobEkok(77,21));
    }
}