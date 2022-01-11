package otherthings.fynngallup.oop;

public class Account {
    private String accountNumber;
    private double balance;
    private String name;
    private String email;
    private String phoneNumber;

    public Account(){
        this("56789", 2.50, "defualt name", "myemail@my.com", "0000000000");
        System.out.println("This is a contructor ");

    }

    public Account(String accountNumber, double balance, String name, String email, String phoneNumber){
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;

    }

    public Account(String name, String email, String phoneNumber){
        this("999999", 100.55, name, email, phoneNumber);
        
    }

    

    public void depositFunds(double funds){
        if(funds > 0){
            this.balance += funds;
            System.out.println("Current Balance: " + this.balance);
        }else{
            System.out.println("Invalid Funds");
        }

    }

    public void withdrawFunds(double funds){
        if(funds <= 0 || funds > this.balance ){
            System.out.println("Insufficient Funds. Only " + this.balance + " available for withdrawal");
        }else{
            this.balance -= funds;
            System.out.println("Current Balance: " + this.balance);
        }

    }

    public void setAccountNumber(String accountNumber){
        this.accountNumber = accountNumber;

    }

    public void setBalance(double balance){
        this.balance = balance;

    }

    public void setName(String name){
        this.name = name;

    }

    public void setEmail(String email){
        this.email = email;

    }

    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber = phoneNumber;
    }

    public String getAccountNumber(){
        return this.accountNumber;

    }

    public double getBalance(){
        return this.balance;

    }

    public String getName(){
        return this.name;

    }

    public String getEmail(){
        return this.email;

    }

    public String getPhoneNumber(){
        return this.phoneNumber;

    }

}
