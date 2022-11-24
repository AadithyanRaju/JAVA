package LAB7.Q5;
import java.util.Scanner;
public class driver {
    public static void main(String[] args) {
		String s1;
		Scanner scan=new Scanner(System.in);
		System.out.print("enter the string : ");
		s1=scan.next();
		scan.close();
		String s2="ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
		int count=0;
		for(int i=0;i<s1.length();i++)if(s2.contains(s1.substring(i,i+1))==true)count++;
		if(count>=26)System.out.println("YES");
		else System.out.println("NO");
	}
}
