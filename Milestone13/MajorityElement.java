/* find the majority element in agiven array
    a majority element is that element which
    has a a greater frequency than the (number of elements present)/2
*/

import java.util.Arrays;

public class MajorityElement {

    static int findMajority(int[] arr){

        Arrays.sort(arr);
        int temp = arr[0];
        int count = 1;
        int ele = 0;
        int max_ele = -1;
        int flag = 0;

        for(int i=1; i<arr.length; i++){

            if(temp == arr[i]){
                count++;
            }

            else{
                count = 1;
                temp = arr[i];
            }

            if(max_ele<count){
                max_ele = count;
                ele = arr[i];

                if(max_ele>(arr.length/2)){
                    flag = 1;
                    break;
                }
            }
        }
        return (flag==1? ele : -1);
    }


    public static void main(String[] args) {
        int[] arr = {1, 2, 1, 4, 1};
        
        int ans = findMajority(arr);
        if(ans==-1){
            System.out.println("No such Element");
        }
        else{
            System.out.println("Majority element is "+ ans);
        }
    }
}
