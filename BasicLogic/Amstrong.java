package BasicLogic;

class Amstrong {

    // Method to check if a number is an Armstrong number
    public boolean isArmstrong(int n) {
        int originalNumber = n;
        int result = 0;

        // Loop to calculate the sum of cubes of the digits
        while (n != 0) {
            int rem = n % 10;         // Get the last digit
            result += rem * rem * rem; // Add the cube of the digit
            n = n / 10;               // Remove the last digit
        }

        // Check if the original number is equal to the result
        return result == originalNumber;
    }

    public static void main(String[] args) {
        Amstrong as = new Amstrong();
        int n = 153; // Example number

        // Check if the number is an Armstrong number
        if (as.isArmstrong(n)) {
            System.out.println(n + " is an Armstrong number.");
        } else {
            System.out.println(n + " is not an Armstrong number.");
        }
    }
}
