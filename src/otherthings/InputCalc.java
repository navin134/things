package otherthings;
import java.util.Scanner;

public class InputCalc {

    public static void main(String[] args) {
        inputThenPrintSumAndAverage();
    }
    
    public static void inputThenPrintSumAndAverage() {
        Scanner scanner = new Scanner(System.in);
        int sum = 0, counter = 0, avg = -1;
        double pH;
        boolean isInt;

        do{
            isInt = scanner.hasNextInt();
            if(isInt){
                sum += scanner.nextInt();
                counter++;
            }
            
        }while(isInt);
        
        pH = (sum / (counter));
        if (pH % 10 >= .5){
            avg = (int) (pH + 1);
        }
        System.out.println("SUM = " + sum + " pH = " + avg);
        
        scanner.close();
        
    }

}
