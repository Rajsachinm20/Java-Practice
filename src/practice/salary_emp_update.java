package practice;
class Employee{
    private String name;
    private String job;
    private  double salary;
    public Employee(String name,String job,double salary){
        this.name=name;
        this.job=job;
        this.salary=salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    public void raiseSalary(double percentage){
        salary=salary+salary*percentage/100;
    }
    public void printEmployeeDetails(){
        System.out.println("Name: "+name);
        System.out.println("job: "+job);
        System.out.println("salary: "+salary);
    }
}
public class salary_emp_update {
    public static void main(String[] args) {
        Employee e1=new Employee("Franziska Waltraud", "HR Manager", 40000);
        Employee employee2 = new Employee("Hubertus Andrea", "Software Engineer", 60000);
        System.out.println("\n list of employee details");
        e1.printEmployeeDetails();
        employee2.printEmployeeDetails();
        e1.raiseSalary(8);
        employee2.raiseSalary(9);
//        System.out.println("\nAfter raising salary:");
//        System.out.println("\n8% for 'Franziska Waltraud':");
        e1.printEmployeeDetails();
        //System.out.println("\n12% for 'Hubertus Andrea':");
        employee2.printEmployeeDetails();
    }
}
