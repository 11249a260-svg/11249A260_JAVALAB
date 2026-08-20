class SalesArray {
    public static void main(String[] args) {

        int[] sales = {45000, 52000, 38000, 60000, 55000, 48000,
                       70000, 65000, 50000, 75000, 68000, 58000};

        int max = sales[0];
        int min = sales[0];

        for (int i = 1; i < sales.length; i++) {
            if (sales[i] > max) {
                max = sales[i];
            }

            if (sales[i] < min) {
                min = sales[i];
            }
        }

        System.out.println("Highest Sales: " + max);
        System.out.println("Lowest Sales : " + min);
    }
}
