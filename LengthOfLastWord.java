public class LengthOfLastWord {
    public static void main(String[] args) {
        String s = "a ";
        int length = lengthOfLastWord(s);
        System.out.println(length);
    }

    public static int lengthOfLastWord(String s) {
        int length = 0;
        int lastChar = s.charAt(s.length()-1);
        if (lastChar == ' ') {
            s = s.trim();
        }
        for (int i = s.length()-1; i >= 0; i--) {
            if (s.charAt(i) != ' ') {
                length++;
            }
            else {
                break;
            }
        }
        return length;
    }
}
