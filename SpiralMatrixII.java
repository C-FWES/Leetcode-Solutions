public class SpiralMatrixII {
    public static void main(String[] args) {
        int n = 3;
        int[][] matrix = generateMatrix(n);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + " ");
            }
        }
    }

    public static int[][] generateMatrix(int n) {
        int[][] matrix = new int[n][n];

        int fillings = n*n+1;
        int currentNumber = 1;

        int left = 0;
        int up = 0;
        int right = n-1;
        int down = n-1;

        while (currentNumber < fillings) {
            for (int i = left; i <= right; i++) {
                matrix[up][i] = currentNumber;
                currentNumber++;
            }
            up++;
            for (int i = up; i <= down; i++) {
                matrix[i][right] = currentNumber;
                currentNumber++;
            }
            right--;
            for (int i = right; i >= left; i--) {
                matrix[down][i] = currentNumber;
                currentNumber++;
            }
            down--;
            for (int i = down; i >= up; i--) {
                matrix[i][left] = currentNumber;
                currentNumber++;
            }
            left++;
        }

        return matrix;
    }
}
