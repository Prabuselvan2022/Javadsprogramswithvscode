public class NumbersandStrings {

    public static void main(String[] args) {

        String temp="pra123bu";
        System.out.println(numbersandstrings(temp));
    }

    public static String numbersandstrings(String temp) {
        
        String result="";
        for(int i = 0; i < temp.length(); i++) {
            char ch = temp.charAt(i);
            if(Character.isDigit(ch)) {
                result=result+ch;
            }
        }
        System.out.println("result-->"+ result);
        return result;
    }
    
}

