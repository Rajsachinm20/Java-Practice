import java.util.Scanner;

class Print_an_exception extends Exception{
    public String toString(){

        return "error! index is out of bound";
    }
    public String getMessage(){

        return "Error occured";
    }
}
public class cwh_practice_exception_Q5 {
    public static int function(int val) throws Print_an_exception{
        if(val>5){
            throw new Print_an_exception();
        }
        return val;
    }
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        boolean flag=true;
        Scanner sc = new Scanner(System.in);
        int val;
        int i=0;
        while(flag && i<5){
            try{
                System.out.println("Enter a valid index...");
                val=sc.nextInt();
                int res = (val);
                System.out.println("The value of given index is :"+arr[res]);
                break;

            }
            catch (Exception e){
                System.out.println(e);
                i++;
            }
        }

    }
}
