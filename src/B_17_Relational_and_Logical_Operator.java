public class B_17_Relational_and_Logical_Operator
{
    public static void main(String[] args) {
     /*   boolean a = false;
        boolean b = false;
        boolean c = false;
        if (a && b && c){
            System.out.println("Y");
        }
        else {
            System.out.println("N");
        }

      */
        boolean a = true;
        boolean b = true;
        boolean c = false;
        if (a || b || c){
            System.out.println("Y");
        }
        else {
            System.out.println("N");
        }
        System.out.println("Not (a) is "+(!a) );
    }
}
