public class test3 {
    public static void main(String[] args) {
        int[][] arr = { {1, 2, 3},
                        {4, 5, 6},
                        {7, 8, 9},
                        {2, 5, 8}};

        int[][] res = new int[arr[0].length][arr.length];

        for(int i=0; i<res.length; i++){
            for(int j=0; j<res[0].length; j++){
                res[i][j] = arr[j][i];
                System.out.print(res[i][j] + " ");
            }
            System.out.println();
        }
    }
}
