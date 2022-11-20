import java.util.Scanner;

public class PermutationsofString {
    public static void printArray(char[] a){
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]);
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        char[] a=str.toCharArray();
        printArray(a);
        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                char temp=a[i];
                a[i]=a[j];
                a[j]=temp;
                printArray(a);
                temp=a[i];
                a[i]=a[j];
                a[j]=temp;
            }
            
        }
    }
}
