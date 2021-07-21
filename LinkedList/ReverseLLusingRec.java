import java.util.LinkedList;

import javax.swing.plaf.synth.SynthSplitPaneUI;

import jdk.javadoc.internal.doclets.formats.html.SystemPropertiesWriter;

public class ReverseLLusingRec {

    static Node head;
 
    static class Node {
 
        int data;
        Node next;
 
        Node(int d)
        {
            data = d;
            next = null;
        }
    }

    static void printLLreverse(Node head){
        if(head==null){
            return;
        }

        printLLreverse(head.next);
        System.out.print(head.data +" ");
    }
    
    static void printList(Node node){
        while(node != null){
            System.out.print(node.data+" ");
            node = node.next;
        }
    }

    public static void main(String[] args) {
       
        head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        System.out.println("Original list is: ");
        printList(head);
        System.out.println();
        System.out.println("After Reversing the list is: ");
        printLLreverse(head);
     
    }
    
}
