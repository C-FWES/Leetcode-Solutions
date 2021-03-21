import java.util.*;

public class LetterCombinations {
    public static void main(String[] args) {
        String digits = "234";
        List<String> combinations = letterCombinations(digits);
        for (String combination : combinations) {
            System.out.println(combination);
        }
    }

    public static List<String> letterCombinations(String digits) {
        if (digits.length() < 1) {
            return Collections.emptyList();
        }
        Map<Character, String> numberMappings = new HashMap<>();
        fillMap(numberMappings);

        List<String> previousCombination = new ArrayList<>();
        previousCombination.add("");

        List<String> current = null;
        for (char c : digits.toCharArray()) {
            current = new ArrayList<>();
            String letters = numberMappings.get(c);
            for (String s : previousCombination) {
                for (char c1 : letters.toCharArray()) {
                    current.add(s + c1);
                }
            }
            previousCombination = current;
        }

        return current;
    }

    public static void fillMap(Map<Character, String> numberMappings) {
        numberMappings.put('2', "abc");
        numberMappings.put('3', "def");
        numberMappings.put('4', "ghi");
        numberMappings.put('5', "jkl");
        numberMappings.put('6', "mno");
        numberMappings.put('7', "pqrs");
        numberMappings.put('8', "tuv");
        numberMappings.put('9', "wxyz");
    }


}
