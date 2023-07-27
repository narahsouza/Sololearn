// Multidimensional Arrays

// Matrix

public class Practice23 {
    public static void main(String[] args) {
        int[][] matrix = {
            {8, 1, 6},
            {3, 5, 7},
            {4, 9, 0},
        };
        //output the numbers
        for(int x=0; x<3; x++) {
            for(int y=0; y<3; y++)
            System.out.println(matrix[x][y]);
        }
    }
}