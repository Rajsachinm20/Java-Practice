import java.util.Scanner;

public class palindrome_number {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int n,r,s=0,c;
        n= sc.nextInt();

        c=n;
        while (n>0){
            r=n%10;
            s=(s*10)+r;
            n=n/10;
        }
        if(c==s){
            System.out.println("it is palindrome");
        }
        else{
            System.out.println("it is not palindrome");
        }
    }

}
