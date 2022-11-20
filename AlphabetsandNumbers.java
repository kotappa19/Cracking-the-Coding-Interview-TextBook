//Write a Program to Print the Corresponding combination of letters for a given number 
import java.util.Scanner;

public class AlphabetsandNumbers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        char[][] arr=new char[10][3];
        char k='A';
        for (int i = 1; i < 10; i++) {
            for (int j = 0; j < 3; j++) {
                arr[i][j]=k++;
            }
        }
        int y=n%10;
        int x=n/10;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(arr[x][i]+""+arr[y][j]+"\t");
            }
        }
        
    }
}
