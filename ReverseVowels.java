import java.util.HashSet;
import java.util.Set;

public class ReverseVowels {
    public static void main(String[] args) {
        String s = "Hello";
        String reverse = reverseVowels(s);
        System.out.println(reverse);
    }

    public static String reverseVowels(String s) {
        int vowel1 = 0;
        int vowel2 = s.length()-1;
        char[] c = s.toCharArray();

//        Set<Character> vowels = new HashSet<>(16);
//        vowels.add('a');
//        vowels.add('A');
//        vowels.add('e');
//        vowels.add('E');
//        vowels.add('i');
//        vowels.add('I');
//        vowels.add('u');
//        vowels.add('U');
//        vowels.add('o');
//        vowels.add('O');

        boolean[] vowels = new boolean[256];
        vowels['a'] = vowels['e'] = vowels['i'] = vowels['o'] = vowels['u'] = true;
        vowels['A'] = vowels['E'] = vowels['I'] = vowels['O'] = vowels['U'] = true;

        while (vowel1<vowel2) {

            while (vowel1 < vowel2 && !vowels[c[vowel1]]) {
                vowel1++;
            }
            while (vowel1 < vowel2 && !vowels[c[vowel2]]) {
                vowel2--;
            }

            if (vowel1 >= vowel2) {
                break;
            }
            char l1 = c[vowel1];
            char l2 = c[vowel2];
            c[vowel1] = l2;
            c[vowel2] = l1;

            vowel1++;
            vowel2--;
        }

        return new String(c);
    }
}
