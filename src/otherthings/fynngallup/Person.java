package otherthings.fynngallup;

public class Person {
    private String firstName;
    private String lastName;
    private int age;
    
    public void setFirstName(String firstName){
        this.firstName = firstName;
        
    }
    
    public void setLastName(String lastName){
        this.lastName = lastName;
        
    }
    
    public void setAge(int age){
        if((age < 0) || (age > 100)){
            this.age = 0;
            
        }else{
            this.age = age;
        }
    }
    
    public String getFirstName(){
        return firstName;
        
    }
    
    public String getlastName(){
        return lastName;
        
    }
    
    public int getAge(){
        return age;
        
    }
    
    public boolean isTeen(){
        boolean teen = false;
        if((age >= 12) && (age < 20)){
            teen = true;
            
        }
        
        return teen;
    }
    
    public String getFullName(){
        boolean first = firstName.isEmpty();
        boolean last = lastName.isEmpty();
        String returnString = "";

        if(first && last){
            returnString = firstName + " " + lastName;

        }else{
            if(first){
                returnString = firstName;
            }else{
                returnString = lastName;
            }
        }

        return returnString;

    }
}
