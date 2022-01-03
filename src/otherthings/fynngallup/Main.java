package otherthings.fynngallup;

public class Main {
    public static void main(String[] args){
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
            System.out.println("fullname= " + person.getFullName());

    }
}
