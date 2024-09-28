
import java.util.Scanner;

public class quotientRemainderTheorem {

    public static void main(String[] args) {
        int dividend = 0,divisor = 0;
        Scanner read = new Scanner(System.in);
        do{
            System.out.print("Please enter a Dividend:");
            String dividenedUnchecked = read.next();
            if(inputValidation.isNumberic(dividenedUnchecked)){
                dividend = Integer.parseInt(dividenedUnchecked);
            }else{
                System.out.print("confirm your dividen is a integer");
            }
        }while( dividend == 0);
        do { 
            System.out.print("Please select a Divisor:");
            String divisorUnchecked = read.next();
            if(inputValidation.isNumberic(divisorUnchecked)){
                divisor = Integer.parseInt(divisorUnchecked);
            }else{
                System.out.print("confirm your divisor is non-zero");
            }  
        } while ( divisor == 0 );

        int[] result = findQStart(Math.abs(dividend),Math.abs(divisor));
        if(((dividend > 0)&&( divisor < 0))  || ((dividend < 0)&&( divisor > 0))){
            result[0] = result[0] * -1;
        }
        System.out.println("The Quotient is: " + result[0]);
        System.out.println("The Remainder is: " + result[1]);
        read.close();
    }
    public static int[] findQStart(int dividend, int divisor){
        return findQ(dividend,divisor,0,dividend);
    }
    public static int[] findQ(int dividend,int divisor,int quotient,int remainder)
    {
        if (remainder >= divisor) {
            return findQ(dividend,divisor,quotient+1, remainder-divisor);
        }else{
            return new int[] {quotient,remainder,dividend, divisor};
        }
        
    }
    
}