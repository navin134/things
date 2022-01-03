package otherthings.fynngallup;

public class SimpleCalculator {
    
    private double firstNumber;
    private double secondNumber;
    
    public void setFirstNumber(double firstNumber){
        this.firstNumber = firstNumber;
        
    }
    
    public void setsecondNumber(double secondNumber){
        this.secondNumber = secondNumber;
        
    }
    
    public double getFirstNumber(){
        return this.firstNumber;
        
    }
    
    public double getSecondNumber(){
        return this.secondNumber;
        
    }
    
    public double getAdditionResult(){
        return (this.firstNumber + this.secondNumber);
        
    }
    
    public double getSubtractionResult(){
        return (this.secondNumber - this.firstNumber);
        
    }
    
    public double getMultiplicationResult(){
        return (this.secondNumber * this.firstNumber);
        
    }
    
    public double getDivisionResult(){
        double num = (this.firstNumber / this.secondNumber);
        if(secondNumber == 0){
            num = 0;
        }
        
        return num;
    }
}
