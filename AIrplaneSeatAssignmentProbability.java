public class AIrplaneSeatAssignmentProbability {
    public static void main(String[] args) {

    }

    public static double nthPersonGetsNthSeat(int n) {
        if (n == 1) {
            return 1;
        }
        else {
            return 0.5;
        }
    }
}
