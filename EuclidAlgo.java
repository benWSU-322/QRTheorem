
import java.util.Scanner;

public class EuclidAlgo{

    public static void main(String args[]){

        //find GCD of A and B
        //Currently Assumes A > B and that 
        int  A = 0, B = 0;
        Scanner read = new Scanner(System.in);
        do{
            System.out.print("Please enter a Dividend:");
            String AUnchecked = read.next();
            if(inputValidation.isNumberic(AUnchecked)){
                A = Integer.parseInt(AUnchecked);
            }else{
                System.out.print("confirm your dividen is a integer");
            }
        }while( A == 0);
        do { 
            System.out.print("Please select a Divisor:");
            String BUnchecked = read.next();
            if(inputValidation.isNumberic(BUnchecked)){
                B = Integer.parseInt(BUnchecked);
            }else{
                System.out.print("confirm your divisor is non-zero");
            }  
        } while (B == 0);
    }



    public static int AlogStart(int A, int B, int R){
        int[] result = Algo(A,B,R);
        return result[0];
    }
    public static int[] Algo(int A, int B, int R){
        if(R==0) 
            return new int[] {A,B,R};
        else{
            return Algo(B, R, A%B);
        }
        //return Algo

    }
}