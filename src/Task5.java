public class Task5 {
    public static void main(String[] args) {
        int a = 30;
        int b = 100;
        int c = 0;
        int d = 0;

        if ((a > 0 && b > 0) || (c > 0 && d > 0)) {
            int sum = a + b + c + d;
            if (sum > 100) {
                if (sum % 2 == 0) {
                    int division = sum / 2;
                    System.out.println("Sum of the numbers " + a + ", " + b + ", " + c + ", " + d + " is " + sum + "." + " The number is divisible by 2.");
                    System.out.println(sum + " : 2 = " + division);
                } else {
                    System.out.println("Sum is " + sum + " and it isn't divisible by 2.");
                    sum = sum - 1;
                    if (sum % 2 == 0) {
                        System.out.println("After subtracting the number 1, the sum is " + sum + ". Now the number is divisible by 2.");

                    } else {
                        System.out.println("The number is still not divisible by 2.");
                    }
                }
            } else {
                System.out.println("Sum isn't greater than 100.");
            }
        } else {
            System.out.println("Variables: " + a + " and " + b + " OR " + c + " and " + d + " must be greater then 0!");
        }
    }
}