public class Polymorphism{
    public static void main(String args[]){

        // creating object of Robot class
        Robot r1 = new Robot();

        r1.name = "abhi";
        r1.speed = 120;

        r1.printInfo(r1.speed);
        r1.printInfo(r1.name);
        r1.printInfo(r1.speed, r1.name);

    }
}

/* --- POLYMORPHISM --- */
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