public class AverageWaitingTIme {
    public static void main(String[] args) {
        int[][] customers = new int[3][1];
        customers[0] = new int[]{1, 2};
        customers[1] = new int[]{2, 5};
        customers[2] = new int[]{4, 3};
        double wait = averageWaitingTime(customers);
        System.out.println(wait);
    }

    public static double averageWaitingTime(int[][] customers) {
        int totalWaiting = 0;
        int time = 0;
        for (int[] customer : customers) {
            time = Math.max(customer[0], time) + customer[1];
            totalWaiting += time - customer[0];
        }
        return (double) totalWaiting/customers.length;
    }
}
