import java.util.Arrays;

public class BoatsToSavePeople2 {
    public static void main(String[] args) {
        int[] people = {3,2,2,1};
        int limit = 3;
        System.out.println(numRescueBoats(people, limit));
    }

    public static int numRescueBoats(int[] people, int limit) {
        int[] output = new int[people.length];
        int numberOfBoats = 0;
        //Coutning Sort
        int[] count = new int[limit+1];
        for (int i = 0; i < people.length; ++i) {
            ++count[people[i]];
        }
        for (int i = 1; i <= count.length-1; ++i) {
            count[i] += count[i - 1];
        }

        for (int i = people.length - 1; i >= 0; i--) {
            output[count[people[i]] - 1] = people[i];
            --count[people[i]];
        }
        int i = 0;
        int j = people.length-1;
        while (i<=j) {
            if (output[i] + output[j] <= limit) {
                i++;
                j--;
            }
            else {
                j--;
            }
            numberOfBoats++;
        }
        return numberOfBoats;
    }
}
