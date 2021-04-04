public class Candy {
    public static void main(String[] args) {
        int[] ratings = {1,2,2};
        int candy = candy(ratings);
        System.out.println(candy);
    }

    public static int candy(int[] ratings) {
        if (ratings.length==1) {
            return 1;
        }
        int a = 1;
        int lowest = a;
        int sum = 0;
        int tempSum = a;
        int previousPeaki = 0;
        int currentStartValue = a;
        int previousPeakValue = Integer.MIN_VALUE;
        int previousSlope = 0;
        boolean firstPeak = true;
        for (int i = 1; i < ratings.length; i++) {
            int iPlus1 = i+1;
            int iMinus1 = i-1;
            boolean isPeak = iPlus1 >= ratings.length || ratings[iPlus1] <= ratings[i] && ratings[iMinus1] < ratings[i] || ratings[iPlus1] < ratings[i] && ratings[iMinus1] <= ratings[i];
            if (ratings[i] > ratings[iMinus1]) {
                a++;
            } else if (ratings[i] < ratings[iMinus1]){
                a--;
            }
            else if (isPeak && iPlus1 < ratings.length) {
                    a++;

            }
            if (a < lowest) {
                lowest = a;
            }
            tempSum += a;
            if (isPeak) {
                int offset = 1 - lowest;
                tempSum = tempSum + (iPlus1 - previousPeaki) * offset;
                sum += tempSum;
                if (!firstPeak) {
                    sum -= Math.min(previousPeakValue, currentStartValue + offset);
                }
                firstPeak = false;
                previousPeakValue = a + offset;
                tempSum = a;
                lowest = a;
                currentStartValue = a;
                previousPeaki = i;
            }
        }
        return sum;
    }
}
