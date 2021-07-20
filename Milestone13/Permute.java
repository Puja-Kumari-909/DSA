public class Permute {

    static String swap(String s, int i, int l){
        char temp;
        char[] charArray = s.toCharArray();
        temp = charArray[i] ;
        charArray[i] = charArray[l];
        charArray[l] = temp;
        return String.valueOf(charArray);
    }

    static void permute(String s, int l, int r){
        if(l==r){
            System.out.print(s + " ");
        }

        for(int i=l; i<=r; i++){
            s = swap(s, i, l);
            permute(s, l+1, r);
            s = swap(s, i, l);
        }
    }
    
    public static void main(String[] args) {
        String s = "abc";
        permute(s, 0, s.length()-1);
    }
}
