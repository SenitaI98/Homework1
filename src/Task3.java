public class Task3 {
    public static void main(String[] args) {
        int A = 5;
        int B = 5;

        if (A > 1000) {
            System.out.println("Number A = " + A + " must be less than 1000!");
        } else {
            if (A > B) {
                int sum = A + B;
                System.out.println("Sum of numbers A = " + A + " and B = " + B + " is: " + sum);
            } else if (B > A) {
                int difference = B - A;
                System.out.println("Difference of numbers B = " + B + " and A = " + A + " is: " + difference);
            } else if (A == B) {
                int product = A * B;
                System.out.println("Product of numbers A = " + A + " and B = " + B + " is: " + product);
            }
        }
    }
}
