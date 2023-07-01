import java.util.Scanner;

public class check_perfect {
    public static void main(String[] args) {
        int sum=0;
        System.out.println("enter any number");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<n;i++){
            if(n%i==0){
                sum=sum+i;
            }
        }
        if(sum==n)
            System.out.println("perfect number");
        else
            System.out.println("not a perfect number");
    }
}
