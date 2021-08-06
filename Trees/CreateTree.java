import java.util.Scanner;

public class CreateTree {

    static Node createTree() {
        Scanner sc = new Scanner(System.in);
		
		Node root = null;
		System.out.println("Enter data: ");
		int data = sc.nextInt();
		
		if(data == -1)
            return null;
        
		root = new Node(data);
		
		System.out.println("Enter left for " + data);
		root.left = createTree();
		
		System.out.println("Enter right for "+ data);
		root.right = createTree();
		
		return root;
	}

    static void inOrder(Node root){

        if(root == null) return;
		
		inOrder(root.left);
		System.out.print(root.data+" ");
		inOrder(root.right);
    }

    static void preOrder(Node root){
        if(root==null) return;

        System.out.print(root.data+" ");
        preOrder(root.left);
        preOrder(root.right);
    }

    static void postOrder(Node root){
        if(root==null) return;

        preOrder(root.left);
        preOrder(root.right);
        System.out.print(root.data+" ");
    }


    public static void main(String[] args) {   
        Node root = createTree();
        inOrder(root);
        System.out.println();
        preOrder(root);
        System.out.println();
        postOrder(root);
    }  
}

class Node {
    Node left, right;
    int data;
    
    public Node(int d) {
        data = d;
    }
}
