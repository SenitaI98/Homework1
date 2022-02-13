public class Task1 {
    public static void main(String[] args) {
        //Uslov1 -maximalna kolicina novca ne smije biti veca od 100, racun mora biti veci od 0
        int money = 10;
        int bill = 0;

        if (money <= 100) {
            if (bill > 0) {
                int change = money - bill;
                System.out.println("You have " + money + "KM" + ", the bill is: " + bill + "KM");
                System.out.println("Change is: " + change + "KM"); //Ostavila sam da ispis bude sa više decimalnih mjesta, a u Task2 sam koristila DecimalFormat za zaokruzivanje na 2 decimale

                if (change >= 1) {
                    int twenty = change / 20;
                    System.out.println("20KM = " + twenty);
                    int changeTwenty = change % 20;

                    int ten = changeTwenty / 10;
                    System.out.println("10KM = " + ten);
                    int changeTen = changeTwenty % 10;

                    int two = changeTen / 2;
                    System.out.println("2KM = " + two);
                    int changeTwo = changeTen % 2;

                    int one = changeTwo / 1;
                    System.out.println("1KM = " + one);

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

    }
}
