import java.util.Scanner;

public class arraymulti {
    public static void main(String[] args) {
        System.out.println("Enter a dimentions of array ");
        Scanner cs = new Scanner(System.in);
        int raws = cs.nextInt();
        int cols = cs.nextInt();

        int array1[][] = new int[raws][cols];
        int array2[][] = new int[raws][cols];
        int array3[][] = new int[raws][cols];

        if (raws==cols){

            System.out.println("Enter 1st marix");
            for(int i=0;i<raws;i++){
                for(int j=0;j<cols;j++){
                    array1[i][j] = cs.nextInt();
                }
            }

            System.out.println("Enter 2st marix");
            for(int i=0;i<raws;i++){
                for(int j=0;j<cols;j++){
                    array2[i][j] = cs.nextInt();
                }
            }
            
            System.out.println("multiplications of array is ");
            for(int i=0;i<raws;i++){
                for(int j=0;j<cols;j++){
                    array3[i][j] = array1[i][j] * array2[j][1] + array1[i][j] * array2[j][1];
                    System.out.print(array3[i][j]);
                }
            }

        }
        cs.close();
    }
}
