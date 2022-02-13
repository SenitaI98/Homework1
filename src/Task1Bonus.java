public class Task1Bonus {
    public static void main(String[] args) {

        double money = 100;
        double bill = 78.16;

        if (bill < money) {      // Ovaj uslov sam dodala iz razloga sto mi nema smisla da se ispituju uslovi kusura ako je bill veci od money kojim raspolazemo
            if (money <= 100) {
                if (bill > 0) {
                    double change = money - bill;
                    System.out.println("You have " + money + "KM" + ", the bill is: " + bill + "KM");
                    System.out.println("Change is: " + change + "KM");

                    if (change >= 1) {
                        double twenty = change / 20;
                        System.out.println("20KM = " + (int) twenty);
                        double changeTwenty = change % 20;

                        double ten = changeTwenty / 10;
                        System.out.println("10KM = " + (int) ten);
                        double changeTen = changeTwenty % 10;

                        double two = changeTen / 2;
                        System.out.println("2KM = " + (int) two);
                        double changeTwo = changeTen % 2;

                        double one = changeTwo / 1;
                        System.out.println("1KM = " + (int) one);
                        double changeOne = changeTwo % 1;

                        double half = changeOne / 0.50;
                        System.out.println("0.50KM = " + (int) half);
                        double changeHalf = changeOne % 0.50;

                        double fifth = changeHalf / 0.20;
                        System.out.println("0.20KM = " + (int) fifth);
                        double changeFifth = changeHalf % 0.20;

                        double tenth = changeFifth / 0.10;
                        System.out.println("0.10KM = " + (int) tenth);
                        double changeTenth = changeFifth % 0.10;

                        double zeroOne = changeTenth / 0.01;
                        System.out.println("0.01KM = " + Math.round(zeroOne));
                    } else {
                        System.out.println("There is no change for you :)");
                    }

                } else if (bill == 0) {
                    System.out.println("You didn't buy anything did you?");
                } else {
                    System.out.println("Did you maybe break something?");
                }
            } else if (money > 100) {
                System.out.println("You have too much money!");
            }
        } else {
            System.out.println("You don't have enough money for the bill.");
        }
    }
}
