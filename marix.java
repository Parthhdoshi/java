import java.util.Scanner;

public class marix{
    public static void main(String[] args) {
        
        Scanner cs = new Scanner (System.in);
        int row = cs.nextInt();
        int cols = cs.nextInt();

        System.out.println("Enter a dimentions for matrix");

        int[][] a = new int[row][cols];
        int[][] b = new int[row][cols];
        int[][] c = new int[row][cols];
        // reading A matrix  
        System.out.println("Enter a 1st marix"); 
        for(int i=0;i<row;i++){
            for(int j=0;j<cols;j++){
                a[i][j] = cs.nextInt();
            }
        }
        // reading B matrix
        System.out.println("Enter a 2st marix"); 
        for(int i=0;i<row;i++){
            for(int j=0;j<cols;j++){
                b[i][j] = cs.nextInt();
            }
        }
        // adding two matrix in to c
        System.out.println("Result in C is ");
        for(int i=0;i<row;i++){
            for(int j=0;j<cols;j++){
                c[i][j] =  a[i][j] + b[i][j];
            }
        }

        //Printing added matrix
        for(int i=0;i<row;i++){
            for(int j=0;j<cols;j++){
                System.out.println(c[i][j]);
            }
        }
        cs.close();
    }
}
