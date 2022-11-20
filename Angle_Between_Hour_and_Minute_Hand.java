import java.util.Scanner;

public class Angle_Between_Hour_and_Minute_Hand {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double h=sc.nextInt();
        double m=sc.nextInt();
        double x=Math.abs(h*5-m);
        double y=Math.abs(x*6-m/2);
        System.out.println(y); 
    }
    
    
}