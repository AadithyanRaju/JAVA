package LAB7.Q3;

import java.util.Scanner;

public class driver {
    public static void main(String[] args) {
        String s1;
        Scanner scan=new Scanner(System.in);
        System.out.print("enter string : ");
        s1=scan.next();
        scan.close();
        StringBuffer s=new StringBuffer(s1);
        StringBuffer s2=new StringBuffer(s);
        s2.reverse();
        if(s2.compareTo(s)==0) System.out.println("YES");
        else System.out.println("NO");
    }
}
