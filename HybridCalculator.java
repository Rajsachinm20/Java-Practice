class MyOwnException extends Exception{
    @Override
    public String toString() {
        return "Invalid Input";
    }

    @Override
    public String getMessage() {
        return "Error";
    }
}
public class HybridCalculator {
    public static void main(String[] args){
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int j = 0;
        int[] arr = new int[5];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        arr[3] = 4;
        arr[4] = 5;
        while (j<5) {
            System.out.print("Enter Index: ");
            int n = sc.nextInt();
            if (n >= arr.length) {
                try {
                    throw new MyOwnException();
                } catch (Exception e) {
                    System.out.println(e.toString());
                    j++;
                    if (j == 5) {
                        System.out.println(e.getMessage());
                    }
                }
            } else System.out.println(arr[n]);
        }
    }
}