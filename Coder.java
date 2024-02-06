/*
 * ID: 6588178       NAME: Nichakul Kongnual
 * SEC: 2
 */

public class Coder {
    private static String code[] = {
            ".-", "-...", "-.-.", "-..", ".", "..-.",
            "--.", "....", "..", ".---", "-.-", ".-..",
            "--", "-.", "---", ".--.", "--.-", ".-.", 
            "...", "-", "..-", "...-", ".--", "-..-", 
            "-.--", "--.."};
    
    //INCOMPLETE
    public static String encode(char c) {
        String str="?"; //Unknown character
        //CODE HERE
        //alphabetical characters from a to z
        //up covert lowerc all
        if(Character.toLowerCase(c)>='a' && Character.toLowerCase(c)<='z') { 
          //calcu array
          int index = Character.toLowerCase(c) - 'a';
           return code[index] + " "; //morse
        } 
        else if(Character.toLowerCase(c) == ' ') { //space show space
           return "  ";
        }
        else{
        	return str; //default 
        }
    }
     
}
    



