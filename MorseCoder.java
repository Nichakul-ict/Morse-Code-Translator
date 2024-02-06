/*
 * ID: 6588178   NAME: Nichakul Kongnual
 * SEC: 2
 */
/**
*   Please do not modify this code
*   This code is for converting text to Morse code.
*/
import java.io.*;

public class MorseCoder {
    public static void main(String[] args) throws IOException {
        BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
        String inputLine;
        while((inputLine=console.readLine())!=null) {
            for(int i = 0;i<inputLine.length();i++) {
                System.out.print(Coder.encode(inputLine.charAt(i)));
            }
            System.out.println();
        }
    }
}
