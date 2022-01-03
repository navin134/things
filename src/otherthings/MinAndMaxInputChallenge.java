package otherthings;
import java.util.Scanner;

public class MinAndMaxInputChallenge {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int min = 2147483647, max = -2147483648;

        while(true){
            System.out.println("Enter Number: ");
            boolean isInt = sc.hasNextInt();

            if(isInt){
                int placeHolder = sc.nextInt();
                min = (min < placeHolder) ? min : placeHolder;
                max = (max > placeHolder) ? max : placeHolder;
            }else{
                break;
            }
        }
        System.out.println("Min: " + min + "\nMax: " + max);

        sc.close();
    }
}
