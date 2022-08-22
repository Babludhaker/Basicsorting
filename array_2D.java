import java.util.Scanner;

public class array_2D {
    //Maximum value return function
    public static int Maximum(int matrix[][]){
        int Max = 0;
        //largest element print
    for(int i=0; i<matrix.length; i++){
        for(int j=0; j<matrix[0].length; j++){
           Max = Math.max(matrix[i][j], Max);
             
        }
        
    }
    return Max;
   

    }
    //search key function
public static boolean search(int matrix[][],int key){
    for(int i=0; i<matrix.length; i++){
        for(int j=0; j<matrix[0].length; j++){
             if(matrix[i][j]==key){
                System.out.println("key found at cell"+"("+i+","+j+")");
                return true;

             }

        }
        
    }
    System.out.println("key not found");
    return false;
}  
public static void main(String args[]){
    int matrix[][] = new int[3][3];
    int n = matrix.length;   // n is a rows
     int m = matrix[0].length; // m is columns
    Scanner sc = new Scanner(System.in);
   
    for(int i=0; i<n; i++){
        for(int j=0; j<m; j++){
             matrix[i][j] = sc.nextInt();

        }
    }
    

    //output code
    for(int i=0; i<n; i++){
        for(int j=0; j<m; j++){
            System.out.print(matrix[i][j]+" ");

        }
        System.out.println();
    }
    
    System.out.println("Your Maximum value is "+Maximum(matrix));
   // search(matrix, 5);
}

}