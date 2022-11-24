package LAB7.Q2;

import java.util.Scanner;

public class driver {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a = in.nextLine();
        String b = in.nextLine();
        int c = in.nextInt();
        if(a.length()>c && b.length()>c)System.out.println(a.substring(0, c)+b.substring(c));
        else System.out.println("word lenght less than lenght.");
        in.close();
    }
}
