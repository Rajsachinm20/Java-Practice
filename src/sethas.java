import java.util.HashSet;

public class sethas {
    public static void main(String[] args) {
        HashSet<Integer> myHashSet=new HashSet<>(6,0.5f);
        myHashSet.add(6);
        myHashSet.add(9);
        myHashSet.add(11);
        System.out.println(myHashSet);
        myHashSet.clone();
        System.out.println(myHashSet.clone());
    }
}
