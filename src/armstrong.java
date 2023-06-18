import java.util.Scanner;

public class armstrong {
    public static void main(String[] args) {
        int n;
        System.out.println("enter anay number");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int r,c,arm=0;
        c=n;

        while (n>0){
            r=n%10;
            arm=(r*r*r)+arm;
            n=n/10;
        }
        if(c==arm){
            System.out.println("it is armstrong number");
        }
        else{
            System.out.println("it  is not armstrong number");
        }
    }
}
