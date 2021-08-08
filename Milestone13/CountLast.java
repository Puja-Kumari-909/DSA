public class test {

    static int findLength(String s){
        int count = 0;

        int j=s.length()-1;
        int i=j;

        while(s.charAt(i)!=' '){
            i--;
        }
    
        count = j-i;
        return count;
    }

    public static void main(String[] args) {
        String s = "Hello World";
        System.out.println(findLength(s));
    }
}
