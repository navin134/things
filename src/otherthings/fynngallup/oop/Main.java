package otherthings.fynngallup.oop;

public class Main {
    public static void main(String[] args){
        Wall wall = new Wall(5, 4);
        System.out.println("area= " + wall.getArea());

        wall.setHeight(-1.5);
        System.out.println("width= " + wall.getWidth());
        System.out.println("height= " + wall.getHeight());
        System.out.println("area= " + wall.getArea());

        Carpet carpet = new Carpet(3.5);
        Floor floor = new Floor(2.75, 4.0);
        Calculator calculator = new Calculator(floor, carpet);
        System.out.println("total=" + calculator.getTotalCost());
        carpet = new Carpet(1.5);
        floor = new Floor(4.5, 5.4);
        calculator = new Calculator(floor, carpet);
        System.out.println("total=" + calculator.getTotalCost());
        

        /*Word litblog = new Word();
        System.out.println(litblog.paragraph());
        litblog.paragraph("Given three assumptions one could travel between galaxies in seconds and move between dimensions.");
        System.out.println(litblog.paragraph());
        System.out.println(litblog.WordCount());

        VipCustomer elonMusk = new VipCustomer();
        System.out.println(elonMusk.getVipName());

        VipCustomer person1 = new VipCustomer("Bob", "fynn@email.com");
        System.out.println(person1.getVipName());

        VipCustomer person2 = new VipCustomer("Fynn", "fynn@email.com", 1000.00);
        System.out.println(person2.getVipEmail());


        Account Account = new Account();//"1029374355436", 11432.16, "murpyhgallup@gmail.com", "Fynn M M Gallup", "8312934338");
        Account.setAccountNumber("1029374355436");
        Account.setBalance(11432.16);
        Account.setEmail("murpyhgallup@gmail.com");
        Account.setName("Fynn M M Gallup");
        Account.setPhoneNumber("8312934338");

        String accountNumber = Account.getAccountNumber();
        System.out.println(accountNumber);

        double balance = Account.getBalance();
        System.out.println(balance);

        String email = Account.getEmail();
        System.out.println(email);

        String name = Account.getName();
        System.out.println(name);
        
        String phoneNumber = Account.getPhoneNumber();
        System.out.println(phoneNumber);

        System.out.println();
        Account.depositFunds(115.13);
        Account.depositFunds(0);
        Account.depositFunds(-20);

        Account.withdrawFunds(115.13);
        Account.withdrawFunds(0);
        Account.withdrawFunds(-20);
        Account.withdrawFunds(11432.16);
        Account.withdrawFunds(21432.16);

        Account fynnsAccount = new Account("Fynn Gallup", "myemail@my.com", "123456789");
        System.out.println(fynnsAccount.getAccountNumber() + "name: " + fynnsAccount.getName());

        Car porsche = new Car();
        Car holden = new Car();
        porsche.setModel("Carrera");
        System.out.println("Porche model: " + porsche.getModel());



        Person person = new Person();
        person.setFirstName("");
        person.setLastName("");
        person.setAge(10);
        System.out.println("fullname= " + person.getFullName());
        System.out.println("teen= " + person.isTeen());
        person.setFirstName("John");
        person.setAge(18);
        System.out.println("fullname= " + person.getFullName());
        System.out.println("teen= " + person.isTeen());
        person.setLastName("Smith");
        System.out.println("fullname= " + person.getFullName());*/

    }
}
