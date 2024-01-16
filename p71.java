import java.util.HashMap;
import java.util.Map;

public class p71 {
    public static int romanToInt(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }

        Map<Character, Integer> romanMap = createRomanMap();
        int result = romanMap.get(s.charAt(s.length() - 1));

        for (int i = s.length() - 2; i >= 0; i--) {
            if (romanMap.get(s.charAt(i)) < romanMap.get(s.charAt(i + 1))) {
                result -= romanMap.get(s.charAt(i));
            } else {
                result += romanMap.get(s.charAt(i));
            }
        }

        return result;
    }

    private static Map<Character, Integer> createRomanMap() {
        Map<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        return map;
    }

    public static void main(String[] args) {
        String romanNumeral = "XII";
        int decimalNumber = romanToInt(romanNumeral);

        System.out.println("Roman Numeral: " + romanNumeral);
        System.out.println("Decimal Number: " + decimalNumber);
    }
}
