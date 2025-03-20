package session_9_Recap;


public class Roman {

    public static void main(String[] args) {
        int num = 1994;
//        Output: "MCMXCIV"
        System.out.println(numRoman(num));
    }

    public static String numRoman(int num) {
        int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] symbols = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

        StringBuilder romanNumber = new StringBuilder();

        for (int i = 0; i < values.length; i++) {
            while (num >= values[i]) {
                num = num - values[i];
                romanNumber.append(symbols[i]);
            }
        }
        return romanNumber.toString();
    }

}