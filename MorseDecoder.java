
/*
 * ID: 6588178   NAME: Nichakul Kongnual
 * SEC: 2
 *//**
*   Please do not modify this code
*   This code is for converting Morse code to text using a binary tree.
*/

import java.io.*;

public class MorseDecoder {
    public static void main(String[] args) throws IOException {
        Decoder d = new Decoder();
        
        BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
        String inputLine;
        while((inputLine=console.readLine())!=null) {
        	
        	String[] morseChar = inputLine.split(" ");  	
            for(int i = 0;i<morseChar.length;i++) {
            	System.out.print(d.decodeR(d.root, morseChar[i]));
            }
            System.out.println();
           
        }
    
    }
}
