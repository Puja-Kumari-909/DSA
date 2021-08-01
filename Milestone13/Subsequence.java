
public class Subsequence {

    static boolean checkSub(String s1, String s2){

        int i=0;

        for(int j=0; j<s2.length() && i<s1.length(); j++){
            if(s1.charAt(i) == s2.charAt(j)){
                i++;
            }
        }
         return (i==s1.length());
    }

    public static void main(String[] args) {
        String s1 = "ABX";
        String s2 = "ABCDXZY";

        if(checkSub(s1, s2)){
            System.out.println("YES");
        }
        else
            System.out.println("NO");
    }
}
