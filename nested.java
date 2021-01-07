import java.util.Scanner;

public class nested {
    public static void main(String[] args) {

        Scanner cs = new Scanner(System.in);
        int n = cs.nextInt();
        cs.close();
        int num = 1;
                                            
        for(int i=1;i<=n;i++){
            for(int j=n;j>=i;j--){
                System.out.print("_  ");
            }

            for(int j=1;j<=i;j++){
                System.out.print("  "+num++ +" ");
                num++;
            }

            System.out.println();
        }
    }
}
