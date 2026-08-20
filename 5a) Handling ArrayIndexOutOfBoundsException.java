class TrainCodes {
    public static void main(String[] args) {

        String[] trainCodes = {"TN101", "TN202", "TN303", "TN404", "TN505"};

        try {
            // Trying to access an invalid index
            System.out.println("Train Code: " + trainCodes[10]);
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Invalid train code index.");
            System.out.println("Please enter an index between 0 and 4.");
        }
    }
}
