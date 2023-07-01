
class Animal{
    String name;
    public void eat(){
        System.out.println("i can eat");
    }
}
// inherit from animal
class dog extends Animal{
    public void display(){
        System.out.println("My name is " + name);
    }
}
public class inheritance_practice {
    public static void main(String[] args) {
      dog obj=new dog();
      Animal obj1=new Animal();
      obj.name="Rohu";
        obj.display();
       // Animal.eat();

    }
}
