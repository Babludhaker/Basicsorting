public class spiralMatrix {
    public static void spiral_matrix(int matrix[][]){
  // Declare of 4 variable
  int startRow = 0;
  int startColumn = 0;
  int endRow = matrix.length-1;
  int endColumn = matrix[0].length-1;
  while(startRow<=endRow && startColumn<=endColumn){
    //Top
    for(int j=startColumn; j<=endColumn; j++){  // J is Column
        System.out.print(matrix[startRow][j]+" ");

    }
    //Right
    for(int i=startRow+1;i<=endRow; i++){   // i is Row
        System.out.print(matrix[i][endColumn]+" ");
    }
    //Bottom
    for(int j=endColumn-1; j>=startColumn; j--){
        if(startRow==endRow){
            break;
        }
        System.out.print(matrix[endRow][j]+" ");

    }
    //Left
    for(int i=endRow-1; i>=startRow+1; i--){
        if(startColumn==endColumn){
            break;
        }
        System.out.print(matrix[i][startColumn]+" ");

    }
    startRow++;
    startColumn++;
    endRow--;
    endColumn--;
  }
  System.out.println();
    }
public static void main(String args[]){
  int matrix[][] = {{1,2,3,4,},
                    {5,6,7,8},
                    {9,10,11,12},
                    {13,14,15,16}};
                    spiral_matrix(matrix);
}
}