import java.util.Scanner;

public class prime_bw_two_no {
    public static void main(String[] args) {
        int count =0;
        int i,j;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the 1st no.");
        int n= sc.nextInt();
        System.out.println("enter the second no.");
        int m=sc.nextInt();
        for(i=n;i<=m;i++){
            for(j=2;j<=i;j++){
                if(i%j==0)
                    break;
            }
            if(i==j)
                System.out.print(j+" ");
        }
    }
}
