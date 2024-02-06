/*
 * ID: 6588178   NAME: Nichakul Kongnual
 * SEC: 2
 */

public class BinaryTree<E extends Comparable<E>> {
    Node<E> root;

    public BinaryTree() {
        root = null;
    }

    // INCOMPLETE
    private String addToSubTree(Node<E> n, E v) {    
    	//CODE HERE
    	if(root == null) {
    		//set as the root node
    	  root= new Node<>(v);
    		return "Root";
    	}
    	
    	//check v less than node n
   	 	if(v.compareTo(n.getValue()) < 0) {
   	        if(n.getLeft() != null) { //has a left child
   	        	return addToSubTree(n.getLeft(), v); //recur
   	        }
   	        else{
   	        	if(v.compareTo(root.getValue()) < 0) {
   	        	//v less than root
   	        		//creates a left child node
   	        		n.setLeft(new Node<>(v));
   	        		 return "LeftSubTree";
   	      	    }//v greater than root
   	        	else if(v.compareTo(root.getValue()) > 0){
   	        	//set leftchild as a new node(v) 
	        		n.setLeft(new Node<>(v));
	      	    	 return "RightSubTree";
   	      	    }
   	       }
   	        
   	   }else if(v.compareTo(n.getValue()) > 0) {
   		   if(n.getRight() != null) {
   	        	return addToSubTree(n.getRight(),v);
   	       }
   		   else{
   	           if(v.compareTo(root.getValue()) > 0) {
   	        	//v more than root go right
   	        	   n.setRight(new Node<>(v));
   	        	    return "RightSubTree";
   	      	   }//v less than root go left
   	           else if(v.compareTo(root.getValue()) < 0){
   	        	   n.setRight(new Node<>(v));
   	        	    return "LeftSubTree";  
   	      	   }
   	       }
   	    } return "value already exist!";
   }
 	

 // INCOMPLETE
    public String add(E v) {
    	//CODE HERE
        return addToSubTree(root, v) + "(" + v + ")";
    }


    // INCOMPLETE.
    private void inOrder(Node<E> n) {
    //This method navigates through the tree and 
    //prints all the data based on an in-order traversal (ascending order)
       //CODE HERE
    	if(n != null) {
    		inOrder(n.getLeft());
    		System.out.print(n.getValue()+" ");
    		inOrder(n.getRight());
    	}	
    }

    // INCOMPLETE.
    private void preOrder(Node<E> n)
    { //navigates through the tree and prints all the data based on a pre-order traversal.
        //CODE HERE
    	if(n != null) { //print first
    		System.out.print(n.getValue()+" ");
    		preOrder(n.getLeft());
    		preOrder(n.getRight());
    	}
    }

    // INCOMPLETE.
    private void postOrder(Node<E> n)
    {//navigates through the tree and prints all the data based on a post-order traversal.
    	//CODE HERE
    	if(n != null) { //print last
    		postOrder(n.getLeft());
    		postOrder(n.getRight());
    		System.out.print(n.getValue()+" ");
    	}
    }

    public void traversal()
    {
        System.out.print("Inorder traversal: ");
        inOrder(root);
        System.out.println();
        
        System.out.print("Preorder traversal: ");
        preOrder(root);
        System.out.println();
        
        System.out.print("Postorder traversal: ");
        postOrder(root);
        System.out.println();
    }
}
