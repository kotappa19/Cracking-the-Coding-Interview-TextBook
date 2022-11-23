// Write a Program to Check Whether a given String contains Unique characters or not
import java.util.HashSet;
import java.util.Scanner;
public class UniqueElementsinString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        char a[]=str.toCharArray();
        HashSet<Character> hs=new HashSet<Character>();
        for (int i = 0; i < a.length; i++) {
            hs.add(a[i]);
        }
        if (str.length()==hs.size()) {
            System.out.println("String Contains Unique Characters");
        } else {
            System.out.println("String Doesn't Contain Unique Characters");
        }
    }
}
