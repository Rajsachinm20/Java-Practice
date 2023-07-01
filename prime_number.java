import java.util.Scanner;

public class prime_number {
    public static void main(String[] args) {
        int count=0;
        System.out.println("enter any number");
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        if(n==0){
            System.out.println("neither prime nor composite");
        }
        else {
            for (int i = 1; i <= n; i++) {
                if (n % i == 0) {
                    count++;
                }

            }
            if (count == 2) {
                System.out.println("it is a prime number");
            } else {
                System.out.println("it is not a prime number");
            }
        }
    }
}
