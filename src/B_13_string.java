import java.awt.*;
import java.util.Scanner;

public class B_13_string {
    public static void main(String[] args) {
       // String name = new String(original:"Bimal");
        String name = "Bimal";
        System.out.print("Hello ");
        System.out.println("Welcome "+name);
        int a = 50;
        float b = 20.12558f;
        System.out.printf("The value of a is %d and the value of b is %10.3f \n",a,b);
        System.out.format("The value of a is %d and the value of b is %f",a,b);
        Scanner sc = new Scanner(System.in);
        String st = sc.nextLine();
        System.out.println(st);
    }

}
