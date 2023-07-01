class organisation{
    int id;
    int salary;
    public int getId(){
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
public class pppppp {
    public static void main(String[] args) {
        organisation sac=new organisation();
        sac.setId(45);
        sac.setSalary(45000);
        System.out.println(sac.getId());
        System.out.println(sac.getSalary());
    }
}
