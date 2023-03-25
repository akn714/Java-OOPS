public class Classes_Objects_and_Constructors{
    public static void main(String args[]){

        // using static variable
        Car.name = "this is the static keyword";

        // creating object of Car class
        Car c1 = new Car();
        c1.brand = "BMW";
        c1.prise();
        c1.name();

        // creating 2nd object of Car class
        Car c2 = new Car();
        c2.name();

    }
}

/* --- Classes, Objects, Constructors and Encapsulation --- */
class Car{

    // variable with static keyword
    static String name;

    int prise;
    String color;
    String brand;

    // constructor of Car class
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