class employee{
    int id;
    String name;
    public void printDetails(){
        System.out.println("my id is : " +id);
        System.out.println("my name is: " +name);
    }
}
public class create_class {
    public static void main(String[] args) {
        employee sachin=new employee();
        employee raju=new employee();

        sachin.id=12;
        sachin.name="sachin kumar bharti";
        raju.id=212;
        raju.name="raju srivastav";

        sachin.printDetails();
        raju.printDetails();

    }
}
