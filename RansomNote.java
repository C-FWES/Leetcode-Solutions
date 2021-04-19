public class RansomNote {
    public static void main(String[] args) {
        String ransomNote = "aa";
        String magazine = "ab";
        System.out.println(canConstruct(ransomNote, magazine));
    }

    public static boolean canConstruct(String ransomNote, String magazine) {
        if (magazine.length() < ransomNote.length()) {
            return false;
        }
        int[] letters = new int[264];
        for (char c : magazine.toCharArray()) {
            letters[c-'a'] += 1;
        }
        for (char c : ransomNote.toCharArray()) {
            letters[c - 'a']-=1;
            if (letters[c - 'a'] < 0) {
                return false;
            }
        }
        return true;
    }
}
