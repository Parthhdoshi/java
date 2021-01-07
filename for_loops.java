import java.util.Scanner;

public class for_loops {
    public static void main(String[] args) {
        Scanner cs = new Scanner(System.in);
        int n = cs.nextInt();
        cs.close();
        int rows = 2*n-1;
        for(int i=1;i<=rows;i++){   
            if(i<=n){
                for(int j=1;j<=i;j++){
                    System.out.print(" * ");
                }
            }
            else{
                for(int a=5;a>=i;a--){
                    System.out.print(" *6 ");
                }
            }
            System.out.println("_");
        
                
            }  
        }
    }

