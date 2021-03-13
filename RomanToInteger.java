
public class RomanToInteger {
    public static void main(String[] args) {
        String s = "III";
        int integer = romanToInt(s);
        System.out.println(integer);
    }

    public static int romanToInt(String s) {
        int integer = 0;
        int previous = -1;
        int current = -1;
        for (char c : s.toCharArray()) {
            if (c== 'I') {
                current =1;
            }
            else if (c== 'V') {
                current =5;
            }
            else if (c== 'X') {
                current =10;
            }
            else if (c== 'L') {
                current =50;
            }
            else if (c== 'C') {
                current =100;
            }
            else if (c== 'D') {
                current =500;
            }
            else if (c== 'M') {
                current =1000;
            }

            if (previous != -1) {
                if (current <= previous) {
                    integer+=previous;
                }
                else if (current > previous) {
                    integer-=previous;
                }
            }
            previous=current;
            
        }
        return integer + current;
    }
}
