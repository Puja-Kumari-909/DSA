import java.util.Stack;

public class ReverseStackUsingRec {


    static void reverseStack(Stack s){
        if(s.size()>0){
            int x = (int) s.peek();     //the first item is stored in every function call until it reaches the last item
            s.pop();
            reverseStack(s);            //keeps on going in the stack until it reaches the last item
            insert_bottom(s, x);        //for the first time x=the last item and after that while coming back the items are processed
        }
    }

    static void insert_bottom(Stack s, int x) {
            if(s.isEmpty()){
                s.push((x));
            }
            else{
                int a = (int) s.peek();     
                s.pop();
                insert_bottom(s, x);    
                s.push(a);
            }
    }


    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();

        for(int i=1; i<=5; i++){
            s.push(i);
        }

        reverseStack(s);

        System.out.println(s);
    }
}
