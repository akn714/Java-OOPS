public class Interfaces{
    public static void main(String args[]){
        
        // creating object of Boy class
        Boy b = new Boy();
        b.walk();

    }
}

/* --- INTERFACES --- */

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
