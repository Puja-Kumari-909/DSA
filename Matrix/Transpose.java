public class Transpose {
    public static void main(String[] args) {
        int[][] arr = { {1, 2, 3, 5},
                        {4, 5, 6, 2},
                        {7, 8, 9, 7},
                        {2, 5, 8, 9}};

        int temp = 0;

        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[0].length; j++){
                if(i<j){
                    temp = arr[i][j];
                    arr[i][j] = arr[j][i];
                    arr[j][i] = temp; 
                }
            }
        }

        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[0].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
