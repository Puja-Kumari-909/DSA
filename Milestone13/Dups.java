import java.util.HashMap;
import java.util.Map;

public class Test {
    static void printDups(String str)
    {
        HashMap<Character, Integer> hm = new HashMap<>();
        
        for (int i = 0; i < str.length(); i++) {
            if (!hm.containsKey(str.charAt(i)))
                hm.put(str.charAt(i), 1);
            else
                hm.put(str.charAt(i),
                          hm.get(str.charAt(i)) + 1);
        }
 
        //Print duplicates in sorted order
        for (Map.Entry<Character, Integer> mapElement : hm.entrySet()) {
            char key = (char)mapElement.getKey();
            int value = ((int)mapElement.getValue());
 
            if (value > 1)
                System.out.println("count of "+key +" is "+ value);
        }
    }
    
    public static void main(String[] args)
    {
        String str = "java";
        printDups(str);
}

}