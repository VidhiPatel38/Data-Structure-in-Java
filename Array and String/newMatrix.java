import java.io.*;
public class newMatrix{
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the no of rows in matrix");
        int row = Integer.parseInt(br.readLine());
        System.out.println("Enter the no of columns in matrix");
        int column = Integer.parseInt(br.readLine());
        int matrix[][] = new int[row][column];
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                System.out.println("enter the values for matrix"+i+""+j);
                matrix[i][j] = Integer.parseInt(br.readLine());
            }
        }
            System.out.println("the matrix is");
            for(int i=0;i<matrix.length;i++){
                for(int j=0;j<matrix[i].length;j++){
                     System.out.print(matrix[i][j] + "\t");
            }
            System.out.print("\n");
        }

        //look for value zero in matrix
        boolean zeroArray[][] = new boolean[row][column];
        int count = 0;
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                if(matrix[i][j] == 0){
                    zeroArray[i][j] = true;
                }
                else{
                    zeroArray[i][j] = false;
                }
            }
        }

        //printing the zeroArray
         System.out.println("the matrix is");
            for(int i=0;i<matrix.length;i++){
                for(int j=0;j<matrix[i].length;j++){
                     System.out.print(zeroArray[i][j] + "\t");
            }
            System.out.print("\n");
        }

        //making rows and colums zero
        int l = matrix.length;
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                if(zeroArray[i][j]==true){
                    for(int k=0;k<matrix[i].length;k++){
                        matrix[i][k] = 0;
                    }
                    for(int k=0;k<matrix.length;k++){
                        matrix[k][j] = 0;
                    }
                }
            }
        }

        //final matrix with zero
        System.out.println("the matrix is");
            for(int i=0;i<matrix.length;i++){
                for(int j=0;j<matrix[i].length;j++){
                     System.out.print(matrix[i][j] + "\t");
            }
            System.out.print("\n");
        }
        
    }
}