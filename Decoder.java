/*
 * ID: 6588178       NAME: Nichakul Kongnual
 * SEC: 2
 */

public class Decoder {
   
	public Node<String> root;

    public Decoder() {
        root = new Node<String>(""); // root Node has no information.

        addMorse(root, "a", ".-");
        addMorse(root, "b", "-...");
        addMorse(root, "c", "-.-.");
        addMorse(root, "d", "-..");
        addMorse(root, "e", ".");
        addMorse(root, "f", "..-.");
        addMorse(root, "g", "--.");
        addMorse(root, "h", "....");
        addMorse(root, "i", "..");
        addMorse(root, "j", ".---");
        addMorse(root, "k", "-.-");
        addMorse(root, "l", ".-..");
        addMorse(root, "m", "--");
        addMorse(root, "n", "-.");
        addMorse(root, "o", "---");
        addMorse(root, "p", ".--.");
        addMorse(root, "q", "--.-");
        addMorse(root, "r", ".-.");
        addMorse(root, "s", "...");
        addMorse(root, "t", "-");
        addMorse(root, "u", "..-");
        addMorse(root, "v", "...-");
        addMorse(root, "w", ".--");
        addMorse(root, "x", "-..-");
        addMorse(root, "y", "-.--");
        addMorse(root, "z", "--..");
    }
    
    //The rule of the tree is that each left node in the tree corresponds to ’.’
    //and each right node corresponds to ’-’
    
    //INCOMPLETE    
    //Insert Morse Code.
    @SuppressWarnings("unchecked")
    private void addMorse(Node<String> tree, String letter, String code)
    {
      //CODE HERE   
      int i = 0;
      while(i < code.length()) {
        if(code.charAt(i) == '.') { // dot = left
            if(tree.getLeft() == null) { // check
                tree.setLeft(new Node<String>(" ")); // new
            }
            tree = tree.getLeft(); // update
        }else if(code.charAt(i) == '-') { // dash = right
            if(tree.getRight() == null) {
                tree.setRight(new Node<String>(" "));
            }
          tree = tree.getRight();
        }
        i++;
     }
      tree.setValue(letter); // alphabet
   }
    	
    
    //INCOMPLETE
    // An iterative version of the Morse code decoder
    public String decode(String m) {
        Node<String> ptr = root; // start at root of tree
        String str="?"; // For unknow character, the program must show ?

        // Scan through the Morse String
        // CODE HERE
        int i = 0;
        while(i< m.length()) {     		
        	if(m.charAt(i) == ' ') {
        		str += ptr.getValue(); //add the value current node
                 ptr = root; //reset
        	}
            else if(m.charAt(i) == '.') {//dot move to left
                 ptr = ptr.getLeft();
            } 
            else if(m.charAt(i) == '-') { //move to r
                 ptr = ptr.getRight();
        	} 
             i++;
        }
        	str+= ptr.getValue(); //append
        return str;
    }


    //INCOMPLETE
    // A Recursive version of the decoder
    public String decodeR(Node<String> n, String m) {
        String str="?"; // For unknow character, the program must show ?
        //CODE HERE
        if(m.isEmpty()) { //recursion stops
            return n.getValue();
        }
        
        if(m.charAt(0)== '.' && n.getLeft() != null) {//left
              return decodeR(n.getLeft(),m.substring(1)); //recur
        } 
        else if(m.charAt(0)== '-' && n.getRight() != null) {//right
              return decodeR(n.getRight(),m.substring(1)); //recur
        }
        	return str;
    }

    // public wrapper function to hide decodeR()
    public String decode2(String m) {
        return decodeR(root, m);
    }
}
