import java.util.Scanner;

public class Exerase {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        if (a==b&&b==c) {
            System.out.println("equal");
        }else{
            System.out.println("not equal");
        }
    }
}
