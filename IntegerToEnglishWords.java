import java.util.ArrayList;
import java.util.List;

public class IntegerToEnglishWords {

    public static void main(String[] args) {
        int num = 123;
        String words = numberToWords(num);
        System.out.println(words);
    }

    public static String numberToWords(int num) {
        if (num == 0) {
            return "Zero";
        }


        return getString(num);
    }

    private static String getString(int num) {
        List<String> words = new ArrayList<>();
       fillList(words);
        StringBuilder appendedWords = new StringBuilder();
        //n/10+20-2
        if (num >= 1000000000) {
            int newNum = num % 1000000000;
            appendedWords.append(getString(num / 1000000000)).append(" Billion ").append(getString(newNum));
        }
        else if (num >= 1000000) {
            int newNum = num % 1000000;
            appendedWords.append(getString(num / 1000000)).append(" Million ").append(getString(newNum));
        }
        else if (num >= 1000) {
            int oldnum = num /1000;
            int newNum = num % 1000;
            appendedWords.append(getString(num / 1000)).append(" Thousand ").append(getString(newNum));
        }
        else if (num >= 100) {
            int newNum = num % 100;
            appendedWords.append(getString(num / 100)).append(" Hundred ").append(getString(newNum));
        }
        else if (num >= 20) {
            appendedWords.append(words.get(num /10+20-2)).append(" ").append(words.get(num % 10));
        }
        else {
            appendedWords.append(words.get(num));
        }

        String inWords = appendedWords.toString().trim();
        return inWords;
    }

    public static void fillList(List<String> words) {
        words.add("");
        words.add("One");
        words.add("Two");
        words.add("Three");
        words.add("Four");
        words.add("Five");
        words.add("Six");
        words.add("Seven");
        words.add("Eight");
        words.add("Nine");
        words.add("Ten");
        words.add("Eleven");
        words.add("Twelve");
        words.add("Thirteen");
        words.add("Fourteen");
        words.add("Fifteen");
        words.add("Sixteen");
        words.add("Seventeen");
        words.add("Eighteen");
        words.add("Nineteen");
        words.add("Twenty");
        words.add("Thirty");
        words.add("Forty");
        words.add("Fifty");
        words.add("Sixty");
        words.add("Seventy");
        words.add("Eighty");
        words.add("Ninety");
    }
}
