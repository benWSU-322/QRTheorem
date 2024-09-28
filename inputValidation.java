public class inputValidation {
    public static boolean isNumberic(String input){
        for(char c : input.toCharArray()){
            if(!(Character.isDigit(c) || (c == '-'))){
                return false;
            }
        }
        return true;
    }
    
}
