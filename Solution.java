import java.util.Scanner;

class ComplexNumber{
    private int real;
    private int imaginary;

    ComplexNumber(int r,int im){
        this.real=r;
        this.imaginary=im;
    }
    public void plus(ComplexNumber obj){
        this.real+=obj.real;
        this.imaginary=obj.imaginary;
    }
    public void multiply(ComplexNumber obj){
        int val1=(this.real* obj.real)-(this.imaginary* obj.imaginary);
        int val2=(this.real* obj.imaginary)+(this.imaginary*obj.real);
        this.real=val1;
        this.imaginary=val2;
    }
    public void Print(){
        System.out.println(this.real+" "+"+"+" "+"i"+this.imaginary);
    }
}
public class Solution{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int real1=sc.nextInt();
        int comp1=sc.nextInt();
        ComplexNumber c1=new ComplexNumber(real1,comp1);
        int real2= sc.nextInt();
        int comp2= sc.nextInt();
        ComplexNumber c2= new ComplexNumber(real2,comp2);
        int q= sc.nextInt();
        switch (q){
            case 1:
                c1.plus(c2);
                c1.Print();
                break;

            case 2:
                c1.multiply(c2);
                c1.Print();
                break;
        }

    }
}