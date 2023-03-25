public class Inheritence{
    public static void main(String args[]){

        // creating object of Student class
        Student s1 = new Student();
        s1.name = "kumkum";
        s1.walking();
        s1.playing();
        s1.studying();

        // creating object of Boy class
        Boy b1 = new Boy();
        b1.name = "abhi";
        b1.walking();

        // creating object os Child class
        Child cc = new Child();

    }
}

/* --- INHERITENCE --- */

// no class can inherit "FinalClass" class because of the final keyword!
final class FinalClass extends Man{
    void main(){
        System.out.println("hello world!");
    }
}

// base class or parant class
class Man{

    String name;

    void man(){
        System.out.println("this is man of Man");
    }

    void walking(){
        System.out.println(this.name + " is walking");
    }
}

// drived(child) class for 'Man' and parant class for 'Student' 
class Child extends Man{

    Child(){
        // the super keyword
        super.man();
    }

    void playing(){
        System.out.println(this.name + " is playing");
    }

    @Override
    void man(){
        System.out.println("this is man of child");
    }

}

// drived(child) class for 'Child' class
class Student extends Child{

    void studying(){
        System.out.println(this.name + " " + " is studying");
    }
    
}

// drived(child) class for 'Man' class
class Boy extends Man{
    
}