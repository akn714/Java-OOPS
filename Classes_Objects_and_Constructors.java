public class Classes_Objects_and_Constructors{
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