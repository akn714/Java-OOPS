public class Access_Modifiers{
    public static void main(String args[]){
        
        // creating object of Account class
        Account a1 = new Account();
        System.out.println(a1.getPassword());
    }
}

/* --- Access Modifiers --- */
class Account{

    public String name; // visible to everyone

    protected String email; // visible to only this package

    private int password; // visible to only base-class(Account)

    String abc; // (default access modifiers) visible to only OOPs class
    
    // getters
    public int getPassword(){
        setPassword(1234);
        return this.password;
    }

    // setters
    private void setPassword(int pass){
        this.password = pass;
    }

    public void printInfo(){
        System.out.println("this is the name : " + " " + this.name);
        System.out.println("this is the email : " + " " + this.email);
    }
}