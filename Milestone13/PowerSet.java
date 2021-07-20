public class PowerSet {

    static void powerSet(String s, int i, String currStr){

        int n = s.length();
        if(i==n){
            System.out.print(currStr+" ");
            return;
        }

        powerSet(s, i+1, currStr + s.charAt(i));
        powerSet(s, i+1, currStr);
    }

    public static void main(String[] args) {
        String s = "abc";
        int index = 0;
        String curr = "";
        powerSet(s, index, curr);
    }
}

// OUTPUT:
// abc ab ac a bc b c 
