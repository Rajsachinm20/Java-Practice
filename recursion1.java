public class recursion1 {
    public static void printnumb(int n){
        if(n==6)
            return;
        System.out.println(n);
        printnumb(n+1);
    }
    public static void main(String[] args) {
        printnumb(1);
    }
}
