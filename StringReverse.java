// Write a Program to Reverse a String
import java.util.Scanner;

public class StringReverse {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        char[] a=str.toCharArray();
        for (int i = 0,j=a.length-1; i <= j; i++,j--) {
            char temp=a[i];
            a[i]=a[j];
            a[j]=temp;
        }
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]);
        }
    }
}
