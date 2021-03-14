import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class IntegerToRoman {
    public static void main(String[] args) {
        int num = 1011;
        String result = intToRoman(num);
        System.out.println(result);
    }

    public static String intToRoman(int num) {
        Map<Integer, String> romanEquivalents = new LinkedHashMap<>();
        makeMap(romanEquivalents);

        StringBuilder romanLetters = new StringBuilder();
        if (num >= 1000) {
            int timesOfM = num / 1000;
//            for (int i = 0; i < timesOfM; i++) {
//                romanLetters.append("M");
//            }
            num-=timesOfM*1000;
            String space10 = new String(new char[timesOfM]).replace('\0', 'M');
            romanLetters.append(space10);
        }
        for (Integer integer : romanEquivalents.keySet()) {
            String string = romanEquivalents.get(integer);
            while (num >= integer) {
                romanLetters.append(string);
                num -= integer;
            }
        }

        String roman = romanLetters.toString();
        return roman;
    }

    private static void makeMap(Map<Integer, String> romanEquivalents) {
//        romanEquivalents.put(1000, "M");
        romanEquivalents.put(900, "CM");
        romanEquivalents.put(500, "D");
        romanEquivalents.put(400, "CD");
        romanEquivalents.put(100, "C");
        romanEquivalents.put(90, "XC");
        romanEquivalents.put(50, "L");
        romanEquivalents.put(40, "XL");
        romanEquivalents.put(10, "X");
        romanEquivalents.put(9, "IX");
        romanEquivalents.put(5, "V");
        romanEquivalents.put(4, "IV");
        romanEquivalents.put(1, "I");
    }
}
