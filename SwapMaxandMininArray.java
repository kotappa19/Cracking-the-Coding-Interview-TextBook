import java.util.Scanner;

public class SwapMaxandMininArray {
    public static int Biggest(int[] a){
        int big=a[0],k=0;
        for (int i = 1; i < a.length; i++) {
            if (big<a[i]) {
                big=a[i];
                k=i;
            }
        }
        return k;
    }
    public static int Smallest(int[] a){
        int small=a[0],k=0;
        for (int i = 0; i < a.length; i++) {
            if (small>a[i]) {
                small=a[i];
                k=i;
            }
        }
        return k;
    }

    public static void Swap(int i,int j, int[] a){
        int temp=a[i];
        a[i]=a[j];
        a[j]=temp;
    }

    public static void Print(int[] a){
        for (int i = 0; i < a.length; i++)
            System.out.println(a[i]);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        
        for (int i = 0; i < n; i++) 
            a[i]=sc.nextInt();

        Swap(Biggest(a),Smallest(a),a);
        Print(a);
    }
}
