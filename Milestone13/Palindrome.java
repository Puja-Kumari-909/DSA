public class Palindrome {

    static boolean isPalindrome(String s, int l, int r){
        if(l>=r)
          return true;

        if(s.charAt(l)!=s.charAt(r))
          return false;

        return isPalindrome(s, l+1, r-1);
    }

    public static void main(String[] args) {
        String s = "gfgfg";
        int l=0;
        int r = s.length()-1;
        if(isPalindrome(s, l, r)){
            System.out.println("palindrome");
        }
        else
           System.out.println("not palindrome");
    }
}
