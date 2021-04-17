public class GoatLatin {
    public static void main(String[] args) {
        String S = "I speak Goat Latin";
        System.out.println(toGoatLatin(S));
    }

    public static String toGoatLatin(String S) {
        boolean[] vowels = new boolean[256];
        vowels['a'] = vowels['e'] = vowels['i'] = vowels['o'] = vowels['u'] = true;
        vowels['A'] = vowels['E'] = vowels['I'] = vowels['O'] = vowels['U'] = true;
        String[] sentence = S.split(" ");
        StringBuilder sb = new StringBuilder();
        int indexCount = 1;
        int length = sentence.length;
        String a = "a";
        for (String s : sentence) {
//            StringBuilder newString = new StringBuilder();
            if (vowels[s.charAt(0)]) {
                sb.append(s).append("ma").append(a.repeat(indexCount));
            }
            else {
                char firstLetter = s.charAt(0);
                sb.append(s.substring(1)).append(firstLetter).append("ma").append(a.repeat(indexCount));
            }
            indexCount++;
            if (indexCount <= length) {
                sb.append(" ");
            }
        }
        return new String(sb);
    }
}
