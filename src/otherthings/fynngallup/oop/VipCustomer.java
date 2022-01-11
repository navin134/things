package otherthings.fynngallup.oop;

public class VipCustomer {
    private String vipName;
    private String vipEmail;
    private double creditLimit;

    public VipCustomer() {
        this("defualt name", "myemail@mydomain.com", 1000.0);

    }

    public VipCustomer(String name, String email, double creditLimit) {
        this.vipName = name;
        this.vipEmail = email;
        this.creditLimit = creditLimit;

    }
    
    public VipCustomer(String name, String email){
        this(name, email, 1000.0);
    }


    public String getVipName() {
        return this.vipName;
    }

    public String getVipEmail() {
        return this.vipEmail;
    }

    public double getCreditLimit() {
        return this.creditLimit;
    }

}
