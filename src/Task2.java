import java.text.DecimalFormat;

public class Task2 {
    private static final DecimalFormat df = new DecimalFormat("0.00");

    public static void main(String[] args) {
        //Napravite program koji izracuna povrsinu kruga. (Bez hardkodiranja)sa ispisom u konzolu.
        // P=r^2*pi
        double radius = 2.2;
        double area = Math.PI * (radius * radius);
        System.out.println("The radius of the circle is: " + df.format(radius) + " and the area of the circle is: " + df.format(area) + ".");

    }
}
        //Napravila sam da se i radius i izracunata area zaokruzuje na 2 decimale.