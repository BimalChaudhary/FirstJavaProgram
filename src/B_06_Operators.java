import java.util.Scanner;

public class B_06_Operators {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your first number:");
        float n1 = sc.nextFloat();
        System.out.println("Enter your second number:");
        float n2 = sc.nextFloat();
        float sum = n1 + n2;
        float sub = sum - n2;
        float mult = n1 * n2;
        float div = mult / n1;
        System.out.println("Sum of "+n1+"and "+n2+"is :"+sum);
        System.out.println("Subtraction of "+sum+"and "+n2+"is :"+sub);
        System.out.println("Multiply  of "+n1+"and "+n2+"is :"+mult);
        System.out.println("Division of "+mult+"and "+n1+"is :"+div);
    }
}
