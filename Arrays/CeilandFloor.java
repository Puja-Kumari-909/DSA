public class CeilandFloor {

    static int findCeil(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;
        while(start<=end){
        int mid = (start+end)/2;
        if(target<arr[mid]){
            end = mid-1;
        }
        else if(target>arr[mid]){
            start = mid+1;
        }else {
            return mid;
        }
        }
        return start;
    }
    static int findFloor(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;
        while(start<=end){
        int mid = (start+end)/2;
        if(target<arr[mid]){
            end = mid-1;
        }
        else if(target>arr[mid]){
            start = mid+1;
        }else {
            return mid;
        }
        }
        return end;
    }

    public static void main(String[] args) {
        int[] arr = {3, 6, 7, 9, 10, 15, 16};
        int target = 8;
        //System.out.println("The ceil value of" + target + "is"+ findCeil(arr, target, start, end));
        int ans = findCeil(arr, target);
        System.out.println(arr[ans]);

        System.out.println(arr[findFloor(arr, target)]);
    }
}
