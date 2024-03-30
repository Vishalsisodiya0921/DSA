package Arrays;
public class SpiralMatrix {
    public static void printSpiral(int matrix[][]) {
        int startRow = 0;
        int startCol = 0;
        int endRow = matrix.length-1;
        int endCol = matrix[0].length-1;

        while(startRow <=endRow && startCol <= endCol){
            //top
            for(int i = startCol;i<= endCol;i++){
                System.out.print(matrix[startRow][i]+" ");
            }
            //right
            for(int j = startRow+1;j<=endRow;j++){
                System.out.print(matrix[j][endCol]+" ");
            }
            //bottom
            for(int k = endCol-1;k>=startCol;k--){
                if(startRow == endRow){
                    break;
                }
                System.out.print(matrix[endRow][k]+" ");
            }
            //left
            for(int l= endRow-1;l>=startRow+1;l--){
                if(startCol == endCol){
                    break;
                }
                System.out.print(matrix[l][startCol]+" ");
            }
            startCol++;
            startRow++;
            endCol--;
            endRow--;
        }
        System.out.println();

    }
    public static void main(String[] args) {
        int matrix[][]= {{1,2,3,4},
                         {5,6,7,8},
                         {9,10,11,12},
                         {13,14,15,16}};
        printSpiral(matrix);
    }
}
