public class OOPS{
    public static void main(String args[]){
        
        System.out.println("-----------------classes, objects and constructors");
        // classes, objects, constructors and Encapsulations
        Car.name = "this is the static keyword";
        Car c1 = new Car();
        c1.brand = "BMW";
        c1.prise();
        c1.name();
        Car c2 = new Car();
        c2.name(); 
        
        
        System.out.println("-----------------Polymorphism");
        // Polymorphism
        Robot r1 = new Robot();
        r1.name = "abhi";
        r1.speed = 120;
        r1.printInfo(r1.speed);
        r1.printInfo(r1.name);
        r1.printInfo(r1.speed, r1.name);
        
        
        System.out.println("-----------------Inheritence");
        // Inheritence
        Student s1 = new Student();
        s1.name = "kumkum";
        s1.walking();
        s1.playing();
        s1.studying();
        Boy b1 = new Boy();
        b1.name = "abhi";
        b1.walking();
        Child cc = new Child();
        
        
        System.out.println("-----------------access modifiers");
        // access modifiers
        Account a1 = new Account();
        System.out.println(a1.getPassword());
        
        
        System.out.println("-----------------Interfaces");
        // Interfaces
        Boy2 b2 = new Boy2();
        b2.walk();
    
    }
}


// classes, objects and constructors
class Car{
    static String name;
    int prise;
    String color;
    String brand;
    Car(){
        System.out.println("this is the constructor of Car class");
    }
    void name(){
        System.out.println(name);
    }
    void prise(){
        switch(brand){
            case "audi":
                prise = 20000;
                System.out.println(prise);
                break;
            case "BMW":
                prise = 30000;
                System.out.println(prise);
                break;
            case "lamborghini":
                prise = 1;
                System.out.println(prise);
                break;
            default:
                break;
        }
    }
}

/*      POLYMORPHISM      */
class Robot{
    String name;
    int speed;
    
    void printInfo(int speed){
        System.out.println(this.speed);
    }
    void printInfo(String name){
        System.out.println(this.name);
    }
    void printInfo(int speed, String name){
        System.out.println(this.speed + " " + this.name);
    }
}


/*      INHERITENCE      */
final class FinalClass extends Man{     // no class can inherit "FinalClass"
                                         class because of the final keyword!
    void main(){
        System.out.println("hello world!");
    }
}
class Man{ // base class or parant class
    String name;
    void man(){
        System.out.println("this is man of Man");
    }
    void walking(){
        System.out.println(this.name + " is walking");
    }
}
class Child extends Man{ // drived(child) class for 'Man' and parant class for 'Student' 
    Child(){
        super.man();    // the super keyword
    }
    void playing(){
        System.out.println(this.name + " is playing");
    }
    @Override
    void man(){
        System.out.println("this is man of child");
    }
}
class Student extends Child{ // drived(child) class for 'Child' class
    void studying(){
        System.out.println(this.name + " " + " is studying");
    }
}
class Boy extends Man{ // drived(child) class for 'Man' class
    
}


/*      Access Modifiers      */
class Account{
    public String name;     // visible to everyone
    protected String email;     // visible to only this package
    private int password;     // visible to only base-class(Account)
    String abc;     // (default access modifiers) visible to only OOPs class
    
    // getters and setters
    public int getPassword(){
        setPassword(1234);
        return this.password;
    }
    private void setPassword(int pass){
        this.password = pass;
    }
    public void printInfo(){
        System.out.println("this is the name : " + " " + this.name);
        System.out.println("this is the email : " + " " + this.email);
    }
}


/*      ENCAPSULATION      */
// it is already came when we create a object



/*      INTERFACES      */
interface Human{
    String name2 = "abc";
    int eyes = 2;
    
}
interface Man2{
    void walk();
} 
class Boy2 implements Human, Man2{
    @Override
    public void walk(){
        System.out.println("boy2 is walking");
    }
}
