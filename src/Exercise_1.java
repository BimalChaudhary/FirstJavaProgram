import java.util.Scanner;
public class Exercise_1 {
    public static void main(String[] args) {
        System.out.println("Marks of 5 subjects. ");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter marks of first subject ");
        float m1 = sc.nextFloat();
        System.out.println("Enter marks of second subject ");
        float m2 = sc.nextFloat();
        System.out.println("Enter marks of third subject ");
        float m3 = sc.nextFloat();
        System.out.println("Enter marks of fourth subject ");
        float m4 = sc.nextFloat();
        System.out.println("Enter marks of fifth subject ");
        float m5 = sc.nextFloat();
        float total = ((m1+m2+m3+m4+m5)*100)/500;
        System.out.println("Percentage marks of all 5 subjects are: "+total);

    }
}
