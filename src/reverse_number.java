import java.util.Scanner;

public class reverse_number {
    public static void main(String[] args) {
        System.out.println("enter a number");
        Scanner sc=new Scanner(System.in);
        int r;
        int sum=0;
        int n= sc.nextInt();
        while (n>0){
            r=n%10;
            System.out.print(r);
            n=n/10;

        }
    }
}
