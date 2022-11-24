package LAB7.Q1;
import java.util.Scanner;
public class driver {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s1 = in.nextLine();
        String s = in.nextLine();
        char ch = in.next().charAt(0);
        if (s1.contains(s)) System.out.println("True");
        else System.out.println("False");
        if (s1.indexOf(ch)!=-1)System.out.println("Position: "+s1.indexOf(ch));
    }
}
