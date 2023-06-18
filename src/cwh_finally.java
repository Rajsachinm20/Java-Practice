public class cwh_finally {
    public static int greet(){
        try{
            int a=10;
            int b=2;
            int c=a/b;
            return c;
        }
        catch (Exception e){
            System.out.println(e);
        }
        finally {
            System.out.println("kuch v ho jaye ye run to hoga hi");
        }
        return -1;
    }

    public static void main(String[] args) {
        int k=greet();
        System.out.println(k);
        int a=9;
        int b=9;
        while(true){
            try{
                System.out.println(a/b);
            }
            catch (Exception e){
                System.out.println(e);
                break;
            }
            finally {
                System.out.println("i am finally for value og b = "+b);
            }
            b--;
        }
    }
}
