public class p70 {
    public static String intToRoman(int num) {
        if (num <= 0 || num > 3999) {
            return "Invalid input";
        }

        int[] values = { 1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1 };
        String[] symbols = { "M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I" };

        StringBuilder roman = new StringBuilder();

        for (int i = 0; i < values.length; i++) {
            while (num >= values[i]) {
                num -= values[i];
                roman.append(symbols[i]);
            }
        }

        return roman.toString();
    }

    public static void main(String[] args) {
        int decimalNumber = 11;
        String romanNumeral = intToRoman(decimalNumber);

        System.out.println("Decimal Number: " + decimalNumber);
        System.out.println("Roman Numeral: " + romanNumeral);
    }
}
