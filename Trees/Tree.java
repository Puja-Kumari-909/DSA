public class Tree {
    static class Node{
        int data;
        Node left = null;
        Node right = null;

        Node(int d){
            data = d;
        }
    }

    static void preOrder(Node node){
        if(node==null){
            return;
        }
        System.out.print(node.data+" ");
        preOrder(node.left);
        preOrder(node.right);
    }

    static void inOrder(Node node){
        if(node==null){
            return;
        }
        inOrder(node.left);
        System.out.print(node.data+" ");
        inOrder(node.right);
    }

    static void postOrder(Node node){
        if(node==null){
            return;
        }
        postOrder(node.left);
        postOrder(node.right);
        System.out.print(node.data+" ");
    }

    static void printLeaf(Node node){
        if(node == null){
            return;
        }

        if(node.left==null && node.right==null){
            System.out.print(node.data+" ");
            return;
        }
        
        if(node.left!=null){
            printLeaf(node.left);
        }

        if(node.right!=null){
            printLeaf(node.right);
        }

    }

    static void morrisInorder(Node root){
        Node curr = root;
        
        while(curr != null){
            if(curr.left == null){
                System.out.print(curr.data + " ");
                curr = curr.right;
            }
            else{
                Node prev = curr.left;
                while(prev.right!= null && prev.right != curr){
                    prev = prev.right;
                }
                
                if(prev.right == null){
                    prev.right = curr;
                    curr = curr.left;
                }
                else{
                    prev.right = null;
                    System.out.print(curr.data + " ");
                    curr = curr.right;
                }
            }
        }
    }

    static void morrisPreorder(Node root){
        Node curr = root;
        
        while(curr != null){
            if(curr.left == null){
                System.out.print(curr.data + " ");
                curr = curr.right;
            }
            else{
                Node prev = curr.left;
                while(prev.right!= null && prev.right != curr){
                    prev = prev.right;
                }
                
                if(prev.right == null){
                    prev.right = curr;
                    System.out.print(curr.data + " ");
                    curr = curr.left;
                }
                else{
                    prev.right = null;
                    curr = curr.right;
                }
            }
        }
    }

    static int height(Node node){
        if(node == null)
            return 0;

        int left = height(node.left);
        int right = height(node.right);

        return 1+Math.max(left, right);
    }

    public static void main(String[] args) {
        Node node = new Node(1);
        node.left = new Node(2);
        node.left.right = new Node(5);
        node.left.left = new Node(4);
        node.right = new Node(3);
        node.right.left = new Node(6);
        node.right.right = new Node(7);

        preOrder(node);
        System.out.println();
        inOrder(node);
        System.out.println();
        postOrder(node);
        System.out.println();
        printLeaf(node);
        System.out.println();
        System.out.println("Height of this binary tree is: "+height(node));
        System.out.println("Morris inorder Traversal of this tree is: ");
        morrisInorder(node);
        System.out.println();
        System.out.println("Morris preorder Traversal of this tree is: ");
        morrisPreorder(node);
    }
}
