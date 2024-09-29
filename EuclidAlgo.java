
import java.util.Scanner;

public class EuclidAlgo{

    public static void main(String args[]){

        //find GCD of A and B
        //Currently Assumes A > B and that 
        int  A = 0, B = 0;
        System.out.println("Enter two numbers to find GCD of the two");
        Scanner read = new Scanner(System.in);
        do{
            System.out.print("Please enter an integer: ");
            String AUnchecked = read.next();
            if(inputValidation.isNumberic(AUnchecked)){
                A = Integer.parseInt(AUnchecked);
            }else{
                System.out.println("Confirm your input is a positive integer");
            }
        }while( A == 0);
        do { 
            System.out.print("Please enter an integer: ");
            String BUnchecked = read.next();
            if(inputValidation.isNumberic(BUnchecked)){
                B = Integer.parseInt(BUnchecked);
            }else{
                System.out.println("Confirm your input is a posiivitve integer");
            }  
        } while (B == 0);

        int result = AlgoStart(A,B,A%B);
        System.out.print(result);
        
    }



    public static int AlgoStart(int A, int B, int R){
        int[] result = Algo(A,B,R);
        return result[0];
    }
    public static int[] Algo(int A, int B, int R){
        // if (R == 0 && B == 0) {
        //     return new int[] {-1,-1,-1};
        // }
        if(B == 0) 
            return new int[] {A,B,R};
        else{
            return Algo(B, R, A%B);
        }
        //return Algo

    }
}