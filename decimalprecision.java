public class decimalprecision {

    public static void main(String[] args){
    int[] arr = {-1, -2, -3, 0, 0, 0, 0, 1, 5, 7};
    float pos = 0;
    float neg = 0;
    float zero = 0;
    float total = arr.length;
    for(int i=0; i<arr.length; i++){
        if(arr[i]>0){
            pos++;
            continue;
        }
        if(arr[i]<0){
            neg++;
            continue;
        }
        else{
            zero++;
        }
    }
    System.out.printf("%.6f%n", pos/total);
    System.out.printf("%.6f%n", neg/total);
    System.out.printf("%.6f%n", zero/total);
}

}
