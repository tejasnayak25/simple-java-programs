package tasks;

public class Program12c {
    public static void main(String[] args) {
        int[][][] myTensor = {
            {
                {1, 2, 3},
                {4, 5, 6}
            },
            {
                {7, 8, 9},
                {10, 11, 12}
            }
        };
        
        int dim1 = 0, dim2 = 0, dim3 = 0;
        boolean isFirstBlock = true;
        boolean isFirstRow = true;

        for (int[][] block : myTensor) {
            dim1++;
            if (isFirstBlock) {
                for (int[] row : block) {
                    dim2++;
                    if (isFirstRow) {
                        for (int element : row) {
                            dim3++;
                        }
                        isFirstRow = false; // Count 3rd dim only once
                    }
                }
                isFirstBlock = false; // Count 2nd dim only once
            }
        }
        
        System.out.println("Calculated Dimensions: " + dim1 + " x " + dim2 + " x " + dim3);
        System.out.println("Total element count: " + (dim1 * dim2 * dim3));
    }
}
