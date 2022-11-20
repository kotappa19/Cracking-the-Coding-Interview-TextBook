import java.util.Scanner;

public class RansomeNote {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str1=sc.nextLine();
        String str2=sc.nextLine();
        char[] a=str1.toCharArray();
        char[] b=str2.toCharArray();
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {
                if(a[i]!=b[j] || i>=j){
                    continue;
                }
                else{
                    char temp=b[i];
                    b[i]=b[j];
                    b[j]=temp;
                }
            }
        }
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
        for (int i = 0; i < b.length; i++) {
            System.out.println(b[i]);
        }
        boolean flag=false;
        for(int i=0;i<a.length;i++){
            if(a[i]=='\0' || a[i]!=b[i]){
                continue;
            }
            int count1=1;
            for (int j = i+1; j < a.length; j++) {
                if(a[i]==a[j]){
                    count1++;
                    a[j]='\0';
                }
            }
            a[i]='\0';
            int count2=1;
            for (int j = i+1; j < b.length; j++) {
                if(b[i]==b[j]){
                    count2++;
                    b[j]='\0';
                }
            }
            b[i]='\0';
            if(count1==count2){
                flag=true;
            }
        }
        System.out.println(flag);
    }
}
