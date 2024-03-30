package Arrays;

public class Array_2dHW {

    //write a program that print count of 7
    // public static void main(String[] args) {
    //     int [][] array = { {4,7,8},{8,8,7}};
    //     int countOf7 = 0;
    //     for(int i=0;i<array.length;i++){
    //         for(int j=0;j<array[0].length;j++){
    //             if (array[i][j] == 7){
    //                 countOf7++;
    //             }
    //         }
    //     }
    //     System.out.println("Count of 7 is:"+countOf7);
    // }



    //write a program to print the sum numbers in the second row of the nums in array!!
    // public static void main(String[] args) {
    //     int nums[][] = {{1,4,9},{11,4,3},{2,2,3}};
    //     int sum =0;

    //     //sum of 2nd row elements
    //     for(int j=0;j<nums[0].length;j++){
    //         sum += nums[0][j];
    //     }
    //     System.out.println("sum is="+sum);
    // }



    // write a program to find the Transpose of a matrix....
    public static void main(String[] args) {
        int row = 2, col =3;
        int [][] matrix = { {2,3,7},{5,6,7} };
        //Display original matrix...
        printMatrix(matrix);

        //Transpose the matrix...
        int [][] transpose = new int [col][row];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                transpose[j][i] = matrix[i][j];
            }
        }
        //print the transposed matrix...
        printMatrix(transpose);
    }
    public static void printMatrix(int [][] matrix) {
        System.out.println("The Matrix is : ");
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                System.out.print(matrix[i][j]+"   ");
            }
            System.out.println();
        }
    }
}

