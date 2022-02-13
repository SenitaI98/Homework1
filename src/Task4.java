public class Task4 {
    public static void main(String[] args) {
        int x = 11201;
        int result = (x + x + 6) / 2 - x;
        if(result % 2 == 0){
            System.out.println("Result: " + result + " is divisible by 2");
        } else {
            System.out.println("Result: " + result + " isn't divisible by 2");
        }
    }
}
//Zakljucak koji god cijeli broj sam unijela result je uvijek 3 i nije djeljiv sa 2
