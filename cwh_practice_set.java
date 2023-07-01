class Employee{
    int salary;
    String name;

    public int getSalary() {
        return salary;
    }

    public String getName() {
        return name;
    }
    public void setName(String n){
        name=n;
    }
}
public class cwh_practice_set {
    public static void main(String[] args) {
        Employee sachin=new Employee();
        sachin.setName("sachin kumar bharti");
        System.out.println(sachin.getName());
    }
}
