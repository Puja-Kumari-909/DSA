public class Selection {
    public static void main(String[] args) {
        int[] arr = {23, 10, 7, 35, 79, 2};
        int temp = 0;
        for(int i=0; i<arr.length; i++){
            int min_ele = i;
            for(int j=i+1; j<arr.length; j++){
                if(arr[j]<arr[min_ele]){
                    min_ele = j;
                }
            }
            temp = arr[i];
            arr[i] = arr[min_ele];
            arr[min_ele] = temp;
        }

        for(int i: arr){
            System.out.print(i+" ");
        }
    }
}

/*
O(n2) time complexity Best, worst and avg
O(1) space complexity
*/