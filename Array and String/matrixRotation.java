import java.io.*;
public class matrixRotation{
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter the length of matrix n*n");
        int a = Integer.parseInt(br.readLine());
        int matrix[][] = new int[a][a];
        int n = matrix.length;
        int first;
        int last;
        for(int i =0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                System.out.println("Enter the matrix"+ i + "" + j);
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
        for(int layer = 0;layer<n/2;layer++){
            first = layer;
            last = n-first-1;
            for(int i=first;i<last;i++){
                int offset = i-first;
                int top = matrix[first][i];
                matrix[first][i]=matrix[last-offset][first];
                matrix[last-offset][first]=matrix[last][last-offset];
                matrix[last][last-offset]=matrix[i][last];
                matrix[i][last]=top;              
            }
        }

        System.out.println("the rotated matrix is");
          for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                 System.out.print(matrix[i][j] + "\t");
            }
             System.out.print("\n");
        }
    }
}